package project.poo.vista;

import project.poo.modelo.Dulce;
import project.poo.modelo.ModeloTablaDulce;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.Image;
import java.awt.Toolkit;

public class Ventana extends JFrame {

    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblMarca;
    private JLabel lblTipo;
    private JLabel lblSabor;
    private JLabel lblUrlFoto;
    private JLabel lblImagenDulce;
    private JLabel lblRegistroSeleccionado;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtMarca;
    private JTextField txtTipo;
    private JTextField txtSabor;
    private JTextField txtUrlFoto;
    private JButton btnAgregar;
    private JButton btnCargar;
    private JButton btnEliminar;
    private JButton btnActualizar;
    private GridLayout layout;
    private JTable tblDulces;
    private JScrollPane scrTabla;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private ModeloTablaDulce modelo;
    private ArrayList<Dulce> info;






    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(1200, 800);//Tamano de la ventana

        layout = new GridLayout(2, 2);//Division de la ventana
        this.getContentPane().setLayout(layout);




//Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(0xFFFBB6D1, true));
        this.getContentPane().add(panel1, 0);
        lblId = new JLabel("Id:");
        lblNombre = new JLabel("Nombre:");
        lblMarca = new JLabel("Marca:");
        lblTipo = new JLabel("Tipo:");
        lblSabor = new JLabel("Sabor:");
        lblUrlFoto = new JLabel("URL Foto:");
        txtId = new JTextField(10);
        txtId.setText("0");
        txtId.setEnabled(false);
        txtNombre = new JTextField(10);
        txtMarca = new JTextField(10);
        txtTipo = new JTextField(10);
        txtSabor = new JTextField(10);
        txtUrlFoto = new JTextField(30);
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblNombre);
        panel1.add(txtNombre);
        panel1.add(lblMarca);
        panel1.add(txtMarca);
        panel1.add(lblTipo);
        panel1.add(txtTipo);
        panel1.add(lblSabor);
        panel1.add(txtSabor);
        panel1.add(lblUrlFoto);
        panel1.add(txtUrlFoto);
        btnAgregar = new JButton("Agregar");
        panel1.add(btnAgregar);


        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(0xF54AB4E5, true));
        this.getContentPane().add(panel2, 1);
        info = new ArrayList<>();
        modelo = new ModeloTablaDulce(info);
        tblDulces = new JTable(modelo);
        scrTabla = new JScrollPane(tblDulces);
        panel2.add(scrTabla);
        btnCargar = new JButton("Cargar Datos");
        panel2.add(btnCargar);

        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(new Color(0xFFC1B3D7, true));
        this.getContentPane().add(panel3, 2);
        lblImagenDulce = new JLabel("...");
        this.panel3.add(lblImagenDulce);

        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(new Color(0xFFFFFFB0, true));
        this.getContentPane().add(panel4, 3);
        btnEliminar = new JButton("Eliminar");
        panel4.add(btnEliminar);
        lblRegistroSeleccionado = new JLabel("Ha seleccionado el registro no. ");
        panel4.add(lblRegistroSeleccionado);
        btnActualizar = new JButton("Actualizar");
        panel4.add(btnActualizar);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblNombre() {
        return lblNombre;
    }

    public void setLblNombre(JLabel lblNombre) {
        this.lblNombre = lblNombre;
    }

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblSabor() {
        return lblSabor;
    }

    public void setLblSabor(JLabel lblSabor) {
        this.lblSabor = lblSabor;
    }

    public JLabel getLblUrlFoto() {
        return lblUrlFoto;
    }

    public void setLblUrlFoto(JLabel lblUrlFoto) {
        this.lblUrlFoto = lblUrlFoto;
    }

    public JLabel getLblImagenDulce() {
        return lblImagenDulce;
    }

    public void setLblImagenDulce(JLabel lblImagenDulce) {
        this.lblImagenDulce = lblImagenDulce;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JTextField getTxtSabor() {
        return txtSabor;
    }

    public void setTxtSabor(JTextField txtSabor) {
        this.txtSabor = txtSabor;
    }

    public JTextField getTxtUrlFoto() {
        return txtUrlFoto;
    }

    public void setTxtUrlFoto(JTextField txtUrlFoto) {
        this.txtUrlFoto = txtUrlFoto;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JTable getTblDulces() {
        return tblDulces;
    }

    public void setTblDulces(JTable tblDulces) {
        this.tblDulces = tblDulces;
    }

    public JScrollPane getScrTabla() {
        return scrTabla;
    }

    public void setScrTabla(JScrollPane scrTabla) {
        this.scrTabla = scrTabla;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public ModeloTablaDulce getModelo() {
        return modelo;
    }

    public void setModelo(ModeloTablaDulce modelo) {
        this.modelo = modelo;
    }

    public ArrayList<Dulce> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<Dulce> info) {
        this.info = info;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnActualizar() {
        return btnActualizar;
    }
    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;

    }

    public JLabel getLblRegistroSeleccionado() {
        return lblRegistroSeleccionado;
    }

    public void setLblRegistroSeleccionado(JLabel lblRegistroSeleccionado) {
        this.lblRegistroSeleccionado = lblRegistroSeleccionado;
    }

    public void limpiar(){
        txtId.setText("");
        txtNombre.setText("");
        txtMarca.setText("");
        txtTipo.setText("");
        txtSabor.setText("");
        txtUrlFoto.setText("");
    }


}
