package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/concesionario";
    private static final String USER = "samuel";
    private static final String PASSWORD = "1234";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void insertarCoche(String marca, int anio, String color) {

        String sql = "INSERT INTO coches (marca, anio, color) VALUES (?, ?, ?)";

        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, marca);
            ps.setInt(2, anio);
            ps.setString(3, color);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Coche guardado en la base de datos");

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar en BD");
        }
    }
}