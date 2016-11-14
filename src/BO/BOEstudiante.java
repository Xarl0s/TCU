package BO;

/**
 *
 * @author Isidro
 */
public class BOEstudiante {
    private int Id_estidiante;
    private String Apellido_1;
    private String Apellido_2;
    private String Nombre_Completo;

    public BOEstudiante(int Id_estidiante, String Apellido_1, String Nombre_Completo) {
        this.Id_estidiante = Id_estidiante;
        this.Apellido_1 = Apellido_1;
        this.Nombre_Completo = Nombre_Completo;
    }

    public BOEstudiante() {
    }

    public int getId_estidiante() {
        return Id_estidiante;
    }

    public void setId_estidiante(int Id_estidiante) {
        this.Id_estidiante = Id_estidiante;
    }

    public String getApellido_1() {
        return Apellido_1;
    }

    public void setApellido_1(String Apellido_1) {
        this.Apellido_1 = Apellido_1;
    }

    public String getApellido_2() {
        return Apellido_2;
    }

    public void setApellido_2(String Apellido_2) {
        this.Apellido_2 = Apellido_2;
    }

    public String getNombre_Completo() {
        return Nombre_Completo;
    }

    public void setNombre_Completo(String Nombre_Completo) {
        this.Nombre_Completo = Nombre_Completo;
    }

    @Override
    public String toString() {
        return "'"+Id_estidiante +"','"+ Apellido_1+"','" + Apellido_2 +"','"+ Nombre_Completo + ';';
    }
    
}
