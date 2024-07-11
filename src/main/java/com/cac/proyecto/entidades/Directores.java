package entidades;
import java.util.Objects;

public class Directores {
  /*`idDirectores` int(11) NOT NULL,
  `nombre` varchar(35) DEFAULT NULL,
  `apellido` varchar(35) DEFAULT NULL,
  `f_nac` date DEFAULT NULL,
  `nacionalidad` varchar(30) DEFAULT NULL*/
        private int idDirectores;
        private String nombre;
        private String apellido;
        private Date f_nac;
        private String nacionalidad;
        
        Directores(){};//Constructor sin parametros

  public Directores(int idDirectores, String nombre, String apellido, Date f_nac, String nacionalidad) {
    this.idDirectores = idDirectores;
    this.nombre = nombre;
    this.apellido = apellido;
    this.f_nac = f_nac;
    this.nacionalidad = nacionalidad;
  }

  public int getIdDirectores() {
    return this.idDirectores;
  }

  public void setIdDirectores(int idDirectores) {
    this.idDirectores = idDirectores;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Date getF_nac() {
    return this.f_nac;
  }

  public void setF_nac(Date f_nac) {
    this.f_nac = f_nac;
  }

  public String getNacionalidad() {
    return this.nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  public Directores idDirectores(int idDirectores) {
    setIdDirectores(idDirectores);
    return this;
  }

  public Directores nombre(String nombre) {
    setNombre(nombre);
    return this;
  }

  public Directores apellido(String apellido) {
    setApellido(apellido);
    return this;
  }

  public Directores f_nac(Date f_nac) {
    setF_nac(f_nac);
    return this;
  }

  public Directores nacionalidad(String nacionalidad) {
    setNacionalidad(nacionalidad);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Directores)) {
            return false;
        }
        Directores directores = (Directores) o;
        return idDirectores == directores.idDirectores && Objects.equals(nombre, directores.nombre) && Objects.equals(apellido, directores.apellido) && Objects.equals(f_nac, directores.f_nac) && Objects.equals(nacionalidad, directores.nacionalidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idDirectores, nombre, apellido, f_nac, nacionalidad);
  }

  @Override
  public String toString() {
    return "{" +
      " idDirectores='" + getIdDirectores() + "'" +
      ", nombre='" + getNombre() + "'" +
      ", apellido='" + getApellido() + "'" +
      ", f_nac='" + getF_nac() + "'" +
      ", nacionalidad='" + getNacionalidad() + "'" +
      "}";
  }
        

        
}
