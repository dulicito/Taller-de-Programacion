ENUNCIADO:
1- Analice el programa Ej01Tabla2.java, que carga un vector que representa la tabla
del 2.
Genere enteros aleatorios hasta obtener el número 11. Para cada número muestre
el resultado de multiplicarlo por 2 (accediendo al vector).

package tema1;

  import PaqueteLectura.GeneradorAleatorio;

          
public class Ej01Tabla2 {

    public static void main(String[] args) {
        int DF = 11 ;  
        int[] tabla2 = new int[DF]; 
        int i = 0; 
        int num;
        
        GeneradorAleatorio.iniciar();
        do {
           num = GeneradorAleatorio.generarInt(100); 
           
           if ( i < DF ){
               tabla2[i] = num;     
             
               System.out.println("El numero generado fue:" +" "+num);
               System.out.println("Su multiplicacion por 2 es:" + " " + (num * 2));
               
             }
           i++;
        } while ( num != 11 && i< 11); //corte  
     }
   }       
