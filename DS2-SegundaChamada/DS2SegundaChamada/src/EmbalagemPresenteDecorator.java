


/**
 Decorador que adiciona uma embalagem de presente ao produto.
 */
public class EmbalagemPresenteDecorator extends ProdutoDecorator {

	/**
	 Construtor que recebe o produto a ser decorado.

	 @param produto Produto base.
	 */
	public EmbalagemPresenteDecorator(Produto produto) {
		super(produto);
	}

	@Override
	public String getDescricao() {
		// COMPLETE
		//Adiciona "com embalagem de presente" à descrição.
                return produto.getDescricao() + " com embalagem de presente";
                
                
	}

	@Override
	public double getPreco() {
		// COMPLETE
		// Adiciona um custo fixo de 5 reais ao preço base.
                return produto.getPreco() + 5;
	}
}
