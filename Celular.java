import java.awt.*;
import java.util.ArrayList;

public class Celular {
    private String marcaCel;
    private Color colorCel;
    private float size;
    private String modelCel;

    public Celular() {
    }

    public Celular(String marca, Color color, float size, String model) {
        this.marcaCel = marca;
        this.colorCel = color;
        this.size = size;
        this.modelCel = model;
    }

    public String getMarcaCel() {
        return marcaCel;
    }

    public void setMarcaCel(String marcaCel) {
        ArrayList<String> marcasCel = new ArrayList<>();
        marcasCel.add("APPLE");
        marcasCel.add("MOTOROLA");
        marcasCel.add("XIAOMI");
        marcasCel.add("SAMSUNG");
        marcasCel.add("HUAWEI");
        marcasCel.add("NOKIA");
        marcasCel.add("LG");
        marcasCel.add("OPPO");
        if (marcasCel.contains(marcaCel.toUpperCase())) {
            this.marcaCel = marcaCel;
        } else {
            System.out.println("Esta marca no existe");
        }

    }

    public Color getColorCel() {
        return colorCel;
    }

    public void setColorCel(Color colorCel) {
        this.colorCel = colorCel;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getModelCel() {
        return modelCel;
    }

    public void setModelCel(String modelCel) {
        this.modelCel = modelCel;
    }
}
