/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author sofia
 */
public abstract class Sistema extends Estacion{
    private int anioInicial,cantidadAnios;
    
    
    public Sistema(String nombre,double latitud,double longitud,int anioInicial,int cantidadAnios){
        super(nombre,latitud,longitud);
        setAnioInicial(anioInicial);
        setCantidadAnios(cantidadAnios);
        int aux,auxY;
    }
    
    public int getAnioInicial() {
        return anioInicial;
    }

    private void setAnioInicial(int anioInicial) {
        this.anioInicial = anioInicial;
    }

    public int getCantidadAnios() {
        return cantidadAnios;
    }

    private void setCantidadAnios(int cantidadAnios) {
        this.cantidadAnios = cantidadAnios;
    }
    
    public abstract void registrarTemperatura(double temperatura,int anio,int mes);
     
    
    public  abstract double obtenerTemperatura(int anio,int mes);
    
    public abstract String mayorTemperatura();
        
   
   public abstract String calcularPromedio(); 
   
}
