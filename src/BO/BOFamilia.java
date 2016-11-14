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
public class BOFamilia {
    private String Telefono;
    private String Dir;
    private String Contacto_Principal;

    public BOFamilia(String Telefono, String Dir, String Contacto_Principal) {
        this.Telefono = Telefono;
        this.Dir = Dir;
        this.Contacto_Principal = Contacto_Principal;
    }

    public BOFamilia() {
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }

    public String getContacto_Principal() {
        return Contacto_Principal;
    }

    public void setContacto_Principal(String Contacto_Principal) {
        this.Contacto_Principal = Contacto_Principal;
    }

    @Override
    public String toString() {
        return "'"+Telefono +"','"+ Dir+ "','" + Contacto_Principal + ';';
    }
    
    
}
