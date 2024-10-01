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
public class Estantes {
    private final int DIMF=5;
    private int DIML=0;
    private Libro vector[];
    
    
    Estantes(){
        vector = new Libro[DIMF];
    }
    
    
    
    
    public void agregarLibro(Libro libro1){
        if(DIML<DIMF){
            vector[DIML] = libro1;
            DIML++;
        
        }    
    }
    
    
    public Libro buscarLibro(String titulo){
        Libro aux=null;
		int x=0;boolean ok=false;
        while ((x<DIML)&&(ok==false)){
			if(vector[x].getTitulo().equals(titulo)){
				aux = vector[x];
				ok=true;
		    }
			if(ok==false)
			  x++;
		}  
        return aux;
        }
    
    
    public int getCantidadLibros(){
        return DIML;
    }
    
    public boolean estaLleno(){
        if(DIML == DIMF){
            return true;
        }else{
            return false;
        }
    }
	@Override
	public String toString(){
		String aux="";
		int x;
		for(x=0;x<DIML;x++)
                  aux+=(vector[x].toString())+"\n";
	    return aux;
	}
}
