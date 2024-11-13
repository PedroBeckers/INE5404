package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Classe Compra representa o processo de compra em uma plataforma de compras online.
 Implementa o padrão Strategy para diferentes formas de pagamento.
 */
public class Compra {

	/**
	 Construtor da classe Compra.

	 @param carrinho o carrinho associado a esta compra.
	 */
	public Compra(Carrinho carrinho) {
            this.carrinho = carrinho;
	}

	/**
	 Define a estratégia de pagamento a ser usada nesta compra.

	 @param pagamentoStrategy a forma de pagamento escolhida.
	 */
	public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
            this.pagamentoStrategy = pagamentoStrategy;
	}

	/**
	 Executa o pagamento usando a estratégia de pagamento definida.
	 Envia uma notificação de venda após o pagamento.
	 */
	public void realizarPagamento() {
            pagamentoStrategy.pagar(carrinho.calcularTotal());
            notificador.notificarVenda(carrinho.getItens());
	}

	private Carrinho carrinho;
	private PagamentoStrategy pagamentoStrategy;
        private Notificador notificador = new Notificador();
    
    
}
