/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clases.Cl_Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import clases.CL_Ubicacion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mauri
 */
public class DAOUbicacion {
    
   private Connection conexion;
   
    public DAOUbicacion(){
        
    }
   
    
    public boolean IngresarUbicacion(CL_Ubicacion ubicacion) throws SQLException{
        
       boolean agregado = false;
        try {
            
            this.conexion = new Cl_Conexion().obtenerConexion();
            String llamada ="{call PKG_Ubicacion.INSERTAR_UBICACION(?,?,?)}";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            
            
            cstmt.setString(1, ubicacion.getDireccion());
            cstmt.setString(2, ubicacion.getFecha());
            cstmt.setInt(3, ubicacion.getIdProfesional());
            
            if (cstmt.executeUpdate()>0) {
                agregado = true;
            }
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            this.conexion.close();
        }
 
      
        
       
            
        
    
        return agregado;
    }
    
}
    
    
    

