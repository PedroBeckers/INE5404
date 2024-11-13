package Model;

/*
FormasDePagamento, PagamentoBoleto, PagamentoCartao nao estao sendo utilizados
Padrao Strategy foi implementado pelas classes do UML
*/

/**
 UFSC/CTC/INE/INE5404
 Description: Demonstrates the functionalities of the online shopping system using design patterns.

 Author: Professor Cancian
 Version:
 Since:
 */
public class Main {
	public static void main(String[] args) {
		// Uso de uma fábrica para dispositivos concretos 
		System.out.println("\nSeu sistema de compras está executando num celular modelo X\n");
		DispositivoFactory factory = new SmartphoneModeloXFabrica();
		DispositivoLocalizador localizador = factory.criarDispositivoLocalizador();
		DispositivoDataProvider dataProvider = factory.criarDispositivoDataProvider();
		System.out.println("Localização obtida: " + localizador.obterLocalizacao());
		System.out.println("Data obtida: " + dataProvider.obterData());

		// Criação de um primeiro carrinho de compras
		Carrinho carrinho1 = new Carrinho();
		Compra compra1 = new Compra(carrinho1);

		// Estratégia de pagamento (Strategy)
		compra1.setPagamentoStrategy(new CartaoCreditoStrategy());

		// Adicionando itens ao primeiro carrinho
		Item item1 = new Item("Produto A", 10.0);
		carrinho1.adicionarItem(item1);
		Item item2 = new Item("Produto B", 20.0);
		carrinho1.adicionarItem(item2);
                
                
		// Desfazer e refazer ações no carrinho (Memento)
		System.out.println("Estado atual do carrinho1: " + carrinho1.getItens());
		carrinho1.removerItem(item1);
		System.out.println("Após remover Produto A: " + carrinho1.getItens());
		carrinho1.desfazer();
		System.out.println("Após desfazer remoção: " + carrinho1.getItens());
		carrinho1.refazer();
		System.out.println("Após refazer remoção: " + carrinho1.getItens());

		// Realizar pagamento com cartão de crédito
		compra1.realizarPagamento();

		// Criação de um segundo carrinho de compras
		Carrinho carrinho2 = new Carrinho();
		Compra compra2 = new Compra(carrinho2);

		// Mudando a estratégia de pagamento para boleto
		compra2.setPagamentoStrategy(new BoletoStrategy());

		// Adicionando itens ao segundo carrinho
		Item item3 = new Item("Produto C", 15.0);
		Item item4 = new Item("Produto D", 30.0);
		carrinho2.adicionarItem(item3);
		carrinho2.adicionarItem(item4);

		// Realizar pagamento com boleto
		compra2.realizarPagamento();

		// Notificar vendedores sobre a venda (Listener)
		Notificador notificador = new Notificador();
		VendaListener vendedor1 = new VendaListenerBase();
		VendaListener vendedor2 = new VendaListenerBase();

		notificador.adicionarListener(vendedor1);
		notificador.adicionarListener(vendedor2);

		// Notificação após venda
		notificador.notificarVenda(carrinho1.getItens());
		notificador.notificarVenda(carrinho2.getItens());

		// Criação de um terceiro carrinho de compras (usando Pix como forma de pagamento)
		Carrinho carrinho3 = new Carrinho();
		Compra compra3 = new Compra(carrinho3);
		compra3.setPagamentoStrategy(new PixStrategy());

		// Adicionando itens ao terceiro carrinho
		Item item5 = new Item("Produto E", 25.0);
		carrinho3.adicionarItem(item5);

		// Desfazer e refazer ações no terceiro carrinho
		System.out.println("Estado atual do carrinho3: " + carrinho3.getItens());
		carrinho3.removerItem(item5);
		System.out.println("Após remover Produto E: " + carrinho3.getItens());
		carrinho3.desfazer();
		System.out.println("Após desfazer remoção de Produto E: " + carrinho3.getItens());

		// Realizar pagamento com Pix
		compra3.realizarPagamento();

	}
}
