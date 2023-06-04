package project.poo;

import project.poo.controlador.ControladorDulce;
import project.poo.modelo.Dulce;
import project.poo.persistencia.DulceDAO;
import project.poo.vista.Ventana;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
    Ventana view = new Ventana("Dulceria");
    ControladorDulce controller = new ControladorDulce(view);
    }
}