package Model;

/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Implementação do PagamentoStrategy para pagamento com boleto.
 */
public class BoletoStrategy implements PagamentoStrategy {
	@Override
	public void pagar(double valor) {
		System.out.println("Pagando com boleto: R$ " + valor);
	}
}
