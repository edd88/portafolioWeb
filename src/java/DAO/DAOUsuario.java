/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clases.Cl_Conexion;
import clases.Cl_Profesional;
import clases.Cl_Usuario;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;


public class DAOUsuario {
    Cl_Conexion conexion;
    
    public DAOUsuario() {
        conexion = new Cl_Conexion();
    }
    
    public Cl_Usuario obtenerUsuario(String user, String pass) throws Exception{
        CallableStatement cstmt = null;
        ResultSet rs = null;
        String sql = "{call PKG_USUARIO.OBTENER_USUARIO(?,?)}";
        try{
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.setString(1, user);
            cstmt.setString(2, pass);
            cstmt.registerOutParameter(3, OracleTypes.CURSOR);
            cstmt.executeUpdate();
            rs = (ResultSet) cstmt.getObject(3);
            Cl_Usuario usuario = new Cl_Usuario();
            while (rs.next()) {                
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setUsuario(rs.getString(2));
                usuario.setPass(rs.getString(3));
                usuario.setEstadoUsuario(rs.getInt(4));
            }
            return usuario;
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
