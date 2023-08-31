/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class JavaApplication34 {

    
    public static void main(String[] args) {
        try {
            //carga de BD
            Class.forName("org.mariadb.jdbc.Driver");
            
            //conexion con BD
            Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/g3extra","root","");
            
            /*
            //agregar datos
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO seriespeliculas (titulo, formato, creador, estreno, puntaje)"
                    + " VALUES ('abc', 'dfg', 'hij', 123, 5.1)");
            int registros = ps.executeUpdate(); // devuelve la cantidad de lineas modificadas
            System.out.println(registros);
            */
            
            /*
            //modificar datos
            PreparedStatement ps = conexion.prepareStatement("UPDATE seriespeliculas SET titulo='qwe' WHERE titulo='abc'");
            int registros = ps.executeUpdate(); // devuelve la cantidad de lineas modificadas
            System.out.println(registros);
            */
            
            /*            
            //borrar datos
            PreparedStatement ps = conexion.prepareStatement("DELETE FROM seriespeliculas WHERE titulo='qwe'");
            int registros = ps.executeUpdate(); // devuelve la cantidad de lineas modificadas
            System.out.println(registros);
            */
            
            /*
            //obtener datos de la tabla            
            //String sql = "SELECT * FROM seriespeliculas";
            PreparedStatement ps = conexion.prepareStatement("SELECT * FROM seriespeliculas");
            ResultSet resultado = ps.executeQuery();
            
            
            while(resultado.next()){
                System.out.println("Titulo: "+resultado.getString("titulo"));
                System.out.println("Formato: "+resultado.getString("formato"));
                System.out.println("Creador: "+resultado.getString("creador"));
                System.out.println("Estreno: "+resultado.getInt("estreno"));
                System.out.println("Puntaje: "+resultado.getDouble("puntaje")+"\n");  
            }
            */  
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la base de datos"+ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a  la base de datos"+ex);
        }
        
          
        
    }
    
}
