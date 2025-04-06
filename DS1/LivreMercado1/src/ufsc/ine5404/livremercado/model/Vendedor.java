package ufsc.ine5404.livremercado.model;


/**
 Representa um vendedor que possui um estoque de produtos.
 */
public class Vendedor extends Pessoa {

	/**
	 Cria um novo vendedor com o nome especificado e inicializa o estoque.

	 @param nome O nome do vendedor.
	 */
	public Vendedor(String nome) {
		super(nome);
		this.estoque = new Estoque();
	}

	/**
	 Adiciona um produto ao estoque do vendedor com a quantidade especificada.

	 @param produto    O produto a ser adicionado.
	 @param quantidade A quantidade do produto a ser adicionada.
	 */
	public void adicioneProdutoAoEstoque(Produto produto, int quantidade) {
		estoque.adicioneItem(produto, quantidade);
	}

	/**
	 Obtém o estoque atual do vendedor.

	 @return O estoque do vendedor.
	 */
	public Estoque getEstoque() {
		return estoque;
	}

	/**
	 Remove um produto do estoque.
	 <p>
	 Este método percorre a lista de itens no estoque em busca do produto especificado.
	 Se encontrar um item que corresponda ao produto fornecido, o item é removido do estoque.
	 Se o produto não estiver presente no estoque, nenhuma ação é realizada.
	 </p>

	 @param produto O produto a ser removido do estoque.
	 */
	public void romovaProdutoDoEstoque(Produto produto) {
		for (ItemEstoque item : estoque.getItens())
			if (item.getProduto().equals(produto)) {
				estoque.removaItem(item);
				return;
			}
	}

	/**
	 Retorna uma representação em string do vendedor, incluindo informações do estoque.

	 @return Uma string representando o vendedor.
	 */
	@Override
	public String toString() {
		return super.toString() + ", estoque=" + estoque;
	}

	private Estoque estoque;

}
