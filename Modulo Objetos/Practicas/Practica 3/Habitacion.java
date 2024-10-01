/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author sofia
 */
public class Habitacion {
    
    private boolean ocupado;
    private double costoXNoche;
    private Persona persona;
    
    
    Habitacion(){
        setOcupado(false);
        setCostoXNoche((int)(GeneradorAleatorio.generarDouble(6001)+2000));//no esta mal pero podria ser un pasaje por parametro
    }
    
    public void ocuparHabitacion(Persona persona){
        setPersona(persona);
        setOcupado(true);
    }
    
	public void aumento(double num){
		this.costoXNoche += num;
	}
	
    public void setOcupado(Boolean ocupado){
        this.ocupado=ocupado;
    }
    
    public Boolean getOcupado(){
        return ocupado;
    }
    
    public void setCostoXNoche(double costoXNoche){
        this.costoXNoche=costoXNoche;
    }
    
    public double getCostoXNoche(){
        return costoXNoche;
    }
    
    public void setPersona(Persona persona){
        this.persona=persona;
    }
     

    @Override
    public String toString() {
        return "|" + "ocupado:" + ocupado + ", costoXNoche:" + costoXNoche + ", persona:" + persona + '|';
    
    }
}
