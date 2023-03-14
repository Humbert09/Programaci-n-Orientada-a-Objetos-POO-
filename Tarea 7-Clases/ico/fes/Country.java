package ico.fes;

public class Country {
    private String nombre;
    private String continente;
    private String idioma;
    private String monumento;

    public Country() {
    }

    public Country(String nombre, String continente, String idioma, String monumento) {
        this.nombre = nombre;
        this.continente = continente;
        this.idioma = idioma;
        this.monumento = monumento;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getMonumento() {
        return monumento;
    }

    public void setMonumento(String monumento) {
        this.monumento = monumento;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", idioma='" + idioma + '\'' +
                ", monumento='" + monumento + '\'' +
                '}';
    }

    public void bienvenida() {
        System.out.println("Bienvenido a: " + nombre + " estamos en el continente " + continente + " aqui hablamos " + idioma);
    }

    public void visitar() {
        System.out.println("Nuestro monumento principal es: " + monumento);
    }


}
