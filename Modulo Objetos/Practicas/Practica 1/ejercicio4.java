ENUNCIADO:
4- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
(1..4). Realice un programa que permita informar la cantidad de personas que
concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al
edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de
oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro.
de piso 9. Al finalizar la llegada de personas, informe lo pedido.

package tema1;

import PaqueteLectura.Lector;
/**
 *
 * @author sofia
 */

public class ejercicio4 {

    public static void main(String[] args){
        /* VARIABLES*/
        int [][] edificio = new int [8][4]; 
        int numPiso; //piso
        int numOficina; // columnas
        int f,c; //indices;

        /*inicializacion de matriz en 0*/
        
        for (f = 0; f < 8; f++){
            for (c= 0; c < 4 ; c++){
                edificio[f][c]= 0;
            }
        }

        /*cargamos matriz*/
        System.out.println("Ingrese el numero de Oficina a Ingresar");
        numOficina = Lector.leerInt();
        System.out.println("Ingrese el numero de Piso a Ingresar");
        numPiso = Lector.leerInt();
        while (numPiso > 0 && numPiso <= 8 && numOficina >= 0 && numOficina <4 ){
            edificio[numOficina--][numPiso--]++;
            System.out.println("Ingrese el numero de Oficina a ingresar ");
            numOficina = Lector.leerInt();
            System.out.println("Ingrese el numero de Piso a ingresar");
            numPiso = Lector.leerInt();
        }
        
        /*recorremos matriz y imprimimos su posicion*/
        
        for (f = 0; f < 8; f++){
            for (c = 0; c < 4 ; c++){
                System.out.println("Fila: " + f + ",Columna: "+ c + " : " + edificio[f][c]);
            }
        }
     }
}
