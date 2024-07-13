package controladores;
import entidades.Peliculas;

public class PeliculaControlador {
    
    public boolean insertarPelicula(Peliculas pelicula){
        String sql = "INSERT INTO `peliculas`(nombre, foto,
         sinopsis, genero, clasificacion, fechaEstreno, director) VALUES (
         ?, ?, ?, ?, ?, ?, ?)";

         try(Connection conn=Conexion.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)){

            ps.setString(1, pelicula.setNombre());
            ps.setString(2, pelicula.setFoto());
            ps.setString(3, pelicula.setSinopsis());
            ps.setString(4, pelicula.setGenero());
            ps.setString(5, pelicula.setClasificacion());
            ps.setDate(6, pelicula.setFechaEstreno());
            ps.setString(7, pelicula.setDirector());
         
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas>0;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    private Peliculas extraerPeliculaResultSet(ResultSet rs) throws Exception{
        Peliculas p = new Peliculas();
        p.setIdPelicula(rs.getInt("idPelicula")); //
        p.setNombre(rs.getString("nombre"));
        p.setFoto(rs.getString("foto"));
        p.setSinopsis(rs.getString("sinopsis"));
        p.setGenero(rs.getString("genero"));
        p.setClasificacion(rs.getString("clasificacion") );
        p.setFechaEstreno(rs.getDate("fechaEstreno") );
        p.setDirector(rs.getString("director"));
        return p;
    }

    public List<Peliculas> obtenerTodos(){
        List<Peliculas> list = new ArrayList<>();
        String sql ="SELECT * FROM Peliculas";
        try(Connection conn=Conexion.getConnection();
         Statement s = conn.createStatement()){
            ResultSet rs = s.executeQuery(sql);

            while(rs.next()) {
                Peliculas p=extraerPeliculaResultSet(rs);
                list.add(p);
         }
    }catch(Exception e){
        e.printStackTrace();
    }

    return list;

}
    public Peliculas obtenerPorId(int id){

    }

    public boolean modificar(Peliculas p){
        String query="UPDATE Peliculas SET nombre = ?, foto = ?, sinopsis = ?, genero = ?
        , clasificacion = ?, fechaEstreno = ?, director = ? WHERE idPelicula = ?";

        try(Connection conn=Conexion.getConnection();
         PreparedStatement s = conn.prepareStatement(query)){
        s.setIdPelicula(rs.getInt("idPelicula")); //
        s.setNombre(rs.getString("nombre"));
        s.setFoto(rs.getString("foto"));
        s.setSinopsis(rs.getString("sinopsis"));
        s.setGenero(rs.getString("genero"));
        s.setClasificacion(rs.getString("clasificacion") );
        s.setFechaEstreno(rs.getDate("fechaEstreno") );
        s.setDirector(rs.getString("director")); 
        int filasAfectadas = ps.executeUpdate();
        return filasAfectadas>0;
         }catch(Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminar (int id){
        String query="DELETE FROM Peliculas WHERE idPelicula = ?";
        try(Connection conn=Conexion.getConnection();
        PreparedStatement s = conn.prepareStatement(query)){
            s.setInt (1, idPelicula);
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas>0;
    }catch(Exception e){e.printStackTrace();
    return false;}

}
