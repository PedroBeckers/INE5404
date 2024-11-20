


/**
 Estado inicial de um pedido.
 */
public class PedidoCriado implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
                pedido.setEstado(new PedidoProcessando());
		// Transiciona o pedido para o estado "Processando".
		System.out.println("Pedido avançou para o estado: Processando.");
	}

	@Override
	public void cancelar(Pedido pedido) {
                pedido.setEstado(new PedidoCancelado());
		// Transiciona o pedido para o estado "Cancelado".
		System.out.println("Pedido foi cancelado.");
	}
}
