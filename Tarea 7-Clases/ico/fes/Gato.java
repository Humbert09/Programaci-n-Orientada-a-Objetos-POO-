package ico.fes;

import java.awt.*;

public class Gato {
    private String raza;
    private byte edad;
    private Color color;

    public Gato() {
    }

    public Gato(String raza, byte edad, Color color) {
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raza='" + raza + '\'' +
                ", edad=" + edad +
                ", color=" + color +
                '}';
    }
    public void cazar() {
        System.out.println("El gato cazo un raton");
    }

    public void comer() {
        System.out.println("El gato come croquetas");
    }
}
