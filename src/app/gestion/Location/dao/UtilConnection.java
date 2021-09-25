/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gestion.Location.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Utilisateur
 */
public class UtilConnection {
    
     public static Connection seConnecter() throws Exception{
         Connection con=null;
         String url="jdbc:oracle:thin:@localhost:1521/XE";
         String user ="loc";
         String mdp="loc";
         try{
             //charger le driver:
         Class.forName("oracle.jdbc.driver.OracleDriver");
             System.out.println("Driver charger");
             //connection a la BD avec url,user,mdp:
         con=DriverManager.getConnection(url,user,mdp);
             System.out.println("Connection etablie");
             return con;
             
         }catch(Exception e){
             throw new Exception("une errure est survenue: "+e.getMessage());
         }
   
    
}
}
