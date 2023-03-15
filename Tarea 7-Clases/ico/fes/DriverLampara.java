package ico.fes;

import java.awt.*;

public class DriverLampara {
    public static void main(String[] args) {
        Lampara lamp = new Lampara("Grande", "Escritorio", Color.WHITE);
        lamp.encender();
        lamp.descompuesta();
        System.out.println(lamp);
    }
}
