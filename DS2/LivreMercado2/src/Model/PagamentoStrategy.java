package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Interface PagamentoStrategy define o contrato para uma forma de pagamento.
 Cada forma de pagamento implementa o método pagar.
 */
public interface PagamentoStrategy {
	/**
	 Realiza o pagamento de um valor.

	 @param valor O valor a ser pago.
	 */
	void pagar(double valor);
}
