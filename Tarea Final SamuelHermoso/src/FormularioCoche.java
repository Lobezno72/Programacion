import javax.swing.*;
import java.awt.*;

public class FormularioCoche extends JFrame {

    private JTextField txtMarca;
    private JTextField txtAnio;
    private JTextField txtColor;

    public FormularioCoche() {

        setTitle("Añadir coche");
        setSize(300, 220);
        setLayout(new GridLayout(4,2));

        JLabel lblMarca = new JLabel("Marca:");
        JLabel lblAnio = new JLabel("Año:");
        JLabel lblColor = new JLabel("Color:");

        txtMarca = new JTextField();
        txtAnio = new JTextField();
        txtColor = new JTextField();

        JButton guardar = new JButton("Guardar");

        guardar.addActionListener(e -> guardarCoche());

        add(lblMarca);
        add(txtMarca);

        add(lblAnio);
        add(txtAnio);

        add(lblColor);
        add(txtColor);

        add(new JLabel());
        add(guardar);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void guardarCoche() {

        String marca = txtMarca.getText().trim();
        String color = txtColor.getText().trim();
        String anioTexto = txtAnio.getText().trim();

        if (marca.isEmpty() ||
                color.isEmpty() ||
                anioTexto.isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Todos los campos son obligatorios"
            );
            return;
        }

        try {

            int anio = Integer.parseInt(anioTexto);

            Coche coche =
                    new Coche(marca, anio, color);

            GestorCoches.agregar(coche);

            JOptionPane.showMessageDialog(
                    this,
                    "Coche añadido correctamente"
            );

            dispose();

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "El año debe ser numérico"
            );

        }
    }
}