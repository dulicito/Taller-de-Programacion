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
public class Triangulo {
    private double lado1,lado2,lado3; 
   private String color,relleno;
   
   
   public Triangulo(double lado1,double lado2,double lado3,String color,String relleno){
       setLado1(lado1);//pongo this ?
       setLado2(lado2);
       setLado3(lado3);
       setColor(color);
       setRelleno(relleno);    
   }
   
   
   public void setLado1(double lado1){
       this.lado1 = lado1;  //con this o sin this ?  
   }
   
   
   public void setLado2(double lado2){
       this.lado2=lado2;
   }
   
   
   public void setLado3(double lado3){
       this.lado3=lado3;
   }
   
   
   public void setColor(String color){
       this.color=color;
   }
   
   
   public void setRelleno(String relleno){
       this.relleno=relleno;
   }
   
   
   public double getLado1(){
       return lado1;
   }
   
   
   public double getLado2(){
       return lado2;
   }
   
   
   public double getLado3(){
       return lado3;
   }
   
   
   public String getColor(){
       return color;
   }
   
   
   public String getRelleno(){
       return relleno;
   }
   
   
   public double calcularPerimetro(){
       return  (getLado1()+getLado2()+getLado3());
   }
   
   
   public double calcularArea(){
       double s;
       s = ((calcularPerimetro())/2);
       return (Math.sqrt(s*(s-getLado1())*(s-getLado2())*(s-getLado3())));
   }
}
