package ufsc.ine5404.livremercado.model;

import java.util.List;

/*
 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**

 @author cancian
 */
public class View_Vendedores {
	public View_Vendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	/**
	 <p>
	 */
	public void show() {
		System.out.println("Vendedores:");
		for (Vendedor vendedor : vendedores) {
			System.out.println(vendedor);
			View_Estoque.show(vendedor.getEstoque());
		}
	}
	private final List<Vendedor> vendedores;
}
