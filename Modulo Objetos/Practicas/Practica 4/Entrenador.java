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
public class Entrenador extends Empleado {
    private int campeonatos;
    
    
    public Entrenador(int campeonatos,String nombre,double sueldo,int antiguedad){
        super(nombre,sueldo,antiguedad);
        setCampeonatos(campeonatos);
    }

    
    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
    
    @Override
    public double calcularEfectividad(){
        return (double) campeonatos/this.getAntiguedad();
    }
    
    public double calcularIncetivo(){
        double aux=getCampeonatos();
        double incentivo=0;
        if((aux>=1)&&(aux<=4)){
            incentivo= 5000;
        }else{
            if((aux>=5)&&(aux<=10)){
                incentivo= 30000;
            }else{
                if(aux>10){
                    incentivo= 50000;
                }else{
                    if(aux<=0)
                        incentivo=0;
                }    
            }
        }
      return incentivo;  
    }
        
    
    @Override
    public double calcularSueldo(){
        return this.getSueldo()+calcularIncetivo();
    }
    
}

