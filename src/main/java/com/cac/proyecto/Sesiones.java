package com.cac.proyecto;

import java.util.Date;

public class Sesiones {
    private String perfil;
    private Date fechaInicio;
    private Date horaInicio;
    private Date horaFinalizacion;
    
    Sesiones(){};
    Sesiones(String per,Date fInicio,Date hInicio,Date hFinalizacion){
        this.perfil=per;
        this.fechaInicio=fInicio;
        this.horaInicio=hInicio;
        this.horaFinalizacion=hFinalizacion;
    };
    public String getPerfil(){return perfil;};
    public void setPerfil(String per){this.perfil=per;};
    public Date getFechaInicio(){return fechaInicio;};
    public void setFechaInicio(Date fInicio){this.fechaInicio=fInicio;};
    public Date getHoraInicio(){return horaInicio;};
    public void setHoraInicio(Date hInicio){this.fechaInicio=hInicio;};
    public Date getHoraFinalizacion(){return horaFinalizacion;};
    public void setHoraFinalizacion(Date hFinalizacion){this.horaFinalizacion=hFinalizacion;};
}
