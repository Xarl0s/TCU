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
public class BOFamilia_Estudiante {
    private String Id_Est;//id del estudiante
    private String Id_Fam;//id de la familia

    public BOFamilia_Estudiante() {
    }

    public BOFamilia_Estudiante(String Id_Est, String Id_Fam) {
        this.Id_Est = Id_Est;
        this.Id_Fam = Id_Fam;
    }

    public String getId_Est() {
        return Id_Est;
    }

    public void setId_Est(String Id_Est) {
        this.Id_Est = Id_Est;
    }

    public String getId_Fam() {
        return Id_Fam;
    }

    public void setId_Fam(String Id_Fam) {
        this.Id_Fam = Id_Fam;
    }

    @Override
    public String toString() {
        return "Familia_Estudiante{" + "Id_Est=" + Id_Est + ", Id_Fam=" + Id_Fam + '}';
    }
    
    
}
