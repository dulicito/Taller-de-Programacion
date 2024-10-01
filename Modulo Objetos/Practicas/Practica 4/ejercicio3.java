/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author sofia
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Persona persona1;
        Trabajadores trabajador1;
        
        GeneradorAleatorio.iniciar();
        persona1 = new Persona(GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(100),GeneradorAleatorio.generarInt(100));
        trabajador1 = new Trabajadores("Limpiador de pisos",GeneradorAleatorio.generarString(5),GeneradorAleatorio.generarInt(100),GeneradorAleatorio.generarInt(100));
        System.out.println(persona1.toString());
        System.out.println(trabajador1.toString());
        
        
    }
}
