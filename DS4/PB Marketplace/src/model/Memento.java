package model;

import java.util.HashMap;

public class Memento {
    
    private HashMap<Produto, Integer> estado;
    
    public Memento(HashMap<Produto, Integer> estado){
        this.estado = new HashMap<>(estado);
    }
    
    public HashMap<Produto, Integer> getEstado(){
        return new HashMap<>(estado);
    }
    
}
