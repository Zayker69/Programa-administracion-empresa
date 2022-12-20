package Dominio;

public class Usuario {
    //DECLARACION DE VARIABLES:
    private String nombre;
    private int telefono;
    private int CI;
    //FIN DECLARACION DE VARIABLES.
    
    public void setNombre(String unNombre){
        nombre = unNombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setTelefono(int unTel){
        telefono = unTel;
    }
    public int getTelefono(){
        return telefono;
    }
    
    
    public int getCI(){
        return CI;
    }
    public void setCI(int unaCI){
        CI = unaCI;
    }
    
    public Usuario(){
        
    }
    
}
