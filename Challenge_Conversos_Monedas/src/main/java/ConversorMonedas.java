import clases.ClienteHttp;
import clases.Conversor;
import clases.Menu;
import clases.SubMonedas;

import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner tecladoIn = new Scanner(System.in);
        int opcion = 0;
        Menu menu = new Menu();
        ClienteHttp cliente = new ClienteHttp();
        Conversor conversor = new Conversor();

        while(opcion != 7){
            menu.welcome();
            menu.menuOptions();
            menu.chooseOption();
            opcion = tecladoIn.nextInt();

            if (opcion == 7) {
                System.out.println("Saliendo del programa...");
                break;
            }

            SubMonedas moneda = null;
            menu.ingressValue();
            Double monto = tecladoIn.nextDouble();
            switch (opcion)
            {
                case 1:
                    moneda = conversor.buscarMoneda(cliente.buscarMoneda("USD").getConversion_rates(),"MXN");
                    System.out.println(conversor.convertirCambio("USD",moneda,monto));
                break;
                case 2:
                    moneda = conversor.buscarMoneda(cliente.buscarMoneda("MXN").getConversion_rates(),"USD");
                    System.out.println(conversor.convertirCambio("MXN",moneda,monto));
                break;
                case 3:
                    moneda = conversor.buscarMoneda(cliente.buscarMoneda("USD").getConversion_rates(),"BRL");
                    System.out.println(conversor.convertirCambio("USD",moneda,monto));
                break;
                case 4:
                    moneda = conversor.buscarMoneda(cliente.buscarMoneda("BRL").getConversion_rates(),"USD");
                    System.out.println( conversor.convertirCambio("BRL",moneda,monto));
                break;
                case 5:
                    moneda = conversor.buscarMoneda(cliente.buscarMoneda("USD").getConversion_rates(),"COL");
                    System.out.println(conversor.convertirCambio("USD",moneda,monto));
                break;
                case 6:
                    moneda = conversor.buscarMoneda(cliente.buscarMoneda("COL").getConversion_rates(),"USD");
                    System.out.println(conversor.convertirCambio("COL",moneda,monto));
                break;
                default:
                    System.out.println("Valor incorrecto o no entendible");
                    break;
            }

        }







    }
}
