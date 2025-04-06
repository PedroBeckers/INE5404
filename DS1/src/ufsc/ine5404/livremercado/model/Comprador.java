package ufsc.ine5404.livremercado.model;

import java.util.ArrayList;


/**
 Representa um comprador que pode adicionar produtos ao carrinho e efetuar compras.
 */
public class Comprador extends Pessoa {

	/**
	 Construtor que inicializa um novo comprador com o nome especificado.

	 @param nome O nome do comprador.
	 */
	public Comprador(String nome) {
		super(nome);
		this.carrinho = new Carrinho();
	}

	/**
	 Adiciona um produto ao carrinho do comprador.

	 @param produto    O produto a ser adicionado.
	 @param vendedor   O vendedor do produto.
	 @param quantidade A quantidade do produto a ser adicionada.
	 */
	public void adicioneAoCarrinho(Produto produto, Vendedor vendedor, int quantidade) {
		carrinho.adicioneItem(produto, vendedor, quantidade);
	}

	/**
	 Efetua a compra dos itens presentes no carrinho do comprador.
	 <p>
	 Este método percorre todos os itens no carrinho, obtendo para cada um o produto, o vendedor e a quantidade desejada.
	 Em seguida, tenta reduzir a quantidade do produto no estoque do vendedor correspondente utilizando o método
	 {@link Estoque#reduzaQuantidade(Produto, int)}. Se a redução for bem-sucedida, a quantidade do item no carrinho é zerada
	 para indicar que a compra foi concluída. Caso ocorra uma exceção {@link IllegalArgumentException} durante essa operação,
	 ela é capturada, mas não é tratada, permitindo que o processo continue com os demais itens. Nesse caso (compra do item
	 nao realizada, a quantidade
	 que deveria ser comprada continua no item do carrinho.
	 <p>
	 Após tentar efetuar a compra de todos os itens, o método remove os itens cujo estoque foi zerado do carrinho (ou seja,
	 a compra foi realizada), garantindo que o carrinho esteja pronto para novas compras e que contenha apenas os itens
	 que nao puderam ser comprados.
	 <p>
	 Este método não retorna nenhum valor e modifica o estado do carrinho e do estoque dos vendedores.
	 */
	public void efetuarCompra() {
            
            for(ItemCompra itemDoCarrinho : carrinho.getItens()){
                
                try{
                    itemDoCarrinho.getVendedor().getEstoque().reduzaQuantidade(itemDoCarrinho.getProduto(), itemDoCarrinho.getQuantidade());
                    itemDoCarrinho.setQuantidade(0);
                }
                catch(IllegalArgumentException e){}
            }
            
            for(ItemCompra itemDoCarrinho : carrinho.getItens()){
                if (itemDoCarrinho.getQuantidade() == 0){
                    carrinho.removaItem(itemDoCarrinho);                    
                }
            }
            
	}

	/**
	 Retorna o carrinho do comprador.

	 @return O carrinho do comprador.
	 */
	public Carrinho getCarrinho() {
		return carrinho;
	}

	/**
	 Retorna uma representação em string do comprador, incluindo as informações do carrinho.

	 @return Uma string representando o comprador.
	 */
	@Override
	public String toString() {
		return super.toString() + ", carrinho=" + carrinho;
	}

	private Carrinho carrinho;
}