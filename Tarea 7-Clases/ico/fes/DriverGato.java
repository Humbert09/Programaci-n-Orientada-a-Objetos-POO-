package ico.fes;

import java.awt.*;

public class DriverGato {
    public static void main(String[] args) {
        Gato cat = new Gato("Siames", (byte) 2, Color.ORANGE);
        cat.cazar();
        cat.comer();
        System.out.println(cat);
    }
}
