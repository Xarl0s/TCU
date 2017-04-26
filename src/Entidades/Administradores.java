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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "administradores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administradores.findAll", query = "SELECT a FROM Administradores a"),
    @NamedQuery(name = "Administradores.findByIdAdmin", query = "SELECT a FROM Administradores a WHERE a.idAdmin = :idAdmin"),
    @NamedQuery(name = "Administradores.findByNombre", query = "SELECT a FROM Administradores a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Administradores.findByApellido", query = "SELECT a FROM Administradores a WHERE a.apellido = :apellido"),
    @NamedQuery(name = "Administradores.findByTelefono", query = "SELECT a FROM Administradores a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Administradores.findByUsername", query = "SELECT a FROM Administradores a WHERE a.username = :username"),
    @NamedQuery(name = "Administradores.findByPassword", query = "SELECT a FROM Administradores a WHERE a.password = :password")})
public class Administradores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_admin")
    private String idAdmin;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "administradores", fetch = FetchType.EAGER)
    private Collection<Pago> pagoCollection;

    public Administradores() {
    }

    public Administradores(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Administradores(String idAdmin, String nombre, String apellido, String username, String password) {
        this.idAdmin = idAdmin;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        hash += (idAdmin != null ? idAdmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administradores)) {
            return false;
        }
        Administradores other = (Administradores) object;
        if ((this.idAdmin == null && other.idAdmin != null) || (this.idAdmin != null && !this.idAdmin.equals(other.idAdmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Administradores[ idAdmin=" + idAdmin + " ]";
    }
    
}
