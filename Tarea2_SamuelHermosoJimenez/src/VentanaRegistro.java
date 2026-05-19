import javax.swing.*;
import java.awt.*;

public class VentanaRegistro extends JFrame {

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtCurso;

    private JButton btnGuardar;

    public VentanaRegistro() {

        setTitle("Registro de Estudiantes");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(4, 2, 10, 10));

        panel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblEdad = new JLabel("Edad:");
        JLabel lblCurso = new JLabel("Curso:");

        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtCurso = new JTextField();

        btnGuardar = new JButton("Guardar");

        btnGuardar.addActionListener(e -> guardarEstudiante());

        panel.add(lblNombre);
        panel.add(txtNombre);

        panel.add(lblEdad);
        panel.add(txtEdad);

        panel.add(lblCurso);
        panel.add(txtCurso);

        panel.add(new JLabel());
        panel.add(btnGuardar);

        add(panel);
    }

    private void guardarEstudiante() {

        String nombre = txtNombre.getText().trim();
        String edad = txtEdad.getText().trim();
        String curso = txtCurso.getText().trim();

        if (nombre.isEmpty() || edad.isEmpty() || curso.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor complete todos los campos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        Estudiante estudiante = new Estudiante(
                nombre,
                edad,
                curso
        );

        JOptionPane.showMessageDialog(
                this,
                estudiante.mostrarDatos(),
                "Información Guardada",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}