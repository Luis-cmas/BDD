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
public class Conexion {
    Connection  miconeexion = null;
    String usuario = "luis";
    String password = "pat0$verdes";
    String bd = "otrosAW";
    String ip = "proyecto-bdd.database.windows.net";    
    String puerto = "1433";
    
    String cadena = "jdbc:sqlserver://"+ip+""+puerto+""+bd;
    try{
    }catch(exception){}
    
    
    
    
}
