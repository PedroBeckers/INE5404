package ufsc.ine5404.livremercado.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Representa um estoque que contém itens disponíveis para venda.
 */
public class Estoque {

	/**
	 Construtor que inicializa um novo estoque vazio.
	 */
	public Estoque() {
		this.itens = new ArrayList<>();
	}

	/**
	 Adiciona uma quantidade de um produto ao estoque.
	 <p>
	 O método verifica se o produto já existe no estoque. Se existir,
	 a quantidade do item correspondente é aumentada. Caso contrário,
	 um novo item de estoque é criado e adicionado à lista de itens do
	 estoque.

	 @param produto    O produto a ser adicionado ou atualizado no estoque.
	 @param quantidade A quantidade a ser adicionada ao estoque do produto.
	 */
	public void adicioneItem(Produto produto, int quantidade) { //OK
            for(ItemEstoque item : itens){
                if(item.getProduto().equals(produto)){
                    item.adicioneQuantidade(quantidade);
                    return;
                }
            }
            itens.add(new ItemEstoque(produto, quantidade));
	}

	/**
	 Remove um item do estoque.
	 <p>
	 Este método procura o item de estoque especificado na lista de itens
	 e o remove, se estiver presente. Caso o item não esteja no estoque,
	 nenhuma ação é realizada. Esta operação modifica a lista de itens
	 do estoque, reduzindo sua contagem.
	 </p>

	 @param item O item de estoque a ser removido.
	 */
	public void removaItem(ItemEstoque item) {
		itens.remove(item);
	}

	/**
	 Retorna a lista de itens no estoque.
	 <p>
	 Este método fornece uma visão imutável da lista de itens,
	 garantindo que as alterações na lista original não afetem
	 a lista retornada. Isso protege a integridade dos dados do estoque.

	 @return Uma lista não modificável de itens no estoque.
	 */
	public List<ItemEstoque> getItens() {
		return Collections.unmodifiableList(itens);
	}

	/**
	 Retorna a quantidade disponível em estoque de um produto específico.
	 <p>
	 Este método verifica cada item no estoque e, se encontrar um item que
	 corresponda ao produto passado como parâmetro, retorna a quantidade
	 desse produto. Se o produto não estiver presente no estoque, retorna 0.

	 @param produto O produto cuja quantidade em estoque deve ser verificada.

	 @return A quantidade do produto em estoque, ou 0 se o produto não estiver disponível.
	 */
	public int quantidadeEmEstoque(Produto produto) {
		for (ItemEstoque item : itens)
			if (item.getProduto().equals(produto))
				return item.getQuantidade();
		return 0;
	}

	/**
	 Reduz a quantidade disponível de um produto no estoque.
	 <p>
	 Este método procura pelo produto especificado na lista de itens do estoque.
	 Se o produto for encontrado, sua quantidade será reduzida pela quantidade fornecida.
	 Se a quantidade a ser reduzida for maior do que a quantidade disponível,
	 uma exceção {@link IllegalArgumentException} será lançada para indicar
	 que não há quantidade suficiente em estoque.
	 </p>

	 @param produto    O produto cuja quantidade deve ser reduzida no estoque.
	 @param quantidade A quantidade a ser reduzida. Deve ser um número positivo.

	 @throws IllegalArgumentException Se a quantidade a ser reduzida for maior
	                                  do que a quantidade disponível para o produto.
	 */
	public void reduzaQuantidade(Produto produto, int quantidade) throws IllegalArgumentException {
            for(ItemEstoque item : itens){
                if(item.getProduto().equals(produto)){
                    int novaQuantidade = item.getQuantidade() - quantidade;
                    if(novaQuantidade >= 0){
                        item.setQuantidade(novaQuantidade);
                    }
                    else{
                        throw new IllegalArgumentException("não há quantidade suficiente em estoque");
                    }
                }
            }
	}

	/**
	 Retorna uma representação em string do estoque, incluindo o número de itens.

	 @return Uma string representando o estoque.
	 */
	@Override
	public String toString() {
		return "itens.size=" + itens.size();
	}

	private final List<ItemEstoque> itens;
}