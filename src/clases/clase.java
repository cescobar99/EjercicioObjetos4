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
public class clase {
    
    private int longitud;
    private String contra;
    
    public clase(){
        this.longitud=8;
    }
    
    public clase (int longitud,String contra){
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
    
    public clase mostrar(){
       clase pass;
       String m;
       int lon;
       m=this.contra;
       lon=this.longitud;
       pass=new clase(lon,m);
       return pass;
    }
    
    public clase CambiarContraseña(){
        clase nc;
        int lon = this.longitud;
        String contra = this.contra;
        nc = new clase(lon,contra);
        return nc;
        
    }
}
