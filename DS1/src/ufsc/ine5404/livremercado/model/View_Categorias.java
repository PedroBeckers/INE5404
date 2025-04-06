package ufsc.ine5404.livremercado.model;
/*
 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**

 @author cancian
 */
public class View_Categorias {
	public View_Categorias(Categoria categoriaPrincipal) {
		this.categoria = categoriaPrincipal;
	}

	/**
	 <p>
	 */
	public void show() {
		System.out.println("Categorias:");
		for (Categoria umacategoria : categoria.getSubcategorias())
			showSubCategoria(umacategoria, "  ");
	}

	private void showSubCategoria(Categoria categoria, String indentacao) {
		System.out.println(indentacao + "- " + categoria);
		for (Categoria subcategoria : categoria.getSubcategorias())
			showSubCategoria(subcategoria, indentacao + "  ");
	}
	private final Categoria categoria;
}
