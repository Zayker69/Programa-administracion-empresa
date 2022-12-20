
package Dominio;

public class Pasaje {
//DECLARACION DE VARIABLES:
    private int hora;
    private int ID;
    private int asiento;
    private int precio;
    private Usuario usuario;
    private String destino;
    private String origen;
// FIN DECLARACION DE VARIABLES
    
    
    public void SetUsuario(Usuario unUsuario){
        usuario = unUsuario;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void SetDestino(String unDestino){
        destino = unDestino;
    }
    public String getDestino(){
        return destino;
    }
    
    public void SetHora(int unaHora){
        hora = unaHora;
    }
    public int gethora(){
        return hora;
    }
    
    public void SetID(int unID){
        ID = unID;
    }
    public int getID(){
        return ID;
    }
     
    public void SetOrigen(String unOrigen){
        origen = unOrigen;
    }
    public String getOrigen(){
        return origen;
    }
 
    public int getPrecio(){
        return precio;
    }
    public void SetPrecio(int unPrecio){
        precio = unPrecio;
    }
    
    public void SetAsiento(int unAsiento){
        asiento = unAsiento;
    }
    public int getAsiento(){
        return asiento;
    }
        
    public Pasaje(){
        
    }
}
