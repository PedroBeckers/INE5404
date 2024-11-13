package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Classe SmartphoneModeloXFabrica implementa DispositivoFactory para o celular ModeloX.
 Esta fábrica cria instâncias dos dispositivos existentes no modeloX (possuem X no nome), 
 simulando um celular desse modelo.
 */
public class SmartphoneModeloXFabrica implements DispositivoFactory {

    @Override
    public DispositivoLocalizador criarDispositivoLocalizador() {
        return new DispositivoGPS6745X();
    }

    @Override
    public DispositivoDataProvider criarDispositivoDataProvider() {
        return new DataProviderRTC6795X();
    }
    
}
