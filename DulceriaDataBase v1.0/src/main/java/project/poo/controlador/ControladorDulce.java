package project.poo.controlador;

import project.poo.modelo.Dulce;
import project.poo.modelo.ModeloTablaDulce;
import project.poo.persistencia.ConexionSingleton;
import project.poo.vista.Ventana;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorDulce extends MouseAdapter {
    private Ventana view;
    private ModeloTablaDulce modelo;

    public ControladorDulce(Ventana view) {
        this.view = view;
        modelo = new ModeloTablaDulce();
        this.view.getTblDulces().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);


    }


    @Override
    public void mouseReleased(MouseEvent e) {
        //Cargar Base de Datos
        if (e.getSource() == this.view.getBtnCargar()) {
            modelo.cargarDatos();
            this.view.getTblDulces().setModel(modelo);
            this.view.getTblDulces().updateUI();
            this.view.getTblDulces().addMouseListener(this);
        }
        //Agregar registro
        if (e.getSource() == this.view.getBtnAgregar()) {
            Dulce temp = new Dulce();

            temp.setId(0);
            temp.setNombre(this.view.getTxtNombre().getText());
            temp.setMarca(this.view.getTxtMarca().getText());
            temp.setTipo(this.view.getTxtTipo().getText());
            temp.setSabor(this.view.getTxtSabor().getText());
            temp.setUrlFoto(this.view.getTxtUrlFoto().getText());

            if (modelo.agregarDulce(temp)) {
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblDulces().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos. Por favor revise la conexion", "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
        //Colocar Imagen
        if (e.getSource() == this.view.getTblDulces()) {
            System.out.println("Clic sobre la tabla");
            int rowIndex = this.view.getTblDulces().getSelectedRow();
            Dulce temp = modelo.obtenerDulce(rowIndex);
            this.view.getLblImagenDulce().setText("");
            this.view.getLblImagenDulce().setIcon(temp.createIcon());
        }
        //Eliminar registro
        if (e.getSource() == this.view.getBtnEliminar()) {
            if (this.view.getTblDulces().getSelectedRow() >= 0) {
                int respuesta = JOptionPane.showConfirmDialog(view,
                        "¿Desea eliminar el registro?",
                        "Eliminar", JOptionPane.YES_NO_OPTION);

                if (respuesta == JOptionPane.YES_NO_OPTION) {
                    ModeloTablaDulce temp = new ModeloTablaDulce();
                    int index = this.view.getTblDulces().getSelectedRow();
                    Dulce tmp = modelo.getDulceAddIndex(index);
                    temp.deleteRow(Integer.toString(tmp.getId()));
                    modelo.cargarDatos();
                    this.view.getTblDulces().updateUI();
                    this.view.limpiar();
                    JOptionPane.showMessageDialog(view, "Registro eliminado", "Eliminado", JOptionPane.OK_OPTION);
                }
            } else {
                JOptionPane.showMessageDialog(view, "Por favor seleccione un registro", "No seleccionado", JOptionPane.WARNING_MESSAGE);
            }
        }
        //Actualizar Datos
            //Registro seleccionado
        if (e.getSource() == this.view.getTblDulces()) {
            int index = this.view.getTblDulces().getSelectedRow();
            Dulce tmp = modelo.getDulceAddIndex(index);

            this.view.getTxtNombre().setText(tmp.getNombre());
            this.view.getTxtMarca().setText(tmp.getMarca());
            this.view.getTxtTipo().setText(tmp.getTipo());
            this.view.getTxtSabor().setText(tmp.getSabor());
            this.view.getTxtUrlFoto().setText(String.valueOf(tmp.getUrlFoto()));

            this.view.getLblRegistroSeleccionado().setText("Seleccionaste el registro No." + tmp.getId());

            this.view.getLblImagenDulce().setIcon(tmp.createIcon());
        }
        if (e.getSource() == this.view.getBtnActualizar()) {
            int index = this.view.getTblDulces().getSelectedRow();
            Dulce tmp = modelo.getDulceAddIndex(index);
            Dulce candy = new Dulce();
            try {
                candy.setNombre(this.view.getTxtNombre().getText());
                candy.setMarca(this.view.getTxtMarca().getText());
                candy.setTipo(this.view.getTxtTipo().getText());
                candy.setSabor(this.view.getTxtSabor().getText());
                candy.setUrlFoto(this.view.getTxtUrlFoto().getText());
                candy.setId(tmp.getId());

                if (modelo.actualizarDatos(candy)) {
                    JOptionPane.showMessageDialog(view, "Datos Actualizados", "Actualizacion"
                            , JOptionPane.INFORMATION_MESSAGE);

                    this.view.getTblDulces().setModel(modelo);
                    this.view.getTblDulces().updateUI();
                    modelo.cargarDatos();
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo modificar a la base de datos," +
                            "Error al actualizar\n Revise su conexion", "Error", JOptionPane.ERROR_MESSAGE);
                }
                this.view.getTblDulces().updateUI();
                this.view.limpiar();
            }catch (SQLException sqle){
                System.out.println(sqle.getMessage());
            }
        }





        }
}


