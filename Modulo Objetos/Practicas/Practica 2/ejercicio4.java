ENUNCIADO:
4- Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:
a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos de
casting.
Una vez finalizada la inscripción:
b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado.


package tema2;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
/**
 *
 * @author sofia
 */
public class ejercicio4 {
    public static void main (String[] args){
        
        
        int DIAS=5;
        int ENTREVISTAS=8;
        int MAXCUPOS=40;
        int cupos=0;
        int pos=0;
        int dni,edad,dias,entrevistas;
        String nombre;
        Persona matriz[][] = new Persona[DIAS][ENTREVISTAS];
        int vectorDIML[] = new int [DIAS];
        
        
        for(int indice=0;indice<DIAS;indice++){
            vectorDIML[indice] = 0;
        }
        
        
        /* GENERO MATRIZ/VECTOR*/
        GeneradorAleatorio.iniciar();
        System.out.print("ingrese nombre: ");
        nombre=Lector.leerString();
        System.out.print("ingrese dia: ");dias=Lector.leerInt();
        dias= dias-1;
        while((cupos<MAXCUPOS)&& !(nombre.equals("ZZZ"))){
            if(vectorDIML[dias]<ENTREVISTAS){
                Persona persona1 = new Persona(nombre,dni=GeneradorAleatorio.generarInt(9999999),edad=GeneradorAleatorio.generarInt(100));
                matriz[dias][vectorDIML[dias]] = persona1;
                vectorDIML[dias]++;
                cupos++;
            }else{
                System.out.println("No hay mas cupos para el dia: "+ dias);   
            }
            System.out.print("ingrese nombre:");
            nombre=Lector.leerString();
            if(nombre.equals("ZZZ")){   
            }else{
                System.out.print("ingrese dia: ");dias=Lector.leerInt();    
            }    
        }
        
        
        /* RECORRO ESTRUCTURA E INFORMO */
        dias=0;
        while(dias<DIAS){
            for(entrevistas=0;entrevistas<vectorDIML[dias];entrevistas++){
                System.out.println("Dia: "+(dias+1)+" Num entrevista: "+(entrevistas+1)+"|"+matriz[dias][entrevistas].getNombre());
            }
            dias++;
          
    }
    }
}
