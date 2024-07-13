package com.cac;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.com.cac.proyecto.entidades.Peliculas;
import java.com.cac.proyecto.controladores.PeliculaControlador;


//direccion del form action"/contexto/crud" method=post
@WebServlet("/crud")
public class PeliculasServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
     HttpServletResponse response) throws ServletException, IOException {

        //obtener parametros de la solicitud, modifcar segun lo de Alejandro
        String nombre = request.getParameter("nombre");
        String foto = request.getParameter("foto");
        String sinopsis = request.getParameter("sinopsis");
        String genero = request.getParameter("genero");
        String clasificacion = request.getParameter("clasificacion");
        String fechaEstreno = request.getParameter("fechaEstreno");
        String director = request.getParameter("director");

        Peliculas p=new Peliculas();
        p.setNombre(nombre);
        p.setFoto(foto);
        p.setSinopsis(sinopsis);
        p.setGenero(genero);
        p.setClasificacion(clasificacion);
        p.setFechaEstreno(fechaEstreno);
        p.setDirector(director);
    }
}
