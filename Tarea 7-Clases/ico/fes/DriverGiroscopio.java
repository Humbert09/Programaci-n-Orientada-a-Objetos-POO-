package ico.fes;

import ico.fes.Giroscopio;

public class DriverGiroscopio {
    public static void main(String[] args) {
        Giroscopio giro1 = new Giroscopio("Metal", "Mediano", 0, false);
        System.out.println(giro1);
        giro1.girando();
        giro1.velocidadAngular();
    }
}
