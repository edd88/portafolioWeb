/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class DAOPlan {
    Cl_Conexion conexion;
    public DAOPlan() {
        conexion = new Cl_Conexion();
    }
    
    public List<Cl_PlanContratado> listarPlan() throws Exception{
        CallableStatement cstmt = null;
        ResultSet rs = null;
        List<Cl_PlanContratado> listaPlan;
        listaPlan = new ArrayList<>();
        String sql = "{call PKG_PLANCONTRATADO.LISTAR_PLANCONTRATADO(?)}";
        try{
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.executeUpdate();
            rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {                
                Cl_PlanContratado plan = new Cl_PlanContratado();
                plan.setIdPlan(rs.getInt(1));
                plan.setFecPlan(rs.getDate(2));
                plan.setPrecio(rs.getInt(3));
                plan.setSucursal(rs.getString(4));
                plan.setEstado(rs.getInt(5));
                plan.setIdCliente(rs.getInt(6));
                plan.setIdProfesional(rs.getInt(7));
                listaPlan.add(plan);
            }
            return listaPlan;
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
    
    public Cl_PlanContratado obtenerPlan(int idPlan) throws Exception{
        CallableStatement cstmt = null;
        ResultSet rs = null;
        String sql = "{call PKG_PLANCONTRATADO.OBTENER_PLAN(?,?)}";
        try{
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.setInt(1, idPlan);
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.executeUpdate();
            rs = (ResultSet) cstmt.getObject(2);
            Cl_PlanContratado plan = new Cl_PlanContratado();
            while (rs.next()) {                
                plan.setIdPlan(rs.getInt(1));
                plan.setFecPlan(rs.getDate(2));
                plan.setPrecio(rs.getInt(3));
                plan.setSucursal(rs.getString(4));
                plan.setEstado(rs.getInt(5));
                plan.setIdCliente(rs.getInt(6));
                plan.setIdProfesional(rs.getInt(7));
            }
            return plan;
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
