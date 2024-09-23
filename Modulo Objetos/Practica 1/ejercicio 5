ENUNCIADO:
5- El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen
(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad
de la comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes
para cada uno de los aspectos y almacene la información en una estructura. Luego
imprima la calificación promedio obtenida por cada aspecto.

package tema1;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector ; 
/**
 * @author sofia
 */
public class ejercicio5 {
   public static void main(String[] args){
       int [][] matriz = new int [5][4];
       
       int f,c; 
       
       int puntaje;
       
       double promedio;
       
       int valor;
       
       /* CARGO MATRIZ */
      
       for( f = 0; f < 5; f++){
           for (c = 0; c < 4; c++){
               System.out.println("Cliente numero: " + f);
               System.out.println("Aspecto numero: " + c);
               System.out.println("Ingrese el puntaje que le da al aspecto " + c);
               puntaje = Lector.leerInt();
               boolean ok = false;
               
               while (ok == false){
                   if (puntaje >= 0 && puntaje <= 10){
                   matriz [f][c] = puntaje;
                   ok = true;
                  }else 
                       System.out.println("Se ingreso un puntaje fuera de su rango, por favor, ingrese otro ");
                       puntaje = Lector.leerInt();
               }
           }
       }
       
           /* 
        RECORRO POR COLUMNA Y SACO SU PROMEDIO
       */
       for (c= 0; c < 4 ; c++){ // de columna 0 a columna 3
           int cantTotal = 0; // var auxuliar cant total para sacar promedio
           
           for(f = 0; f < 5; f++){ //mientras la fila no termine
               cantTotal = cantTotal + matriz[f][c]; //guardo en auxiliar contenido dentro de la matriz
           }
           
           promedio =  cantTotal / 5; //guardo en promedio
           System.out.println("el promedio del aspecto: " + c + " es: " + promedio); //imprimo promedio 
       }
       }
       }
