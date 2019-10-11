/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Cl_DetalleBoleta {
    private int idDetalleBoleta;
    private int precio;
    private int idBoleta;
    private String[] servicio;

    public Cl_DetalleBoleta() {
    }

    public Cl_DetalleBoleta(int idDetalleBoleta, int precio, int idBoleta, String[] servicio) {
        this.idDetalleBoleta = idDetalleBoleta;
        this.precio = precio;
        this.idBoleta = idBoleta;
        this.servicio = servicio;
    }

    public String[] getServicio() {
        return servicio;
    }

    public void setServicio(String[] servicio) {
        this.servicio = servicio;
    }

    public int getIdDetalleBoleta() {
        return idDetalleBoleta;
    }

    public void setIdDetalleBoleta(int idDetalleBoleta) {
        this.idDetalleBoleta = idDetalleBoleta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }
    
}
