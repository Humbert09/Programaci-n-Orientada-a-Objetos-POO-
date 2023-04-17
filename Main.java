import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Taxi tax = new Taxi("automovil", "Gasolina", "Terrestre", "Nissan", 1996, Color.WHITE, "CDMX", "Efectivo", "Sitio");
        System.out.println(tax);
        tax.cambiarAceite();
        tax.encender();
        tax.rellenarCombustible();
        tax.enServicio();
        tax.colocarFreno();
        tax.cobrar();
    }
}