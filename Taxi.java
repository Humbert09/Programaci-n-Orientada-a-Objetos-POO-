import java.awt.*;

public class Taxi extends Automovil{
    private String lugar;
    private String tipoCobro;
    private String tipoTaxi;

    public Taxi() {
    }

    public Taxi(String tipo, String combusttible, String terreno, String marca, int modelo, Color color, String lugar, String tipoCobro, String tipoTaxi) {
        super(tipo, combusttible, terreno, marca, modelo, color);
        this.lugar = lugar;
        this.tipoCobro = tipoCobro;
        this.tipoTaxi = tipoTaxi;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getTipoCobro() {
        return tipoCobro;
    }

    public void setTipoCobro(String tipoCobro) {
        this.tipoCobro = tipoCobro;
    }

    public String getTipoTaxi() {
        return tipoTaxi;
    }

    public void setTipoTaxi(String tipoTaxi) {
        this.tipoTaxi = tipoTaxi;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "lugar='" + lugar + '\'' +
                ", tipoCobro='" + tipoCobro + '\'' +
                ", tipoTaxi='" + tipoTaxi + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                ", tipo='" + tipo + '\'' +
                ", combusttible='" + combusttible + '\'' +
                ", terreno='" + terreno + '\'' +
                '}';
    }
public void cobrar(){
        double num = Math.random();
    System.out.println("Pagó: " + num + " con " + tipoCobro);
}
public boolean enServicio(){
    System.out.println("Esta en servicio");
        return true;
}
}
