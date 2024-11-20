

import java.util.ArrayList;
import java.util.List;

/**
 Implementação real do histórico de compras de um cliente.
 */
public class HistoricoComprasReal implements HistoricoCompras {
	private List<String> compras;

	/**
	 Construtor que inicializa o histórico de compras vazio.
	 */
	public HistoricoComprasReal() {
		this.compras = new ArrayList<>();
	}

	@Override
	public List<String> getCompras() {
		// COMPLETE
		// Retorna uma *cópia* do histórico para evitar modificações externas.
                return new ArrayList<>(compras);
	}

	@Override
	public void adicionarCompra(String compra) {
		// COMPLETE
		// Adiciona a compra à lista de histórico.
                compras.add(compra);
	}
}
