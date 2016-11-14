package DAO;
import Interfaces.DAOConsultas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isidro
 */
public class DAOEstudiante implements DAOConsultas{

    protected Conexion _con;
    
    public DAOEstudiante() {
        _con = new Conexion();
    }

    
    @Override
    public void insert(String info) {
        //formato id_estudiante, Apellido_1, Apellido_2, Nombre_Completo
        String sql = "call insert_estudiante ("+ info+ ");";
        try {
            _con.Abrir();
            _con.ExecuteStmt(sql);
            _con.Cerrar();
        } catch (Exception ex) {
            Logger.getLogger(DAOEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public void modificar(String info) {
        //formato id_Estudiante,nuevo_Id, Apellido_1, Apellido_2, Nombre_Completo;
        String sql = "call modificar_estudiante ("+info+")";
        try {
            _con.Abrir();
            _con.ExecuteStmt(sql);
            _con.Cerrar(); 
        
        } catch (Exception ex) {
            Logger.getLogger(DAOEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void borrar(String info) {
        //formato id_estudiante
        String sql = "call borrar_estudiante ("+ info+");";
        try {
            _con.Abrir();
            _con.ExecuteStmt(sql);
            _con.Cerrar(); 
        
        } catch (Exception ex) {
            Logger.getLogger(DAOEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String consultar(String info) {
        //formato id_estudiante
    String consulta= "";
        String sql = "consultar_estudiante ("+info+");";
        try {
            _con.Abrir();
            _con.ExecuteStmt(sql);
            _con.Cerrar(); 
            
        } catch (Exception ex) {
            Logger.getLogger(DAOEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    return consulta;
    }

}

