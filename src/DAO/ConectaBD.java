package DAO;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConectaBD {
    public static Connection conectabd() throws ClassNotFoundException{
        try{
            Class.forName("org.postgresql.Driver");
            String user = "glbwgyiizfzmbi";
            String password = "0156ecb27d7906ebb9984e1626d46a0d56dd1fde576d1ccb007c378c5f2096fb";
            Connection con = DriverManager.getConnection("jdbc:postgresql://ec2-23-21-94-99.compute-1.amazonaws.com:5432/d7hacmrhir1hk7?sslmode=require", user, password);
            return con;
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
            return null;            
        }        
    }
}
