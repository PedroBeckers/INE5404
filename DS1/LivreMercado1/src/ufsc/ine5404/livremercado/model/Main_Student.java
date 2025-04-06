package ufsc.ine5404.livremercado.model;

public class Main_Student {

	/**
	 @param args the command line arguments
	 */
	public static void main(String[] args) {
		Mercado livreMercado = new Mercado();

		Categoria todos = new Categoria("Todos");
		livreMercado.adicioneCategoria(todos);

		PreenchedorConteudo.SetMercado(livreMercado);
		PreenchedorConteudo.PreenchaMercado();

		View_Mercado view = new View_Mercado(livreMercado);
		view.show();

		// Efetuar a compra
		Comprador comprador1 = livreMercado.getCompradores().get(0);
                System.out.println(comprador1.getCarrinho().getItens().size());
		comprador1.efetuarCompra();
                System.out.println(comprador1.getCarrinho());
		// Efetuar a compra
		Comprador comprador2 = livreMercado.getCompradores().get(1);
		comprador2.efetuarCompra();

		view.show();
	}
}
