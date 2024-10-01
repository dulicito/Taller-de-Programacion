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
public class SistemaAnio extends Sistema {
    double matriz [][];
    private final int MES=12;
    
    
    public SistemaAnio(String nombre,double latitud,double longitud,int anioInicial,int cantidadAnios){
        super(nombre,latitud,longitud,anioInicial,cantidadAnios);
        matriz = new double[cantidadAnios][MES];
        int x,y,anios=this.getCantidadAnios();
        for(x=0;x<anios;x++){
           for(y=0;y<MES;y++){
               matriz[x][y] = 1000;
           } 
        }
    }
    
    @Override
    public  void registrarTemperatura(double temperatura,int anio,int mes){
        matriz[anio][mes] = temperatura;
    }
    
    @Override
    public String mayorTemperatura(){
    int x,y,anios=this.getCantidadAnios();
        String aux="vacio";
        double mayor=-1;
        for(x=0;x<anios;x++){
            for(y=0;y<MES;y++){
                if(matriz[x][y]>mayor){
                    aux="Anio: "+x+" Mes: "+y;
                    mayor=matriz[x][y];
                }      
            }
        }
        return aux;
    }
   
    @Override
    public String calcularPromedio() {
        int x,y,anios=this.getCantidadAnios();
        String aux="";
        double total;
        for(x=this.getAnioInicial();x<anios;x++){
              total=0;
            for(y=0;y<MES;y++){
               total +=matriz[x][y];
            }
            aux="La temperatura promedio del anio: "+x+" es de: "+String.format("%.2f",(double)total/12)+"\n";
        }
        return aux;
    }

    @Override
    public double obtenerTemperatura(int anio, int mes) {
        return matriz[anio][mes];
    }
    
    @Override
    public String toString(){
        return super.toString()+calcularPromedio();
    }
    

}
