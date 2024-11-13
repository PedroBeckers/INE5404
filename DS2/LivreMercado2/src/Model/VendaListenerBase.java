package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Classe que representa a notificação foi implementada nesta versao, entao apenas mostra que estaria notificando o vendedor
 */
public class VendaListenerBase implements VendaListener  {
	@Override
	public void produtoVendido(Item item) {
		System.out.println("Vendedor notificado da venda do item " + item.getNome());
	}
}
