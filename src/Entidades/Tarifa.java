/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Isidro
 */
@Entity
@Table(name = "tarifa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarifa.findAll", query = "SELECT t FROM Tarifa t"),
    @NamedQuery(name = "Tarifa.findByIdMontoAnual", query = "SELECT t FROM Tarifa t WHERE t.idMontoAnual = :idMontoAnual"),
    @NamedQuery(name = "Tarifa.findByMonto", query = "SELECT t FROM Tarifa t WHERE t.monto = :monto"),
    @NamedQuery(name = "Tarifa.findByFechaDeCreacion", query = "SELECT t FROM Tarifa t WHERE t.fechaDeCreacion = :fechaDeCreacion"),
    @NamedQuery(name = "Tarifa.findByEstado", query = "SELECT t FROM Tarifa t WHERE t.estado = :estado")})
public class Tarifa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_monto_anual")
    private Integer idMontoAnual;
    @Basic(optional = false)
    @Column(name = "monto")
    private double monto;
    @Basic(optional = false)
    @Column(name = "fecha_de_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaDeCreacion;
    @Basic(optional = false)
    @Column(name = "estado")
    private short estado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tarifa", fetch = FetchType.EAGER)
    private Collection<Pago> pagoCollection;

    public Tarifa() {
    }

    public Tarifa(Integer idMontoAnual) {
        this.idMontoAnual = idMontoAnual;
    }

    public Tarifa(Integer idMontoAnual, double monto, Date fechaDeCreacion, short estado) {
        this.idMontoAnual = idMontoAnual;
        this.monto = monto;
        this.fechaDeCreacion = fechaDeCreacion;
        this.estado = estado;
    }

    public Integer getIdMontoAnual() {
        return idMontoAnual;
    }

    public void setIdMontoAnual(Integer idMontoAnual) {
        this.idMontoAnual = idMontoAnual;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public short getEstado() {
        return estado;
    }

    public void setEstado(short estado) {
        this.estado = estado;
    }

    @XmlTransient
    public Collection<Pago> getPagoCollection() {
        return pagoCollection;
    }

    public void setPagoCollection(Collection<Pago> pagoCollection) {
        this.pagoCollection = pagoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMontoAnual != null ? idMontoAnual.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarifa)) {
            return false;
        }
        Tarifa other = (Tarifa) object;
        if ((this.idMontoAnual == null && other.idMontoAnual != null) || (this.idMontoAnual != null && !this.idMontoAnual.equals(other.idMontoAnual))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tarifa[ idMontoAnual=" + idMontoAnual + " ]";
    }
    
}
