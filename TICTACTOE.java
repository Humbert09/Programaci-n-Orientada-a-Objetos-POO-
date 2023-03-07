import java.util.Scanner;

public class TICTACTOE {
    public static void main(String[] args) {

        System.out.println("Por favor escribe las respuestas del juego: ");
        Scanner teclado = new Scanner(System.in);
        String resultado = teclado.nextLine();
        String[] separado = resultado.split("");
       if(resultado == "X"){
           System.out.println("-----");
           String jugada1 = separado[0];
           String jugada2 = separado[1];
           String jugada3 = separado[2];
           System.out.println("|" + jugada1 + jugada2 + jugada3 + "|");
           String jugada4 = separado[3];
           String jugada5 = separado[4];
           String jugada6 = separado[5];
           System.out.println("|" + jugada4 + jugada5 + jugada6 + "|");
           String jugada7 = separado[6];
           String jugada8 = separado[7];
           String jugada9 = separado[8];
           System.out.println("|" + jugada7 + jugada8 + jugada9 + "|");
           System.out.println("-----");
       } else {
           System.out.println("Jugada no valida");
       }

    }
}