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
public class ejercicio1 {
    public static void main(String[] args) {
        
        
        double lado1,lado2,lado3;
        String color,relleno;
        
        
        System.out.println("Inciso 1");
        System.out.print("Ingrese lado1: ");lado1 = Lector.leerDouble();
        System.out.print("Ingrese lado2: ");lado2 = Lector.leerDouble();
        System.out.print("Ingrese lado3: ");lado3 = Lector.leerDouble();
        System.out.print("Ingrese color de linea: ");color = Lector.leerString();
        System.out.print("Ingrese color de relleno: ");relleno = Lector.leerString();
        Triangulo triangulo = new Triangulo(lado1,lado2,lado3,color,relleno);
        
        
        System.out.println("Inciso 2");
        System.out.println("El perimetro es: "+String.format("%.2f", triangulo.calcularPerimetro()));
        System.out.println("El area es: "+String.format("%.2f", triangulo.calcularArea()));
    }
}
