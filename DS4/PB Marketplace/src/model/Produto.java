package model;

import java.io.Serializable;

public class Produto implements Serializable{
    
    private String nome;
    private double preco;
    private String vendedor;
    private String icone;
    private Categoria categoria;
        
    public Produto(String nome, double preco, String vendedor, Categoria categoria, String icone){
        this.nome = nome;
        this.preco = preco;
        this.vendedor = vendedor;
        this.categoria = categoria;
        this.icone = icone;
    }
    
    public String salvarProduto(){
        return String.format("%s;%.2f;%s;%s;%s", nome, preco, vendedor, categoria.getNome(), getIcone());
    }

   public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    public String getVendedor() {
        return vendedor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getIcone() {
        return icone;
    }
    
}
