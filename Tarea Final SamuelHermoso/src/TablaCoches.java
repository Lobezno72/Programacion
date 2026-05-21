import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaCoches extends JFrame {

    public TablaCoches() {

        setTitle("Lista de coches");

        String[] columnas =
                {"Marca", "Año", "Color"};

        DefaultTableModel modelo =
                new DefaultTableModel(
                        columnas,
                        0
                );

        for (Coche c :
                GestorCoches.obtenerLista()) {

            modelo.addRow(new Object[]{
                    c.getMarca(),
                    c.getAnio(),
                    c.getColor()
            });
        }

        JTable tabla =
                new JTable(modelo);

        add(new JScrollPane(tabla));

        setSize(500,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}