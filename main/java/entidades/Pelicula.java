
package entidades;

public class Pelicula {
    private int idPelicula;
    private String nombre;
    private String foto;
    private String sinopsis;
    private String genero;
    private String clasificacion;
    private String director;

    // Constructor

    public Pelicula(int idPelicula, String nombre, String foto, String sinopsis, String genero, String clasificacion, String director) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.foto = foto;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.director = director;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    
    
}
