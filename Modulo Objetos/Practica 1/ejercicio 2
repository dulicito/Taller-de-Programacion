ENUNCIADO:
2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
NOTA: Dispone de un esqueleto para este programa en Ej02Jugadores.java


package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  /*
    2- Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
NOTA: Dispone de un esqueleto para este programa en Ej02Jugadores.java
    
    */
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        int DF = 15;
        
        //Paso 3: Crear el vector para 15 double 
        double [] alturas = new double [DF]; 

        //Paso 4: Declarar indice y variables auxiliares a usar
        int i;
        double sumaAlturas;
        sumaAlturas = 0;
        double promedio;
        int cantidadPorEncimaDelPromedio;
        cantidadPorEncimaDelPromedio = 0;
        
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        System.out.println ("Ingrese las alturas de los 15 jugadores");
        for (i = 0 ; i < DF ; i++){
            System.out.println("la altura del jugador"+ " " + i + " " + "es:");
            alturas[i] = Lector.leerDouble();
            sumaAlturas += alturas[i];
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        promedio = sumaAlturas / DF;
        System.out.println("La altura promedio en general es" +" "+ promedio);
        System.out.println("--------------------------------------------------");
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for (i = 0; i < DF; i++){
            if (alturas[i] > promedio){
                cantidadPorEncimaDelPromedio++;
            }
        }
        //Paso 9: Informar la cantidad.
        System.out.println("La cantidad de jugadores que superan en promedio son"+" " + cantidadPorEncimaDelPromedio);
    }
    
}
