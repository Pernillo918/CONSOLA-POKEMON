
package Clases;


public class Pelea {
    
    private int Id_gym;
    private int id_pok1;
    private int id_poke2;
    
    
    //constructor iniciaizado 
    public Pelea(){
        this.Id_gym=0;
        this.id_pok1=0;
        this.id_poke2=0;
                
    }
    
    
    //constructor generado 

    public Pelea(int Id_gym, int id_pok1, int id_poke2) {
        this.Id_gym = Id_gym;
        this.id_pok1 = id_pok1;
        this.id_poke2 = id_poke2;
    }
    
    
    //metodos get y set 

    public int getId_gym() {
        return Id_gym;
    }

    public void setId_gym(int Id_gym) {
        this.Id_gym = Id_gym;
    }

    public int getId_pok1() {
        return id_pok1;
    }

    public void setId_pok1(int id_pok1) {
        this.id_pok1 = id_pok1;
    }

    public int getId_poke2() {
        return id_poke2;
    }

    public void setId_poke2(int id_poke2) {
        this.id_poke2 = id_poke2;
    }
    
    
}
