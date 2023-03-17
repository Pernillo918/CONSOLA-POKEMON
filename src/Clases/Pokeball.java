
package Clases;

import java.io.Serializable;


public class Pokeball implements Serializable{
    
    
   //PARAMETEROS 
    private int id;
    private String tipo ;
    private Pokemones pokemon;
    
    
   //CONSTRUCTOR INICIALIZADO
    public Pokeball (){
        this.id=0;
        this.tipo="";
        this.pokemon=null;
    }

    //CONSTRUCTOR

    public Pokeball(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }
    

    
        
    //IMPRESION DEL POKEMON ASIGNADOS
    public void PokemonAsignados(){
        pokemon.setCapturado(true);
        System.out.println("Id de pokeball: "+id);
        System.out.println("Tipo de pokeball: "+tipo);
        System.out.println("Id de pokemon asignado "+pokemon.getId());
        System.out.println("Tipo "+pokemon.getTipo());
        System.out.println("Nombre "+pokemon.getNombre());
        System.out.println("Vida "+pokemon.getVida());
        System.out.println("Puntos de ataque "+pokemon.getPuntosAtaque());
        System.out.println("Capturado "+pokemon.isCapturado());
        System.out.println("Estado "+pokemon.isEstado());
        System.out.println("-------------------------------------");
        System.out.println("");
    }
    
    
   
    
    
    
    
    //METODO GET Y SET 

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

    public Pokemones getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemones pokemon) {
        this.pokemon = pokemon;
    }

    
    
}