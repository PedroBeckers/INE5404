package model;

import java.util.ArrayList;
import java.util.List;

public class Comprador {
    
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String cpf;
    private String email;
    private List<Produto> carrinho = new ArrayList<>();
    
    public Comprador(String nome, String sobrenome, String dataNascimento, String cpf, String email){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
    }
    
    //DESENVOLVER
    public void efetuarCompra(){
        
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }
    
}
