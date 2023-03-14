package ico.fes;

public class DriverCountry {
    public static void main(String[] args) {
        Country pais1 = new Country("Noruega", "Europa", "Noruego", "Swords in rock");
        System.out.println(pais1);
        pais1.bienvenida();
        pais1.visitar();
    }
}
