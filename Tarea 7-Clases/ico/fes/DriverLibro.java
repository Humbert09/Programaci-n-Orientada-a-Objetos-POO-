package ico.fes;

public class DriverLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("Soul", "Horror", "Pascualita", 20);
        System.out.println(libro);
        libro.abrirLibro();
        libro.cambiarPag();
    }
}
