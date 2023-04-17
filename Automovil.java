import java.awt.*;

public class Automovil extends Vehiculo{
    protected String marca;
    protected int modelo;
    protected Color color;

    public Automovil() {
    }

    public Automovil(String tipo, String combusttible, String terreno, String marca, int modelo, Color color) {
        super(tipo, combusttible, terreno);
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                ", tipo='" + tipo + '\'' +
                ", combusttible='" + combusttible + '\'' +
                ", terreno='" + terreno + '\'' +
                '}';
    }
    public void colocarFreno(){
        System.out.println("Freno de mano");
    }
    public void cambiarAceite(){
        System.out.println("Cambio de aceite");
    }
}
