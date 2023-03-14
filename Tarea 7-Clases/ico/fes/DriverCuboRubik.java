package ico.fes;

import java.awt.*;

public class DriverCuboRubik {
    public static void main(String[] args) {
        CuboRubik cubo = new CuboRubik(Color.BLUE, "Piramix", "GAN", 4);
        cubo.caraCompleta();
        cubo.girarCara();
    }
}
