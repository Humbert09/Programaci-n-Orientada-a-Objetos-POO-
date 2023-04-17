public class Vehiculo {
    protected String tipo;
    protected String combusttible;
    protected String terreno;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String combusttible, String terreno) {
        this.tipo = tipo;
        this.combusttible = combusttible;
        this.terreno = terreno;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCombusttible() {
        return combusttible;
    }

    public void setCombusttible(String combusttible) {
        this.combusttible = combusttible;
    }

    public String getTerreno() {
        return terreno;
    }

    public void setTerreno(String terreno) {
        this.terreno = terreno;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", combusttible='" + combusttible + '\'' +
                ", terreno='" + terreno + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("Encendido...");
    }
    public void rellenarCombustible(){
        System.out.println("El tanque esta lleno");
    }
}
