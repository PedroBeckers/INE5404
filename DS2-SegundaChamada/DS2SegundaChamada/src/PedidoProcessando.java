


/**
 Estado do pedido quando está sendo processado.
 */
public class PedidoProcessando implements EstadoPedido {

	@Override
	public void avancar(Pedido pedido) {
		pedido.setEstado(new PedidoEnviado());
		// transiciona o pedido para o estado "Enviado"
		System.out.println("Pedido avançou para o estado: Enviado.");
	}

	@Override
	public void cancelar(Pedido pedido) {
                pedido.setEstado(new PedidoCancelado());
		// Transiciona o pedido para o estado "Cancelado".
		System.out.println("Pedido foi cancelado.");
	}
}
