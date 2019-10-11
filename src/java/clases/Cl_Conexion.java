/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Zeit
 */
public class Cl_Conexion {
    private static Connection conexion;
    String cadena = "jdbc:Oracle:thin:@localhost:1521:orcl";

    public Connection Conectar() throws Exception {
        try {
            if (conexion==null) {
                Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
                conexion = DriverManager.getConnection(cadena, "NOMAS","1234");
                if (conexion!=null) {
                    System.out.println("Conexion Exitosa en Nomasaccidentes");
                }else{
                    System.out.println("No se pudo Conectar");
                }
                
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return conexion;
    }
    
    public Connection obtenerConexion(){
        return conexion;
    }
    
}
