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
public class Jugador extends Empleado {
    private int partidos,goles;
    
    public Jugador(int partidos,int goles,String nombre,double sueldo,int antiguedad) {
        super(nombre,sueldo,antiguedad);
        setPartidos(partidos);
        setGoles(goles);
    }
    
    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    @Override
    public double calcularEfectividad(){
        return  goles/partidos;
    }
    
    @Override
    public double calcularSueldo(){
        double aux=((this.getSueldo()/100)*10)*this.getAntiguedad();
        double basico=this.getSueldo();
        if(calcularEfectividad()>0.5){
            return basico*2+aux;
         }else{
            return basico+aux;
        }    
    }
    
    
}

