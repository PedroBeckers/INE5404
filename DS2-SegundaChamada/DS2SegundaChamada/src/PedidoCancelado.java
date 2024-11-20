


/**
 Estado do pedido quando foi cancelado.
 */
public class PedidoCancelado implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		System.out.println("O pedido foi cancelado e não pode avançar.");
	}

	@Override
	public void cancelar(Pedido pedido) {
		System.out.println("O pedido já está cancelado.");
	}
}
