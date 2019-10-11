/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clases.Cl_Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author Zeit
 */
public class DAOAsesoria {
    Cl_Conexion conexion;
    public DAOAsesoria() {
        conexion = new Cl_Conexion();
    }
    
    public int ingresarAsesoria(int idEvento, String asesoria) throws Exception{
        CallableStatement cstmt = null;
        ResultSet rs = null;
        //java.sql.Date sqlFechaInicio = java.sql.Date.valueOf(fechaInicio);
        String sql = "{call PKG_EVENTO.INGRESAR_ASESORIA(?,?)}";
        try {
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.setInt(1, idEvento);
            cstmt.setString(2, asesoria);
            cstmt.execute();
            return 1;
        }catch(Exception err){
            throw new Exception(err);
        }finally {
            conexion.Conectar().close();
            if (cstmt != null) {
                cstmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
    }
    
}
