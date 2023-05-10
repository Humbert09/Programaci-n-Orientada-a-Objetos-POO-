import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>(new String[10]);
        miCaja.add( 0, "hola");
        miCaja.add( 1, "que tal");
        miCaja.add( 2, "adios");
        System.out.println(miCaja);

        String temp = miCaja.get(0);

        System.out.println("-------------");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0,"hola");
        cajaSin.add(1,"que tal");
        cajaSin.add(2,"adios");
        System.out.println(cajaSin);
        String temp2 = (String) cajaSin.get(0);

        System.out.println("-----------Comida--------------");

        Caja<Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yogurth", true));
        System.out.println(cajaComida.get(0));

        System.out.println("_________");

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("ZANAHORIA", false));
        comidas.add(new Comida("CAMARON", false));
        comidas.add(new Comida("ZANAHORIA", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(13));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Pan Tostado", true));
        comidas2.add(new Comida("Mantequilla", true));
        comidas2.add(new Comida("Mani", true));
        comidas2.add(new Comida("Mermelada", true));
        comidas2.add(new Comida("queso", true));

        System.out.println(comidas.get(3));
        comidas2.set(3, new Comida("Chiles", false));
        System.out.println("_--------------");
        for (Comida comida : comidas2) {
            System.out.println(comida);
        }



    }
}