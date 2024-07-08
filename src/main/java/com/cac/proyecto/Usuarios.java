package com.cac.proyecto;

import java.util.Date;

public class Usuarios {
    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;
    private Date fechaNacimiento;
    private String nacionalidad;
    
    Usuarios (){};
    Usuarios (String nom, String ape, String em,String cont,Date fNacim,String nac){
        this.nombre=nom;
        this.apellido=ape;
        this.email=em;
        this.contraseña=cont;
        this.fechaNacimiento=fNacim;
        this.nacionalidad=nac;
    }
    public String getNombre(){return nombre;};
    public void setNombre(String nom){this.nombre=nom;};
    public String getApellido(){return apellido;};
    public void setApellido(String ape){this.apellido=ape;};
    public String getEmail(){return email;};
    public void setEmail(String em){this.email=em;};
    public String getContraseña(){return contraseña;};
    public void setContraseña(String cont){this.contraseña=cont;};
    public Date getFechaNacimiento(){return fechaNacimiento;};
    public void setFechaNacimiento(Date fNacim){this.fechaNacimiento=fNacim;};
    public String getNacionalidad(){return nacionalidad;};
    public void setNacionalidad(String nac){this.nacionalidad=nac;};   
}