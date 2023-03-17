package Clases;

import java.io.Serializable;

public class Pokemones implements Serializable {

    //PARAMETROS
    private int id;
    private String tipo;
    private String nombre;
    private double vida;
    private double puntosAtaque;
    private boolean Capturado;
    private boolean estado;
    

    //CONSTRUCTOR INICIALIZADO
    public Pokemones() {
        this.id = 0;
        this.tipo = "";
        this.nombre = "";
        this.vida = 0;
        this.puntosAtaque = 0;
        this.Capturado = false;
        this.estado = false;
 

    }

    //CONSTRUCTOR
    public Pokemones(int id, String tipo, String nombre, double vida, double puntosAtaque, boolean Capturado, boolean estado) {
        this.id = id;
        this.tipo = tipo;
        this.nombre = nombre;
        this.vida = vida;
        this.puntosAtaque = puntosAtaque;
        this.Capturado = Capturado;
        this.estado = estado;
        
        
    }

  
    
    //METODO PARA IMPRESION 
    public void POKEMONS() {
        System.out.println("Id: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida: " + vida);
        System.out.println("Puntos de ataque: " + puntosAtaque);
        System.out.println("Capturado: " + Capturado);
        System.out.println("Estado: " + estado);
        System.out.println("------------------------");
        System.out.println("");
       
        
    }
        
     

    //METODOS GET Y SET 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(double puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public boolean isCapturado() {
        return Capturado;
    }

    public void setCapturado(boolean Capturado) {
        this.Capturado = Capturado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
    
    

}
