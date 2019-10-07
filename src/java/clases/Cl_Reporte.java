/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Cl_Reporte {
    private int idReporte;
    private int visitas;
    private int capacitaciones;
    private int accidentes;
    private int multas;

    public Cl_Reporte() {
    }

    public Cl_Reporte(int idReporte, int visitas, int capacitaciones, int accidentes, int multas) {
        this.idReporte = idReporte;
        this.visitas = visitas;
        this.capacitaciones = capacitaciones;
        this.accidentes = accidentes;
        this.multas = multas;
    }

    public int getMultas() {
        return multas;
    }

    public void setMultas(int multas) {
        this.multas = multas;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public int getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(int capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    public int getAccidentes() {
        return accidentes;
    }

    public void setAccidentes(int accidentes) {
        this.accidentes = accidentes;
    }
    
    
}
