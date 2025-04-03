
package model;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    
    private List<Memento> mementos;
    private int indexAtual;
    
    public Caretaker(){
        mementos = new ArrayList<>();
        indexAtual = -1;
    }
    
    public void salvarEstado(Memento memento) {
        if(temPosterior()){
            int i = mementos.size() - 1;
            while(!mementos.get(i).equals(mementos.get(indexAtual))){
                mementos.remove(i);
                i -= 1;
            }
        }
        mementos.add(memento);
        indexAtual += 1;
    }
    
    public boolean temAnterior(){
        return indexAtual > 0;
    }
    
    public boolean temPosterior(){
        return indexAtual < mementos.size() - 1;
    }
    
    public Memento getMementoAnterior(){
        if(temAnterior()){
            indexAtual -= 1;
            return mementos.get(indexAtual);
        }
        return null;
    }
    
    public Memento getMementoPosterior(){
        if(temPosterior()){
            indexAtual -= 1;
            return mementos.get(indexAtual);
        }
        return null;
    }
    
    public Memento desfazer(){
        if(temAnterior()){
            indexAtual -= 1;
            return mementos.get(indexAtual);
        }
        return null;
    }
    
    public Memento refazer(){
        if(temPosterior()){
            indexAtual += 1;
            return mementos.get(indexAtual);
        }
        return null;
    }

}
