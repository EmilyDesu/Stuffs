/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


/**
 *
 * @author EmilyDesu
 */
public class Conectar {
    
    //variables
    Connection con;

    public Conectar() {
        try{
            Class.forName("com.mysql.jdbc.Driver"); //driver Mysql
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/BD_Fastdevelopment","root","");
        
        }catch(Exception e){
        
        }
        
        
    }
    
    public Connection getConnection(){
      return con;
    }
    
    
    
    
}
