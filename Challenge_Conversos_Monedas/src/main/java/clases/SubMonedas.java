package clases;

public class SubMonedas {
    private String moneda;
    private double cambio;

    public SubMonedas(String moneda, Double valor) {
        this.moneda = moneda;
        this.cambio = valor;
    }

    public String getMoneda() {
        return moneda;
    }

    public double getCambio() {
        return cambio;
    }

    @Override
    public String toString() {
        return "SubMonedas{" +
                "moneda='" + moneda + '\'' +
                ", cambio=" + cambio +
                '}';
    }
}
