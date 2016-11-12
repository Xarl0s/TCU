package DAO;

import com.mysql.jdbc.ResultSetImpl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Isidro
 */
public class Conexion {
    
    protected Connection _conexion;
    
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    
    private final String USER = "root";
    private final String PASS = "Hernandez93";
    
    public void conectar() throws Exception{
        try {
                _conexion = DriverManager.getConnection(DB_URL,USER, PASS);
                Class.forName(JDBC_DRIVER);
                
        } catch (Exception e) {
            throw e;
        }
    }

    public void cerrar()throws SQLException{
        if (_conexion != null) {
            if (!_conexion.isClosed()) {
                _conexion.close();
            }
        }
    }
}
