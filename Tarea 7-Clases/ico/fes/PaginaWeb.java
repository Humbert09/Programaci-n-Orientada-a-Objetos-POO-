package ico.fes;

import java.time.LocalTime;
import java.util.Scanner;

public class PaginaWeb {
    private String tipo;
    private String nombre;
    private String url;
    private String contenido;
    private String fechaModificacion;

    public PaginaWeb() {
    }

    public PaginaWeb(String tipo, String nombre, String url, String contenido, String fechaModificacion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.url = url;
        this.contenido = contenido;
        this.fechaModificacion = fechaModificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", url='" + url + '\'' +
                ", contenido='" + contenido + '\'' +
                ", fechaModificacion='" + fechaModificacion + '\'' +
                '}';
    }
    public void visitar(){
        System.out.println(url);
        System.out.println("Bienvenido a: " + nombre);
        System.out.println("TiendaOnline");
    }

    public void modificar(){
        Scanner teclado = new Scanner(System.in);
        contenido = teclado.nextLine();
        System.out.println("--------------");
        System.out.println(contenido);
        System.out.println("--------------");
        LocalTime local = LocalTime.now();
        Reloj watch = new Reloj(local.getHour(), local.getMinute(), local.getSecond());
        fechaModificacion = String.valueOf(watch);
        System.out.println("Ultima modificacion: " + fechaModificacion);
    }

    public void cerrar(){
        System.out.println("Adios!!");
    }
}
