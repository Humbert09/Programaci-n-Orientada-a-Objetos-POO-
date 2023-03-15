package ico.fes;

import java.awt.*;

public class Lampara {
    private String tamano;
    private String tipo;
    private Color color;

    public Lampara() {
    }

    public Lampara(String tamano, String tipo, Color color) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.color = color;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ico.fes.Lampara{" +
                "tamano='" + tamano + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color=" + color +
                '}';
    }
    public void encender() {
        boolean encendida = false;
        if (encendida == true) {
            System.out.println("La lampara esta encendida");

        } else {
            System.out.println("La lampara esta apagada");
        }
    }
    public void descompuesta() {
        boolean descomponer = false;
        if (descomponer == true) {
            System.out.println("La lampara esta descompuesta");

        } else {
            System.out.println("La lampara esta bien");
        }
    }
}
