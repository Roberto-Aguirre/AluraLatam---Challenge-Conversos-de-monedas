package interfaces;

import clases.SubMonedas;

public interface ProcesarCambio {

    public String convertirCambio(String monedaOrigen, SubMonedas monedaFinal,Double monto);

}
