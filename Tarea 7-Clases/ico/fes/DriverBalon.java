package ico.fes;

import java.awt.*;

public class DriverBalon {
    public static void main(String[] args) {
        Balon ball1 = new Balon(Color.CYAN, "Grande", "Plastico");
        ball1.rebotar();
        ball1.rodar();
        System.out.println(ball1);
    }
}
