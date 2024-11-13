package Model;


/**
 UFSC/CTC/INE/INE5404
 Description:

 @author Professor Cancian
 @version
 @since
 */
/**
 Classe SmartphoneModeloYFabrica implementa DispositivoFactory para o celular ModeloY.
 Esta fábrica cria instâncias dos dispositivos existentes no modeloY (possuem Y no nome), 
 simulando um celular desse modelo.
 */
public class SmartphoneModeloYFabrica implements DispositivoFactory {

    @Override
    public DispositivoLocalizador criarDispositivoLocalizador() {
        return new DispositivoGPSActive9202Y();
    }

    @Override
    public DispositivoDataProvider criarDispositivoDataProvider() {
        return new DataProviderRTCSuper9212Y();
    }
    
}
