package ufsc.ine5404.livremercado.model;

import java.util.List;

/*
 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**

 @author cancian
 */
public class View_Compradores {
	public View_Compradores(List<Comprador> compradores) {
		this.compradores = compradores;
	}

	/**
	 <p>
	 */
	public void show() {
		System.out.println("Compradores:");
		for (Comprador comprador : compradores) {
			System.out.println(comprador);
			View_Carrinho.show(comprador.getCarrinho());
		}
	}
	private final List<Comprador> compradores;
}
