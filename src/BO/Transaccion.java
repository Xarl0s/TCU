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
public class Transaccion {
    
    private String Fecha;
    private double Monto;
    private String Id_Familia;
    private int Id_Pago_Anual;

    public Transaccion() {
    }

    public Transaccion(String Fecha, double Monto, String Id_Familia, int Id_Pago_Anual) {
        this.Fecha = Fecha;
        this.Monto = Monto;
        this.Id_Familia = Id_Familia;
        this.Id_Pago_Anual = Id_Pago_Anual;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public String getId_Familia() {
        return Id_Familia;
    }

    public void setId_Familia(String Id_Familia) {
        this.Id_Familia = Id_Familia;
    }

    public int getId_Pago_Anual() {
        return Id_Pago_Anual;
    }

    public void setId_Pago_Anual(int Id_Pago_Anual) {
        this.Id_Pago_Anual = Id_Pago_Anual;
    }

    @Override
    public String toString() {
        return "Transaccion{" + "Fecha=" + Fecha + ", Monto=" + Monto + ", Id_Familia=" + Id_Familia + ", Id_Pago_Anual=" + Id_Pago_Anual + '}';
    }
    
    
}
