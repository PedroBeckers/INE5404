package Model;

/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Interface VendaListener define o comportamento de objetos que serão notificados após uma venda.
 Parte do padrão Listener, permitindo que diferentes tipos de ouvintes respondam ao evento de venda.
 */
/**
 Interface VendaListener representa um listener para eventos de venda.
 */
public interface VendaListener {
	void produtoVendido(Item item);
}
