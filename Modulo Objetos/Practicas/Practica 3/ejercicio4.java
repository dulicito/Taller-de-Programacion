/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author sofia
 */
public class ejercicio4 {
    public static void main(String[] args) {
        int num,x;
        double aumento;
		String aux;
        
        
        System.out.print("Ingrese n habitaciones: ");num=Lector.leerInt();
        Hotel hotel = new Hotel(num);
        aux=hotel.imprimirHotel();
		System.out.println(aux);
        for(x=0;x<3;x++){
            System.out.print("Ingrese num de habitacion: ");num=Lector.leerInt();
            Persona persona = new Persona(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(100),GeneradorAleatorio.generarInt(100));
            hotel.ocuparHabitacion(persona, num);
        }
        System.out.print("Cantidad a aumentar: ");aumento=Lector.leerDouble();
        hotel.aumentar(aumento);
        aux=hotel.imprimirHotel();
		System.out.println(aux);
    }
}
