package ufsc.ine5404.livremercado.model;


/**
 Representa um item no estoque, que associa um produto a uma quantidade disponível.
 */
public class ItemEstoque {

	/**
	 Construtor que inicializa um novo item de estoque com o produto e a quantidade especificados.

	 @param produto    O produto associado a este item de estoque.
	 @param quantidade A quantidade disponível do produto.
	 */
	public ItemEstoque(Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}

	/**
	 Adiciona uma quantidade ao item de estoque.

	 @param quantidade A quantidade a ser adicionada.
	 */
	public void adicioneQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}

	/**
	 Retorna o produto associado ao item de estoque.

	 @return O produto do item de estoque.
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 Retorna a quantidade disponível do produto no estoque.

	 @return A quantidade do item de estoque.
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 Retorna uma representação em string do item de estoque, incluindo produto e quantidade.

	 @return Uma string representando o item de estoque.
	 */
	@Override
	public String toString() {
		return "produto=" + produto + ", quantidade=" + quantidade;
	}

	/**
	 Define uma nova quantidade para o item de estoque.

	 @param novaQuantidade A nova quantidade a ser definida.
	 */
	void setQuantidade(int novaQuantidade) {
		this.quantidade = novaQuantidade;
	}

	private Produto produto;
	private int quantidade;
}
