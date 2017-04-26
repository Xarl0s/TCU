/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Isidro
 */
@Embeddable
public class PagoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Id_Factura")
    private String idFactura;
    @Basic(optional = false)
    @Column(name = "id_admin")
    private String idAdmin;
    @Basic(optional = false)
    @Column(name = "id_estudiante")
    private int idEstudiante;
    @Basic(optional = false)
    @Column(name = "id_monto_anual")
    private int idMontoAnual;

    public PagoPK() {
    }

    public PagoPK(String idFactura, String idAdmin, int idEstudiante, int idMontoAnual) {
        this.idFactura = idFactura;
        this.idAdmin = idAdmin;
        this.idEstudiante = idEstudiante;
        this.idMontoAnual = idMontoAnual;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdMontoAnual() {
        return idMontoAnual;
    }

    public void setIdMontoAnual(int idMontoAnual) {
        this.idMontoAnual = idMontoAnual;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFactura != null ? idFactura.hashCode() : 0);
        hash += (idAdmin != null ? idAdmin.hashCode() : 0);
        hash += (int) idEstudiante;
        hash += (int) idMontoAnual;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagoPK)) {
            return false;
        }
        PagoPK other = (PagoPK) object;
        if ((this.idFactura == null && other.idFactura != null) || (this.idFactura != null && !this.idFactura.equals(other.idFactura))) {
            return false;
        }
        if ((this.idAdmin == null && other.idAdmin != null) || (this.idAdmin != null && !this.idAdmin.equals(other.idAdmin))) {
            return false;
        }
        if (this.idEstudiante != other.idEstudiante) {
            return false;
        }
        if (this.idMontoAnual != other.idMontoAnual) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.PagoPK[ idFactura=" + idFactura + ", idAdmin=" + idAdmin + ", idEstudiante=" + idEstudiante + ", idMontoAnual=" + idMontoAnual + " ]";
    }
    
}
