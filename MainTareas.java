import javax.swing.event.CellEditorListener;
import java.awt.*;

public class MainTareas {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ferrari", "F40", (byte)22, Color.RED);
        System.out.println(auto1);

        Person per1 = new Person(19, "Pancho", "masculino", 1.72, 78);
        System.out.println(per1);

        Monitor mon1 = new Monitor("ASUS", "TUF Gaming VG24VQ", "AmoLed", 4.999, 23.6);
        System.out.println(mon1);

        Celular cel1 = new Celular("Apple", Color.BLUE, 13, "Iphone 13");
        System.out.println(cel1);
    }
}
