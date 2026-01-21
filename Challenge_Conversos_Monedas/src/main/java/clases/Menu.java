package clases;

public class Menu {
    public void welcome()
    {
        System.out.println("Bienvenido al change exchange de Alura Latam");
    }

    public void menuOptions()
    {
        System.out.println("1) Dolar -> Peso Mexicano");
        System.out.println("2) Peso Mexicano -> Dolar");
        System.out.println("3) Dolar -> Real brasilenyo");
        System.out.println("4) Real brasilenyo -> Dolar");
        System.out.println("5) Dolar -> Peso colombiano");
        System.out.println("6) Peso colombiano -> Dolar");
        System.out.println("7) Salir");

    }

    public void chooseOption()
    {
        System.out.print("Eliga una opcion valida: ");
    }

    public void ingressValue()
    {
        System.out.print("Ingresa un monto a convertir: ");
    }

}
