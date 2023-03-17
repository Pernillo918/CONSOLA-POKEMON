package Clases;

import java.io.Serializable;

public class Entrenadores implements Serializable {

    private int id;
    private String nombre;
    private Pokeball[]maximo;
    
    
    
    
    //Constructor inicializado 
    public Entrenadores(){
        this.id=0;
        this.nombre="";
        
    }

    //Constructor 
    public Entrenadores(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
    //MOSTRAR ENTENADOR
    public void Mostrar_Entrenadores(){
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("-------------------");
        System.out.println("");
        
    }
    
    
    //Metodos get y set 
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
    
    
    
}
