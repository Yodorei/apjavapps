/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    private static String url="jdbc:mariadb://localhost:3306/g4act02"; //url de la BD
    private static String usuario="root";
    private static String password="";

   
    private static Conexion conexion = null;
    
     private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver");
        }
    }
    
    public static Connection getConexion() {
        Connection con=null;
      if(conexion == null){
          
           conexion = new Conexion();
        }
        try {
            // Setup the connection with the DB
            con = DriverManager.getConnection(url, usuario, password);            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion ");
        }
        
        return con;
    }
    
}
