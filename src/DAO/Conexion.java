/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
                Statement stmt = _conexion.createStatement();
                ResultSet rs = stmt.executeQuery("select * from mydb.estudiante");
                while (rs.next()) {
             //   System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  " + rs.getString(4));
            }
                
        } catch (Exception e) {
            throw e;
        }
    }
    /*try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb", "root", "Hernandez93");
//here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from mydb.estudiante");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }*/
    public void cerrar()throws SQLException{
        if (_conexion != null) {
            if (!_conexion.isClosed()) {
                _conexion.close();
            }
        }
    }
}
