package project.poo.modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Dulce {
    private int id;
    private String nombre;
    private String marca;
    private String tipo;
    private String sabor;
    private String urlFoto;

    public Dulce() {
    }

    public Dulce(int id, String nombre, String marca, String tipo, String sabor, String urlFoto) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.sabor = sabor;
        this.urlFoto = urlFoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    @Override
    public String toString() {
        return "Dulce{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", sabor='" + sabor + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                '}';
    }

    public ImageIcon createIcon(){
        ImageIcon resultado = null;
        try {
            URL urlImagen = new URL(this.urlFoto);
            resultado = new ImageIcon(urlImagen);
        }catch (MalformedURLException mue){
            System.out.println(mue.toString());
        }
        return resultado;
    }
}
