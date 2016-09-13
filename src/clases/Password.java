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
    private String contra;
    
    public Password(){
        this.longitud=8;
    }
    
    public Password (int longitud,String contra){
        this.longitud=longitud;
        this.contra=contra;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }   
    
    public String fuerte(){
        
        String f;
        if (this.longitud>=6) {
            f="La contraseña actual es fuerte";
        }
        else{
            f="La contraseña actual no es fuerte";
        }
        return f;
    }
    
    public Password mostrar(){
       Password pass;
       String m;
       int lon;
       m=this.contra;
       lon=this.longitud;
       pass=new Password(lon,m);
       return pass;
    }
    
    public Password CambiarContraseña(){
        Password nc;
        int lon = this.longitud;
        String contra = this.contra;
        nc = new Password(lon,contra);
        return nc;
        
    }
}
