


/**
 Classe Flyweight que armazena características compartilhadas entre produtos.
 */
public class CaracteristicaProduto {
	private String marca;
	private String categoria;
	private String modelo;

	/**
	 Construtor para inicializar características do produto.

	 @param marca     Marca do produto.
	 @param categoria Categoria do produto.
	 @param modelo    Modelo do produto.
	 */
	public CaracteristicaProduto(String marca, String categoria, String modelo) {
		this.marca = marca;
		this.categoria = categoria;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getModelo() {
		return modelo;
	}
}
