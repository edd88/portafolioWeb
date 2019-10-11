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
public class DAOReporteCheck {
    Cl_Conexion conexion;
    public DAOReporteCheck() {
        conexion = new Cl_Conexion();
    }
    
    public int ingresarReporte(int estadoCheck, String mejora, int idCheck) throws Exception{
        CallableStatement cstmt = null;
        ResultSet rs = null;
        //java.sql.Date sqlFechaInicio = java.sql.Date.valueOf(fechaInicio);
        String sql = "{call PKG_CHECKLISTREPORTE.INSERTAR_CHECKLISTREPORTE(?,?,?)}";
        try {
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.setInt(1, estadoCheck);
            cstmt.setString(2, mejora);
            cstmt.setInt(3, idCheck);
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
