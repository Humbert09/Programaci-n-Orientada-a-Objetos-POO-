import java.util.Scanner;
public class ClaseString {
    public static void main(String[] args) {

        //Acceder a los carecteres de la cadena
        System.out.println("Escriba una su nombre, profesion y nacionalidad(separado por espacios): ");
        Scanner teclado = new Scanner(System.in);
        String phrase = teclado.nextLine();
        String[] partes = phrase.split(" ");
        String name = partes[0]; //Nombre
        System.out.println("Nombre: " + name);
        String job = partes[1]; //Profesion
        System.out.println("Profesion: " + job);
        String nationality = partes[2]; //Nacionalidad
        System.out.println("Nacionalidad: " + nationality);
    }
}