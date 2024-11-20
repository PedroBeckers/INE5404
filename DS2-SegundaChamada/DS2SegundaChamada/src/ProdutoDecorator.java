


/**
 Classe base para decoradores de produtos.
 */
public abstract class ProdutoDecorator implements Produto {
	protected Produto produto;

	/**
	 Construtor que recebe o produto a ser decorado.

	 @param produto Produto base a ser decorado.
	 */
	public ProdutoDecorator(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String getDescricao() {
		return produto.getDescricao();
	}

	@Override
	public double getPreco() {
		return produto.getPreco();
	}
}
