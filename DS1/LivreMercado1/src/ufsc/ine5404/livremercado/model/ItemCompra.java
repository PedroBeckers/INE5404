package ufsc.ine5404.livremercado.model;


/**
 Representa um item de compra, que associa um produto a um vendedor e uma quantidade.
 */
public class ItemCompra {

	/**
	 Construtor que cria um novo item de compra, associando um produto, um vendedor e a quantidade desejada.
	 <p>
	 Este método inicializa as propriedades do item de compra com os parâmetros fornecidos.
	 Ele verifica se o produto e o vendedor são válidos (não nulos) e se a quantidade é um valor positivo.
	 Caso contrário, lança uma exceção {@link IllegalArgumentException}.
	 A quantidade deve ser um número inteiro maior que zero para que o item de compra seja considerado válido.

	 @param produto    O produto a ser comprado, que deve ser um objeto válido.
	 @param vendedor   O vendedor do produto, que deve ser um objeto válido.
	 @param quantidade A quantidade do produto a ser comprada, que deve ser maior que zero.

	 @throws IllegalArgumentException Se o produto ou o vendedor forem nulos, ou se a quantidade for menor ou igual a zero.
	 */
	public ItemCompra(Produto produto, Vendedor vendedor, int quantidade) throws IllegalArgumentException {
            if(produto != null){
                this.produto = produto;
            }
            else{
                throw new IllegalArgumentException("O produto nao pode ser nulo.");
            }
            if(vendedor != null){
                this.vendedor = vendedor;
            }
            else{
                throw new IllegalArgumentException("O vendedor nao pode ser nulo.");
            }
            if(quantidade > 0){
                this.quantidade = quantidade;
            }
            else{
                throw new IllegalArgumentException("A quantidade deve ser um número inteiro maior que zero para que o item de compra seja considerado válido.");
            }
	}

	/**
	 Retorna o produto associado ao item de compra.

	 @return O produto do item de compra.
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 Retorna a quantidade do produto a ser comprada.

	 @return A quantidade do item de compra.
	 */
	public int getQuantidade() {
		return quantidade;
	}
	
	
	/**
	 @param quantidade the quantidade to set
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 Retorna o vendedor associado ao item de compra.

	 @return O vendedor do item de compra.
	 */
	public Vendedor getVendedor() {
		return vendedor;
	}

	/**
	 Retorna uma representação em string do item de compra, incluindo produto, quantidade e vendedor.

	 @return Uma string representando o item de compra.
	 */
	@Override
	public String toString() {
		return "produto=" + produto + ", quantidade=" + quantidade + ", vendedor=" + vendedor;
	}

	private final Produto produto;
	private int quantidade;
	private final Vendedor vendedor;

}