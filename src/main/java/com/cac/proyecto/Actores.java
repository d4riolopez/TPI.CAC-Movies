package com.cac.proyecto;

public class Actores {
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    Actores(){};
    Actores(String nom,String ape,int ed,String nac){
           this.nombre=nac;
           this.apellido=ape;
           this.edad=ed;
           this.nacionalidad=nac;
    }
    public String getNombre(){return nombre;};
    public void setNombre(String nom){this.nombre=nom;};
    public String getApellido(){return apellido;};
    public void setApellido(String ape){this.apellido=ape;};
    public int getEdad(){return edad;};
    public void setEdad(int ed){this.edad=ed;};
    public String getNacionalidad(){return nacionalidad;};
    public void setNacionalidad(String nac){this.nacionalidad=nac;};

}
