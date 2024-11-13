package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Classe DispositivoGPSActive9202Y é uma implementação concreta do DispositivoLocalizador.
 */
public class DispositivoGPSActive9202Y implements DispositivoLocalizador {
	@Override
	public String obterLocalizacao() {
		return "Localização obtida via GPSActive9202Y.";
	}
}
