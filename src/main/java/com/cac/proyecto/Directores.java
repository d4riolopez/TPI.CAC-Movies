package com.cac.proyecto;

public class Directores {
        private String nombre;
        private String apellido;
        private int edad; 
        private String nacionalidad;
        
        Directores(){};//Constructor sin parametros
        Directores(String n,String a, int e,String nac)//Constructor con parametros
        {
          this.nombre=n;
          this.apellido=a;
          this.edad=e;
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
