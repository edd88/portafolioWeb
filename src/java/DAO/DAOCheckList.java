/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clases.Cl_CheckList;
import clases.Cl_Conexion;
import clases.Cl_Evento;
import clases.Cl_PlanContratado;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Zeit
 */
public class DAOCheckList {
    private Connection conexion;
    public DAOCheckList() {
        
    }
    
    public boolean ingresarCheck(Cl_CheckList checkList) throws SQLException{
        
        boolean agrego =false;
        
        try {
            this.conexion = new Cl_Conexion().obtenerConexion();
        String llamada = "{call PKG_CHECKLIST.INSERTAR_CHECKLIST(?,?)}";
        CallableStatement cstmt = this.conexion.prepareCall(llamada);
        
        cstmt.setString(1, checkList.getDescripcion());
        cstmt.setInt(2, checkList.getIdPlan());
        
            if (cstmt.executeUpdate()>0) {
                agrego= true;
            }
        
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            this.conexion.close();
        }
        
        return agrego;
    }
    
    
        
    
}
