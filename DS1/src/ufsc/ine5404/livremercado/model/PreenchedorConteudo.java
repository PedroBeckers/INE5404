package ufsc.ine5404.livremercado.model;

/*
 Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**

 @author cancian
 */
public class PreenchedorConteudo {

	/**

	 @param vendedor
	 @param todos
	 */
	public static void AdicioneProdutosAoEstoqueDoVendedor1(Vendedor vendedor, Categoria todos) {
		// Acessando categorias existentes
		Categoria celulares = todos.getSubcategorias().get(0).getSubcategorias().get(0);
		Categoria computadores = todos.getSubcategorias().get(0).getSubcategorias().get(1);
		Categoria moda = todos.getSubcategorias().get(1);
		Categoria moveis = moda.getSubcategorias().get(0);
		Categoria casaJardim = todos.getSubcategorias().get(2);
		Categoria esportes = todos.getSubcategorias().get(3);
		Categoria belezaSaude = todos.getSubcategorias().get(4);
		Categoria brinquedos = todos.getSubcategorias().get(5);
		Categoria automoveis = todos.getSubcategorias().get(6);
		Categoria informatica = todos.getSubcategorias().get(7);
		Categoria livros = todos.getSubcategorias().get(8);
		Categoria musica = todos.getSubcategorias().get(9);

		// Adicionando produtos à categoria Eletrônicos
		Produto iphone = new Produto("iPhone 14", "A2633", "Apple", 999.99, celulares);
		Produto galaxy = new Produto("Samsung Galaxy S23", "SM-S911B", "Samsung", 899.99, celulares);
		Produto dellXPS = new Produto("Dell XPS 13", "9300", "Dell", 1299.99, computadores);
		Produto hpPavilion = new Produto("HP Pavilion", "15-eh2020nr", "HP", 799.99, computadores);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(iphone, 10);
		vendedor.adicioneProdutoAoEstoque(galaxy, 15);
		vendedor.adicioneProdutoAoEstoque(dellXPS, 5);
		vendedor.adicioneProdutoAoEstoque(hpPavilion, 8);

		// Adicionando produtos à categoria Moda
		Produto camiseta = new Produto("Camiseta Masculina", "Estampa", "Nike", 49.99, moveis);
		Produto vestido = new Produto("Vestido de Verão", "Floral", "Zara", 89.99, moveis);
		Produto tenisNike = new Produto("Tênis Nike", "Air Max", "Nike", 299.99, moda);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(camiseta, 20);
		vendedor.adicioneProdutoAoEstoque(vestido, 10);
		vendedor.adicioneProdutoAoEstoque(tenisNike, 12);

		// Adicionando produtos à categoria Casa e Jardim
		Produto sofa = new Produto("Sofá de Couro", "3 Lugares", "Sofás Brasil", 1499.99, moveis);
		Produto vasoDecorativo = new Produto("Vaso Decorativo", "Cerâmica", "Casa & Decor", 29.99, casaJardim);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(sofa, 3);
		vendedor.adicioneProdutoAoEstoque(vasoDecorativo, 25);

		// Adicionando produtos à categoria Esportes
		Produto bolaFutebol = new Produto("Bola de Futebol", "Nike Ordem", "Nike", 79.99, esportes);
		Produto tenisEsportivo = new Produto("Tênis Esportivo", "Air Zoom", "Nike", 199.99, esportes);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(bolaFutebol, 30);
		vendedor.adicioneProdutoAoEstoque(tenisEsportivo, 8);

		// Adicionando produtos à categoria Beleza e Saúde
		Produto baseMaquiagem = new Produto("Base de Maquiagem", "Matte", "Maybelline", 39.99, belezaSaude);
		Produto hidratanteFacial = new Produto("Hidratante Facial", "Neutrogena Hydro Boost", "Neutrogena", 49.99,
				belezaSaude);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(baseMaquiagem, 40);
		vendedor.adicioneProdutoAoEstoque(hidratanteFacial, 35);

		// Adicionando produtos à categoria Brinquedos
		Produto boneca = new Produto("Boneca de Pano", "Clássica", "Fisher Price", 59.99, brinquedos);
		Produto quebraCabeca = new Produto("Quebra-Cabeça", "1000 peças", "Estrela", 39.99, brinquedos);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(boneca, 15);
		vendedor.adicioneProdutoAoEstoque(quebraCabeca, 20);

		// Adicionando produtos à categoria Automóveis
		Produto carroEsportivo = new Produto("Carro Esportivo", "Modelo X", "Ferrari", 50000.00, automoveis);
		Produto motoSport = new Produto("Moto Sport", "CBR 600RR", "Honda", 15000.00, automoveis);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(carroEsportivo, 1);
		vendedor.adicioneProdutoAoEstoque(motoSport, 2);

		// Adicionando produtos à categoria Informática
		Produto mouseGamer = new Produto("Mouse Gamer", "G502", "Logitech", 99.99, informatica);
		Produto tecladoMecanico = new Produto("Teclado Mecânico", "K70", "Corsair", 199.99, informatica);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(mouseGamer, 25);
		vendedor.adicioneProdutoAoEstoque(tecladoMecanico, 15);

		// Adicionando produtos à categoria Livros
		Produto senhorDosAnéis = new Produto("O Senhor dos Anéis", "Edição Especial", "HarperCollins", 59.99, livros);
		Produto sapiens = new Produto("Sapiens: Uma Breve História da Humanidade", "Edição de Bolso",
				"Companhia das Letras", 39.99, livros);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(senhorDosAnéis, 12);
		vendedor.adicioneProdutoAoEstoque(sapiens, 18);

		// Adicionando produtos à categoria Música
		Produto guitarra = new Produto("Guitarra Elétrica", "Stratocaster", "Fender", 799.99, musica);
		Produto cdAlbum = new Produto("CD de Álbum", "Thriller", "Michael Jackson", 29.99, musica);

		// Adiciona itens de estoque ao vendedor
		vendedor.adicioneProdutoAoEstoque(guitarra, 5);
		vendedor.adicioneProdutoAoEstoque(cdAlbum, 20);
	}

