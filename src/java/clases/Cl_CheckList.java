/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Cl_CheckList {
    private int idCheck;
    private String descripcion;
    private int idPlan;

    public Cl_CheckList() {
    }

    public Cl_CheckList(int idCheck, String descripcion, int idPlan) {
        this.idCheck = idCheck;
        this.descripcion = descripcion;
        this.idPlan = idPlan;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public int getIdCheck() {
        return idCheck;
    }

    public void setIdCheck(int idCheck) {
        this.idCheck = idCheck;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
