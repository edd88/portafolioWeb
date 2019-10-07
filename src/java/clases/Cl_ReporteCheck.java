/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

public class Cl_ReporteCheck {
    private boolean estadoCheck;
    private Date fecha;
    private String mejora;
    private int idCheck;

    public Cl_ReporteCheck() {
    }

    public Cl_ReporteCheck(boolean estadoCheck, Date fecha, String mejora, int idCheck) {
        this.estadoCheck = estadoCheck;
        this.fecha = fecha;
        this.mejora = mejora;
        this.idCheck = idCheck;
    }

    public int getIdCheck() {
        return idCheck;
    }

    public void setIdCheck(int idCheck) {
        this.idCheck = idCheck;
    }

    public boolean isEstadoCheck() {
        return estadoCheck;
    }

    public void setEstadoCheck(boolean estadoCheck) {
        this.estadoCheck = estadoCheck;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMejora() {
        return mejora;
    }

    public void setMejora(String mejora) {
        this.mejora = mejora;
    }
}
