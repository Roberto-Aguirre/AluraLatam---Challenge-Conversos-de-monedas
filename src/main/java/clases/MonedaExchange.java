package clases;

import java.util.ArrayList;
import java.util.Map;

public class MonedaExchange {
    private String base_code;
    private Map<String,Double> conversion_rates;

    public MonedaExchange() {
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

    public void setConversion_rates(Map<String, Double> conversion_rates) {
        this.conversion_rates = conversion_rates;
    }

    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    @Override
    public String toString() {
        return "MonedaExchange{" +
                "base_code='" + base_code + '\'' +
                ", conversion_rates=" + conversion_rates +
                '}';
    }
}
