import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblGenero;
    private JLabel lblPesoIns;
    private JLabel lblPlataforma;
    private JLabel lblDesarrollador;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtGenero;
    private JTextField txtPesoIns;
    private JTextField txtPlataforma;
    private JTextField txtDesarrollador;
    private JButton btnAgregar;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private ModeloTablaJuego modelo;
    private ArrayList<VideoJuego> info;
    private JScrollPane scroll;
    private JTable tblTabla;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(500,700);
        layout = new GridLayout(2,1);
        this.setLayout(layout);

        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(new Color(21, 140, 206));

        lblId = new JLabel("Id: ");
        txtId = new JTextField(4);
        panel1.add(lblId);
        panel1.add(txtId);

        lblNombre = new JLabel("Nombre: ");
        txtNombre = new JTextField(30);
        panel1.add(lblNombre);
        panel1.add(txtNombre);

        lblGenero = new JLabel("Genero: ");
        txtGenero = new JTextField(4);
        panel1.add(lblGenero);
        panel1.add(txtGenero);

        lblPesoIns = new JLabel("Peso: ");
        txtPesoIns = new JTextField(4);
        panel1.add(lblPesoIns);
        panel1.add(txtPesoIns);

        lblPlataforma = new JLabel("Plataforma: ");
        txtPlataforma = new JTextField(4);
        panel1.add(lblPlataforma);
        panel1.add(txtPlataforma);

        lblDesarrollador = new JLabel("Desarrollador:");
        txtDesarrollador = new JTextField(4);
        panel1.add(lblDesarrollador);
        panel1.add(txtDesarrollador);

        btnAgregar = new JButton("Agregar Juego");
        panel1.add(btnAgregar);


        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(new Color(0x8925EE));

        info = new ArrayList<>();
        info.add(new VideoJuego(1, "Call Of Duty", "FPS",
                100.5, "PlayStation, XBOX y Windows",
                "ACTIVISION"));
        modelo = new ModeloTablaJuego(info);
        tblTabla = new JTable(modelo);
        scroll = new JScrollPane(tblTabla);
        panel2.add(scroll);

        this.getContentPane().add(panel2, 1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                VideoJuego nuevo = new VideoJuego();
                nuevo.setId(Integer.parseInt(txtId.getText()));
                nuevo.setNombre(txtNombre.getText());
                nuevo.setGenero(txtGenero.getText());
                nuevo.setPesoIns(Double.parseDouble(txtPesoIns.getText()));
                nuevo.setPlataforma(txtPlataforma.getText());
                nuevo.setDesarrollador(txtDesarrollador.getText());

                modelo.agregarJuego(nuevo);
                tblTabla.updateUI();
            }
        });

        this.setVisible(true);




    }
}
