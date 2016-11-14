package GESTORA;

import DAO.DAOEstudiante;

/**
 *
 * @author Isidro
 */
public class AdminPat {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
      
        DAOEstudiante est = new DAOEstudiante();
        String pito = "";//dependiendo de la consulta
        est.insert(pito);
        
    }
}
