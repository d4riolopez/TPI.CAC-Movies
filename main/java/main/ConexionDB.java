
package main;

import java.sql.*;


public class ConexionDB {
        private static final String url = "jdbc:mysql://localhost:3306/finalcac";
    private static final String user = "root";
    private static final String pass = "root";

    public static Connection obtenerConexion() throws SQLException {

        try {
            // Cargar el driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("No se encontró el driver JDBC", e);
        }

        return DriverManager.getConnection(url, user, pass);
    }
}
