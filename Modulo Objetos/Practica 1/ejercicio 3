ENUNCIADO:
3- Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Leer un valor entero e indicar si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.


package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios

import PaqueteLectura.GeneradorAleatorio;

import PaqueteLectura.Lector;

public class Ej03Matrices {

    
    public static void main(String[] args) {
	//Paso 2. iniciar el generador aleatorio     
         GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
         int DF = 5;
         int [][] matriz = new int [DF][DF];
         int f;
         int c;
         
         GeneradorAleatorio.iniciar();
         for ( f = 0 ; f < DF ; f++){
             for (c = 0; c < DF ; c++ ){
                 matriz[f][c] =  GeneradorAleatorio.generarInt(31);
             }
         }
        //Paso 4. mostrar el contenido de la matriz en consola
        System.out.println("El contenido de la matriz es:");
        for (f = 0; f < DF ;  f++){
            for (c = 0; c < DF; c++){
                System.out.println( "El valor Guardado en la Fila "+ f + " y Columna "+ c + " es: " + matriz[f][c]);
            }
        }
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
        int sumaFila = 0;
        
        c = 0;
        while ( c < DF){
            sumaFila += matriz[1][c];
            c++;
        } 
        System.out.println("El total de la suma de los elementos de la fila 1 es: " + sumaFila);
        
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.
        
        
        int [] vector = new int [DF];
        
         for (c = 0 ; c < DF; c++){
         
             int sumaColumnas = 0;
             for (f = 0; f < DF ; f++){
                 sumaColumnas += matriz [f][c];
             }
             vector [c] = sumaColumnas;
         }
         
         
        for (int j = 0; j < DF; j++){
            System.out.println("El valor de la posicion "+ j + " es "+ vector[j]);
        }
        
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        
        System.out.println("Ingrese un valor Entero para buscar en la matriz");
        int valorBuscado = Lector.leerInt();
        boolean encontrado = false;
        
        f = 0;
        while (  f < DF && !encontrado ) {
            c = 0;
            while (c < DF && !encontrado ){
                if ( matriz[f][c] == valorBuscado ){
                  encontrado = true;
                  System.out.println("El valor se encuentra en la fila: " + (f) + " y la columna se encuentra en: " + (c));
                 }
                c++;
              }
            f++;
        }
        if (encontrado ==  false){
           System.out.println("El valor no se ha encontrado");
   }
}
}
