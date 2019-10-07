
package clases;

import java.util.Date;


public class Cl_PlanContratado {
    private int idPlan;
    private Date fecPlan;
    private int precio;
    private String sucursal;
    private int estado;
    private int idCliente;
    private int idProfesional;

    public Cl_PlanContratado() {
    }

    public Cl_PlanContratado(int idPlan, Date fecPlan, int precio, String sucursal, int estado, int idCliente, int idProfesional) {
        this.idPlan = idPlan;
        this.fecPlan = fecPlan;
        this.precio = precio;
        this.sucursal = sucursal;
        this.estado = estado;
        this.idCliente = idCliente;
        this.idProfesional = idProfesional;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public Date getFecPlan() {
        return fecPlan;
    }

    public void setFecPlan(Date fecPlan) {
        this.fecPlan = fecPlan;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
}
