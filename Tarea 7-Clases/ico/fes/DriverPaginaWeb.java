package ico.fes;

import java.time.LocalTime;
import java.util.Scanner;

public class DriverPaginaWeb {
    public static void main(String[] args) {
        PaginaWeb page = new PaginaWeb("Tienda Online", "CyberChelas",
                "https:www.CyberChelas.com.mx", "", "");
        page.visitar();
        Scanner cadena = new Scanner(System.in);
        String modificar = cadena.next();
        if (modificar.equals("modificar")) {
            page.modificar();
            page.cerrar();
        } else {
            page.cerrar();
        }
    }
}
