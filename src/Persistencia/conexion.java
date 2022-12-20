package Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
//IMPORT LIBRERIAS

public class conexion {
    private static Connection conn;
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "boleto_bd";
    

    protected void conectar(){
        conn = null;
        try{
            conn = DriverManager.getConnection(url, user, password);
    }
    catch (SQLException ex) {
        System.out.println("ERROR");
        }
      }//CIERRE conectar()
    
    protected void desconectar(){
        try{
          conn.close();
        }
        catch (Exception ex){
            System.out.println("ERROR");
        }
      }// CIERRE DESCONECTAR()
    
   protected void EjecutarSentencia(String sql){
       try{
         Statement stmt = conn.createStatement();
         stmt.executeUpdate(sql);
       }
       catch (Exception ex){
           System.out.println("ERROR\n" + ex.getMessage());
       }
   }// CIERRE EjecutarSentncia()
    
   protected ResultSet EjecutarConsulta(String consulta){
        ResultSet rs = null;
        try {
            PreparedStatement stmt = conn.prepareStatement(consulta);
            rs = stmt.executeQuery();
        }
        catch (Exception ex){
            System.out.println("ERROR\n" + ex.getMessage());
            
        }
        return rs;
    }//Cierre EjecutarConsulta()
   
   
     
   }
 


