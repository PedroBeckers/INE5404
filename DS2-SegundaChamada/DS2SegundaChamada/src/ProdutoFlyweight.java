


/**
 Produto que utiliza características compartilhadas (Flyweight).
 */
public class ProdutoFlyweight {
	private String nome;
	private double preco;
	private CaracteristicaProduto caracteristica;

	/**
	 Construtor para criar um produto com características compartilhadas.

	 @param nome           Nome do produto.
	 @param preco          Preço do produto.
	 @param caracteristica Característica compartilhada.
	 */
	public ProdutoFlyweight(String nome, double preco, CaracteristicaProduto caracteristica) {
		this.nome = nome;
		this.preco = preco;
		this.caracteristica = caracteristica;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public CaracteristicaProduto getCaracteristica() {
		return caracteristica;
	}
}
