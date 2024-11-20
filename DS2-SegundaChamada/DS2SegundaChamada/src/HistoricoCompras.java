import java.util.List;

/**
 Interface que define os métodos para acessar e gerenciar o histórico de compras de um cliente.
 */
public interface HistoricoCompras {
	/**
	 Retorna a lista de compras do cliente.

	 @return Lista de compras realizadas.
	 */
	List<String> getCompras();

	/**
	 Adiciona uma nova compra ao histórico.

	 @param compra Descrição da compra a ser adicionada.
	 */
	void adicionarCompra(String compra);
}
