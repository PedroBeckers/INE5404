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
 Classe Notificador gerencia os listeners e notifica-os sobre vendas.
 */
/**
 Classe Notificador gerencia e notifica listeners quando uma venda ocorre.
 */
public class Notificador {

	public void adicionarListener(VendaListener listener) {
		listeners.add(listener);
	}

	public void notificarVenda(List<Item> itensVendidos) {
            for(Item item : itensVendidos){
                for(VendaListener listener : listeners){
                    listener.produtoVendido(item);
                }
            }
        }

	public void removerListener(VendaListener listener) {
		listeners.remove(listener);
	}
	
    private List<VendaListener> listeners = new ArrayList<>();
	
}
