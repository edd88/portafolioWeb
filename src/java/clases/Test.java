/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import DAO.DAOCheckList;
import DAO.DAOUsuario;
import clases.Cl_CheckList;
import com.sun.corba.se.spi.activation.Server;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author Zeit
 */
public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("--------------------------------------");
        System.out.println("Clase Test");
        System.out.println("--------------------------------------");
        Cl_Conexion conexion = new Cl_Conexion();
        conexion.Conectar();
//        Cl_CheckList ub = new Cl_CheckList();
//        
//        ub.setDescripcion("asensores");
//        ub.setIdPlan(3);
//        DAOCheckList daoc = new DAOCheckList();
//        
//        try {
//            if (daoc.ingresarCheck(ub)) {
//                System.out.println("Agrego");
//            }
//            else{
//                System.out.println("no agrego");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        DAOUsuario daoUsuario = new DAOUsuario();
        Cl_Usuario user = daoUsuario.obtenerUsuario("PROFESIONAL1", "PROFESIONAL123");
        System.out.println(user.getUsuario());
        System.out.println(user.getIdTipoUsuario());
    }
}
