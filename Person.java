import java.util.ArrayList;

public class Person {
    private int edad;
    private String name;
    private String gender;
    private double estatura;
    private double peso;

    public Person() {
    }

    public Person(int edad, String name, String gender, double estatura, double peso) {
        this.edad = edad;
        this.name = name;
        this.gender = gender;
        this.estatura = estatura;
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        ArrayList<String> genders = new ArrayList<>();
        genders.add("FEMENINO");
        genders.add("MASCULINO");
        genders.add("OTRO");

        if (genders.contains(gender.toUpperCase())) {
            this.gender = gender;
        } else {
            System.out.println("Intentalo de nuevo");
        }
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}