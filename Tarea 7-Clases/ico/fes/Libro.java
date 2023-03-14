package ico.fes;

public class Libro {
    private String nombre;
    private String genero;
    private String editorial;
    private int paginas;

    public Libro() {
    }

    public Libro(String nombre, String genero, String editorial, int paginas) {
        this.nombre = nombre;
        this.genero = genero;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "ico.fes.Libro{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", editorial='" + editorial + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    public void abrirLibro() {
        boolean abierto = false;
        if(abierto == true) {
            System.out.println("El libro esta abierto");
        } else {
            System.out.println("El libro esta cerrado");
        }
    }
    public void cambiarPag() {
        for (int i = 1; i < paginas; i++) {
            System.out.println("Num de pag: " + i);

        }
    }


}
