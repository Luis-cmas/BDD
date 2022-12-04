/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author super
 */
public class Conexiones {
    Connection  miconexion = null;
    String usuario = "luis";
    String password = "pat0$verdes";
    String bd = "otrosAW";
    String ip = "proyecto-bdd.database.windows.net";    
    String puerto = "1434";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+";";
    public Connection conectar(){
        try{
        String cadena2 = cadena                       
                        + "database="+bd+";"
                        + "user="+usuario+";"
                        + "password="+password+";"
                        + "encrypt=true;"
                      
                        + "loginTimeout=30;";
         miconexion =DriverManager.getConnection(cadena2);
            System.out.println("se conecto correctamente a la base");
        }catch(Exception e){
            System.out.println(e);
        }
        return  miconexion;
    }
    
    
    
    
}
