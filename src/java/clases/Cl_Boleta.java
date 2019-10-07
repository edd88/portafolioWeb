package clases;

import java.util.Date;

public class Cl_Boleta {
    private int idBoleta;
    private Date fecPago;
    private Date fecLimite;
    private int monto;
    private int estadoBoleta;
    private int idPlan;

    public Cl_Boleta() {
    }

    public Cl_Boleta(int idBoleta, Date fecPago, Date fecLimite, int monto, int estadoBoleta, int idPlan) {
        this.idBoleta = idBoleta;
        this.fecPago = fecPago;
        this.fecLimite = fecLimite;
        this.monto = monto;
        this.estadoBoleta = estadoBoleta;
        this.idPlan = idPlan;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public Date getFecPago() {
        return fecPago;
    }

    public void setFecPago(Date fecPago) {
        this.fecPago = fecPago;
    }

    public Date getFecLimite() {
        return fecLimite;
    }

    public void setFecLimite(Date fecLimite) {
        this.fecLimite = fecLimite;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getEstadoBoleta() {
        return estadoBoleta;
    }

    public void setEstadoBoleta(int estadoBoleta) {
        this.estadoBoleta = estadoBoleta;
    }
    
}
