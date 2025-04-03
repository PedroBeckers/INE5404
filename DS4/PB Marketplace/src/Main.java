import java.io.FileNotFoundException;
import java.io.IOException;

import model.*;
import view.*;

public class Main {
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        
        String texto = "C:src\\data\\products\\texto.txt";
        String binario = "C:src\\data\\products\\binario.bin";
        
        /*
        //Criando categorias (Vertices)
        Categoria c0 = new Categoria("Root");
        Categoria c1 = new Categoria("Clothing");
        Categoria c2 = new Categoria("Shoes");
        Categoria c3 = new Categoria("T-Shirts");
        Categoria c4 = new Categoria("Shorts");
        Categoria c5 = new Categoria("Flip-Flops");
        Categoria c6 = new Categoria("Swimming Shorts");
        
        //Configurando relacoes entre categorias (Arestas)
        c0.adicioneSubcategoria(c1);
        c0.adicioneSubcategoria(c2);
        c1.adicioneSubcategoria(c3);
        c1.adicioneSubcategoria(c4);
        c2.adicioneSubcategoria(c5);
        c4.adicioneSubcategoria(c6);
        
        //Adicionando produtos as categorias
        c1.adicioneProduto(new Produto("White Dress", 380.90, "C", c1, "/data/images/WhiteDress.jpg"));
        c2.adicioneProduto(new Produto("Dress Shoes", 600, "S", c2, "/data/images/DressShoes.jpg"));
        c2.adicioneProduto(new Produto("Wool Slippers", 80.75, "S", c2, "/data/images/WoolSlippers.jpg"));
        c3.adicioneProduto(new Produto("Plain White T-Shirt", 27.50, "Tee", c3, "/data/images/WhiteTShirt.jpg"));
        c3.adicioneProduto(new Produto("Plain Red T-Shirt", 27.50, "Tee", c3, "/data/images/RedTShirt.jpg"));
        c3.adicioneProduto(new Produto("Plain Yellow T-Shirt", 27.50, "Tee", c3, "/data/images/YellowTShirt.jpg"));
        c4.adicioneProduto(new Produto("Grey Workout Shorts", 179.90, "S", c4, "/data/images/GreyWorkoutShorts.jpg"));
        c5.adicioneProduto(new Produto("Black Flip-Flops", 50.99, "S", c5, "/data/images/BlackFlipFlops.jpg"));
        c6.adicioneProduto(new Produto("Blue Swimming Shorts", 300, "S", c6, "/data/images/BlueSwimmingShorts.jpg"));
        
        Categoria.salvarCategoriaTexto(c0, texto);
        Categoria.salvarCategoriaBinario(c0, binario);
        */
        /*
        //CARREGA CATEGORIAS E PRODUTOS SALVOS EM TEXTO
        Categoria c0 = Categoria.carregarCategoriaTexto(texto);
        Categoria c1 = c0.getSubcategorias().get(0);
        Categoria c2 = c0.getSubcategorias().get(1);
        Categoria c3 = c1.getSubcategorias().get(0);
        Categoria c4 = c1.getSubcategorias().get(1);
        Categoria c5 = c2.getSubcategorias().get(0);
        Categoria c6 = c4.getSubcategorias().get(0);
        Categoria[] categorias = {c0, c1, c2, c3, c4, c5, c6}; 
        
        for(int i = 0; i < 7; i++){
            System.out.println(categorias[i].toString());
        }
        */
        /*
        //CARREGA CATEGORIAS E PRODUTOS SERIALIZADOS
        Categoria c0 = Categoria.carregarCategoriaBinario(binario);
        Categoria c1 = c0.getSubcategorias().get(0);
        Categoria c2 = c0.getSubcategorias().get(1);
        Categoria c3 = c1.getSubcategorias().get(0);
        Categoria c4 = c1.getSubcategorias().get(1);
        Categoria c5 = c2.getSubcategorias().get(0);
        Categoria c6 = c4.getSubcategorias().get(0);
        Categoria[] categorias = {c0, c1, c2, c3, c4, c5, c6}; 
        
        for(int i = 0; i < 7; i++){
            System.out.println(categorias[i].toString());
        }
        */
        
        //CODIGO ORIGINAL
        new MainWindow(Categoria.carregarCategoriaBinario(binario)).setVisible(true);
        
        
        
    }
   
}
