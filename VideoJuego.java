public class VideoJuego {
    private int id;
    private String nombre;
    private String genero;
    private double pesoIns;
    private String plataforma;
    private String desarrollador;

    public VideoJuego() {
    }

    public VideoJuego(int id, String nombre, String genero, double pesoIns, String plataforma, String desarrollador) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.pesoIns = pesoIns;
        this.plataforma = plataforma;
        this.desarrollador = desarrollador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPesoIns() {
        return pesoIns;
    }

    public void setPesoIns(double pesoIns) {
        this.pesoIns = pesoIns;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", pesoIns=" + pesoIns +
                ", plataforma='" + plataforma + '\'' +
                ", desarrollador='" + desarrollador + '\'' +
                '}';
    }
}
