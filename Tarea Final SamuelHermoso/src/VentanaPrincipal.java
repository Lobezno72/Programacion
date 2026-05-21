import javax.swing.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {

        setTitle("Gestión de Coches");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar barra = new JMenuBar();

        JMenu menu = new JMenu("Opciones");

        JMenuItem agregar = new JMenuItem("Añadir Coche");
        JMenuItem mostrar = new JMenuItem("Mostrar Coches");

        agregar.addActionListener(e -> {
            new FormularioCoche();
        });

        mostrar.addActionListener(e -> {
            new TablaCoches();
        });

        menu.add(agregar);
        menu.add(mostrar);

        barra.add(menu);

        setJMenuBar(barra);

        setVisible(true);
    }
}