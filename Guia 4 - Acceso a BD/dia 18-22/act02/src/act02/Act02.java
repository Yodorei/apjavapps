/*
En la empresa ConstruirSA, necesitan llevar un registro de todas las herramientas disponibles en
el obrador, los empleados que tienen acceso a él y un registro detallado de que herramienta retiran
y devuelven los empleados.

Desde el método main de un nuevo proyecto Java de nombre construirSA:
h) Cargar el driver MariaDB.
i) Establecer la conexión a la base de datos previamente creada.
j) Insertar 3 empleados.
k) Insertar 2 herramientas.
l) Listar todas las herramientas con stock superior a 10.
m) Dar de baja al primer empleado ingresado a la base de datos.
 */
package act02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Act02 {

    
    public static void main(String[] args) {
        Connection con = null;
        con = Conexion.getConexion();
        
        PreparedStatement ps = null;        
        ResultSet rs = null;        
        
        String sql = "";
        /*
        sql =  "INSERT INTO empleado(dni, apellido, nombre, acceso, estado) VALUES "
                + "(112233,'Gomez','Lucas',1,1),"
                + "(223344,'Pomez','Carlos',3,1),"
                + "(334455,'Barriga','Dolores',2,1);";
        */
        
        /*
        sql = "INSERT INTO herramienta(nombre, descripcion, stock, estado) VALUES "
                + "('martillo', 'rojo', 12, 1),"
                + "('pinza', 'loro', 8, 1),"
                + "('llave inglesa', 'n10', 15, 1);";
        */
        
        /*
        sql = "SELECT * FROM herramienta WHERE stock>10;";
        */
        
        /*
        sql = "DELETE FROM empleado WHERE id_empleado=1;";
        */
        
        try {
            ps = con.prepareStatement(sql);
            
            int registros = ps.executeUpdate(); // ejecuta los cambios
            System.out.println(registros); // cantidad de cambios hechos  
            
            /*
            rs = ps.executeQuery(); // ejecuta el Query(SELECT)
            
            while(rs.next()){
                System.out.println("Herramienta: "+rs.getString("nombre"));
                System.out.println("Descripcion: "+rs.getString("descripcion"));
                System.out.println("Stock: "+rs.getInt("stock")+"\n");
            }
            */
   
        }            
        catch (SQLException ex) {
            System.out.println(" Error " + ex.getMessage());
        }
    }
    
}
