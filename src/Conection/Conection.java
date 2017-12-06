package Conection;

/**
 *
 * @author kevin
 */

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conection 
{

    // Global variables
    static PrintStream out = System.out;
    private final String database = "db_bank";
    private final String user = "root";
    private final String password = "teamwork";
    private final String url = "jdbc:mysql://localhost:3306" + database;
    private Connection con = null;
    
    public Connection getConnection() 
    {
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            out.println(e);
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(Conection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
}
