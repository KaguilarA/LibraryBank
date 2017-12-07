package Managers;

/**
 *
 * @author kevin
 */

import Conection.Conection;
import java.io.*;
import Classes.User;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManagerUsers {
    
    public static String registerUser (String[] newuser) {
        String validation;
        Conection con = new Conection();
        
        //- User data
        String id = newuser[0];
        String name = newuser[1];
        String surname = newuser[2];
        String secondSurname = newuser[3];
        String username = newuser[4];
        String email = newuser[5];
        String password = newuser[6];
        
        User newUser = new User(id,name,surname,secondSurname,username,email,password);
        
        try {
            con.saveUser(newUser);
        } catch (SQLException ex) {
            Logger.getLogger(ManagerUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        validation = "Usuario Guardado";
                
        return validation;
    }
    
    public static void getAllUsers()
    {
    
    }
}
