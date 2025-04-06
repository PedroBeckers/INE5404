package ufsc.ine5404.livremercado.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Representa um carrinho de compras que contém itens de compra.
 */
public class Carrinho {

	/**
	 Construtor que inicializa um novo carrinho de compras.
	 */
	public Carrinho() {
		this.itens = new ArrayList<>();
	}

	/**
	 Adiciona um item à lista de compras, verificando a disponibilidade em estoque do vendedor.
	 <p>
	 Este método realiza a verificação da quantidade disponível do produto no estoque do vendedor antes de
	 adicioná-lo à compra. Se o produto já estiver presente na lista de itens, a quantidade é atualizada,
	 desde que a quantidade total não exceda a disponível em estoque. Se o produto não estiver na lista,
	 ele é adicionado somente se houver quantidade suficiente disponível.
	 <p>
	 <p>
	 O método pode lançar uma exceção {@link IllegalArgumentException} nas seguintes situações:
	 <ul>
	 <li>Se a quantidade solicitada exceder a quantidade disponível em estoque.</li>
	 <li>Se a quantidade total (já existente no carrinho mais a nova) ultrapassar a quantidade em estoque.</li>
	 </ul>

	 @param produto    O produto que se deseja adicionar à compra.
	 @param vendedor   O vendedor do qual o produto está sendo adquirido.
	 @param quantidade A quantidade do produto a ser adicionada à compra.
	 */
	public void adicioneItem(Produto produto, Vendedor vendedor, int quantidade) throws IllegalArgumentException { //OKK
            
            for(ItemEstoque itemDoEstoqueDoVendedor : vendedor.getEstoque().getItens()){
                if(quantidade <= itemDoEstoqueDoVendedor.getQuantidade()){
                    for(ItemCompra itemDoCarrinho : itens){
                        if(itemDoCarrinho.getProduto().equals(produto) && itemDoCarrinho.getVendedor().equals(vendedor)){ //SE ITEM JA ESTAVA NO CARRINHO, APENAS ATUALIZAR QTD, APOS VERIFICAR QTD
                            int quantidadeSolicitada = quantidade + itemDoCarrinho.getQuantidade(); 
                            if(quantidadeSolicitada >= itemDoEstoqueDoVendedor.getQuantidade()){
                                itemDoCarrinho.setQuantidade(itemDoCarrinho.getQuantidade() + quantidade);
                                return;
                            }
                            else{
                                throw new IllegalArgumentException("quantidade solicitada junto a quantidade previa no carrinho excedem a quantidade disponível em estoque");
                            }
                        }
                    }//SE NAO ESTAVA NO CARRINHO, BASTA ADICIONAR
                    itens.add(new ItemCompra(produto, vendedor, quantidade));
                    return;
                }
                else{
                    throw new IllegalArgumentException("quantidade solicitada excede a quantidade disponível em estoque");
                }
            }
	}

	/**
	 Retorna a lista de itens no carrinho.

	 @return A lista de itens de compra.
	 */
	public List<ItemCompra> getItens() {
		return Collections.unmodifiableList(itens);
	}

	/**
	 Remove um item de compra do carrinho com base no produto fornecido.
	 <p>
	 Este método verifica cada item de compra no carrinho e, se encontrar
	 um item que corresponda ao produto passado como parâmetro, remove-o
	 da lista de itens. O método encerra a operação após a remoção do primeiro
	 item correspondente.

	 @param produto O produto a ser removido do carrinho de compras.
	 */
	public void removaItem(Produto produto) { //OK
            for(ItemCompra item : itens){
                if(item.getProduto().equals(produto)){
                    itens.remove(item);
                    return;
                }
            }
	}

	/**
	 Remove um item de compra da lista de itens.
	 <p>
	 Este método procura o item especificado na lista de itens e, se encontrado, o remove.
	 A remoção é realizada utilizando o método {@link List#remove(Object)} da coleção,
	 que garante que o item correspondente seja removido, caso exista.
	 Se o item não estiver presente na lista, a operação não terá efeito.
e
	 @param item O item de compra a ser removido da lista.
	             Caso o item não exista na lista, nenhuma ação será tomada.
	 */
	public void removaItem(ItemCompra item) {
		itens.remove(item);
	}

	/**
	 Retorna uma representação em string do carrinho, incluindo o número de itens.

	 @return Uma string representando o carrinho.
	 */
	@Override
	public String toString() {
		String texto = "itens.size" + itens.size() + ", itens=[";
		for (ItemCompra item : itens)
			texto += "(" + item.toString() + "),";
		return texto.substring(0, texto.length() - 1) + "]";
	}

	private final List<ItemCompra> itens;
}