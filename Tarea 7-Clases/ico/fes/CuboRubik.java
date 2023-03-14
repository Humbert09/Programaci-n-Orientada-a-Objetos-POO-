package ico.fes;

import java.awt.*;

public class CuboRubik {
    private Color color;
    private String forma;
    private String marca;
    private int caras;

    public CuboRubik() {
    }

    public CuboRubik(Color color, String forma, String marca, int caras) {
        this.color = color;
        this.forma = forma;
        this.marca = marca;
        this.caras = caras;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    @Override
    public String toString() {
        return "ico.fes.CuboRubik{" +
                "color=" + color +
                ", forma='" + forma + '\'' +
                ", marca='" + marca + '\'' +
                ", caras=" + caras +
                '}';
    }
    public void caraCompleta() {
        boolean completado = false;
        if(color == Color.BLUE) {
            completado = true;
            System.out.println("Cara completada color: " + color);
        }
    }
    public void girarCara() {
        System.out.println("Girar cara a la derecha");
    }
}
