/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import PaqueteLectura.Lector;
/**
 *
 * @author sofia
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Jugador jugador;
        Entrenador entrenador;
        double sueldo;
        int antiguedad,partidos,goles,campeonatos;
        String nombre;
        
        
        System.out.print("Ingrese nombre: "); nombre=Lector.leerString();
        System.out.print("Ingrese sueldo: ");sueldo=Lector.leerDouble();
        System.out.print("Ingrese antiguedad: ");antiguedad=Lector.leerInt();
        System.out.print("Ingrese partidos: ");partidos=Lector.leerInt();
        System.out.print("Ingrese goles: ");goles=Lector.leerInt();
        jugador = new Jugador(partidos,goles,nombre,sueldo,antiguedad);
        System.out.print("Ingrese nombre: ");nombre=Lector.leerString();
        System.out.print("Ingrese sueldo: ");sueldo=Lector.leerDouble();
        System.out.print("Ingrese antiguedad: ");antiguedad=Lector.leerInt();
        System.out.print("Ingrese campeonatos ganados: ");campeonatos=Lector.leerInt();
        entrenador = new Entrenador(campeonatos,nombre,sueldo,antiguedad);
        System.out.println(jugador.toString());
        System.out.println(entrenador.toString());
    }
}
