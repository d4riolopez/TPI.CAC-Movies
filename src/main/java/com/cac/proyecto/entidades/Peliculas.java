package entidades;

import java.sql.Date;

public class Peliculas {
    private int idPelicula;
    private String nombre;
    private String foto;
    private String sinopsis;
    private String genero;
    private String clasificacion;
    private Date fechaEstreno;
    private String director;
    

    public Peliculas() {
    }

    public Peliculas(int idPelicula, String nombre, String foto, String sinopsis, String genero, String clasificacion, Date fechaEstreno, String director) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.foto = foto;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.fechaEstreno = fechaEstreno;
        this.director = director;
    }

    public int getIdPelicula() {
        return this.idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return this.foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getSinopsis() {
        return this.sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return this.clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Date getFechaEstreno() {
        return this.fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Peliculas idPelicula(int idPelicula) {
        setIdPelicula(idPelicula);
        return this;
    }

    public Peliculas nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Peliculas foto(String foto) {
        setFoto(foto);
        return this;
    }

    public Peliculas sinopsis(String sinopsis) {
        setSinopsis(sinopsis);
        return this;
    }

    public Peliculas genero(String genero) {
        setGenero(genero);
        return this;
    }

    public Peliculas clasificacion(String clasificacion) {
        setClasificacion(clasificacion);
        return this;
    }

    public Peliculas fechaEstreno(Date fechaEstreno) {
        setFechaEstreno(fechaEstreno);
        return this;
    }

    public Peliculas director(String director) {
        setDirector(director);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " idPelicula='" + getIdPelicula() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", foto='" + getFoto() + "'" +
            ", sinopsis='" + getSinopsis() + "'" +
            ", genero='" + getGenero() + "'" +
            ", clasificacion='" + getClasificacion() + "'" +
            ", fechaEstreno='" + getFechaEstreno() + "'" +
            ", director='" + getDirector() + "'" +
            "}";
    }
    
}
