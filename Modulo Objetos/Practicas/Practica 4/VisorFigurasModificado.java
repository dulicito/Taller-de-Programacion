/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author sofia
 */
public class VisorFigurasModificado {
    private int guardadas;
    private int capacidadMaxima=5;
    private Figura [] vector;

    public VisorFigurasModificado(){
        vector = new Figura[capacidadMaxima];
    }

    public void guardar(Figura f){
        vector[getGuardadas()]=f;
        guardadas++;
    }
    
    public boolean quedaEspacio(){
        boolean aux;
        if(guardadas<capacidadMaxima){
            aux=true;
        }else{
            aux=false;
        }
        return aux;
    }

    public void mostrar(){
        int aux=0;
        while(aux<guardadas){
            System.out.println(vector[aux]);
            aux++;
        }
    }
    
    public int getGuardadas() {
        return guardadas;
    }
}
