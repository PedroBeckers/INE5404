


/**
 Estado final do pedido quando foi entregue.
 */
public class PedidoEntregue implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("O pedido já foi entregue. Não há mais estados para avançar.");
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("Não é possível cancelar o pedido após ele ter sido entregue.");
	}
}
