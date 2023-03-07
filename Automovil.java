import java.awt.*;
import java.util.ArrayList;

public class Automovil {

        //Crear los atributos
        private String marcaAuto;
        private String subMarca;
        private byte modeloAuto; //2000 + byte
        private Color colorAuto;

        public Automovil() {
        }

        public Automovil(String marca, String subMarca, byte modelo, Color color) {
                this.marcaAuto = marca;
                this.subMarca = subMarca;
                this.modeloAuto = modelo;
                this.colorAuto = color;
        }

        public String getMarcaAuto() {
                return marcaAuto;
        }

        public void setMarcaAuto(String marcaAuto) {
                ArrayList<String> marcasAuto= new ArrayList<>();
                marcasAuto.add("ASTON MARTION");
                marcasAuto.add("FERRARI");
                marcasAuto.add("MERCEDES");
                marcasAuto.add("MCLAREN");
                marcasAuto.add("ALFA ROMEO");
                marcasAuto.add("RENAULT");
                marcasAuto.add("HONDA");

                if (marcasAuto.contains(marcaAuto.toUpperCase())) {
                        this.marcaAuto = marcaAuto;
                } else {
                        System.out.println("Esta marca no existe");
                }
        }

        public String getSubMarca() {
                return subMarca;
        }

        public void setSubMarca(String subMarca) {
                this.subMarca = subMarca;
        }

        public byte getModeloAuto() {
                return modeloAuto;
        }

        public void setModeloAuto(byte modeloAuto) {
                this.modeloAuto = modeloAuto;
        }

        public Color getColorAuto() {
                return colorAuto;
        }

        public void setColorAuto(Color colorAuto) {
                this.colorAuto = colorAuto;
        }
}