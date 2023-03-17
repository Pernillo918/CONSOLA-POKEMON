package Clases;

import java.io.Serializable;

public class Gimnasios implements Serializable{

    //ATRIBUTOS 
    private int id;
    private String lugar;

    //CONSTRUCTOR INICIALIZADO 
    public Gimnasios(){
        this.id=0;
        this.lugar="";
        
    }
    
    
    //CONSTRUCTOR
    public Gimnasios(int id, String lugar) {
        this.id = id;
        this.lugar = lugar;
    }
    
    
    //MOSTAR GIMNASIOS 
    public void Mostrar_GYM(){
        System.out.println("Id: "+ id);
        System.out.println("Lugar "+lugar);
        System.out.println("-------------------");
        System.out.println("");
    }
    
    //METODOS GET Y SET 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