	/**

	 @param vendedor
	 @param todos
	 */
	public static void AdicioneProdutosAoEstoqueDoVendedor2(Vendedor vendedor, Categoria todos) {
		// Acessando categorias existentes
		Categoria celulares = todos.getSubcategorias().get(0).getSubcategorias().get(0);
		Categoria computadores = todos.getSubcategorias().get(0).getSubcategorias().get(1);
		Categoria moda = todos.getSubcategorias().get(1);
		Categoria moveis = moda.getSubcategorias().get(0);
		Categoria casaJardim = todos.getSubcategorias().get(2);
		Categoria esportes = todos.getSubcategorias().get(3);
		Categoria belezaSaude = todos.getSubcategorias().get(4);
		Categoria brinquedos = todos.getSubcategorias().get(5);
		Categoria automoveis = todos.getSubcategorias().get(6);
		Categoria informatica = todos.getSubcategorias().get(7);
		Categoria livros = todos.getSubcategorias().get(8);
		Categoria musica = todos.getSubcategorias().get(9);

		// Produtos já existentes (metade)
		Produto iphone = new Produto("iPhone 14", "A2633", "Apple", 999.99, celulares);
		Produto galaxy = new Produto("Samsung Galaxy S23", "SM-S911B", "Samsung", 899.99, celulares);
		Produto dellXPS = new Produto("Dell XPS 13", "9300", "Dell", 1299.99, computadores);
		Produto hpPavilion = new Produto("HP Pavilion", "15-eh2020nr", "HP", 799.99, computadores);
		Produto tenisNike = new Produto("Tênis Nike", "Air Max", "Nike", 299.99, moda);
		Produto camiseta = new Produto("Camiseta Masculina", "Estampa", "Nike", 49.99, moveis);
		Produto bolaFutebol = new Produto("Bola de Futebol", "Nike Ordem", "Nike", 79.99, esportes);

		// Adiciona produtos existentes ao estoque do vendedor 2
		vendedor.adicioneProdutoAoEstoque(iphone, 5);
		vendedor.adicioneProdutoAoEstoque(galaxy, 3);
		vendedor.adicioneProdutoAoEstoque(dellXPS, 2);
		vendedor.adicioneProdutoAoEstoque(hpPavilion, 4);
		vendedor.adicioneProdutoAoEstoque(tenisNike, 6);
		vendedor.adicioneProdutoAoEstoque(camiseta, 15);
		vendedor.adicioneProdutoAoEstoque(bolaFutebol, 20);

		// Produtos únicos do vendedor 2 (metade)
		Produto smartwatch = new Produto("Smartwatch", "Series 7", "Apple", 399.99, celulares);
		Produto laptop = new Produto("Laptop Gamer", "ROG Zephyrus", "Asus", 4999.99, computadores);
		Produto jaqueta = new Produto("Jaqueta de Couro", "Preta", "Leather Co", 399.99, moveis);
		Produto mesa = new Produto("Mesa de Jantar", "Redonda", "Móveis Brasil", 799.99, casaJardim);
		Produto luminaria = new Produto("Luminária de Mesa", "LED", "Luz & Cia", 129.99, casaJardim);
		Produto brinquedoEducativo = new Produto("Brinquedo Educativo", "Cubo Mágico", "Estrela", 49.99, brinquedos);
		Produto guitarra = new Produto("Guitarra Elétrica", "Stratocaster", "Fender", 799.99, musica);
		Produto livroEducativo = new Produto("Matemática Para Todos", "Edição Atual", "Saraiva", 39.99, livros);
		Produto headsetGamer = new Produto("Headset Gamer", "HyperX Cloud", "HyperX", 399.99, informatica);

		// Adiciona produtos únicos ao estoque do vendedor 2
		vendedor.adicioneProdutoAoEstoque(smartwatch, 10);
		vendedor.adicioneProdutoAoEstoque(laptop, 4);
		vendedor.adicioneProdutoAoEstoque(jaqueta, 5);
		vendedor.adicioneProdutoAoEstoque(mesa, 6);
		vendedor.adicioneProdutoAoEstoque(luminaria, 12);
		vendedor.adicioneProdutoAoEstoque(brinquedoEducativo, 25);
		vendedor.adicioneProdutoAoEstoque(guitarra, 3);
		vendedor.adicioneProdutoAoEstoque(livroEducativo, 20);
		vendedor.adicioneProdutoAoEstoque(headsetGamer, 8);
	}

