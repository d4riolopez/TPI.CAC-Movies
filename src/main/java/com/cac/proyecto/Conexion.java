package com.cac.proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection connection;  // Objeto Connection para manejar la conexión a la base de datos

    // Constructor de la clase Conexion
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            this.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/finalcac",  // URL de conexión JDBC para MySQL
                "root",  // Nombre de usuario de la base de datos 
                "root"  // la contraseña es para Martina, en su caso pongan ""
            );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  // Imprimir el error en caso de no encontrar el driver
        } catch (SQLException e) {
            e.printStackTrace();  // Imprimir el error en caso de problemas con la conexión a la base de datos
        }
    }

       public Connection getConnection() {
        return connection;  // Devuelve el objeto Connection establecido
    }

    // Método para cerrar la conexión
    public void close() {
        try {
            // Verificar si la conexión no es nula y está abierta, entonces cerrarla
            if (connection != null && !connection.isClosed()) {
                connection.close();  // Cierra la conexión a la base de datos
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Imprimir el error en caso de problemas al cerrar la conexión
        }
    }

}
