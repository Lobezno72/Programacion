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

        VentanaRegistro ventana = new VentanaRegistro();
        ventana.setVisible(true);
    });
}


