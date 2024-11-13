package Model;

import java.util.ArrayList;
import java.util.List;

/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */


/**
 * A classe CareTaker gerencia a lista de Mementos que representam os estados salvos do carrinho.
 * Permite desfazer e refazer operações, mantendo um histórico de estados.
 */
public class CareTaker {

    
	/**
	 Construtor da classe CarrinhoCareTaker.
	 Inicializa a lista de mementos e o índice atual do histórico.
	 */
	public CareTaker() {
		// Inicializa lista de mementos e define índice inicial como -1
		this.mementos = new ArrayList<>();
		this.currentIndex = -1;
	}



    /**
     * Desfaz a última operação realizada no carrinho, retornando ao estado anterior.
     * Move o índice atual para trás e retorna o Memento correspondente ao estado anterior.
     * Se não houver estados anteriores, retorna null.
     *
     * @return o Memento representando o estado anterior do carrinho ou null se não for possível desfazer.
     */
    public Memento desfazer() {
        if(hasPrevious()){
            currentIndex -= 1;
            return mementos.get(currentIndex);
        }
        return null;
    }

    /**
     * Refaz a última operação desfeita no carrinho, avançando para o próximo estado.
     * Move o índice atual para frente e retorna o Memento correspondente ao próximo estado.
     * Se não houver estados seguintes, retorna null.
     *
     * @return o Memento representando o próximo estado do carrinho ou null se não for possível refazer.
     */
    public Memento refazer() {
        if(hasNext()){
            currentIndex += 1;
            return mementos.get(currentIndex);
        }
        return null;
    }

    /**
     * Salva um novo estado do carrinho na lista de Mementos.
     * Se um novo estado for salvo após uma operação de desfazer, 
     * os estados posteriores (após o índice atual) são descartados.
     * O novo estado é inserido e o índice atual é atualizado para o novo estado.
     *
     * @param memento o Memento que contém o estado atual do carrinho a ser salvo.
     */
    public void salvarEstado(Memento memento) {
        if(hasNext()){
            int i = mementos.size() - 1;
            while(!mementos.get(i).equals(mementos.get(currentIndex))){
                mementos.remove(i);
                i -= 1;
            }
        }
        mementos.add(memento);
        currentIndex += 1;
    }

    private int currentIndex = -1; // Índice que aponta para o estado atual na lista de Mementos.
    public List<Memento> mementos = new ArrayList<>();
    
	/**
	 Adiciona um novo memento ao histórico. 
	 Para isso, Remove mementos após o índice atual para manter consistência e então
	 Adiciona novo memento e atualiza o índice atual
	 @param memento o estado a ser adicionado ao histórico
	 */
	public void addMemento(Memento memento) {
            // Remove mementos após o índice atual para manter consistência
            if(hasNext()){
                int i = mementos.size() - 1;
                while(!mementos.get(i).equals(mementos.get(currentIndex))){
                    mementos.remove(i);
                    i -= 1;
                }
            }
            // Adiciona novo memento e atualiza o índice atual
	    mementos.add(memento);
            currentIndex += 1;
	}

	/**
	 Recupera o memento anterior no histórico.
	 Se houver algum item prévio, então decrementa o índice atual e retorna o 
	 memento nesse índice. Se não houver item anterior, retorna null
	 @return o memento anterior, ou null se não houver histórico anterior
	 */
	public Memento getPreviousMemento() {
            if(hasPrevious()){
                currentIndex -= 1;
                return mementos.get(currentIndex);
            }
            return null;
	}

	/**
	 Recupera o próximo memento no histórico.
	 Se houver próximo item, então incrementa o índice atual e retorna o memento
	 desse índice. Se não houver próximo, retorna null

	 @return o próximo memento, ou null se não houver memento seguinte
	 */
	public Memento getNextMemento() {
            if(hasNext()){
                currentIndex += 1;
                return mementos.get(currentIndex);
            }
            return null;
	}

	/**
	 Verifica se há mementos anteriores no histórico.

	 @return true se houver mementos anteriores, false caso contrário
	 */
	public boolean hasPrevious() {
		return currentIndex > 0;
	}

	/**
	 Verifica se há mementos seguintes no histórico.

	 @return true se houver mementos seguintes, false caso contrário
	 */
	public boolean hasNext() {
		return currentIndex < mementos.size() - 1;
	}


    
}
