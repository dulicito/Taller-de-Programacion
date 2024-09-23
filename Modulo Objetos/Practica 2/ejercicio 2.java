ENUNCIADO:
2- Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
- Informe la cantidad de personas mayores de 65 años.
- Muestre la representación de la persona con menor DNI.

package tema2;

import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author sofia
 */
public class ejercicio2 {
    public static void main (String[] args){
        int DF = 15;
        int DL;
        Persona [] vector = new Persona [DF];
        int edad,dni;
        String nombre;
        
        /*
          CARGO VECTOR
        */
        GeneradorAleatorio.iniciar();
        DL = 0;
        edad = GeneradorAleatorio.generarInt(100);
        while ((DL < DF)&&(edad != 0)){
            Persona persona1 = new Persona(GeneradorAleatorio.generarString(50), GeneradorAleatorio.generarInt(50), edad);
            vector[DL] = persona1;
            DL++;
        }
        
        /*
          RECORRO VECTOR Y HAGO INCISOS 
        */
        int i;
        int cantmayores = 0;
        Persona persona1 = new Persona(nombre = "nadie",dni=999999,edad=-1);
        
        for (i = 0; i <DL; i++){
           if (vector[i].getEdad() > 65){
               cantmayores++;
           }
           if (vector[i].getDNI()< persona1.getDNI()){
               persona1 = vector[i];
           }
        }
        System.out.println("La cantidad de personas mayores de 65 años son: "+ cantmayores);
        System.out.println("La persona con menor dni es: "+ persona1.toString());
    }
    
}
