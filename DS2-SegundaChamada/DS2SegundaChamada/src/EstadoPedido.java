


/**
 Interface que define os métodos para gerenciar estados de um pedido.
 */
public interface EstadoPedido {
	void avancar(Pedido pedido);

	void cancelar(Pedido pedido);
}
