/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


public class Cl_Usuario {
    private int idUsuario;
    private String usuario;
    private String pass;
    private int estadoUsuario;
    private int idtipoUsuario;

    public Cl_Usuario() {
    }

    public Cl_Usuario(int idUsuario, String usuario, String pass, int estadoUsuario, int idtipoUsuario) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.pass = pass;
        this.estadoUsuario = estadoUsuario;
        this.idtipoUsuario = idtipoUsuario;
    }

    public int getIdtipoUsuario() {
        return idtipoUsuario;
    }

    public void setTipoUsuario(int idtipoUsuario) {
       this.idtipoUsuario = idtipoUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(int estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
}
