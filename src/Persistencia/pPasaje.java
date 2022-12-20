package Persistencia;
import Dominio.Pasaje;
import Dominio.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Dominio.*;

public class pPasaje extends conexion {
    public void AgregarPasaje(Pasaje pPasaje){
    try{
       String strInsertar = "insert into Pasaje values ("+ pPasaje.getID() +",'"+pPasaje.gethora()+"' '"+pPasaje.getOrigen()+"', '"+pPasaje.getDestino()+"',"+", "+pPasaje.getAsiento()+", "+pPasaje.getUsuario().getCI()+", "+pPasaje.getPrecio()+")";
            System.out.println(strInsertar);
            this.conectar();
            this.EjecutarSentencia(strInsertar);
    }//CIERRA TRY
    catch(Exception ex){
            System.out.println("Error al insertar datos");
    }//CIERRA CATCH
    finally {
        this.desconectar();
    }
   }//FINAL AREGARBOLETO()
   
   public ArrayList MostrarPasajes(){
       ResultSet rs = null;
       ArrayList ColPasaje = new ArrayList();
       Pasaje pasaje;
       String Consulta;
       Consulta = "select * from Pasaje;";
       this.conectar();
       rs = this.EjecutarConsulta(Consulta);
       try{
         while(rs.next()){
             pasaje = new Pasaje();
             pasaje.SetID(rs.getInt("id"));
             pasaje.SetHora(rs.getInt("Hora"));
             pasaje.SetOrigen(rs.getString("Origen"));
             pasaje.SetPrecio(rs.getInt("Precio"));
             pasaje.SetDestino(rs.getString("Destino"));
             pasaje.SetAsiento(rs.getInt("Asiento"));
            Usuario usu = new Usuario();
            usu.setCI(rs.getInt("ci_usuario"));
            pasaje.SetUsuario(usu);
            ColPasaje.add(pasaje);
         }//FIN While
       }//FIN try
       catch(Exception ex){
           System.out.println("ERROR al traer datos\n:" + ex.getMessage());
       }
       this.desconectar();
       return ColPasaje;
   }//Fin MostrarPasaje()
}//FINAL CLASE

