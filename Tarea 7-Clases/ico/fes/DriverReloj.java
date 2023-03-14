package ico.fes;

import java.time.LocalTime;

public class DriverReloj {
    public static void main(String[] args) {
        LocalTime local = LocalTime.now();
        Reloj watch = new Reloj(local.getHour(), local.getMinute(), local.getSecond());
        watch.programarAlarma(21,53,0);
        for (int i = 0; i < 1000000000; i++) {
            watch.avanzar();
            watch.mostrar();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
