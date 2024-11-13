package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Interface FormaPagamento define um método para processar pagamentos.
 É parte do padrão Strategy e permite que diferentes formas de pagamento
 possam ser implementadas e utilizadas de forma intercambiável.
 */
public interface FormaPagamento {
	/**
	 Processa o pagamento de um valor específico.
	 Este método deve ser implementado por cada classe de pagamento específica.

	 @param valor o valor a ser pago
	 */
	void processarPagamento(double valor);
}
