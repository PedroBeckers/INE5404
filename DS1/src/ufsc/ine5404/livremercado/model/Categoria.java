package ufsc.ine5404.livremercado.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Representa uma categoria de produtos, que pode conter subcategorias e produtos.
 */
class Categoria {

	/**
	 Constrói uma nova instância de Categoria com o nome especificado.
	 <p>
	 Este construtor inicializa a categoria com o nome fornecido, além de
	 criar listas vazias para subcategorias e produtos associados a esta
	 categoria.

	 @param nome O nome da categoria a ser criada.
	 */
	public Categoria(String nome) {
		this.nome = nome;
		this.subcategorias = new ArrayList<>();
		this.produtos = new ArrayList<>();
	}

	/**
	 Adiciona um produto à categoria, garantindo que sua categoria esteja sempre atualizada.
	 <p>
	 Este método verifica se o produto já está na lista de produtos da categoria. Se não estiver,
	 ele é adicionado à lista. Em seguida, o método atualiza a categoria do produto para a categoria atual,
	 removendo-o de qualquer categoria anterior, se necessário. Isso assegura que o produto mantenha
	 a associação correta com sua nova categoria, mesmo que já estivesse presente na lista.
	 </p>

	 @param produto O produto a ser adicionado à categoria.
	 */
	public void adicioneProduto(Produto produto) {
            if(!produtos.contains(produto)){
                produtos.add(produto);
                if(!produto.getCategoria().equals(this)){
                    produto.getCategoria().produtos.remove(produto);
                    produto.setCategoria(this);
                }
            }
	}

	/**
	 Adiciona uma subcategoria à categoria.
	 <p>
	 Este método verifica se a subcategoria já está presente na lista de
	 subcategorias. Se não estiver, a subcategoria é adicionada à lista.

	 @param subcategoria A subcategoria a ser adicionada à categoria.
	 */
	public void adicioneSubcategoria(Categoria subcategoria) {
		if (!subcategorias.contains(subcategoria))
			subcategorias.add(subcategoria);
	}

	/**
	 Retorna o nome da categoria.

	 @return O nome da categoria.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 Retorna uma lista imutável de produtos pertencentes à categoria.
	 <p>
	 Este método fornece acesso à lista de produtos, garantindo que
	 a lista retornada não possa ser modificada diretamente.

	 @return Uma lista imutável de produtos da categoria.
	 */
	public List<Produto> getProdutos() {
		return Collections.unmodifiableList(produtos);
	}

	/**
	 Retorna uma lista imutável de subcategorias pertencentes à categoria.
	 <p>
	 Este método fornece acesso à lista de subcategorias, garantindo que
	 a lista retornada não possa ser modificada diretamente.

	 @return Uma lista imutável de subcategorias da categoria.
	 */
	public List<Categoria> getSubcategorias() {
		return Collections.unmodifiableList(subcategorias);
	}

	/**
	 Remove uma categoria do sistema, permitindo a opção de remoção permanente ou temporária.
	 <p>
	 Este método permite que uma categoria seja removida de maneira permanente ou que sua remoção seja
	 temporária. Na remoção temporária, a subcategoria é removida e nada mais precisa ser feito feito.
	 Se a remoção for permanente, a categoria é excluída de forma definitiva. Nesse caso, todos os produtos que eram
	 da categoria removida passam a ser da categoria à qual ela pertencia. Além disso, na remoção
	 permanente, todas as subcategorias daquela que foi removida passam a ser subcategorias da categoria
	 à qual ela pertencia.
	 </p>
	 <p>
	 A remoção temporária é útil para gerenciar categorias que podem ser reintegradas posteriormente,
	 possivelmente em outro ramo da árvore de categorias, enquanto a remoção permanente é aplicada
	 quando a categoria não é mais necessária. O método garante que as referências a produtos ou
	 subcategorias relacionadas sejam movidos adequadamente durante o processo de remoção.
	 </p>

	 @param categoria  A categoria a ser removida.
	 @param permanente Indica se a remoção deve ser permanente (true) ou temporária (false).

	 @throws IllegalArgumentException Se a categoria não existir no sistema.
	 */
	void removaSubcategoria(Categoria subcategoria, boolean permanente) {
            if(permanente){
                for(Produto produto : subcategoria.produtos){
                    this.adicioneProduto(produto);
                    produto.setCategoria(this);
                }
                for(Categoria subcat : subcategoria.subcategorias){
                    this.adicioneSubcategoria(subcat);
                }
            }
            subcategorias.remove(subcategoria);
	}

	/**
	 Retorna uma representação em string da categoria, incluindo o nome e o número de subcategorias.

	 @return Uma string representando a categoria.
	 */
	public String toString() {
		return "nome=" + nome + ", subcategorias.size=" + subcategorias.size();
	}

	private String nome;
	private List<Produto> produtos;
	private List<Categoria> subcategorias;
}
