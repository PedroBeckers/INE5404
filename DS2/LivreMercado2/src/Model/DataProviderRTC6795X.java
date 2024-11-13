package Model;

/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Classe DataProviderRTC6795X é uma implementação concreta do DispositivoDataProvider.
 */
public class DataProviderRTC6795X implements DispositivoDataProvider {
	@Override
	public String obterData() {
		return "Data obtida do dispositivo RTC6795X.";
	}
}
