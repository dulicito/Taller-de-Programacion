/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import PaqueteLectura.Lector;
/**
 *
 * @author sofia
 */
public class ejercicio5 {
    public static void main(String[] args) {
        double radio;
        String colorRelleno,colorLinea;
        
        
        System.out.print("Ingrese radio: ");radio=Lector.leerDouble();
        System.out.print("Ingrese color relleno: ");colorRelleno=Lector.leerString();
        System.out.print("Ingrese color linea: ");colorLinea=Lector.leerString();
        Circulo circulo = new Circulo(radio,colorRelleno,colorLinea);
        System.out.println(circulo.toString());
  }
}

