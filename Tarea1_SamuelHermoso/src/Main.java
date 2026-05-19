import javax.swing.SwingUtilities;
import javax.swing.UIManager;

void main(String[] args) {

    try {

        UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName()
        );

    } catch (Exception e) {

        e.printStackTrace();
    }
    SwingUtilities.invokeLater(() -> {

        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
    });
}


