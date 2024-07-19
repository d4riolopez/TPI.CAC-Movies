/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controladores.PeliculaDAO;
import com.fasterxml.jackson.databind.ObjectMapper;
import entidades.Pelicula;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;
import org.apache.commons.io.FilenameUtils;
@WebServlet("/peliculas")
@MultipartConfig
public class PeliculaServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();
    private PeliculaDAO peliculaDAO = new PeliculaDAO();

    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        List<Pelicula> peliculas = peliculaDAO.obtenerTodasLasPeliculas();
        objectMapper.writeValue(response.getWriter(), peliculas); 
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los datos del formulario
        String titulo = request.getParameter("titulo");
String sinopsis = request.getParameter("sinopsis");
String genero = request.getParameter("genero");
String clasificacion = request.getParameter("clasificacion");
String director = request.getParameter("director");
Part imagenPart = request.getPart("imagen");

// Define the path where images will be stored
String rutaImagenes = getServletContext().getRealPath("/img");
File uploads = new File(rutaImagenes);
if (!uploads.exists()) {
    uploads.mkdirs();
}

// Generate a unique filename
String extension = FilenameUtils.getExtension(imagenPart.getSubmittedFileName());
String nombreArchivo = UUID.randomUUID().toString() + "." + extension;
File archivoImagen = new File(uploads, nombreArchivo);

// Save the image to the server
try {
    imagenPart.write(archivoImagen.getAbsolutePath());
} catch (IOException e) {
    e.printStackTrace();
    // Handle the error (e.g., show an error message to the user)
    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error saving the image");
    return;
}

// Insert the new movie into the database

String query="INSERT INTO `peliculas`(nombre, foto, sinopsis, genero, clasificacion, director)"
        + " VALUES (?,?,?,?,?,?)";
try (Connection conn = ConexionDB.obtenerConexion();
     PreparedStatement stmt = conn.prepareStatement(query)) {
    stmt.setString(1, titulo);
    stmt.setString(2, nombreArchivo); //solo se guarda la url de la imagen
    stmt.setString(3, sinopsis); 
    stmt.setString(4, genero);
    stmt.setString(5, clasificacion);
    stmt.setString(6, director);
    stmt.executeUpdate();
} catch (SQLException e) {
    e.printStackTrace();
    // Handle the error (e.g., show an error message to the user)
    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Error saving to database");
    return;
}
    }
}
