package ico.fes;

import java.util.Scanner;

public class Computadora {
    private String marca;
    private String subMarca;
    private String modelo;

    public Computadora() {
    }

    public Computadora(String marca, String subMarca, String modelo) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "ico.fes.Computadora{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public void encender() {
        Scanner boton = new Scanner(System.in);
        String encendido = boton.nextLine();
        if (encendido.equals("Encender")) {
            boolean energia = true;
            System.out.println("ico.fes.Computadora encendida");
        } else {
            System.out.println("La computadora esta apagada");
        }
    }
    public void esteEquipo() {
        Scanner buscar = new Scanner(System.in);
        String datos = buscar.nextLine();
        if (datos.equals("Este equipo")) {
            System.out.println("Marca: " + marca + " Submarca: " + subMarca + " Modelo: " + modelo);
        } else {
            System.out.println("Entrada no valida");
        }
    }
}
