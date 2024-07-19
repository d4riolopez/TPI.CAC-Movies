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
        //lo que esta entre comilllas seria el nombre del name del input
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
        p.setFechaEstreno(Date.valueOf(fechaEstreno));
        p.setDirector(director);

        PeliculaControlador pC=new PeliculasControlador();
        //cambiar a gusto mas adelnate sino
        try{
            pC.insertarPelicula(p);
            //lo de redireccion y error segun script establecido
            //video profe codo a codo minuto 23:25 agregar en la pagina
            //que va a hacer Alejandro
            response.sendRederect("index.jsp?redireccion=true");
        }catch(Exception e){
            response.sendRederect("registro.jsp?error=false");
        }
    }
}
