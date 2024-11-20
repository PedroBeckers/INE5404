
public class Pedido {
	private EstadoPedido estado; 
        
        //Estados ordenados: PedidoCriado -> PedidoProcessando -> PedidoEnviado -> PedidoEntregue

	/**
	 Construtor que inicializa o pedido no estado "Criado".
	 */
	public Pedido() {
		this.estado = new PedidoCriado();
	}

	/**
	 Retorna o estado atual do pedido.

	 @return Estado atual do pedido.
	 */
	public EstadoPedido getEstado() {
		return estado;
	}

	/**
	 Define o estado atual do pedido.

	 @param estado Novo estado do pedido.
	 */
	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

	/**
	 Avança o estado do pedido para o próximo.
	 */
	public void avancar() {
		estado.avancar(this);
	}

	/**
	 Cancela o pedido no estado atual.
	 */
	public void cancelar() {
		estado.cancelar(this);
	}
}
