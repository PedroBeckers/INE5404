package ufsc.ine5404.livremercado.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Representa um mercado que contém categorias de produtos, vendedores e compradores.
 */
public class Mercado {

	/**
	 Construtor que inicializa um novo mercado com listas vazias de categorias, vendedores e compradores.
	 */
	public Mercado() {
            categorias = new ArrayList<>();
            compradores = new ArrayList<>();
            vendedores = new ArrayList<>();
	}

	/**
	 Adiciona uma nova categoria ao mercado.
	 <p>
	 Este método verifica se a categoria já está presente na lista
	 de categorias. Se não estiver, a categoria é adicionada.

	 @param categoria A categoria a ser adicionada ao mercado.
	 */
	public void adicioneCategoria(Categoria categoria) {
            for(Categoria iteradorCategoria : categorias){
                if(iteradorCategoria.equals(categoria)){
                    return;
                }
            }
            categorias.add(categoria);
	}

	/**
	 Adiciona um novo comprador ao mercado.
	 <p>
	 Este método verifica se o comprador já está presente na lista
	 de compradores. Se não estiver, o comprador é adicionado.

	 @param comprador O comprador a ser adicionado ao mercado.
	 */
	public void adicioneComprador(Comprador comprador) {
            for(Comprador iteradorComprador : compradores){
                if(iteradorComprador.equals(comprador)){
                    return;
                }
            }
            compradores.add(comprador);
	}

	/**
	 Adiciona um novo vendedor ao mercado.
	 <p>
	 Este método verifica se o vendedor já está presente na lista
	 de vendedores. Se não estiver, o vendedor é adicionado.

	 @param vendedor O vendedor a ser adicionado ao mercado.
	 */
	public void adicioneVendedor(Vendedor vendedor) {
            for(Vendedor iteradorVendedor : vendedores){
                if(iteradorVendedor.equals(vendedor)){
                    return;
                }
            }
            vendedores.add(vendedor);
	}

	/**
	 Retorna a lista de categorias do mercado.
	 <p>
	 Este método fornece uma visão não modificável da lista de
	 categorias disponíveis no mercado.

	 @return A lista de categorias.
	 */
	public List<Categoria> getCategorias() {
		return Collections.unmodifiableList(categorias);
	}

	/**
	 Retorna a lista de compradores do mercado.
	 <p>
	 Este método fornece uma visão não modificável da lista de
	 compradores registrados no mercado.

	 @return A lista de compradores.
	 */
	public List<Comprador> getCompradores() {
		return Collections.unmodifiableList(compradores);
	}

	/**
	 Retorna a lista de vendedores do mercado.

	 @return A lista de vendedores.
	 */
	public List<Vendedor> getVendedores() {
		return Collections.unmodifiableList(vendedores);
	}

	/**
	 Retorna uma representação em string do mercado, incluindo o número de categorias, compradores e vendedores.

	 @return Uma string representando o estado do mercado.
	 */
	@Override
	public String toString() {
		return "categorias.size=" + categorias.size() + ", compradores.size=" + compradores.size() + ", vendedores.size=" + vendedores.
				size();
	}

	private final List<Categoria> categorias;
	private final List<Comprador> compradores;
	private final List<Vendedor> vendedores;
}