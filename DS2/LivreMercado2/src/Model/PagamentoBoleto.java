package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Classe PagamentoBoleto representa uma implementação de pagamento com boleto bancário.
 Implementa a interface FormaPagamento como parte do padrão Strategy.
 */
public class PagamentoBoleto  implements FormaPagamento  {
	/**
	 Realiza o pagamento com boleto bancário.
	 Este método simula a geração e processamento do boleto bancário.

	 @param valor o valor a ser pago
	 */
	@Override
	public void processarPagamento(double valor) {
		// Exibe mensagem simulando a geração do boleto bancário
		System.out.println("Pagamento de R$" + valor + " gerado por boleto bancário.");
	}
}
