package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
public class Concesionario extends JFrame {
    private ArrayList<Coche> listaCoches = new ArrayList<>();
    public Concesionario() {

        setTitle("Concesionario");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar barra = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem agregar = new JMenuItem("Añadir coche");
        JMenuItem mostrar = new JMenuItem("Mostrar coches");
        JMenuItem actualizar = new JMenuItem("Actualizar coche");
        JMenuItem eliminar = new JMenuItem("Eliminar coche");

        menu.add(agregar);
        menu.add(mostrar);
        menu.add(actualizar);
        menu.add(eliminar);

        barra.add(menu);
        setJMenuBar(barra);

        agregar.addActionListener(e -> abrirFormulario());
        mostrar.addActionListener(e -> mostrarTabla());
        actualizar.addActionListener(e -> actualizarCoche());
        eliminar.addActionListener(e -> eliminarCoche());

        setVisible(true);
    }
    private void abrirFormulario() {
        JFrame ventana = new JFrame("Nuevo coche");
        ventana.setSize(300, 250);
        ventana.setLayout(new GridLayout(4, 2));

        JLabel lblMarca = new JLabel("Marca:");
        JTextField txtMarca = new JTextField();

        JLabel lblAnio = new JLabel("Año:");
        JTextField txtAnio = new JTextField();

        JLabel lblColor = new JLabel("Color:");
        JTextField txtColor = new JTextField();

        JButton btnGuardar = new JButton("Guardar");

        ventana.add(lblMarca);
        ventana.add(txtMarca);

        ventana.add(lblAnio);
        ventana.add(txtAnio);

        ventana.add(lblColor);
        ventana.add(txtColor);

        ventana.add(new JLabel());
        ventana.add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            String marca = txtMarca.getText();
            String color = txtColor.getText();
            String anioTexto = txtAnio.getText();

            if (marca.isEmpty() || color.isEmpty() || anioTexto.isEmpty()) {
                JOptionPane.showMessageDialog(ventana, "No puede haber campos vacíos");
                return;
            }
            int anio;
            try {
                anio = Integer.parseInt(anioTexto);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(ventana, "El año debe ser numérico");
                return;
            }

            Coche coche = new Coche(marca, anio, color);

            listaCoches.add(coche);

            ConexionDB.insertarCoche(marca, anio, color);

            JOptionPane.showMessageDialog(ventana, "Coche añadido correctamente");

            ventana.dispose();
        });
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    private void mostrarTabla() {

        JFrame ventana = new JFrame("Lista de coches");
        ventana.setSize(500, 300);

        String[] columnas = {"Marca", "Año", "Color"};

        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modelo);

        for (Coche c : listaCoches) {
            Object[] fila = {
                    c.getMarca(),
                    c.getAnio(),
                    c.getColor()
            };
            modelo.addRow(fila);
        }

        JScrollPane scroll = new JScrollPane(tabla);
        ventana.add(scroll);

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private void actualizarCoche() {

        String marcaBuscar = JOptionPane.showInputDialog(this, "Introduce la marca del coche a modificar");

        if (marcaBuscar == null || marcaBuscar.isEmpty()) return;

        for (Coche c : listaCoches) {

            if (c.getMarca().equalsIgnoreCase(marcaBuscar)) {

                String nuevaMarca = JOptionPane.showInputDialog(this, "Nueva marca:", c.getMarca());
                String nuevoAnio = JOptionPane.showInputDialog(this, "Nuevo año:", c.getAnio());
                String nuevoColor = JOptionPane.showInputDialog(this, "Nuevo color:", c.getColor());

                try {
                    c.setMarca(nuevaMarca);
                    c.setAnio(Integer.parseInt(nuevoAnio));
                    c.setColor(nuevoColor);

                    JOptionPane.showMessageDialog(this, "Coche actualizado correctamente");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "El año debe ser numérico");
                }

                return;
            }
        }

        JOptionPane.showMessageDialog(this, "No se encontró ningún coche con esa marca");
    }

    private void eliminarCoche() {

        String marcaBuscar = JOptionPane.showInputDialog(this, "Introduce la marca del coche a eliminar");

        if (marcaBuscar == null || marcaBuscar.isEmpty()) return;

        for (int i = 0; i < listaCoches.size(); i++) {

            if (listaCoches.get(i).getMarca().equalsIgnoreCase(marcaBuscar)) {

                listaCoches.remove(i);

                JOptionPane.showMessageDialog(this, "Coche eliminado correctamente");
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "No se encontró ningún coche con esa marca");
    }
}