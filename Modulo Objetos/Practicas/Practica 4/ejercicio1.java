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
public class ejercicio1 {
     public static void main(String[] args) {
        Triangulo triangulo;
        Circulo circulo;
        double uno=1,dos=1,tres=1;
        String a="rojo",b="azul";
        
        
        triangulo = new Triangulo(uno,dos,tres,a,b);
        circulo = new Circulo(uno,a,b);
        System.out.println(circulo.toString());
        System.out.println(triangulo.toString());
        circulo.despintar();
        triangulo.despintar();
        System.out.println(circulo.toString());
        System.out.println(triangulo.toString());
        
    }
}
