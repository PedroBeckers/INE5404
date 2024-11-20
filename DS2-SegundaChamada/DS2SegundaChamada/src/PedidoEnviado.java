


/**
 Estado do pedido quando foi enviado.
 */
public class PedidoEnviado implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		pedido.setEstado(new PedidoEntregue());
		// Transiciona o pedido para o estado "Entregue".
		System.out.println("Pedido avançou para o estado: Entregue.");
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Não é possível cancelar o pedido após ele ter sido enviado.");
	}
}
