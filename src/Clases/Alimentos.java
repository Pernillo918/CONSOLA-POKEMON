package Clases;

import java.io.Serializable;

public class Alimentos implements Serializable {

    //ATRIBUTOS 
    private int id;
    private String nombre;
    private Double vida;
  

    
    //CONTADOR INICIALIZADO 
    public Alimentos(){
        this.id=0;
        this.nombre="";
        this.vida=0.0;
        
    }
    
    
    //CONTADOR 
      public Alimentos(int id, String nombre, Double vida) {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
    }
    
  
      
      
    //METODO SET Y GET 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }


  
}
