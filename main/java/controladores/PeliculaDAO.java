/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import entidades.Pelicula;
import java.sql.*;
import java.util.*;
import main.ConexionDB;

/**
 *
 * @author miguel
 */
public class PeliculaDAO {

    public List<Pelicula> obtenerTodasLasPeliculas() {
        List<Pelicula> peliculas = new ArrayList<>();
        String query = "SELECT * FROM peliculas";

        try (Connection conn = ConexionDB.obtenerConexion(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Pelicula pelicula = new Pelicula(
                        rs.getInt("idPelicula"),
                        rs.getString("nombre"),
                        rs.getString("foto"),
                        rs.getString("sinopsis"),
                        rs.getString("genero"),
                        rs.getString("clasificacion"),
                        rs.getString("director")
                );
                peliculas.add(pelicula);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return peliculas;
    }
    
  }
