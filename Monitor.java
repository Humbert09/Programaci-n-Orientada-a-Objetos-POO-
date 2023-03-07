import java.util.ArrayList;

public class Monitor {
        private String marcaMonitor;
        private String modelMonitor;
        private String type;
        private double price;
        private double inches;

        public Monitor() {
        }

        public Monitor(String marca, String model, String type, double price, double inches) {
            this.marcaMonitor = marca;
            this.modelMonitor = model;
            this.type = type;
            this.price = price;
            this.inches = inches;
        }

        public String getMarcaMonitor() {
            return marcaMonitor;
        }

        public void setMarcaMonitor(String marcaMonitor) {
            ArrayList<String> marcasMon = new ArrayList<>();
            marcasMon.add("ASUS");
            marcasMon.add("TUF");
            marcasMon.add("GIGABYTE");
            marcasMon.add("SAMSUNG");
            marcasMon.add("PHILLIPS");
            marcasMon.add("ATVIO");
            marcasMon.add("LG");

            if (marcasMon.contains(marcaMonitor.toUpperCase())) {
                this.marcaMonitor = marcaMonitor;
            } else {
                System.out.println("Esta marca no existe");
            }

        }

        public String getModelMonitor() {
            return modelMonitor;
        }

        public void setModelMonitor(String modelMonitor) {
            this.modelMonitor = modelMonitor;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getInches() {
            return inches;
        }

        public void setInches(double inches) {
            this.inches = inches;
        }
}