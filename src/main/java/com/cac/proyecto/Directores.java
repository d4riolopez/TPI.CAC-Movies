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

        
}
