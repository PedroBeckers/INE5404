package Model;

/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
import java.util.ArrayList;
import java.util.List;

/**
 Classe Carrinho representa o carrinho de compras de um usuário.
 Implementa o padrão Memento para permitir desfazer e refazer operações no carrinho.
 */
public class Carrinho {
	/**
	 Adiciona um item ao carrinho e salva o estado atual.

	 @param item o item a ser adicionado.
	 */
	public void adicionarItem(Item item) {
            itens.add(item);
            caretaker.salvarEstado(new Memento(itens));
	}

	/**
	 Remove um item do carrinho e salva o estado atual.

	 @param item o item a ser removido.
	 */
	public void removerItem(Item item) {
            itens.remove(item);
            caretaker.salvarEstado(new Memento(itens));
	}

	/**
	 Restaura o último estado do carrinho.
	 Pede para o CareTaker desfazer a ação. Se houver um estado prévio (foi desfeito)
	 então atualiza os itens do carrinho com o estado anterior.
	 */
	public void desfazer() {
            if(caretaker.hasPrevious()){
               itens = caretaker.desfazer().getEstado();
            }
        }

	/**
	 Restaura o próximo estado do carrinho.
	 Pede para o CareTaker refazer a ação. Se houver um estado a ser refeito,
	 então atuaiza os itens do carrinho com o estado recuperado
	 */
	public void refazer() {
            if(caretaker.hasNext()){
                itens = caretaker.refazer().getEstado();
            }
        }

	/**
	 Calcula o total dos itens no carrinho.

	 @return o total em reais.
	 */
	public double calcularTotal() {
		return itens.stream().mapToDouble(Item::getPreco).sum();
	}

	public List<Item> getItens() {
		return itens;
	}

        public CareTaker getCareTaker(){
            return caretaker;
        }
        
	private List<Item> itens = new ArrayList<>();
	private CareTaker caretaker = new CareTaker();
    
    
}
