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
public class Circulo {
   private double radio;
   private String colorRelleno,colorLinea;

    public Circulo(double radio, String colorRelleno, String colorLinea) {
        this.radio = radio;
        this.colorRelleno = colorRelleno;
        this.colorLinea = colorLinea;
    }

    public double calcularPerimetro(){
        return ((2*Math.PI)*radio);
    }
    
    public double calcularArea(){
        return (Math.PI*(Math.pow(radio,2)));
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColorRelleno() {
        return colorRelleno;
    }

    public void setColorRelleno(String colorRelleno) {
        this.colorRelleno = colorRelleno;
    }

    public String getColorLinea() {
        return colorLinea;
    }

    public void setColorLinea(String colorLinea) {
        this.colorLinea = colorLinea;
    }
   
    @Override
    public String toString(){
        return "Perimetro: "+String.format("%.2f",calcularPerimetro())+" Area: "+String.format("%.2f",calcularArea());
        
    }
}
