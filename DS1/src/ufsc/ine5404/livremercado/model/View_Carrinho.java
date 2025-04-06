package ufsc.ine5404.livremercado.model;
/*
 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**

 @author cancian
 */
public class View_Carrinho {

	/**

	 @param carrinho
	 */
	public static void show(Carrinho carrinho) {
		System.out.println("Itens no Carrinho:");
		for (ItemCompra item : carrinho.getItens())
			System.out.println(item);
	}
}
