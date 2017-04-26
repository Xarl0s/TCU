/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Isidro
 */
@Entity
@Table(name = "pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p"),
    @NamedQuery(name = "Pago.findByIdFactura", query = "SELECT p FROM Pago p WHERE p.pagoPK.idFactura = :idFactura"),
    @NamedQuery(name = "Pago.findByIdAdmin", query = "SELECT p FROM Pago p WHERE p.pagoPK.idAdmin = :idAdmin"),
    @NamedQuery(name = "Pago.findByIdEstudiante", query = "SELECT p FROM Pago p WHERE p.pagoPK.idEstudiante = :idEstudiante"),
    @NamedQuery(name = "Pago.findByFecha", query = "SELECT p FROM Pago p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Pago.findByMonto", query = "SELECT p FROM Pago p WHERE p.monto = :monto"),
    @NamedQuery(name = "Pago.findByIdMontoAnual", query = "SELECT p FROM Pago p WHERE p.pagoPK.idMontoAnual = :idMontoAnual"),
    @NamedQuery(name = "Pago.findByDetalle", query = "SELECT p FROM Pago p WHERE p.detalle = :detalle")})
public class Pago implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PagoPK pagoPK;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "monto")
    private double monto;
    @Basic(optional = false)
    @Column(name = "Detalle")
    private String detalle;
    @JoinColumn(name = "id_admin", referencedColumnName = "id_admin", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Administradores administradores;
    @JoinColumn(name = "id_estudiante", referencedColumnName = "id_Estudiante", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Estudiante estudiante;
    @JoinColumn(name = "id_monto_anual", referencedColumnName = "id_monto_anual", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Tarifa tarifa;

    public Pago() {
    }

    public Pago(PagoPK pagoPK) {
        this.pagoPK = pagoPK;
    }

    public Pago(PagoPK pagoPK, Date fecha, double monto, String detalle) {
        this.pagoPK = pagoPK;
        this.fecha = fecha;
        this.monto = monto;
        this.detalle = detalle;
    }

    public Pago(String idFactura, String idAdmin, int idEstudiante, int idMontoAnual) {
        this.pagoPK = new PagoPK(idFactura, idAdmin, idEstudiante, idMontoAnual);
    }

    public PagoPK getPagoPK() {
        return pagoPK;
    }

    public void setPagoPK(PagoPK pagoPK) {
        this.pagoPK = pagoPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Administradores getAdministradores() {
        return administradores;
    }

    public void setAdministradores(Administradores administradores) {
        this.administradores = administradores;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pagoPK != null ? pagoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.pagoPK == null && other.pagoPK != null) || (this.pagoPK != null && !this.pagoPK.equals(other.pagoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Pago[ pagoPK=" + pagoPK + " ]";
    }
    
}
