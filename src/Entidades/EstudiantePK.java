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
public class EstudiantePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_Estudiante")
    private int idEstudiante;
    @Basic(optional = false)
    @Column(name = "Seccion_id_seccion")
    private int seccionidseccion;

    public EstudiantePK() {
    }

    public EstudiantePK(int idEstudiante, int seccionidseccion) {
        this.idEstudiante = idEstudiante;
        this.seccionidseccion = seccionidseccion;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getSeccionidseccion() {
        return seccionidseccion;
    }

    public void setSeccionidseccion(int seccionidseccion) {
        this.seccionidseccion = seccionidseccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEstudiante;
        hash += (int) seccionidseccion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstudiantePK)) {
            return false;
        }
        EstudiantePK other = (EstudiantePK) object;
        if (this.idEstudiante != other.idEstudiante) {
            return false;
        }
        if (this.seccionidseccion != other.seccionidseccion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.EstudiantePK[ idEstudiante=" + idEstudiante + ", seccionidseccion=" + seccionidseccion + " ]";
    }
    
}
