package ufsc.ine5404.livremercado.model;


/**
 Classe que representa um produto no mercado.
 Cada produto possui um nome, modelo, marca, preço e está associado a uma categoria.

 @author cancian
 */
public class Produto {

	/**
	 Construtor que inicializa os atributos do produto e associa-o a uma categoria.
	 <p>
	 Este construtor recebe informações essenciais sobre o produto, como nome, modelo, marca e preço,
	 e também a categoria à qual o produto pertence. Além de inicializar os atributos do produto,
	 o método também registra o produto na lista de produtos da categoria fornecida.

	 @param nome      O nome do produto.
	 @param modelo    O modelo do produto.
	 @param marca     A marca do produto.
	 @param preco     O preço do produto.
	 @param categoria A categoria à qual o produto pertence, onde o produto será adicionado.
	 */
	public Produto(String nome, String modelo, String marca, double preco, Categoria categoria) {
		this.nome = nome;
		this.modelo = modelo;
		this.marca = marca;
		this.preco = preco;
		this.categoria = categoria; // Associando a categoria ao produto
		categoria.adicioneProduto(this);
	}

	/**
	 Obtém a categoria do produto.

	 @return A categoria do produto.
	 */
	public Categoria getCategoria() {
		return categoria; // Método para obter a categoria
	}

	/**
	 Seta a categoria do produto

	 @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	/**
	 Obtém a marca do produto.

	 @return A marca do produto.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 Obtém o modelo do produto.

	 @return O modelo do produto.
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 Obtém o nome do produto.

	 @return O nome do produto.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 Obtém o preço do produto.

	 @return O preço do produto.
	 */
	public double getPreco() {
		return preco;
	}

	/**
	 Retorna uma representação em String do produto.

	 @return String representando os detalhes do produto.
	 */
	@Override
	public String toString() {
		return "nome=" + nome + ", modelo=" + modelo + ", marca=" + marca + ", preço=" + preco + ", categoria=" + getCategoria();
	}
	private Categoria categoria;   // Referência à categoria do produto
	private String marca;          // Marca do produto
	private String modelo;         // Modelo do produto
	private String nome;           // Nome do produto
	private double preco;          // Preço do produto
}
