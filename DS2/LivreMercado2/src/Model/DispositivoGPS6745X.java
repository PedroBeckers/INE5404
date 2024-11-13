package Model;

/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Classe DispositivoGPS6745X é uma implementação concreta do DispositivoLocalizador.
 */
public class DispositivoGPS6745X implements DispositivoLocalizador {
	@Override
	public String obterLocalizacao() {
		return "Localização obtida via GPS6745X.";
	}
}
