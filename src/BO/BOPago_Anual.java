/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author Isidro
 */
public class BOPago_Anual {
    
    private double Monto;
    private String Fecha_Cambio;

    public BOPago_Anual() {
    }

    public BOPago_Anual(double Monto, String Fecha_Cambio) {
        this.Monto = Monto;
        this.Fecha_Cambio = Fecha_Cambio;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getFecha_Cambio() {
        return Fecha_Cambio;
    }

    public void setFecha_Cambio(String Fecha_Cambio) {
        this.Fecha_Cambio = Fecha_Cambio;
    }

    @Override
    public String toString() {
        return "Pago_Anual{" + "Monto=" + Monto + ", Fecha_Cambio=" + Fecha_Cambio + '}';
    }
    
}
