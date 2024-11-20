


public class Main {
	public static void main(String[] args) {
		// === Proxy: Gerenciamento do histórico de compras ===
		System.out.println("=== Proxy ===");
		try {
			HistoricoCompras historico = new ProxyHistoricoCompras(true); // Com permissão
			historico.adicionarCompra("Notebook Dell");
			historico.adicionarCompra("Smartphone Samsung");
			System.out.println("Histórico de compras: " + historico.getCompras());

			HistoricoCompras historicoRestrito = new ProxyHistoricoCompras(false); // Sem permissão
			historicoRestrito.getCompras(); // Deve lançar SecurityException
		} catch (SecurityException e) {
			System.out.println("Erro ao acessar histórico: " + e.getMessage());
		}

		// === Decorator: Adicionar funcionalidades extras aos produtos ===
		System.out.println("\n=== Decorator ===");
		Produto produtoSimples = new ProdutoSimples("Notebook Acer", 2500.0);
		System.out.println("Produto base: " + produtoSimples.getDescricao() + " | Preço: " + produtoSimples.getPreco());

		// Adicionando embalagem de presente
		Produto produtoComEmbalagem = new EmbalagemPresenteDecorator(produtoSimples);
		System.out.println("Com embalagem: " + produtoComEmbalagem.getDescricao() + " | Preço: " + produtoComEmbalagem.
				getPreco());

		// Adicionando garantia estendida
		Produto produtoComGarantia = new GarantiaEstendidaDecorator(produtoComEmbalagem);
		System.out.println(
				"Com garantia estendida: " + produtoComGarantia.getDescricao() + " | Preço: " + produtoComGarantia.
				getPreco());

		// === State: Ciclo de vida do pedido ===
		System.out.println("\n=== State ===");
		Pedido pedido = new Pedido();
		pedido.avancar(); // Criado -> Processando
		pedido.avancar(); // Processando -> Enviado
		pedido.cancelar(); // Tentar cancelar após enviado (não permitido)
		pedido.avancar(); // Enviado -> Entregue
		pedido.avancar(); // Tentar avançar após entregue (não permitido)

		// === Flyweight: Compartilhamento de características de produtos ===
		System.out.println("\n=== Flyweight ===");
		CaracteristicaProduto c1 = CaracteristicaProdutoFactory.getCaracteristica("Dell", "Notebook", "Inspiron");
		CaracteristicaProduto c2 = CaracteristicaProdutoFactory.getCaracteristica("Dell", "Notebook", "Inspiron"); // Compartilhado

		ProdutoFlyweight p1 = new ProdutoFlyweight("Notebook Inspiron", 3000.0, c1);
		ProdutoFlyweight p2 = new ProdutoFlyweight("Notebook Inspiron Plus", 3200.0, c2);

		System.out.println("Produto 1: " + p1.getNome() + " | Marca: " + p1.getCaracteristica().getMarca());
		System.out.println("Produto 2: " + p2.getNome() + " | Marca: " + p2.getCaracteristica().getMarca());
		System.out.println("Característica compartilhada? " + (c1 == c2)); // Verifica compartilhamento
	}
}
