package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Categoria implements Serializable {
    
    private String nome;
    private List<Produto> produtos;
    private List<Categoria> subcategorias;
    
    public Categoria(String nome){
        this.nome = nome;
        produtos = new ArrayList<>();
        subcategorias = new ArrayList<>();
    }
    
    public static Categoria carregarCategoriaTexto(String file) throws IOException{
            
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Stack<Categoria> pilhaCategorias = new Stack<>(); 
        Stack<Integer> pilhaNiveis = new Stack<>();
        
        Categoria raiz = null;
        String linha;
        Categoria ultimaCategoria = null;
        while((linha = reader.readLine()) != null){

            String[] a = linha.split(";");
            String classe = a[0];

            if(classe.equals("CATEGORIA")){
                ultimaCategoria = new Categoria(a[2]);
                Integer nivel = Integer.valueOf(a[1]);
                if(!pilhaCategorias.empty()){
                    int nivelTopo = pilhaNiveis.peek();
                    
                    if(nivel > nivelTopo){
                        pilhaCategorias.peek().adicioneSubcategoria(ultimaCategoria);
                    }
                    else if(nivel < nivelTopo){
                        while(nivel <= pilhaNiveis.peek()){
                            pilhaCategorias.pop();
                            pilhaNiveis.pop();
                        }
                        pilhaCategorias.peek().adicioneSubcategoria(ultimaCategoria);
                    }
                    else{
                        pilhaCategorias.pop();
                        pilhaNiveis.pop();
                        pilhaCategorias.peek().adicioneSubcategoria(ultimaCategoria);
                    }
                    pilhaCategorias.push(ultimaCategoria);
                    pilhaNiveis.push(nivel);
                }
                
                else{
                    pilhaCategorias.push(ultimaCategoria);
                    pilhaNiveis.push(nivel);
                    if(nivel == 0){
                        raiz = ultimaCategoria;
                    }
                }
            }
            else{
                ultimaCategoria.adicioneProduto(new Produto(a[1], Double.parseDouble(a[2]), a[3], ultimaCategoria, a[5]));
            }
        }
        return raiz;
    }
    
    /*
    A estrutura salva deve segir o formato:
    - Linha de categoria: "CATEGORIA;nivel;nomeCategoria"
    - Linha de produto: "PRODUTO;atributosCSVDoProduto"
    */
    public static void salvarCategoriaTexto(Categoria categoria, String file){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            salvarCategoriaRecursivo(categoria, writer, 0);
            writer.close();
        } catch (IOException ex) {}
    }
    
    public static void salvarCategoriaRecursivo(Categoria categoria, BufferedWriter writer, int nivel){
        try {
            
            writer.write(String.format("CATEGORIA;%d;%s", nivel, categoria.getNome()));
            writer.newLine();
            
            for(Produto produto : categoria.produtos){
                writer.write("PRODUTO;" + produto.salvarProduto());
                writer.newLine();
            }
            
            for(Categoria subcategoria : categoria.subcategorias){
                salvarCategoriaRecursivo(subcategoria, writer, nivel + 1);
            }
            
        } catch (IOException ex) {}
    }
    
    public static Categoria carregarCategoriaBinario(String file) throws FileNotFoundException, IOException, ClassNotFoundException{
        
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        return (Categoria) ois.readObject();
        
    }
    
    public static void salvarCategoriaBinario(Categoria categoria, String file) throws FileNotFoundException, IOException{
        
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(categoria);
        oos.close();
        
    }
    
    public void adicioneProduto(Produto produto){
        if(!produtos.contains(produto)){
            getProdutos().add(produto);
        }
    }
    
    public void removeProduto(Produto produto){
        if(getProdutos().contains(produto)){
            getProdutos().remove(produto);
        }
    }
    
    public void adicioneSubcategoria(Categoria subcategoria) {
        if (!subcategorias.contains(subcategoria)){
            subcategorias.add(subcategoria);
        }
    }
    
    public void removeSubcategoria(Categoria subcategoria, boolean permanente){
        if(permanente){
            if(subcategorias.contains(subcategoria)){
                for(Categoria categoriaParaRealocar : subcategoria.subcategorias){
                    subcategorias.add(categoriaParaRealocar);
                }
                for(Produto produtoParaRealocar : subcategoria.produtos){
                    produtos.add(produtoParaRealocar);
                    produtoParaRealocar.setCategoria(this);
                }
            }
        }
        subcategorias.remove(subcategoria);
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Categoria> getSubcategorias() {
        return subcategorias;
    }
    
    @Override
    public String toString(){
        String listaP = "";
        for(Produto p : produtos){
            if(!listaP.isEmpty()){
                listaP += ", ";
            }
            listaP += p.getNome();
        }
        
        String listaC = "";
        for(Categoria s : subcategorias){
            if(!listaC.isEmpty()){
                listaC += ", ";
            }
            listaC += s.getNome();
        }
        
       return "Categoria: " + nome + " -> Produtos: [" + listaP + "] -> Subcategorias: [" + listaC + "]"; 
    }
    
}
