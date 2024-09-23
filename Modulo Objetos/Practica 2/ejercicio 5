ENUNCIADO:
5- Se dispone de la clase Partido (en la carpeta tema2). Un objeto partido representa un
encuentro entre dos equipos (local y visitante). Un objeto partido puede crearse sin
valores iniciales o enviando en el mensaje de creación el nombre del equipo local, el
nombre del visitante, la cantidad de goles del local y del visitante (en ese orden). Un objeto
partido sabe responder a los siguientes mensajes:

getLocal() retorna el nombre (String) del equipo local
getVisitante() retorna el nombre (String) del equipo visitante
getGolesLocal() retorna la cantidad de goles (int) del equipo local
getGolesVisitante() retorna la cantidad de goles (int) del equipo visitante
setLocal(X) modifica el nombre del equipo local al “String” X
setVisitante(X) modifica el nombre del equipo visitante al “String” X
setGolesLocal(X) modifica la cantidad de goles del equipo local al “int” X
setGolesVisitante(X) modifica la cantidad de goles del equipo visitante al “int” X
hayGanador() retorna un boolean que indica si hubo (true) o no hubo (false) ganador
getGanador() retorna el nombre (String) del ganador del partido (si no hubo retorna un String vacío).

hayEmpate() retorna un boolean que indica si hubo (true) o no hubo (false) empate
Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local.

package tema2;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author sofia
 */
public class ejercicio5 {
    public static void main (String[] args){
        int DF= 20;
        int DL= 0;
        Partido []vector= new Partido [DF];
        String nombreequipolocal, nombrevisitante;
        int cantgoleslocal,cantgolesvisitantes;
        String corte= "ZZZ";
        
        /* INICIALIZAR VECTOR*/
        GeneradorAleatorio.iniciar();
        System.out.println("Ingrese el nombre del equipo local: ");
        nombreequipolocal = Lector.leerString();
        System.out.println("Ingrese el nombre del visitante: ");
        nombrevisitante = Lector.leerString();
        Partido partido1 = new Partido (nombreequipolocal, nombrevisitante, cantgoleslocal = GeneradorAleatorio.generarInt(100),cantgolesvisitantes=GeneradorAleatorio.generarInt(100));
        while ( !(partido1.getVisitante().equals(corte))&&(DL < DF)){
             vector[DL]= partido1;
             DL++;
             System.out.println("Ingrese el nombre del equipo local: ");
             nombreequipolocal= Lector.leerString();
             System.out.println("Ingrese el nombre del visitante: ");
             nombrevisitante= Lector.leerString();
             partido1 = new Partido(nombreequipolocal,nombrevisitante,cantgoleslocal=GeneradorAleatorio.generarInt(100),cantgolesvisitantes=GeneradorAleatorio.generarInt(100));
        }
        
        /*RECORRO VECTOR*/
        
        int partidosriver = 0;
        int totalgoles = 0;
        
        for (int i= 0; i <DL ; i++){
            System.out.println("EQUIPO-LOCAL: "+vector[i].getGolesLocal() +" VS "+ "EQUIPO-VISITANTE: "+ vector[i].getGolesVisitante());
            if (vector[i].getLocal().equals("River")){
                partidosriver++;
            }
            if (vector[i].getVisitante().equals("Boca")){
                totalgoles = totalgoles + vector[i].getGolesVisitante();
            }
        }
        System.out.println("Cantidad de partidos que gano River: "+partidosriver);
        System.out.println("Goles que realizo Boca jugando de local: "+totalgoles);
        
        
    }
    
}
