package Dominio;
import java.util.ArrayList;
import java.lang.Integer;
import Persistencia.pPasaje;

public class Controladora {
    private ArrayList colPasajes = new ArrayList();
    private ArrayList colUsuarios = new ArrayList();
    private pPasaje perPasaje = new pPasaje();
    
    public ArrayList MostrarPasajes(){
        return perPasaje.MostrarPasajes();
    }// Dvuelve los pasajes que se agreguen a colPasajes
    
    
    public void AgregarPasaje(Pasaje pPasaje){
       perPasaje.AgregarPasaje(pPasaje);
       perPasaje.AgregarPasaje(pPasaje);
    }
    
    public boolean ModificarPasaje(Pasaje pPasaje){
       Pasaje p = DevolverPasaje(pPasaje.getID());
       if(p != null){
           p.SetAsiento(pPasaje.getAsiento());
           p.SetDestino(pPasaje.getDestino());
           p.SetHora(pPasaje.gethora());
           p.SetPrecio(pPasaje.getPrecio());
           p.SetUsuario(pPasaje.getUsuario());
           return true;
       }
       return false;
    }
    
       
public boolean EliminarPasaje(int pID){
    for (int i=0; i < colPasajes.size();i++){
        Pasaje p = (Pasaje)colPasajes.remove(i);
        if(p.getID() == pID){
            colPasajes.remove(i);
            return true;
        }
    }
    return false;
}



    private Pasaje DevolverPasaje(int pID) {
        for(int i=0; i < colPasajes.size(); i++){
            Pasaje p = (Pasaje)colPasajes.get(i);
            if(p.getID()== pID){
                return p;
            }
        }
      return null;  
    }
    
}
