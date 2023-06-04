package project.poo.modelo;

import project.poo.persistencia.DulceDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaDulce implements TableModel {
    public static final int COLS = 6;
    private ArrayList<Dulce> datos;
    private DulceDAO ddao;

    public ModeloTablaDulce() {
        ddao = new DulceDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaDulce(ArrayList<Dulce> datos) {
        this.datos = datos;
        ddao = new DulceDAO();
    }


    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "Id";
                break;
            case 1:
                columnName = "Nombre";
                break;
            case 2:
                columnName = "Marca";
                break;
            case 3:
                columnName = "Tipo";
                break;
            case 4:
                columnName = "Sabor";
                break;
            case 5:
                columnName = "URL Foto";
                break;
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dulce tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getNombre();
            case 2:
                return tmp.getMarca();
            case 3:
                return tmp.getTipo();
            case 4:
                return tmp.getSabor();
            case 5:
                return tmp.getUrlFoto();
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                break;
            case 1:
                datos.get(rowIndex).setNombre((String)aValue);
                break;
            case 2:
                datos.get(rowIndex).setMarca((String)aValue);
                break;
            case 3:
                datos.get(rowIndex).setTipo((String)aValue);
                break;
            case 4:
                datos.get(rowIndex).setSabor((String)aValue);
                break;
            case 5:
                datos.get(rowIndex).setUrlFoto((String)aValue);
                break;
            default:
                System.out.println("No se ha modificado nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try{
            datos = ddao.obtenerTodo();
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }

    }

    public boolean agregarDulce(Dulce candy){
        boolean resultado = false;
        try{
            if(ddao.insertar(candy)){
                datos.add(candy);
                resultado = true;
            }else {
                resultado = false;
            }
        } catch(SQLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }


    public Dulce obtenerDulce(int rowIndex) throws IndexOutOfBoundsException{
        return datos.get(rowIndex);
    }

    public boolean deleteRow(String id){
        boolean resultado = false;
        try {
            if (ddao.delete(id)){
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public Dulce getDulceAddIndex(int index){
        return datos.get(index);
    }

    public boolean actualizarDatos(Dulce dulces) throws SQLException{
        boolean resultado = false;
        try {
            if (ddao.update(dulces)){
                datos.add(dulces);
                resultado = true;
            }else {
                resultado = false;
            }
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

}
