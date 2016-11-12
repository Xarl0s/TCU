/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Isidro
 */
public interface DAOConsultas {
    
    public void insert();
    public void modificar();
    public void borrar();
    public void consultar();
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