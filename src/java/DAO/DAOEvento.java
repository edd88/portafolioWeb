/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class DAOEvento {
    Cl_Conexion conexion;

    public DAOEvento() {
        conexion = new Cl_Conexion();
    }
    
    public int IngresarEvento(int idTipoEvento,int idPlan) throws Exception{
        CallableStatement cstmt = null;
        ResultSet rs = null;
        //java.sql.Date sqlFechaInicio = java.sql.Date.valueOf(fechaInicio);
        String sql = "{call PKG_EVENTO.INSERTAR_EVENTO(?,?)}";
        try {
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.setInt(1, idTipoEvento);
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
    
    public List<Cl_Evento> listarEventos() throws Exception{
        List<Cl_Evento> listaEventos;
        listaEventos = new ArrayList<>();
        CallableStatement cstmt = null;
        ResultSet rs = null;
        String sql = "{call PKG_EVENTO.LISTAR_EVENTOS(?)}";
        try{
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.registerOutParameter(1, OracleTypes.CURSOR);
            cstmt.executeUpdate();
            rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) {                
                Cl_Evento evento = new Cl_Evento();
                evento.setIdEvento(rs.getInt(1));
                evento.setAsesoria(rs.getString(2));
                evento.setFecha(rs.getDate(3));
                evento.setTipoEvento(rs.getInt(4));
                listaEventos.add(evento);
            }
            return listaEventos;
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
    
    public List<Cl_Evento> obtenerEvento(int idEvento) throws Exception{
        List<Cl_Evento> listaEventos;
        listaEventos = new ArrayList<>();
        CallableStatement cstmt = null;
        ResultSet rs = null;
        String sql = "{call PKG_EVENTO.OBTENER_EVENTO(?,?)}";
        try{
            cstmt = conexion.Conectar().prepareCall(sql);
            cstmt.setInt(1, idEvento);
            cstmt.registerOutParameter(2, OracleTypes.CURSOR);
            cstmt.executeUpdate();
            rs = (ResultSet) cstmt.getObject(2);
            while (rs.next()) {                
                Cl_Evento evento = new Cl_Evento();
                evento.setIdEvento(rs.getInt(1));
                evento.setAsesoria(rs.getString(2));
                evento.setFecha(rs.getDate(3));
                evento.setTipoEvento(rs.getInt(4));
                listaEventos.add(evento);
            }
            return listaEventos;
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
