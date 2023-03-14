package ico.fes;

public class Giroscopio{
    private String material;
    private String tamano;
    private float velocidad;

    private boolean girando = false;


    public Giroscopio() {
    }

    public Giroscopio(String material, String tamano, float velocidad, boolean girando) {
        this.material = material;
        this.tamano = tamano;
        this.velocidad = velocidad;
        this.girando = girando;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isGirando() {
        return girando;
    }

    public void setGirando(boolean girando) {
        this.girando = girando;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "material='" + material + '\'' +
                ", tamano='" + tamano + '\'' +
                ", velocidad=" + velocidad +
                ", girando=" + girando +
                '}';
    }

    public void girando() {
        System.out.println("Esta girando?");
        if(girando == true) {
            System.out.println("Si esta girando");
        } else {
            System.out.println("No esta girando");
            velocidad = 0;
        }
    }
    public void velocidadAngular() {
        System.out.println("Esta girando a una velocidad de: " + velocidad + " rpm");
    }
}
