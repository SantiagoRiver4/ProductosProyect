/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosProyect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author santy 2.0
 */
public class Conectar{
    
    Connection conectar = null;
    @SuppressWarnings({"BroadCatchBlock", "TooBroadCatch"})
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proyect", "root", "");
            System.out.println("Conexion aceptada...");
        
        }catch (ClassNotFoundException | SQLException e){
        System.out.print("Mensaje de error"+e);
        JOptionPane.showMessageDialog(null, "No se pudo conectar");
        }
    
        return conectar;
    }
}
