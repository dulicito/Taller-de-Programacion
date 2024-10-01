/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 *
 * @author sofia
 */
public class Hotel {
    private int cantHabitaciones;  
   private Habitacion habitaciones [];
   
   
   Hotel(int cantHabitaciones){
       int x;
       setCantHabitaciones(cantHabitaciones);
       habitaciones =  new Habitacion[cantHabitaciones];
       for(x=0;x<cantHabitaciones;x++){
           habitaciones[x] = new Habitacion();
       }
   }
   
   public void ocuparHabitacion(Persona persona,int pos){
       if(habitaciones[pos].getOcupado()==false){
           habitaciones[pos].ocuparHabitacion(persona);
        }else{
           System.out.println("La habitacion: "+pos+" ya esta ocupada");
       }   
   }
   
   
    public String imprimirHotel(){
        int x;
		String aux="";
        for(x=0;x<cantHabitaciones;x++){
            aux+=habitaciones[x].toString()+"\n";
        }
		return aux;
    }
    
    public void aumentar(double aumento){
        int x;
        for(x=0;x<cantHabitaciones;x++){
            habitaciones[x].aumento(aumento);// delegar a habitacion 
        }
    }
   
    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    private void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }
}
