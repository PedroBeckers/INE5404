package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Interface DispositivoFactory define métodos para criação de produtos de localização e data.
 Parte do padrão Abstract Factory, permitindo que classes concretas implementem esses métodos
 de acordo com as especificações de diferentes dispositivos.
 */
public interface DispositivoFactory {
	/**
	 Cria um objeto de localização adequado para o dispositivo.

	 @return uma instância de DispositivoLocalizador
	 */
	DispositivoLocalizador criarDispositivoLocalizador();

	/**
	 Cria um objeto de data adequado para o dispositivo.

	 @return uma instância de DataProider
	 */
	DispositivoDataProvider criarDispositivoDataProvider();
}
