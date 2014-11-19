package org.android.curso.practica2;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by campitos on 11/18/14.
 */
public class Imc implements Serializable {
    private float imc;
    private Date fecha;

    public Imc() {
    }

    public Imc(Date fecha, float imc) {
        this.fecha = fecha;
        this.imc = imc;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
