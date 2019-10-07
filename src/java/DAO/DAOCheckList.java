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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Zeit
 */
public class DAOCheckList {
    Cl_Conexion conexion;
    public DAOCheckList() {
        conexion = new Cl_Conexion();
    }
    
    public int ingresarCheck(String descripcion, int idPlan) throws Exception{
        CallableStatement cstmt = null;
        ResultSet rs = null;
        //java.sql.Date sqlFechaInicio = java.sql.Date.valueOf(fechaInicio);
        String sql = "{call PKG_CHECKLIST.INSERTAR_CHECKLIST(?,?)}";
        try {
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.setString(1, descripcion);
            cstmt.setInt(2, idPlan);
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
    
    public List<Cl_CheckList> listarCheck() throws Exception{
        List<Cl_CheckList> listaCheck;
        listaCheck = new ArrayList<>();
        CallableStatement cstmt = null;
        ResultSet rs = null;
        String sql = "{call PKG_CHECKLIST.LISTAR_CHECKLIST(?)}";
        try{
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.executeUpdate();
            rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {                
                Cl_CheckList check = new Cl_CheckList();
                check.setIdCheck(rs.getInt(1));
                check.setDescripcion(rs.getString(2));
                check.setIdPlan(rs.getInt(3));
                listaCheck.add(check);
            }
            return listaCheck;
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
