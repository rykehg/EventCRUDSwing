package DAO;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConectaBD {
    public static Connection conectabd() throws ClassNotFoundException{
        try{
            Class.forName("org.postgresql.Driver");
            String user = "YourUserHere";
            String password = "YourPasswordHere";
            Connection con = DriverManager.getConnection("jdbc:postgresql://YourPostgressURLHere?sslmode=require", user, password);
            return con;
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
            return null;            
        }        
    }
}
