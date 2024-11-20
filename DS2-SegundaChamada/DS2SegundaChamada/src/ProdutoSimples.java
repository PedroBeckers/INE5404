


/**
 Implementação básica de um produto.
 */
public class ProdutoSimples implements Produto {
	private String nome;
	private double preco;

	/**
	 Construtor para inicializar um produto simples.

	 @param nome  Nome do produto.
	 @param preco Preço do produto.
	 */
	public ProdutoSimples(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public String getDescricao() {
		// COMPLETE
		// Retorna o nome do produto.
                return nome;
	}

	@Override
	public double getPreco() {
		// COMPLETE
		// Retorna o preço do produto.
                return preco;
	}
}