	/**

	 @param vendedor
	 @param todos
	 */
	public static void AdicioneProdutosAoEstoqueDoVendedor3(Vendedor vendedor, Categoria todos) {
		// Acessando categorias existentes
		Categoria celulares = todos.getSubcategorias().get(0).getSubcategorias().get(0);
		Categoria moda = todos.getSubcategorias().get(1);
		Categoria esportes = todos.getSubcategorias().get(3);
		Categoria informatica = todos.getSubcategorias().get(7);

		// Produtos em comum (5)
		Produto iphone = new Produto("iPhone 14", "A2633", "Apple", 999.99, celulares);
		Produto tenisNike = new Produto("Tênis Nike", "Air Max", "Nike", 299.99, moda);
		Produto bolaFutebol = new Produto("Bola de Futebol", "Nike Ordem", "Nike", 79.99, esportes);
		Produto mouseGamer = new Produto("Mouse Gamer", "G502", "Logitech", 99.99, informatica);
		Produto guitarra = new Produto("Guitarra Elétrica", "Stratocaster", "Fender", 799.99, informatica);

		// Adiciona produtos em comum ao estoque do vendedor 3
		vendedor.adicioneProdutoAoEstoque(iphone, 4);
		vendedor.adicioneProdutoAoEstoque(tenisNike, 8);
		vendedor.adicioneProdutoAoEstoque(bolaFutebol, 15);
		vendedor.adicioneProdutoAoEstoque(mouseGamer, 10);
		vendedor.adicioneProdutoAoEstoque(guitarra, 5);

		// Produtos únicos do vendedor 3 (10)
		Produto smartwatch = new Produto("Smartwatch", "Galaxy Watch 4", "Samsung", 399.99, celulares);
		Produto tablet = new Produto("Tablet", "Galaxy Tab S7", "Samsung", 599.99, celulares);
		Produto camiseta = new Produto("Camiseta Feminina", "Estampa Floral", "H&M", 49.99, moda);
		Produto jaqueta = new Produto("Jaqueta Jeans", "Estilo Vintage", "Levi's", 499.99, moda);
		Produto bolaBasquete = new Produto("Bola de Basquete", "Wilson Evolution", "Wilson", 89.99, esportes);
		Produto bicicleta = new Produto("Bicicleta Mountain Bike", "Mountain Bike", "Caloi", 899.99, esportes);
		Produto headset = new Produto("Headset", "Razer Kraken", "Razer", 299.99, informatica);
		Produto teclado = new Produto("Teclado Mecânico", "Logitech G Pro", "Logitech", 249.99, informatica);
		Produto livroFiccao = new Produto("1984", "George Orwell", "Companhia das Letras", 29.99, todos);
		Produto livroCulinaria = new Produto("Receitas Rápidas", "Chef André", "Editora G", 39.99, todos);

		// Adiciona produtos únicos ao estoque do vendedor 3
		vendedor.adicioneProdutoAoEstoque(smartwatch, 6);
		vendedor.adicioneProdutoAoEstoque(tablet, 3);
		vendedor.adicioneProdutoAoEstoque(camiseta, 12);
		vendedor.adicioneProdutoAoEstoque(jaqueta, 4);
		vendedor.adicioneProdutoAoEstoque(bolaBasquete, 10);
		vendedor.adicioneProdutoAoEstoque(bicicleta, 2);
		vendedor.adicioneProdutoAoEstoque(headset, 7);
		vendedor.adicioneProdutoAoEstoque(teclado, 5);
		vendedor.adicioneProdutoAoEstoque(livroFiccao, 15);
		vendedor.adicioneProdutoAoEstoque(livroCulinaria, 10);
	}

