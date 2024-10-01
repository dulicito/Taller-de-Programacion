/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;

/**
 *
 * @author sofia
 */
public class ejercicio4 {
     public static void main(String[] args) {
        int z,y;
        SistemaAnio sistemaA;
        SistemaMes sistemaM;
      
        sistemaA = new SistemaAnio("La plata",-34.921,57.955,2021,3);
        for(z=0;z<3;z++){
            for(y=0;y<12;y++){
                    sistemaA.registrarTemperatura(GeneradorAleatorio.generarDouble(90),z,y);
                }
        }
            
        sistemaM = new SistemaMes("Mar del plata",-38.002,-57.556,2020,4);
        for(z=0;z<3;z++){
            for(y=0;y<12;y++){
                    sistemaM.registrarTemperatura(GeneradorAleatorio.generarDouble(90)-30,z,y);
                }
            }
            
        System.out.println(sistemaA.toString());
        System.out.println(sistemaM.toString());
        }
}
