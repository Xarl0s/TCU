package DAO;
//descargar el mysql-connector-java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Isidro
 */
public class Conexion {
    
    protected Connection _conexion;
    
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:3306/tcu_republica_de_francia";
    
    private final String USER = "root";
    private final String PASS = "jj021493";
    
    public void Abrir() throws Exception{
        try {
                _conexion = DriverManager.getConnection(DB_URL,USER, PASS);
                Class.forName(JDBC_DRIVER);
                
        } catch (SQLException | ClassNotFoundException e) {
            throw e;
        }
    }
    public void ExecuteStmt(String sql) throws SQLException{
       
        Statement stmt =_conexion.createStatement();
        stmt.execute(sql);
    }
    public void Cerrar()throws SQLException{
        if (_conexion != null) {
            if (!_conexion.isClosed()) {
                _conexion.close();
            }
        }
    }
}