	/**
	 <p>
	 */
	public static void CrieCategorias() {
		Categoria todos = livreMercado.getCategorias().get(0);
		// Criando as categorias e subcategorias
		Categoria eletronicos = new Categoria("Eletrônicos");
		Categoria moda = new Categoria("Moda");
		Categoria casaJardim = new Categoria("Casa e Jardim");
		Categoria esportes = new Categoria("Esportes");
		Categoria belezaSaude = new Categoria("Beleza e Saúde");
		Categoria brinquedos = new Categoria("Brinquedos");
		Categoria automoveis = new Categoria("Automóveis");
		Categoria informatica = new Categoria("Informática");
		Categoria livros = new Categoria("Livros");
		Categoria musica = new Categoria("Música");

		// Subcategorias de Eletrônicos
		Categoria celulares = new Categoria("Celulares");
		celulares.adicioneSubcategoria(new Categoria("Smartphones"));
		celulares.adicioneSubcategoria(new Categoria(
				"Acessórios para Celulares"));

		Categoria computadores = new Categoria("Computadores");
		computadores.adicioneSubcategoria(new Categoria("Laptops"));
		computadores.adicioneSubcategoria(new Categoria("Desktops"));
		computadores.adicioneSubcategoria(new Categoria("Periféricos"));

		eletronicos.adicioneSubcategoria(celulares);
		eletronicos.adicioneSubcategoria(computadores);
		eletronicos.adicioneSubcategoria(new Categoria("Televisores"));
		eletronicos.adicioneSubcategoria(new Categoria("Áudio"));

		// Adicionando as outras categorias e subcategorias
		Categoria roupas = new Categoria("Roupas");
		roupas.adicioneSubcategoria(new Categoria("Masculinas"));
		roupas.adicioneSubcategoria(new Categoria("Femininas"));
		roupas.adicioneSubcategoria(new Categoria("Infantis"));

		moda.adicioneSubcategoria(roupas);
		moda.adicioneSubcategoria(new Categoria("Calçados"));
		moda.adicioneSubcategoria(new Categoria("Acessórios"));

		Categoria moveis = new Categoria("Móveis");
		moveis.adicioneSubcategoria(new Categoria("Sala de Estar"));
		moveis.adicioneSubcategoria(new Categoria("Quarto"));
		moveis.adicioneSubcategoria(new Categoria("Cozinha"));

		casaJardim.adicioneSubcategoria(moveis);
		casaJardim.adicioneSubcategoria(new Categoria("Decoração"));
		casaJardim.adicioneSubcategoria(new Categoria("Jardinagem"));

		esportes.adicioneSubcategoria(new Categoria("Roupas Esportivas"));
		esportes.adicioneSubcategoria(new Categoria("Equipamentos"));

		belezaSaude.adicioneSubcategoria(new Categoria("Maquiagem"));
		belezaSaude.adicioneSubcategoria(new Categoria("Cuidados Pessoais"));

		brinquedos.adicioneSubcategoria(new Categoria("Brinquedos Infantis"));
		brinquedos.adicioneSubcategoria(new Categoria("Jogos"));

		automoveis.adicioneSubcategoria(new Categoria("Carros"));
		automoveis.adicioneSubcategoria(new Categoria("Motos"));

		informatica.adicioneSubcategoria(new Categoria("Laptops"));
		informatica.adicioneSubcategoria(new Categoria("Desktops"));
		informatica.adicioneSubcategoria(new Categoria("Periféricos"));

		livros.adicioneSubcategoria(new Categoria("Ficção"));
		livros.adicioneSubcategoria(new Categoria("Não-ficção"));

		musica.adicioneSubcategoria(new Categoria("Instrumentos Musicais"));
		musica.adicioneSubcategoria(new Categoria("Álbuns"));

		// Adicionando as categorias à categoria "Todos"
		todos.adicioneSubcategoria(eletronicos);
		todos.adicioneSubcategoria(moda);
		todos.adicioneSubcategoria(casaJardim);
		todos.adicioneSubcategoria(esportes);
		todos.adicioneSubcategoria(belezaSaude);
		todos.adicioneSubcategoria(brinquedos);
		todos.adicioneSubcategoria(automoveis);
		todos.adicioneSubcategoria(informatica);
		todos.adicioneSubcategoria(livros);
		todos.adicioneSubcategoria(musica);
	}

