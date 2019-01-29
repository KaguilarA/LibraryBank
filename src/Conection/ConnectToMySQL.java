package Conection;

/**
 *
 * @author kevin
 */

import Classes.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;
import java.sql.CallableStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectToMySQL 
{

    // Global variables
    static PrintStream out = System.out;
    private static Connection con = null;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String database = "db_bank";
    private static final String user = "root";
    private static final String password = "teamwork";
    private static final String url = "jdbc:mysql://localhost:3306" + database;
    
    
    public static void main (String [ ] args) {
        
    }
    
    private Connection getConnection() 
    {
        try
        {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, password);
            
        } catch(SQLException e)
        {
            out.println(e);
            
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return (Connection) con;
    }
    
    public void disconnect(){
        con = null;
        
        if(con == null){
            out.println("Connection close");
        }
    }
    
    public void saveUser(User pnewuser) throws SQLException
    {
        Connection conn = getConnection();
        
        String id = pnewuser.getId();
        String name = pnewuser.getName();
        String surname = pnewuser.getSurname();
        String secondSurname = pnewuser.getSecondSurname();
        String username = pnewuser.getUsername();
        String email = pnewuser.getEmail();
        String pasword = pnewuser.getPassword();
        
        String sp = "{call pa_post_new_user(id, name, surname, secondSurname, username, email, pasword)}";
        
        CallableStatement stpr = conn.prepareCall(sp);
        
    }


    
}
