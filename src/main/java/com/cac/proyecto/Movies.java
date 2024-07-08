package com.cac.proyecto;

import java.util.Date;

public class Movies {

    private String nombre;
    private String genero;
    private Date fechaCreacion;
    private String synopsis;
    private String calificacion;
    private String estrellas;
    private int añoEstreno;
    
    Movies(){};
    Movies(String nom,String gen,Date fCrea,String syn,String cal,String estr,int aEst){
        this.nombre=nom;
        this.genero=gen;
        this.fechaCreacion=fCrea;
        this.synopsis=syn;
        this.calificacion=cal;
        this.estrellas=estr;
        this.añoEstreno=aEst;
    }
        public String getNombre(){return nombre;};
        public void setNombre(String nom){this.nombre=nom;};
        public String getGenero(){return genero;};
        public void setGenero(String gen){this.genero=gen;};
        public int getFechaCreacion(){return fechaCreacion;};
        public void setEdad(int fCrea){this.fechaCreacion=fCrea;};
        public String getSynopsis(){return synopsis;};
        public void setSynopsis(String syn){this.synopsis=syn;};    
        public String getCalificacion(){return calificacion;};
        public void setCalificaion(String cal){this.calificacion=cal;};
        public String getEstrellas(){return estrellas;};
        public void setEstrellas(String est){this.estrellas=est;};
        public int getAñoEstreno(){return añoEstreno;};
        public void setAñoEstreno(int aEst){this.añoEstreno=aEst;};    
}
