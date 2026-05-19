import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private FormularioEstudiante formulario;

    public VentanaPrincipal() {

        setTitle("Sistema de Registro de Estudiantes");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        crearMenu();

        formulario = new FormularioEstudiante();

        add(formulario, BorderLayout.CENTER);
    }

    private void crearMenu() {

        JMenuBar menuBar = new JMenuBar();

        JMenu menuArchivo = new JMenu("Archivo");

        JMenuItem itemNuevo = new JMenuItem("Nuevo Estudiante");
        JMenuItem itemSalir = new JMenuItem("Salir");

        itemNuevo.addActionListener(e -> {

            formulario.limpiarCampos();

            JOptionPane.showMessageDialog(
                    this,
                    "Formulario listo para un nuevo estudiante.",
                    "Nuevo Registro",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        itemSalir.addActionListener(e -> System.exit(0));

        menuArchivo.add(itemNuevo);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);

        menuBar.add(menuArchivo);

        setJMenuBar(menuBar);
    }
}