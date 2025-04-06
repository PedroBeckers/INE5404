package ufsc.ine5404.livremercado.model;


/**
 Representa uma pessoa com um nome.
 */
public class Pessoa {

	/**
	 Construtor que inicializa a pessoa com um nome.

	 @param nome O nome da pessoa.
	 */
	public Pessoa(String nome) {
		this.nome = nome;
	}

	/**
	 Retorna o nome da pessoa.

	 @return O nome da pessoa.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 Retorna uma representação em string da pessoa.

	 @return Uma string que representa o nome da pessoa.
	 */
	@Override
	public String toString() {
		return "nome=" + nome;
	}

	private String nome;
}
