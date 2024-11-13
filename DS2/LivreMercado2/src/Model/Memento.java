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
 Classe Memento armazena o estado do carrinho para ser recuperado posteriormente.
 */
public class Memento {

	public Memento(List<Item> estado) {
            this.estado = new ArrayList<>(estado);
	}

	public List<Item> getEstado() {
            return new ArrayList<>(estado);
	}
	
    private List<Item> estado;
}
