/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Isidro
 */
@Entity
@Table(name = "estudiante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiante.findAll", query = "SELECT e FROM Estudiante e"),
    @NamedQuery(name = "Estudiante.findByIdEstudiante", query = "SELECT e FROM Estudiante e WHERE e.estudiantePK.idEstudiante = :idEstudiante"),
    @NamedQuery(name = "Estudiante.findByNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estudiante.findByApellido", query = "SELECT e FROM Estudiante e WHERE e.apellido = :apellido"),
    @NamedQuery(name = "Estudiante.findByTelefono", query = "SELECT e FROM Estudiante e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Estudiante.findBySeccionidseccion", query = "SELECT e FROM Estudiante e WHERE e.estudiantePK.seccionidseccion = :seccionidseccion")})
public class Estudiante implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstudiantePK estudiantePK;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private String telefono;
    @JoinColumn(name = "Seccion_id_seccion", referencedColumnName = "id_seccion", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Seccion seccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estudiante", fetch = FetchType.EAGER)
    private Collection<Pago> pagoCollection;

    public Estudiante() {
    }

    public Estudiante(EstudiantePK estudiantePK) {
        this.estudiantePK = estudiantePK;
    }

    public Estudiante(EstudiantePK estudiantePK, String nombre, String apellido) {
        this.estudiantePK = estudiantePK;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Estudiante(int idEstudiante, int seccionidseccion) {
        this.estudiantePK = new EstudiantePK(idEstudiante, seccionidseccion);
    }

    public EstudiantePK getEstudiantePK() {
        return estudiantePK;
    }

    public void setEstudiantePK(EstudiantePK estudiantePK) {
        this.estudiantePK = estudiantePK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
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
        hash += (estudiantePK != null ? estudiantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiante)) {
            return false;
        }
        Estudiante other = (Estudiante) object;
        if ((this.estudiantePK == null && other.estudiantePK != null) || (this.estudiantePK != null && !this.estudiantePK.equals(other.estudiantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Estudiante[ estudiantePK=" + estudiantePK + " ]";
    }
    
}
