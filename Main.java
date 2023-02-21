//Importamos la clase Scanner
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        //Tamaño de la cadena
        String word = "Hola";
        int tam = word.length(); //Retorna: 4
        System.out.println(tam);

        //Detecta si la cadena esta vacia
        String word2 = "ADIOS";
        boolean vacia = word2.isEmpty(); //Retorna: false
        System.out.println(vacia);

        String word3 = "";
        boolean vacia2 = word3.isEmpty(); //Retorna: true
        System.out.println(vacia2);

        //Acceder a los carecteres de la cadena
        System.out.println("Escriba una palabra: ");
        Scanner teclado = new Scanner(System.in);
        String phrase = teclado.nextLine();
        for(int i = 0; i<phrase.length(); i++){
            char letra = phrase.charAt(i);
            System.out.println(letra);
        }

        //Comparar Cadenas
        String word4 = "Hola";
        String word5 = "Hola";
        if(word4.equals(word5)){
            System.out.println("Si pasa por aqui!");
        }

        //Posicion del caracter
        String phrase2 = "Hola, como estas?";
        int pw1 = phrase2.indexOf('a');
        System.out.println("Indice letra: " + pw1);
        int pw2 = phrase2.lastIndexOf('a');
        System.out.println("Indice frase: " + pw2);

        //Posicion del caracter
        String phrase3 = "Hola, como estas? Estas como querias?";
        int p3w1 = phrase3.indexOf("como");
        System.out.println("Indice letra: " + p3w1);
        int p3w2 = phrase3.indexOf("estas");
        System.out.println("Indice letra: " + p3w2);
        int p3w3 = phrase3.lastIndexOf("como");
        System.out.println("Indice frase: " + p3w3);

        //Convertir mayusuclas a minusculas
        String phrase4 = "Hola, como estas?";
        String may = phrase4.toUpperCase();
        System.out.println(may);
        String min = phrase4.toLowerCase();
        System.out.println(min);

        //Subcadenas
        String phrase5 = "Hola, como estas?";
        String p5w1 = phrase5.substring(0, 4);
        System.out.println(p5w1);
        String p5w2 = phrase5.substring(6, 10);
        System.out.println(p5w2);
        String p5w3 = phrase5.substring(11);
        System.out.println(p5w3);

        //Conversion enteros
        String s1 = "1234";
        int i = Integer.parseInt(s1);
        String t1 = Integer.toString(i);
        System.out.println(t1);

        //Conversion flotante
        String s2 = "1234.56";
        double d = Double.parseDouble(s2);
        String t2 = Double.toString(d);
        System.out.println(t2);

        //Concatenar codenas
            String s = "Hola, ";
            String t = "que tal?";
            String u  =  s+t;
            System.out.println(u);

            // Invarianza de las cadenas
        String s3 = "Hola";
        s3 = "chau";
        System.out.println(s3);

        //Concatenar cadenas
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");
        System.out.println(sb);

        //Modificar los caracteres de una cadena
        StringBuilder sb2 = new StringBuilder("Hola ");
        sb2.setCharAt(2, 'X');
        System.out.println(sb2);









    }
}