	public static void PreenchaMercado() {
		PreenchedorConteudo.CrieCategorias();
		PreenchedorConteudo.CrieVendedores();
		PreenchedorConteudo.CrieCompradores();
		PreenchedorConteudo.CrieProdutosDosVendedores();
		PreenchedorConteudo.CrieCarrinhosDeCompra();
	}

	/**

	 @param mercado
	 */
	public static void SetMercado(Mercado mercado) {
		livreMercado = mercado;
	}

	static void CrieCarrinhosDeCompra() {
		Comprador comprador1 = livreMercado.getCompradores().get(0);
		Comprador comprador2 = livreMercado.getCompradores().get(1);
		//
		Vendedor vendedor1 = livreMercado.getVendedores().get(0);
		Vendedor vendedor2 = livreMercado.getVendedores().get(1);
		Vendedor vendedor3 = livreMercado.getVendedores().get(2);
		// Comprador 1 adicionando itens ao carrinho
		comprador1.adicioneAoCarrinho(vendedor1.getEstoque().getItens().get(0).getProduto(), vendedor1, 2); // Produto do vendedor 1
		comprador1.adicioneAoCarrinho(vendedor2.getEstoque().getItens().get(1).getProduto(), vendedor2, 1); // Produto do vendedor 2
		// Comprador 2 adicionando itens ao carrinho
		comprador2.adicioneAoCarrinho(vendedor1.getEstoque().getItens().get(0).getProduto(), vendedor1, 1); // Produto do vendedor 1
		comprador2.adicioneAoCarrinho(vendedor1.getEstoque().getItens().get(1).getProduto(), vendedor1, 2); // Outro produto do vendedor 1
		comprador2.adicioneAoCarrinho(vendedor2.getEstoque().getItens().get(0).getProduto(), vendedor2, 3); // Produto do vendedor 2
		comprador2.adicioneAoCarrinho(vendedor2.getEstoque().getItens().get(2).getProduto(), vendedor2, 1); // Outro produto do vendedor 2
		comprador2.adicioneAoCarrinho(vendedor3.getEstoque().getItens().get(1).getProduto(), vendedor3, 2); // Produto do vendedor 3
		comprador2.adicioneAoCarrinho(vendedor3.getEstoque().getItens().get(0).getProduto(), vendedor3, 1); // Outro produto do vendedor 3
		comprador2.adicioneAoCarrinho(vendedor1.getEstoque().getItens().get(3).getProduto(), vendedor1, 4); // Mais um produto do vendedor 1
		comprador2.adicioneAoCarrinho(vendedor2.getEstoque().getItens().get(1).getProduto(), vendedor2, 2); // Mais um produto do vendedor 2
		comprador2.adicioneAoCarrinho(vendedor3.getEstoque().getItens().get(2).getProduto(), vendedor3, 1); // Mais um produto do vendedor 3

	}

	static void CrieCompradores() {
		// Adicionando compradores ao sistema
		Comprador comprador1 = new Comprador("Ana");
		Comprador comprador2 = new Comprador("Luiz");
		// adicionando os compradores ao sistema
		livreMercado.adicioneComprador(comprador1);
		livreMercado.adicioneComprador(comprador2);
	}

	static void CrieProdutosDosVendedores() {
		Vendedor vendedor1 = livreMercado.getVendedores().get(0);
		Vendedor vendedor2 = livreMercado.getVendedores().get(1);
		Vendedor vendedor3 = livreMercado.getVendedores().get(2);
		Categoria todos = livreMercado.getCategorias().get(0);
		// Adicionando produtos ao estoque dos vendedores
		PreenchedorConteudo.AdicioneProdutosAoEstoqueDoVendedor1(vendedor1, todos);
		PreenchedorConteudo.AdicioneProdutosAoEstoqueDoVendedor2(vendedor2, todos);
		PreenchedorConteudo.AdicioneProdutosAoEstoqueDoVendedor3(vendedor3, todos);
	}

	static void CrieVendedores() {
		// Criando vendedores
		Vendedor vendedor1 = new Vendedor("João");
		Vendedor vendedor2 = new Vendedor("Maria");
		Vendedor vendedor3 = new Vendedor("Carlos");
		// adicionando os vendedores ao sistema
		livreMercado.adicioneVendedor(vendedor1);
		livreMercado.adicioneVendedor(vendedor2);
		livreMercado.adicioneVendedor(vendedor3);
	}
	private static Mercado livreMercado;
}
