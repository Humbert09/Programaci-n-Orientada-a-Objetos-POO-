package ico.fes;

import java.awt.*;

public class Balon {
    private Color color;
    private String tamano;
    private String tipo;

    public Balon() {
    }

    public Balon(Color color, String tamano, String tipo) {
        this.color = color;
        this.tamano = tamano;
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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

    @Override
    public String toString() {
        return "Balon{" +
                "color=" + color +
                ", tamano='" + tamano + '\'' +
                ", tipo=" + tipo +
                '}';
    }
    public void rebotar() {
        boolean rebota = false;
        if (rebota == true) {
            System.out.println("El balon rebota");

        } else {
            System.out.println("El balon no rebota");
        }
    }
    public void rodar() {
        boolean rueda = false;
        if (rueda == true) {
            System.out.println("El balon rueda");

        } else {
            System.out.println("El balon no rueda");
        }
    }
}
