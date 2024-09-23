ENUNCIADO:
3- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.
NOTA: utilizar la clase Persona. Pensar en la estructura de datos a utilizar. Para comparar
Strings use el método equals.

package tema2;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/**
 *
 * @author sofia
 */

public class ejercicio3 {
    public static void main (String[] args){
        
        int dfDIAS = 5;
        int dfENTREVISTAS = 8;
        int MAXCUPOS = 40;
        int cantcupos = 0;
        int pos = 0;
        int dni,edad,dias,entrevistas,d,e;
        String nombre;
        Persona matriz [][] = new Persona[dfDIAS][dfENTREVISTAS];
        
        
        /* GENERO MATRIZ */
        GeneradorAleatorio.iniciar();
        System.out.println("Ingrese el nombre: ");
        nombre = Lector.leerString();
        dias = 0; 
        while ((dias <dfDIAS)&& (cantcupos <MAXCUPOS)&& !(nombre.equals("ZZZ"))){
            entrevistas = 0;
            while ((entrevistas < dfENTREVISTAS) && (cantcupos < MAXCUPOS)&& !(nombre.equals("ZZZ"))){
                Persona persona1 = new Persona(nombre, dni =GeneradorAleatorio.generarInt(50),edad=GeneradorAleatorio.generarInt(50));
                matriz[dias][entrevistas] = persona1;
                entrevistas++;
                cantcupos++;
                System.out.println("Ingrese el nombre: ");
                nombre = Lector.leerString();
            }
            dias++;
         }
        
        /*RECORRO MATRIZ E INFORMO*/
        
        for (dias = 0 ;dias < dfDIAS ; dias++){
            for (entrevistas = 0; entrevistas <dfENTREVISTAS; entrevistas++){
                System.out.println("Dia: "+( dias+1)+ " Entrevista: "+ (entrevistas+1));
                System.out.println(matriz[dias][entrevistas].toString());
            }
        }
        
    }
    
}
