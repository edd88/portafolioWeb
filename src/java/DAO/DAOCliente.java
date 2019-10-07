/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clases.Cl_Cliente;
import clases.Cl_Conexion;
import clases.Cl_Profesional;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Zeit
 */
public class DAOCliente {
    Cl_Conexion conexion;
    public DAOCliente() {
        conexion = new Cl_Conexion();
    }
    
    public Cl_Cliente obtenerCliente(int idUsuario) throws Exception{
        CallableStatement cstmt = null;
        ResultSet rs = null;
        String sql = "{call PKG_CLIENTE.OBTENER_CLIENTE(?,?)}";
        try{
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.setInt(1, idUsuario);
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.executeUpdate();
            rs = (ResultSet) cstmt.getObject(2);
            Cl_Cliente cliente = new Cl_Cliente();
            while (rs.next()) {                
                cliente.setIdCliente(rs.getInt(1));
                cliente.setRut(rs.getString(2));
                cliente.setNombre(rs.getString(3));
                cliente.setApePaterno(rs.getString(4));
                cliente.setApeMaterno(rs.getString(5));
                cliente.setTelefono(rs.getString(6));
                cliente.setIdComuna(rs.getInt(7));
                cliente.setIdRubro(rs.getInt(8));
            }
            return cliente;
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
