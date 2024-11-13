package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Classe PagamentoCartao representa uma implementação de pagamento com cartão de crédito.
 Implementa a interface FormaPagamento como parte do padrão Strategy.
 */
public class PagamentoCartao  implements FormaPagamento {
	/**
	 Realiza o pagamento com cartão de crédito.
	 Este método simula uma transação de pagamento via cartão de crédito.

	 @param valor o valor a ser pago
	 */
	@Override
	public void processarPagamento(double valor) {
		// Exibe mensagem simulando o pagamento com cartão de crédito
		System.out.println("Pagamento de R$" + valor + " realizado com cartão de crédito.");
	}
}
