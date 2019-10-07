/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clases.Cl_Conexion;
import clases.Cl_PlanContratado;
import clases.Cl_Profesional;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Zeit
 */
public class DAOProfesional {
    Cl_Conexion conexion;
    
    public DAOProfesional() {
        conexion = new Cl_Conexion();
    }
    
    public Cl_Profesional obtenerProfesional(int idUsuario) throws Exception{
        CallableStatement cstmt = null;
        ResultSet rs = null;
        String sql = "{call PKG_PROFESIONAL.OBTENER_PROFESIONAL(?,?)}";
        try{
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.setInt(1, idUsuario);
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.executeUpdate();
            rs = (ResultSet) cstmt.getObject(2);
            Cl_Profesional profesional = new Cl_Profesional();
            while (rs.next()) {                
                profesional.setIdProfesional(rs.getInt(1));
                profesional.setRut(rs.getString(2));
                profesional.setNombre(rs.getString(3));
                profesional.setApePaterno(rs.getString(4));
                profesional.setApeMaterno(rs.getString(5));
                profesional.setTelefono(rs.getString(6));
                profesional.setFecNacimiento(rs.getDate(5));
                profesional.setIdComuna(rs.getInt(6));
            }
            return profesional;
        } catch (Exception err) {
            throw new Exception(err);
        }finally{
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
