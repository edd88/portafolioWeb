/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

public class Cl_Evento {
    private int idEvento;
    private String asesoria;
    private Date fecha;
    private int tipoEvento;
    private int idPlan;

    public Cl_Evento() {
    }

    public Cl_Evento(int idEvento, String asesoria, Date fecha, int tipoEvento, int idPlan) {
        this.idEvento = idEvento;
        this.asesoria = asesoria;
        this.fecha = fecha;
        this.tipoEvento = tipoEvento;
        this.idPlan = idPlan;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getAsesoria() {
        return asesoria;
    }

    public void setAsesoria(String asesoria) {
        this.asesoria = asesoria;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(int tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    
    
}
