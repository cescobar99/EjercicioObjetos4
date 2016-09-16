/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Camilo_Escobar
 */
public class Password {
    
    private int longitud;
    private String contraseña;
    
    public Password(){
        this.longitud=8;
    }
    
    public Password (int longitud,String contra){
        this.longitud=longitud;
        this.contraseña=contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contra) {
        this.contraseña = contraseña;
    }   
    
    public String fuerte(){
        
        String resultado;
        if (this.longitud>=6) {
            resultado="La contraseña actual es fuerte";
        }
        else{
            resultado="La contraseña actual no es fuerte";
        }
        return resultado;
    }
    
    public Password mostrar(){
       Password pass;
       String m;
       int longittud;
       m=this.contraseña;
       longitud=this.longitud;
       pass=new Password(longitud,m);
       return pass;
    }
    
    public Password CambiarContraseña(){
        Password contraseña_nueva;
        int lon = this.longitud;
        String contraseña = this.contraseña;
        contraseña_nueva = new Password(lon,contraseña);
        return contraseña_nueva;
        
    }
}
