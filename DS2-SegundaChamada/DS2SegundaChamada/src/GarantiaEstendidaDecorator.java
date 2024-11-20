


/**
 Decorador que adiciona garantia estendida ao produto.
 */
public class GarantiaEstendidaDecorator extends ProdutoDecorator {

	/**
	 Construtor que recebe o produto a ser decorado.

	 @param produto Produto base.
	 */
	public GarantiaEstendidaDecorator(Produto produto) {
		super(produto);
	}

	@Override
	public String getDescricao() {
		// COMPLETE
		// Adiciona "com garantia estendida" à descrição.
                return produto.getDescricao() + " com garantia estendida";
	}

	@Override
	public double getPreco() {
		// COMPLETE
		//  Adiciona um custo fixo de 10 reais ao preço base.
                return produto.getPreco() + 10;
	}
}
