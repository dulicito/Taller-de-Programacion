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
public abstract class Empleado {//deberia ser abstracta ?
    private String nombre;
    private double sueldo;
    private int antiguedad;
    
    public Empleado(String nombre,double sueldo,int antiguedad){
        setNombre(nombre);
        setSueldo(sueldo);
        setAntiguedad(antiguedad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public abstract double calcularEfectividad();
    
    public abstract double calcularSueldo();
    
    @Override
    public String toString(){
        String aux;
        aux= "Nombre: "+nombre+" Sueldo: "+this.calcularSueldo()+" Antiguedad: "+antiguedad+" Efectividad: "+this.calcularEfectividad();
        return aux;        
    }
}
