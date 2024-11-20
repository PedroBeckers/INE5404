import java.util.HashMap;
import java.util.Map;

/**
 Factory que gerencia objetos CaracteristicaProduto para evitar duplicação.
 */
public class CaracteristicaProdutoFactory {
	private static Map<String, CaracteristicaProduto> pool = new HashMap<>();

    /**
    * Obtém uma instância compartilhada de {@link CaracteristicaProduto} com base nos atributos fornecidos.
    * <p>
    * Este método implementa o padrão de projeto Flyweight, onde objetos que compartilham
    * características comuns são reutilizados para otimizar o uso de memória. Caso já exista
    * uma instância de {@link CaracteristicaProduto} com os mesmos valores de marca, categoria
    * e modelo, essa instância será retornada. Caso contrário, uma nova instância será criada,
    * armazenada no pool interno e retornada.
    * </p>
    *
    * @param marca     A marca do produto (ex.: "Dell", "HP").
    * @param categoria A categoria do produto (ex.: "Notebook", "Desktop").
    * @param modelo    O modelo do produto (ex.: "Inspiron", "Pavilion").
    * @return Uma instância compartilhada de {@link CaracteristicaProduto} correspondente aos atributos fornecidos.
    *         Nunca retorna {@code null}.
    */ 
	public static CaracteristicaProduto getCaracteristica(String marca, String categoria, String modelo) {
		String chave = marca + "-" + categoria + "-" + modelo;
		// COMPLETE
		// Pesquise HashMap se for necessário
                CaracteristicaProduto caracteristicasProcuradas = pool.get(chave);
                if(caracteristicasProcuradas != null){
                    return caracteristicasProcuradas;
                }
                else{
                    CaracteristicaProduto caracteristicasNovas = new CaracteristicaProduto(marca, categoria, modelo);
                    pool.put(chave, caracteristicasNovas);
                    return caracteristicasNovas;
                }
	}

	public static void clear() {
		pool.clear();
	}

	/**
	 Método auxiliar para verificar o número de instâncias únicas criadas.

	 @return Número de objetos únicos no pool.
	 */
	public static int getInstanciasCriadas() {
		return pool.size();
	}
}
