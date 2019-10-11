/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author mauri
 */
public class CL_Ubicacion {
    
    private int idUbicacion;
    private String direccion; 
    private String fecha;
    private int idProfesional;
    
    public CL_Ubicacion(){
        
    }
    
    public CL_Ubicacion(int idUbicacion,String direccion,String fecha,int idprofesional ){
        
        this.idUbicacion = idUbicacion;
        this.direccion = direccion;
        this.fecha = fecha;
        this.idProfesional = idprofesional;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }
    
    
    
    
}
