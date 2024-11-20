import java.util.List;

/**
 Proxy que controla o acesso ao histórico de compras de um cliente.
 */
public class ProxyHistoricoCompras implements HistoricoCompras {
	private HistoricoComprasReal historicoReal;
	private boolean permissoes;

	/**
	 Construtor que inicializa o proxy com permissões de acesso.

	 @param permissoes Define se o acesso ao histórico será permitido.
	 */
	public ProxyHistoricoCompras(boolean permissoes) {
		this.permissoes = permissoes;
	}


/**
 * Retorna o histórico de compras do cliente, controlando o acesso e carregando o histórico real somente quando necessário.
 * <p>
 * Este método faz parte da implementação do padrão de projeto Proxy. Ele verifica se o usuário tem permissão para acessar
 * o histórico de compras e garante que o objeto real {@link HistoricoComprasReal} seja carregado apenas no momento necessário
 * (lazy loading). Caso o usuário não tenha permissão, será lançada uma {@link SecurityException}.
 * </p>
 *
 * <h3>Funcionamento do Método</h3>
 * <ol>
 *     <li>Verifica se as permissões do usuário são válidas. Se não forem, lança uma {@link SecurityException} com uma mensagem apropriada.</li>
 *     <li>Verifica se o objeto real {@link HistoricoComprasReal} já foi criado:
 *         <ul>
 *             <li>Se não, instancia o objeto real e o inicializa (lazy loading).</li>
 *             <li>Se sim, reutiliza o objeto já existente.</li>
 *         </ul>
 *     </li>
 *     <li>Chama o método {@code getCompras()} no objeto real e retorna o histórico de compras.</li>
 * </ol>
 *
 * <h3>Exemplo de Uso</h3>
 * <pre>{@code
 * ProxyHistoricoCompras proxy = new ProxyHistoricoCompras(true);
 * proxy.adicionarCompra("Notebook");
 * List<String> compras = proxy.getCompras(); // Retorna o histórico: ["Notebook"]
 * }</pre>
 *
 * @return Uma lista de strings representando o histórico de compras do cliente.
 * @throws SecurityException Se o cliente não tiver permissão para acessar o histórico.
 */
	@Override
	public List<String> getCompras() {
		// COMPLETE
		// Verifica se tem permissões, cria um novo histórico se não existe e retorna as compras do histórico
                
                //Verificacao de permissao
                if(!permissoes){
                    throw new SecurityException("Cliente nao tem permissao para acessar o historico de compras.");
                }
                
                //Verificacao se objeto HistoricoComprasReal ja foi criado
                if(historicoReal == null){
                    historicoReal = new HistoricoComprasReal();
                }
                
                //retornando o historico de compras
                return historicoReal.getCompras();
                
                
	}

/**
 * Adiciona uma compra ao histórico do cliente, garantindo controle de acesso e carregamento preguiçoso do objeto real.
 * <p>
 * Este método faz parte da implementação do padrão de projeto Proxy. Ele controla o acesso ao método
 * {@link HistoricoComprasReal#adicionarCompra(String)} e implementa o lazy loading para garantir que o
 * objeto real {@link HistoricoComprasReal} seja criado apenas quando necessário.
 * </p>
 *
 * <h3>Funcionamento do Método</h3>
 * <ol>
 *     <li>Verifica se o cliente tem permissões de acesso ao histórico:
 *         <ul>
 *             <li>Se não houver permissão, lança uma {@link SecurityException} com uma mensagem indicando o problema.</li>
 *         </ul>
 *     </li>
 *     <li>Verifica se o objeto real {@link HistoricoComprasReal} já foi criado:
 *         <ul>
 *             <li>Se não, instancia o objeto real usando lazy loading.</li>
 *         </ul>
 *     </li>
 *     <li>Chama o método {@code adicionarCompra(String)} do objeto real para registrar a compra.</li>
 * </ol>
 *
 * <h3>Exemplo de Uso</h3>
 * <pre>{@code
 * ProxyHistoricoCompras proxy = new ProxyHistoricoCompras(true);
 * proxy.adicionarCompra("Notebook");
 * }</pre>
 *
 * @param compra A descrição da compra a ser adicionada ao histórico.
 * @throws SecurityException Se o cliente não tiver permissão para acessar ou modificar o histórico.
 */
	@Override
	public void adicionarCompra(String compra) {
		// COMPLETE
		// Verifica se tem permissões, cria um novo histórico se não existe e adicioa a compra ao histórico
                
                if(!permissoes){
                    throw new SecurityException("Cliente nao tem permissao para acessar o historico de compras.");
                }
                
                if(historicoReal == null){
                    historicoReal = new HistoricoComprasReal();
                }
                
                historicoReal.adicionarCompra(compra);
                
	}

	/**
	 Método auxiliar para testes que verifica se o histórico real foi carregado.

	 @return true se o histórico real foi criado; caso contrário, false.
	 */
	public boolean isHistoricoCarregado() {
		return historicoReal != null;
	}
}
