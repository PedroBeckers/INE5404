package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Implementação do PagamentoStrategy para pagamento com cartão de crédito.
 */
public class CartaoCreditoStrategy implements PagamentoStrategy {
	@Override
	public void pagar(double valor) {
		System.out.println("Pagando com cartão de crédito: R$ " + valor);
	}
}
