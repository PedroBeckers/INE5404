package ufsc.ine5404.livremercado.model;

/*
 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit
 this template
 */
/**

 @author cancian
 */
public class View_Mercado {

	public View_Mercado(Mercado mercado) {
		this.mercado = mercado;
		this.viewCtegorias = new View_Categorias(mercado.getCategorias().get(0));
		this.viewVendedores = new View_Vendedores(mercado.getVendedores());
		this.viewCompradores = new View_Compradores(mercado.getCompradores());
	}

	/**
	 <p>
	 */
	public void show() {
		System.out.println("Mercado:");
		viewCtegorias.show();
		viewVendedores.show();
		viewCompradores.show();
	}
	private final Mercado mercado;
	private View_Categorias viewCtegorias;
	private View_Vendedores viewVendedores;
	private View_Compradores viewCompradores;
}
