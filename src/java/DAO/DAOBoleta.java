/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import clases.Cl_Boleta;
import clases.Cl_Conexion;
import clases.Cl_Evento;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Zeit
 */
public class DAOBoleta {
    Cl_Conexion conexion;
    public DAOBoleta() {
        conexion = new Cl_Conexion();
    }
    
    public List<Cl_Boleta> listarBoletas() throws Exception{
        List<Cl_Boleta> listaBoletas;
        listaBoletas = new ArrayList<>();
        CallableStatement cstmt = null;
        ResultSet rs = null;
        String sql = "{call PKG_BOLETA.LISTAR_BOLETAS(?)}";
        try{
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.executeUpdate();
            rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {                
                Cl_Boleta boleta = new Cl_Boleta();
                boleta.setIdBoleta(rs.getInt(1));
                boleta.setFecPago(rs.getDate(2));
                boleta.setFecLimite(rs.getDate(3));
                boleta.setMonto(rs.getInt(4));
                boleta.setIdPlan(rs.getInt(5));
                listaBoletas.add(boleta);
            }
            return listaBoletas;
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
