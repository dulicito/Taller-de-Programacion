/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

/**
 * 
 * @author sofia
 */

public class Autor {
    private String nombre,biografia,origen;
    
    
    public Autor(String nombre,String biografia,String origen){
        setNombre(nombre);
        setBiografia(biografia);
        setOrigen(origen);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre: " + nombre + ", biografia: " + biografia + ", origen: " + origen + '}';
    }
    
   
}
