package ufsc.ine5404.livremercado.model;

/*
 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**

 @author cancian
 */
public class View_Estoque {

	/**

	 @param estoque
	 */
	public static void show(Estoque estoque) {
		System.out.println("Itens no Estoque:");
		for (ItemEstoque item : estoque.getItens())
			System.out.println(item);
	}
}
