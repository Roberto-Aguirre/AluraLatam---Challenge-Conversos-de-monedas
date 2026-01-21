package clases;

import interfaces.ProcesarCambio;

import java.util.Map;

public class Conversor implements ProcesarCambio {

    @Override
    public String convertirCambio(String monedaOrigen, SubMonedas monedaFinal, Double monto) {
        SubMonedas original = new SubMonedas(monedaOrigen,1.00);

            Double valorConvertido = monedaFinal.getCambio()/original.getCambio()*monto;



        return "Conversion: "+monedaOrigen+ " -> " + monedaFinal.getMoneda() + " dan $" + valorConvertido;
    }
    public SubMonedas buscarMoneda(Map<String,Double> monedas, String moneda){
        SubMonedas subMoneda = new SubMonedas(moneda,monedas.get(moneda));
        return subMoneda;
    }
}
