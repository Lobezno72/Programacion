import javax.swing.*;
import java.awt.*;

public class FormularioEstudiante extends JPanel {

    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtCurso;

    private JButton btnGuardar;

    public FormularioEstudiante() {

        setLayout(new BorderLayout());

        crearFormulario();
    }

    private void crearFormulario() {

        JPanel panelFormulario = new JPanel();

        panelFormulario.setLayout(new GridLayout(4, 2, 15, 15));

        panelFormulario.setBorder(
                BorderFactory.createTitledBorder("Datos del Estudiante")
        );

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblEdad = new JLabel("Edad:");
        JLabel lblCurso = new JLabel("Curso:");

        txtNombre = new JTextField();
        txtEdad = new JTextField();
        txtCurso = new JTextField();

        btnGuardar = new JButton("Guardar");

        btnGuardar.addActionListener(e -> guardarEstudiante());

        panelFormulario.add(lblNombre);
        panelFormulario.add(txtNombre);

        panelFormulario.add(lblEdad);
        panelFormulario.add(txtEdad);

        panelFormulario.add(lblCurso);
        panelFormulario.add(txtCurso);

        panelFormulario.add(new JLabel());
        panelFormulario.add(btnGuardar);

        JPanel contenedor = new JPanel(new BorderLayout());

        contenedor.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        contenedor.add(panelFormulario, BorderLayout.CENTER);

        add(contenedor, BorderLayout.CENTER);
    }

    private void guardarEstudiante() {

        String nombre = txtNombre.getText().trim();
        String edad = txtEdad.getText().trim();
        String curso = txtCurso.getText().trim();

        if (nombre.isEmpty() || edad.isEmpty() || curso.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, complete todos los campos.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        JOptionPane.showMessageDialog(
                this,
                estudiante.obtenerInformacion(),
                "Registro Guardado",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void limpiarCampos() {

        txtNombre.setText("");
        txtEdad.setText("");
        txtCurso.setText("");
    }
}