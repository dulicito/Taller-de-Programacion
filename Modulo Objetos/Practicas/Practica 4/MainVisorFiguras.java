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
public class MainVisorFiguras {
public static void main(String[] args) {
 VisorFiguras visor = new VisorFiguras();//incializa el visor seteando su cantidad mostradas en 0

 Cuadrado c1 = new Cuadrado(10,"Violeta","Rosa");
 Rectangulo r= new Rectangulo(20,10,"Azul","Celeste");
 Cuadrado c2= new Cuadrado(30,"Rojo","Naranja");
 //genero 3 figuras

 visor.mostrar(c1);//uso el visor y sumo 1 a mostradas
 visor.mostrar(r);//uso el visor y sumo 1 a mostradas
 visor.mostrar(c2);//uso el visor y sumo 1 a mostradas

 //para este punto mostradas vale 3
 System.out.println(visor.getMostradas());
 } 
} 
