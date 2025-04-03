package model;

import java.util.HashMap;

public class Carrinho {
    
    private HashMap<Produto, Integer> itens;
    private Caretaker caretaker = new Caretaker();
    
    public Carrinho(){
        itens = new HashMap<>();
    }

    public HashMap<Produto, Integer> getItens() {
        return itens;
    }

    public void adicioneItem(Produto produto, int quantidade){
        getItens().put(produto, getItens().getOrDefault(produto, 0) + quantidade);
        caretaker.salvarEstado(new Memento(getItens()));
    }
    
    public void removeItem(Produto produto, int quantidade){
        int quantidadeAtual = getItens().getOrDefault(produto, 0);
        if(quantidadeAtual >= quantidade){
            getItens().put(produto, quantidadeAtual - quantidade);
        }
    }
    
    public void desfazer(){
        if(caretaker.temAnterior()){
            itens = caretaker.desfazer().getEstado();
        }
    }
    
    public void refazer(){
        if(caretaker.temPosterior()){
            itens = caretaker.refazer().getEstado();
        }
    }
    
    public double calcularTotal(){
        double soma = 0;
        for(Produto produto : getItens().keySet()){
            soma += produto.getPreco() * getItens().get(produto);
        }
        return soma;
    }
    
}
