package Main;

import Clases.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {

    //LECTOR
    static Scanner lector = new Scanner(System.in);
    static Scanner lector1 = new Scanner(System.in);
    static Scanner lector2 = new Scanner(System.in);
    static Scanner lector3 = new Scanner(System.in);
    static Scanner lector4 = new Scanner(System.in);
    static Scanner lector5 = new Scanner(System.in);
    static Scanner lector6 = new Scanner(System.in);
    static Scanner lector7 = new Scanner(System.in);
    static Scanner lector8 = new Scanner(System.in);
    static Scanner lector9 = new Scanner(System.in);
    
    static Scanner sc = new Scanner(System.in);
    //RUTAS DE ARCHIVOS 
    static String ruta, ruta1;
    //OBJETOS 
    static Pokemones[] pokemon;
    static int ContadorPokemon = 0;
    static Pokeball[] pokeball;
    static int ContadorPokeball = 0;
    static Entrenadores[] entrenador;
    static int ContadorEntrenadores = 0;
    static Gimnasios[] GYM;
    static int ContadorGym = 0;
    static Alimentos[] Comida;
    static int ContadorComida = 0;
    static Pelea[] pelea;
    static int Contadorpelea;
    
    
     static ObjectInputStream ois;
    static ObjectOutputStream oos;

    //PARA REPORTE SALVAJE
    public static void main(String[] ARS) {
        
        

        int opcion = 0;

        while (opcion != 10) {

            System.out.println("=============== MENU ==============");
            System.out.println("| 1. Cargar Pokemons              |");
            System.out.println("| 2. Cargar Entrenadores          |");
            System.out.println("| 3. Poke ball                    |");
            System.out.println("| 4. Gimnasios                    |");
            System.out.println("| 5. Alimentos                    |");
            System.out.println("| 6. Asignar Pokemon              |");
            System.out.println("| 7. Asignar poke ball            |");
            System.out.println("| 8. Asignar actividad de comida  |");
            System.out.println("| 9. Asignar actividad de pelea   |");
            System.out.println("| 10. Generar reportes            |");
            System.out.println("| 11. Salir                       |");
            System.out.println("===================================");
            System.out.print("Tu opcion a escoger es:");

            try {
                opcion = (char) sc.nextInt();
                switch (opcion) {

                    case 1:
                        
                                
                            Cargar_Pokemones();
                      
                        
                        break;

                    case 2:
                        
                                 
                            Cargar_Entrenadores();
                        
                        
                        
                        
                       
                        break;

                    case 3:
                        
                                
                          Pokeballs();
                      
                        
                        
                        
                        break;

                    case 4:
                        
                               
                               Cargar_Gym();
                       
                        break;

                    case 5:
                        
                               
                            Cargar_Alimetos();
                       
                        break;

                    case 6:
                        Asignar_pokemons();
                        break;

                    case 7:
                        Asignar_Pokeball();
                        break;

                    case 8:

                        Asignar_comida();

                        break;

                    case 9:
                        Asignar_pelea();
                        System.out.println("CSV GUARDADO CON EXITO \n");
                        break;

                    case 10:
                        Reportes();
                     
                        break;

                    case 11:
                        System.out.println("Gracias por usar nuestro programa hasta pronto");
                        System.exit(0);

                        break;

                    default:
                        System.out.println("Opcion invalida");

                }

            } catch (InputMismatchException e) {
                System.out.println(" OPCION INVALIDAD DEBE SER UN NUMERO");
                sc.next();
            }

        }

    }//TERMINA EL MAIN 
    
    
    //----------------------------------AREA DE SEREALIZACION---------------------------
     public static Object Pokemones_serealizados(){
        Object objeto;
        
        try{
            ois = new ObjectInputStream(new FileInputStream("Pokemones.bin"));
            objeto = ois.readObject();
            return objeto;
        }catch(Exception e){
        }
        return null;
    }
     
      public static void SerializarPokemon(Object objeto){
        try{
            oos = new ObjectOutputStream(new FileOutputStream("Pokemones.bin"));
            oos.writeObject(objeto);
            oos.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

      public static Object Entrenadores_serealizados(){
        Object objeto;
        
        try{
            ois = new ObjectInputStream(new FileInputStream("Entrenadores.bin"));
            objeto = ois.readObject();
            return objeto;
        }catch(Exception e){
        }
        return null;
    }
     
      public static void SerializarEntrenador(Object objeto){
        try{
            oos = new ObjectOutputStream(new FileOutputStream("Entrenadores.bin"));
            oos.writeObject(objeto);
            oos.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

      public static Object Pokeball_serealizados(){
        Object objeto;
        
        try{
            ois = new ObjectInputStream(new FileInputStream("Pokeball.bin"));
            objeto = ois.readObject();
            return objeto;
        }catch(Exception e){
        }
        return null;
    }
     
      public static void SerializarPokeball(Object objeto){
        try{
            oos = new ObjectOutputStream(new FileOutputStream("Pokeball.bin"));
            oos.writeObject(objeto);
            oos.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      
      public static Object Gym_serealizados(){
        Object objeto;
        
        try{
            ois = new ObjectInputStream(new FileInputStream("Gym.bin"));
            objeto = ois.readObject();
            return objeto;
        }catch(Exception e){
        }
        return null;
    }
     
      public static void SerializarGym(Object objeto){
        try{
            oos = new ObjectOutputStream(new FileOutputStream("Gym.bin"));
            oos.writeObject(objeto);
            oos.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      
      public static Object Alimentos_serealizados(){
        Object objeto;
        
        try{
            ois = new ObjectInputStream(new FileInputStream("Alimento.bin"));
            objeto = ois.readObject();
            return objeto;
        }catch(Exception e){
        }
        return null;
    }
     
      public static void SerializarAlimentos(Object objeto){
        try{
            oos = new ObjectOutputStream(new FileOutputStream("Alimentos.bin"));
            oos.writeObject(objeto);
            oos.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
      
      
 //--------------------------------------METODOS DE CARGA ----------------------------------------     
    //METODO CARGAR POKEMONES 
    public static void Cargar_Pokemones() {
        

        System.out.print("Ingresar la ruta del archivo csv a leer: ");
        ruta = lector.nextLine();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String filas;
            int Contadorfilas = 0;

            while ((filas = br.readLine()) != null) {
                Contadorfilas++;

            }

            pokemon = new Pokemones[Contadorfilas - 1];
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            filas = br.readLine();
            while ((filas = br.readLine()) != null) {

                String[] Datos = filas.split(",");

                int id = Integer.parseInt(Datos[0]);
                String tipo = Datos[1];
                String nombre = Datos[2];
                Double vida = Double.parseDouble(Datos[3]);
                Double puntosataque = Double.parseDouble(Datos[4]);

                boolean capturado = false;
                if (Datos[5].equals("salvaje")) {
                    capturado = false;
                } else if (Datos[5].equals("capturado")) {
                    capturado = true;
                }

                boolean estado = false;
                if (Datos[6].equals("muerto")) {
                    estado = false;
                } else if (Datos[6].equals("vivo")) {
                    estado = true;
                }

                Pokemones nuevo = new Pokemones(id, tipo, nombre, vida, puntosataque, capturado, estado);
                pokemon[ContadorPokemon] = nuevo;
                ContadorPokemon++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
        ORDENARPOKEMONS();
        
    }//TERMINAR CARGADO DE LOS POKEMONES 
    

//METODO CARGAR POKEBALLS   
    public static void Pokeballs() {

        System.out.print("Ingresar la ruta del archivo csv a leer: ");
        ruta = lector2.nextLine();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String filas;
            int Contadorfilas = 0;

            while ((filas = br.readLine()) != null) {
                Contadorfilas++;

            }

            pokeball = new Pokeball[Contadorfilas - 1];
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            filas = br.readLine();
            while ((filas = br.readLine()) != null) {

                String[] Datos = filas.split(",");

                int id = Integer.parseInt(Datos[0]);
                String tipo = Datos[1];

                Pokeball nuevo = new Pokeball(id, tipo);
                pokeball[ContadorPokeball] = nuevo;
                ContadorPokeball++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }//TERMINICA CARGADO DE POKEBALLS

    //METODO CARGAR ENTRENADORES
    public static void Cargar_Entrenadores() {

        System.out.print("Ingresar la ruta del archivo csv a leer: ");
        ruta = lector3.nextLine();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String filas;
            int Contadorfilas = 0;

            while ((filas = br.readLine()) != null) {
                Contadorfilas++;

            }

            entrenador = new Entrenadores[Contadorfilas - 1];
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            filas = br.readLine();
            while ((filas = br.readLine()) != null) {

                String[] Datos = filas.split(",");

                int id = Integer.parseInt(Datos[0]);
                String nombre = Datos[1];

                Entrenadores nuevo = new Entrenadores(id, nombre);
                entrenador[ContadorEntrenadores] = nuevo;
                ContadorEntrenadores++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        Mostrar_Entrenadores(entrenador);
        

    }//TERMINAR CARGADO DE LOS ENTRENADORES

    //METODO CARGAR GIMNASIOS
    public static void Cargar_Gym() {

        System.out.print("Ingresar la ruta del archivo csv a leer: ");
        ruta = lector4.nextLine();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String filas;
            int Contadorfilas = 0;

            while ((filas = br.readLine()) != null) {
                Contadorfilas++;

            }

            GYM = new Gimnasios[Contadorfilas - 1];
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            filas = br.readLine();
            while ((filas = br.readLine()) != null) {

                String[] Datos = filas.split(",");

                int id = Integer.parseInt(Datos[0]);
                String lugar = Datos[1];

                Gimnasios nuevo = new Gimnasios(id, lugar);
                GYM[ContadorGym] = nuevo;
                ContadorGym++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
        Mostrar_GYM(GYM);

    }//TERMINAR CARGADO DE LOS ENTRENADORES

    //METODO CARGAR GIMNASIOS
    public static void Cargar_Alimetos() {

        System.out.print("Ingresar la ruta del archivo csv a leer: ");
        ruta1 = lector1.nextLine();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File(ruta1);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String filas;
            int Contadorfilas = 0;

            while ((filas = br.readLine()) != null) {
                Contadorfilas++;

            }

            Comida = new Alimentos[Contadorfilas - 1];
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            filas = br.readLine();
            while ((filas = br.readLine()) != null) {

                String[] Datos = filas.split(",");

                int id = Integer.parseInt(Datos[0]);
                String nombre = Datos[1];
                Double vida = Double.parseDouble(Datos[2]);

                Alimentos nuevo = new Alimentos(id, nombre, vida);
                Comida[ContadorComida] = nuevo;
                ContadorComida++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        ORDENARCOMIDA();
    }//TERMINAR CARGADO DE LOS ALIMENTOS

    //---------------------------------ACTIVIDADES---------------------------------------------
    public static void Asignar_pokemons() {

        try {

            System.out.print("Ingresar la ruta del archivo csv a leer: ");
            ruta = lector5.nextLine();

            File archivo = new File(ruta);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String filas;
            String[] Datos = new String[2];

            filas = br.readLine();

            //PROCESO PARA ASIGNAR POKEMON 
            while ((filas = br.readLine()) != null) {
                //el arreglo de datos va a relizar la lectura separadas por una coma
                Datos = filas.split(",");
                //Declaro las variables que van a realizar la conversion de los datos segun la posicon de datos
                int ID_POKEBOLL = Integer.parseInt(Datos[0]);
                int ID_POKEMON = Integer.parseInt(Datos[1]);

                //Realizo un for que va a realizar la lectura del arreglo de pokemon y verificar si los id son iguales
                for (int i = 0; i < pokemon.length; i++) {
                    if (pokemon[i].getId() == ID_POKEMON) {
                        //Segundo for que reliza la lectura del arreglo pokeball y verifica si los id son iguales
                        for (int j = 0; j < pokeball.length; j++) {
                            if (pokeball[j].getId() == ID_POKEBOLL) {
                                //setea la pokeball al pokemon y cambio el estado de capturado a true ya que esta capturado
                                pokeball[j].setPokemon(pokemon[i]);
                                pokeball[j].getPokemon().setEstado(true);
                                pokemon[j].setEstado(true);
                            }
                        }
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        PokemonAsignados(pokeball);

    }

    public static void Asignar_comida() {

        try {

            System.out.print("Ingresar la ruta del archivo csv a leer: ");
            ruta = lector6.nextLine();

            File archivo = new File(ruta);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String filas;
            String[] Datos = new String[2];

            filas = br.readLine();

            //PROCESO PARA ASIGNAR COMIDA AL POKEMON 
            while ((filas = br.readLine()) != null) {
                //el arreglo de datos va a relizar la lectura separadas por una coma
                Datos = filas.split(",");
                //Declaro las variables que van a realizar la conversion de los datos segun la posicon de datos
                int ID_COMIDA = Integer.parseInt(Datos[0]);
                int ID_POKEMON = Integer.parseInt(Datos[1]);

                double aux1;
                double aux2;
                double vida;

                for (int i = 0; i < pokemon.length; i++) {
                    if (pokemon[i].getId() == ID_POKEMON) {

                        for (int j = 0; j < Comida.length; j++) {
                            if (Comida[j].getId() == ID_COMIDA) {
                                aux1 = pokemon[i].getVida();
                                aux2 = Comida[j].getVida();
                                vida = aux1 + aux2;

                                pokemon[i].setVida(vida);

                                System.out.println("ID de comida asignada: " + ID_COMIDA);
                                System.out.println("Nombre: " + Comida[j].getNombre());
                                System.out.println("Vida que otorga: " + Comida[j].getVida());
                                System.out.println("");
                                System.out.println("-----REALIZANDO PROCESO DE ALIMENTACION---- ");
                                System.out.println("");
                                System.out.println("ID de pokemon asignado " + ID_POKEMON);
                                System.out.println("Nombre: " + pokemon[i].getNombre());
                                System.out.println("Vida antes de alimentar: " + aux1);
                                System.out.println("Vida luego de alimentar: " + pokemon[i].getVida());
                                System.out.println("------------------------------------------------");
                                System.out.println("");
                            }
                        }
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public static void Asignar_Pokeball(){
        try {

            System.out.print("Ingresar la ruta del archivo csv a leer: ");
            ruta = lector5.nextLine();

            File archivo = new File(ruta);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String filas;
            String[] Datos = new String[2];

            filas = br.readLine();

            
            Pokeball[] asignados = new Pokeball[4];
            //PROCESO PARA ASIGNAR POKEMON 
            while ((filas = br.readLine()) != null) {
                //el arreglo de datos va a relizar la lectura separadas por una coma
                Datos = filas.split(",");
                //Declaro las variables que van a realizar la conversion de los datos segun la posicon de datos
                int ID_ENTRENADOR = Integer.parseInt(Datos[0]);
                int ID_POKEBALL = Integer.parseInt(Datos[1]);

                //Realizo un for que va a realizar la lectura del arreglo de pokemon y verificar si los id son iguales
                for (int i = 0; i < pokeball.length; i++) {
                    if (pokeball[i].getId() == ID_POKEBALL) {
                        //Segundo for que reliza la lectura del arreglo pokeball y verifica si los id son iguales
                        for (int j = 0; j < entrenador.length; j++) {
                            if (entrenador[j].getId() == ID_ENTRENADOR) {
                                //setea la pokeball al pokemon y cambio el estado de capturado a true ya que esta capturado
                                for (int k = 0; k < 4; k++) {
                                 System.out.println("ID ENTREANDOR: "+entrenador[j].getId());
                                System.out.println("Id POKEBALL: "+pokeball[i].getId());
                                }
                                                              
                            }
                        }
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void Asignar_pelea(){
        
        System.out.print("Ingresar la ruta del archivo csv a leer: ");
        ruta = lector9.nextLine();

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String filas;
            int Contadorfilas = 0;

            while ((filas = br.readLine()) != null) {
                Contadorfilas++;

            }

            pelea = new Pelea[Contadorfilas - 1];
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            filas = br.readLine();
            while ((filas = br.readLine()) != null) {

                String[] Datos = filas.split(",");

                int id_gym = Integer.parseInt(Datos[0]);
                int id_poke1 = Integer.parseInt(Datos[1]);
                int id_poke2 = Integer.parseInt(Datos[2]);
                

              

                Pelea nuevo = new Pelea(id_gym, id_poke1, id_poke2);
                pelea[Contadorpelea] = nuevo;
                Contadorpelea++;

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    //------------------------------AREA DE ORDENAMIENTO Y BUSQUEDA------------------------------
    public static void ORDENARPOKEMONS() {
        int verificador = 0;
        Pokemones aux;

        //LECTOR PARA SABER HASTA QUE POSICION HAY VALORES 
        for (int i = 0; i < pokemon.length; i++) {
            if (pokemon[i] != null) {
                verificador++;
            } else {
                break;
            }

        }
        

        for (int i = 0; i < verificador; i++) {
            for (int j = 0; j < verificador - 1; j++) {
                //si pokemon j+1 tiene mayor puntos de ataque que pokemonj 
                if (pokemon[j].getPuntosAtaque() < pokemon[j + 1].getPuntosAtaque()) {
                    //guarda el valor del pokemon que tiene menos puntos
                    aux = pokemon[j];
                    //Se ordenan al pokemonj+1 en una posicon mayor 
                    pokemon[j] = pokemon[j + 1];
                    //al pokemonj se asigna en una posicion menor
                    pokemon[j + 1] = aux;

                }

            }

        }
        
        
        
    }

    public static void ORDENARCOMIDA() {
        int verificador = 0;
        Alimentos aux;

        //LECTOR PARA SABER HASTA QUE POSICION HAY VALORES 
        for (int i = 0; i < Comida.length; i++) {
            if (Comida[i] != null) {
                verificador++;
            } else {
                break;
            }

        }

        for (int i = 0; i < verificador; i++) {
            for (int j = 0; j < verificador - 1; j++) {
                //si comida j+1 tiene mayor puntos de ataque que pokemonj 
                if (Comida[j].getVida() < Comida[j + 1].getVida()) {
                    //guarda el valor del pokemon que tiene menos puntos
                    aux = Comida[j];
                    //Se ordenan al comidaj+1 en una posicon mayor 
                    Comida[j] = Comida[j + 1];
                    //al comidaj se asigna en una posicion menor
                    Comida[j + 1] = aux;

                }

            }

        }
        
        

    }

    //------------------------------AREA DE IMPRESION--------------------------------------------
    public static void POKEMONS(Pokemones[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i].POKEMONS();

        }
    }

    public static void PokemonAsignados(Pokeball[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i].PokemonAsignados();

        }

    }

    public static void Mostrar_Entrenadores(Entrenadores[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i].Mostrar_Entrenadores();

        }
    }

    public static void Mostrar_GYM(Gimnasios[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i].Mostrar_GYM();

        }
    }

    //PRUEBA DE SALVAJES 
    public static void SALVAJES() {
        for (int i = 0; i < pokemon.length; i++) {
            if (pokemon[i] != null) {
                if (pokemon[i].isCapturado() == false) {

                    System.out.println(" ID: " + String.valueOf(pokemon[i].getId()));
                    System.out.println(" TIPO: " + String.valueOf(pokemon[i].getTipo()));
                    System.out.println(" NOMBRE: " + String.valueOf(pokemon[i].getNombre()));
                    System.out.println(" VIDA: " + String.valueOf(pokemon[i].getVida()));
                    System.out.println("PUNTOS DE ATAQUE: " + String.valueOf(pokemon[i].getPuntosAtaque()));
                    System.out.println("CAPTURADO: " + String.valueOf(pokemon[i].isCapturado()));
                    System.out.println(" ESTADO: " + String.valueOf(pokemon[i].isEstado()));
                    System.out.println("---------------------------------------------------------------\n");

                }
            }

        }
    }

    //----------------------------------AREA DE REPORTES--------------------------------------------
    static void Reportes() {

        try {

            if (ruta == null) {

                System.out.println("Se deben ingresar datos antes  de generar los reportes! ");

            } else {

                TOPCOMIDAS();
                TOPPOKEMONS();
                POKEMONSALVAJE();
                COMIDAASIGNADA();
                PELEA();
                ENTRENADORES();
                System.out.println("REPORTES GENERADOS CON EXITO :D ");
                System.out.println("");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy 'a las' hh:mm a ");
                ZonedDateTime datetime = ZonedDateTime.now();
                String fullForm = datetime.format(formatter);
                System.out.println("");
                System.out.println("Se generaron el:: \t" + fullForm);

            }

        } catch (InputMismatchException e) {
            System.out.println(" OPCION INVALIDA");
            sc.next();
        }

    }//TERMINA MENU REPORTES

    static void TOPCOMIDAS() {

        FileWriter fichero = null;
        PrintWriter es = null;
        try {
            fichero = new FileWriter("REPORTES\\REPORTE TOP COMIDAS.html");
            es = new PrintWriter(fichero);

            es.println("<HTML>");
            es.println("<title> REPORTE TOP COMIDAS </title>");
            es.println("<body style=\"background-color: black; \">");

            //CSS------------------------------------------------------         
            es.println("<style type=\"text/css\">");
            es.println("h1 { color: red; size: 13; background-color: black; font-family: Tahoma; }");
            es.println("b {color:F9C533; size: 17; justify; font-family:Consolas; }");
            es.println("p {color:white ; size: 15; justify; font-family:Consolas; }");
            es.println(" td {align=\"center\"}");
            es.println("</style>");

            //INICIO DE CODIGO-----------------------------------------
            es.println("<embed src=\"MEDIA/F.mp3\"  align=\"absmiddle\" autostart=\"true\" loop=1true  hidden=\"true\" volume=\"50\"></embed>");
            es.println("<marquee >");
            es.println("<center><img src=\"MEDIA/COMIDA.gif\" width=1000 heigth=1000></img></center>");
            es.println("</marquee>");
            es.println("<br>");
            es.println("<br>");
            es.println("<br>");

            es.println("<center>");
            es.println("<table class=\"default\">");
            es.println("<tr>");
            es.println("<td><h1>1)</h1></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>Nombre:</b></td width=25><td><p> " + String.valueOf(Comida[0].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>Salud que ofrece:</b></td><td><p> " + String.valueOf(Comida[0].getVida()) + "<p></td>");
            es.println("<tr>");
            es.println("</table>");

            es.println("</td><td></td><td></td><td></td><td></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td></td><td align =\"right\"><h1>2)</h1></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>Nombre:</b></td width=25><td><p> " + String.valueOf(Comida[1].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>Salud que ofrece:</b></td><td><p> " + String.valueOf(Comida[1].getVida()) + "<p></td>");
            es.println("<tr>");
            es.println("</table>");

            es.println("</td><td></td><td></td><td></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td></td><td></td><td align =\"right\"><h1>3)</h1></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>Nombre:</b></td width=25><td><p> " + String.valueOf(Comida[2].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>Salud que ofrece:</b></td><td><p> " + String.valueOf(Comida[2].getVida()) + "<p></td>");
            es.println("<tr>");
            es.println("</table>");

            es.println("</td><td></td><td></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td></td><td></td><td></td><td align =\"right\"><h1>4)</h1></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>Nombre:</b></td width=25><td><p> " + String.valueOf(Comida[3].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>Salud que ofrece:</b></td><td><p> " + String.valueOf(Comida[3].getVida()) + "<p></td>");
            es.println("<tr>");
            es.println("</table>");

            es.println("</td><td></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td></td><td></td><td></td><td></td><td align =\"right\"><h1>5)</h1></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>Nombre:</b></td width=25><td><p> " + String.valueOf(Comida[4].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>Salud que ofrece:</b></td><td><p> " + String.valueOf(Comida[4].getVida()) + "<p></td>");
            es.println("<tr>");
            es.println("</table>");

            es.println("</td>");
            es.println("</tr>");
            es.println("</table>");

            es.println("<img src=\"MEDIA/3.png\" width=1000 heigth=1000 align =center  position=absolute  ></img></center>");
            es.println("<br>");
            es.println("<br>");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy 'a las' hh:mm a ");
            ZonedDateTime datetime = ZonedDateTime.now();
            String fullForm = datetime.format(formatter);
            es.println("<b>El reporte se genero el: \t</b><p>" + fullForm + "</p>");

            es.println("</body>");
            es.println("</HTML>");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }//TERMINA REPORTE TOP COMIDAS

    static void TOPPOKEMONS() {

        FileWriter fichero = null;
        PrintWriter es = null;
        try {
            fichero = new FileWriter("REPORTES\\REPORTE TOP POKEMONS.html");
            es = new PrintWriter(fichero);

            int aux1;
            aux1 = pokemon[0].getId();
            int aux2;
            aux2 = pokemon[1].getId();
            int aux3;
            aux3 = pokemon[2].getId();
            int aux4;
            aux4 = pokemon[3].getId();
            int aux5;
            aux5 = pokemon[4].getId();

            es.println("<HTML>");
            es.println("<title> REPORTE TOP POKEMON </title>");
            es.println("<body bgcolor=black>");

            //CSS------------------------------------------------------         
            es.println("<style type=\"text/css\">");
            es.println("h1 { color: red; size: 13; background-color: white; font-family: Tahoma; }");
            es.println("b {color:C4287D; size: 17; justify; font-family:Consolas; }");
            es.println("p {color:white ; size: 15; justify; font-family:Consolas; }");
            es.println(" td {align=\"center\"}");
            es.println("</style>");

            //INICIO DE CODIGO-----------------------------------------
            es.println("<embed src=\"MEDIA/A.mp3\"  align=\"absmiddle\" autostart=\"true\" loop=\"true\"  hidden=\"true\" volume=\"50\"></embed>");
            //es.println("<marquee >");
            es.println("<center><img src=\"MEDIA/211.gif\" width=1200 heigth=1200></img></center>");
            // es.println("</marquee>");
            es.println("<br>");
            es.println("<br>");
            es.println("<br>");

            es.println("<center>");
            es.println("<table class=\"default\">");
            es.println("<tr>");

            es.println("<td><img src=\"MEDIA/pokemones/" + aux1 + ".png\" width=125 heigth=125></img></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>ID:</b></td width=25><td><p> " + String.valueOf(pokemon[0].getId()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>TIPO:</b></td width=25><td><p> " + String.valueOf(pokemon[0].getTipo()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>NOMBRE:</b></td width=25><td><p> " + String.valueOf(pokemon[0].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>VIDA:</b></td width=25><td><p> " + String.valueOf(pokemon[0].getVida()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>P.ATAQUE:</b></td width=25><td><p> " + String.valueOf(pokemon[0].getPuntosAtaque()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            // es.println("<td><b>CAPTURADO:</b></td width=25><td><p> " + String.valueOf(pokemon[0].isCapturado()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            //  es.println("<td><b>ESTADO:</b></td width=25><td><p> " + String.valueOf(pokemon[0].isEstado()) + "<p></td>");
            es.println("</tr>");
            es.println("</table>");

            es.println("</td><td></td><td></td><td></td><td></td>");
            es.println("</tr>");
            es.println("<tr>");

            es.println("<td></td><td align =\"right\"><img src=\"MEDIA/pokemones/" + aux2 + ".png\" width=125 heigth=125></img></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>ID:</b></td width=25><td><p> " + String.valueOf(pokemon[1].getId()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>TIPO:</b></td width=25><td><p> " + String.valueOf(pokemon[1].getTipo()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>NOMBRE:</b></td width=25><td><p> " + String.valueOf(pokemon[1].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>VIDA:</b></td width=25><td><p> " + String.valueOf(pokemon[1].getVida()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>P.ATAQUE:</b></td width=25><td><p> " + String.valueOf(pokemon[1].getPuntosAtaque()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            // es.println("<td><b>CAPTURADO:</b></td width=25><td><p> " + String.valueOf(pokemon[1].isCapturado()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            // es.println("<td><b>ESTADO:</b></td width=25><td><p> " + String.valueOf(pokemon[1].isEstado()) + "<p></td>");
            es.println("</tr>");
            es.println("</table>");

            es.println("</td><td></td><td></td><td></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td></td><td></td><td align =\"right\"><img src=\"MEDIA/pokemones/" + aux3 + ".png\" width=125 heigth=125></img></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>ID:</b></td width=25><td><p> " + String.valueOf(pokemon[2].getId()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>TIPO:</b></td width=25><td><p> " + String.valueOf(pokemon[2].getTipo()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>NOMBRE:</b></td width=25><td><p> " + String.valueOf(pokemon[2].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>VIDA:</b></td width=25><td><p> " + String.valueOf(pokemon[2].getVida()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>P.ATAQUE:</b></td width=25><td><p> " + String.valueOf(pokemon[2].getPuntosAtaque()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            //  es.println("<td><b>CAPTURADO:</b></td width=25><td><p> " + String.valueOf(pokemon[2].isCapturado()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            // es.println("<td><b>ESTADO:</b></td width=25><td><p> " + String.valueOf(pokemon[2].isEstado()) + "<p></td>");
            es.println("</tr>");
            es.println("</table>");

            es.println("</td><td></td><td></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td></td><td></td><td></td><td align =\"right\"><img src=\"MEDIA/pokemones/" + aux4 + ".png\" width=125 heigth=125></img></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>ID:</b></td width=25><td><p> " + String.valueOf(pokemon[3].getId()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>TIPO:</b></td width=25><td><p> " + String.valueOf(pokemon[3].getTipo()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>NOMBRE:</b></td width=25><td><p> " + String.valueOf(pokemon[3].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>VIDA:</b></td width=25><td><p> " + String.valueOf(pokemon[3].getVida()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>P.ATAQUE:</b></td width=25><td><p> " + String.valueOf(pokemon[3].getPuntosAtaque()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            //   es.println("<td><b>CAPTURADO:</b></td width=25><td><p> " + String.valueOf(pokemon[3].isCapturado()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            //   es.println("<td><b>ESTADO:</b></td width=25><td><p> " + String.valueOf(pokemon[3].isEstado()) + "<p></td>");
            es.println("</tr>");
            es.println("</table>");

            es.println("</td><td></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td></td><td></td><td></td><td></td><td align =\"right\"><img src=\"MEDIA/pokemones/" + aux5 + ".png\" width=125 heigth=125></img></td>");
            es.println("<td>");

            es.println("<table>");
            es.println("<tr>");
            es.println("<td><b>ID:</b></td width=25><td><p> " + String.valueOf(pokemon[4].getId()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>TIPO:</b></td width=25><td><p> " + String.valueOf(pokemon[4].getTipo()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>NOMBRE:</b></td width=25><td><p> " + String.valueOf(pokemon[4].getNombre()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>VIDA:</b></td width=25><td><p> " + String.valueOf(pokemon[4].getVida()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            es.println("<td><b>P.ATAQUE:</b></td width=25><td><p> " + String.valueOf(pokemon[4].getPuntosAtaque()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            //   es.println("<td><b>CAPTURADO:</b></td width=25><td><p> " + String.valueOf(pokemon[4].isCapturado()) + "<p></td>");
            es.println("</tr>");
            es.println("<tr>");
            //  es.println("<td><b>ESTADO:</b></td width=25><td><p> " + String.valueOf(pokemon[4].isEstado()) + "<p></td>");
            es.println("</tr>");
            es.println("</table>");

            es.println("</td>");
            es.println("</tr>");
            es.println("</table>");

            es.print("<img src=\"MEDIA/c.gif\" width=200 heigth=200 align =center  position=absolute  ></img></center>");
            es.println("<br>");
            es.println("<br>");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy 'a las' hh:mm a ");
            ZonedDateTime datetime = ZonedDateTime.now();
            String fullForm = datetime.format(formatter);
            es.println("<b>El reporte se genero el: \t</b><p>" + fullForm + "</p>");

            es.println("</body>");
            es.println("</HTML>");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }//TERMINA REPORTE TOP COMIDAS

    static void POKEMONSALVAJE() {

        FileWriter fichero = null;
        PrintWriter es = null;
        try {
            fichero = new FileWriter("REPORTES\\REPORTE POKEMONES SALVAJES.html");
            es = new PrintWriter(fichero);

            es.println("<HTML>");
            es.println("<title> REPORTE POKEMON SALVAJE </title>");
            es.println("<body bgcolor=black>");

            //CSS------------------------------------------------------         
            es.println("<style type=\"text/css\">");
            es.println("h1 { color: red; size: 13; background-color: white; font-family: Tahoma; }");
            es.println("h2 { color:#22E999; size: 13;  font-family: Tahoma; }");
            es.println("b {color:yellow; size: 17; justify; font-family:Consolas; }");
            es.println("p {color:white ; size: 15; justify; font-family:Consolas; }");
            es.println(" td {align=\"center\"}");
            es.println("</style>");

            //INICIO DE CODIGO-----------------------------------------
            es.println("<embed src=\"MEDIA/A.mp3\"  align=\"absmiddle\" autostart=\"true\" loop=\"true\"  hidden=\"true\" volume=\"50\"></embed>");
            //es.println("<marquee >");
            es.println("<center><img src=\"MEDIA/salvajes.gif\" width=1200 heigth=1200></img></center>");
            // es.println("</marquee>");
            es.println("<br>");
            es.println("<br>");
            es.println("<br>");

            es.println(" <center> ");
            es.println(" <table> ");

            int aux;
            for (int i = 0; i < pokemon.length; i++) {
                if (pokemon[i] != null) {
                    if (pokemon[i].isCapturado() == false) {
                        aux = pokemon[i].getId();
                        es.println("<th><h2>POKEMON</h2></th>");
                        es.println("<th><h2>DATOS</h2></th>");
                        es.println(" <tr> ");

                        es.println("<td><img src=\"MEDIA/pokemones/" + aux + ".png\" width=125 heigth=125></img></td>");
                        es.println("<td>");

                        es.println("<table>");
                        es.println("<tr>");
                        es.println("<td><b>ID:</b></td width=25><td><p> " + String.valueOf(pokemon[i].getId()) + "<p></td>");
                        es.println("</tr>");
                        es.println("<tr>");
                        es.println("<td><b>TIPO:</b></td width=25><td><p> " + String.valueOf(pokemon[i].getTipo()) + "<p></td>");
                        es.println("</tr>");
                        es.println("<tr>");
                        es.println("<td><b>NOMBRE:</b></td width=25><td><p> " + String.valueOf(pokemon[i].getNombre()) + "<p></td>");
                        es.println("</tr>");
                        es.println("<tr>");
                        es.println("<td><b>VIDA:</b></td width=25><td><p> " + String.valueOf(pokemon[i].getVida()) + "<p></td>");
                        es.println("</tr>");
                        es.println("<tr>");
                        es.println("<td><b>P.ATAQUE:</b></td width=25><td><p> " + String.valueOf(pokemon[i].getPuntosAtaque()) + "<p></td>");
                        es.println("</tr>");
                        es.println("<tr>");
                        es.println("<td><b>CAPTURADO:</b></td width=25><td><p> " + String.valueOf(pokemon[i].isCapturado()) + "<p></td>");
                        es.println("</tr>");
                        es.println("<tr>");
                        es.println("<td><b>ESTADO:</b></td width=25><td><p> " + String.valueOf(pokemon[i].isEstado()) + "<p></td>");
                        es.println("</tr>");
                        es.println("</table>");

                        es.println("<td>");
                        es.println("<tr>");
                        es.println("</tr>");
                        es.println(" </tr> ");

                    }
                }
            }

            es.println(" </table> ");
            es.println(" </center> ");

            es.println("<br>");
            es.println("<br>");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy 'a las' hh:mm a ");
            ZonedDateTime datetime = ZonedDateTime.now();
            String fullForm = datetime.format(formatter);
            es.println("<b>El reporte se genero el: \t</b><p>" + fullForm + "</p>");

            es.println("</body>");
            es.println("</HTML>");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }//TERMINA REPORTE TOP COMIDAS

    static void COMIDAASIGNADA() {

        FileWriter fichero = null;
        PrintWriter es = null;
        try {
            fichero = new FileWriter("REPORTES\\REPORTE COMIDA ASIGNADA.html");
            es = new PrintWriter(fichero);

            es.println("<HTML>");
            es.println("<title> REPORTE COMIDA ASIGNADA </title>");
            es.println("<body bgcolor=white>");

            //CSS------------------------------------------------------         
            es.println("<style type=\"text/css\">");
            es.println("h1 { color: red; size: 13; background-color: white; font-family: Tahoma; }");
            es.println("h2 { color:#22E999; size: 13; background-color: white; font-family: Tahoma; }");
            es.println("b {color:black; size: 17; justify; font-family:Consolas; }");
            es.println("p {color:8D9C96 ; size: 15; justify; font-family:Consolas; }");
            es.println(" td {align=\"center\"}");
            es.println("</style>");

            //INICIO DE CODIGO-----------------------------------------
            es.println("<embed src=\"MEDIA/A.mp3\"  align=\"absmiddle\" autostart=\"true\" loop=\"true\"  hidden=\"true\" volume=\"50\"></embed>");
            //es.println("<marquee >");
            es.println("<center><img src=\"MEDIA/ASIGNADA.gif\" width=1200 heigth=1200></img></center>");
            // es.println("</marquee>");
            es.println("<br>");
            es.println("<br>");
            es.println("<br>");

            es.println(" <center> ");
            es.println(" <table> ");

            File archivo = new File(ruta);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            String filas;
            String[] Datos = new String[2];

            filas = br.readLine();

            //PROCESO PARA ASIGNAR COMIDA AL POKEMON 
            while ((filas = br.readLine()) != null) {
                //el arreglo de datos va a relizar la lectura separadas por una coma
                Datos = filas.split(",");
                //Declaro las variables que van a realizar la conversion de los datos segun la posicon de datos
                int ID_COMIDA = Integer.parseInt(Datos[0]);
                int ID_POKEMON = Integer.parseInt(Datos[1]);

                double aux1;
                double aux2;
                double vida;

                for (int i = 0; i < pokemon.length; i++) {
                    if (pokemon[i].getId() == ID_POKEMON) {

                        for (int j = 0; j < Comida.length; j++) {
                            if (Comida[j].getId() == ID_COMIDA) {
                                aux1 = pokemon[i].getVida();
                                aux2 = Comida[j].getVida();
                                vida = aux1 + aux2;

                                pokemon[i].setVida(vida);

                                es.println("<th><h2>COMIDA<h2></th>");
                                es.println("<th><h2>POKEMON</h2></th>");
                                es.println("<th><h2>DATOS</h2></th>");
                                es.println(" </tr> ");
                                es.println(" <tr> ");

                                es.println("<td>");
                                es.println("<table>");
                                es.println("<tr>");
                                es.println("<td><b>ID DE COMIDA ASIGNADA:</b></td width=25><td><p> " + String.valueOf(ID_COMIDA) + "<p></td>");
                                es.println("</tr>");
                                es.println("<tr>");
                                es.println("<td><b>NOMBRE:</b></td width=25><td><p> " + String.valueOf(Comida[j].getNombre()) + "<p></td>");
                                es.println("</tr>");
                                es.println("<tr>");
                                es.println("<td><b>VIDA QUE OTORGA:</b></td width=25><td><p> " + String.valueOf(Comida[j].getVida()) + "<p></td>");
                                es.println("</tr>");
                                es.println("</table>");
                                es.println("</td>");

                                es.println("<td><center><img src=\"MEDIA/pokemones/" + ID_POKEMON + ".png\" width=125 heigth=125></img></center></td>");

                                es.println("<td>");
                                es.println("<table>");
                                es.println("<tr>");
                                es.println("<td><b>ID POKEMON ASIGNADO:</b></td width=25><td><p> " + String.valueOf(ID_POKEMON) + "<p></td>");
                                es.println("</tr>");
                                es.println("<tr>");
                                es.println("<td><b>TIPO:</b></td width=25><td><p> " + String.valueOf(pokemon[i].getTipo()) + "<p></td>");
                                es.println("</tr>");
                                es.println("<tr>");
                                es.println("<td><b>NOMBRE:</b></td width=25><td><p> " + String.valueOf(pokemon[i].getNombre()) + "<p></td>");
                                es.println("</tr>");
                                es.println("<tr>");
                                es.println("<td><b>VIDA ANTES DE ALIMENTAR:</b></td width=25><td><p> " + String.valueOf(aux1) + "<p></td>");
                                es.println("</tr>");
                                es.println("<tr>");
                                es.println("<td><b>VIDA LUEGO DE ALIMENTAR:</b></td width=25><td><p> " + String.valueOf(pokemon[i].getVida()) + "<p></td>");
                                es.println("</tr>");
                                es.println("</table>");
                                es.println("</td>");

                                es.println(" </tr> ");

                            }
                        }
                    }
                }
            }

            es.println(" </table> ");
            es.println(" </center> ");
            es.println("<br>");
            es.println("<br>");

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy 'a las' hh:mm a ");
            ZonedDateTime datetime = ZonedDateTime.now();
            String fullForm = datetime.format(formatter);
            es.println("<b>El reporte se genero el: \t</b><p>" + fullForm + "</p>");

            es.println("</body>");
            es.println("</HTML>");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }//TERMINA REPORTE TOP COMIDAS
    
    static void PELEA() {

        FileWriter fichero = null;
        PrintWriter es = null;
        try {
            fichero = new FileWriter("REPORTES\\REPORTE PELEA.html");
            es = new PrintWriter(fichero);

            es.println("<HTML>");
            es.println("<title> REPORTE POKEMON SALVAJE </title>");
            es.println("<body bgcolor=black>");

            //CSS------------------------------------------------------         
            es.println("<style type=\"text/css\">");
            es.println("h1 { color: red; size: 13; background-color: white; font-family: Tahoma; }");
            es.println("h2 { color:#22E999; size: 13;  font-family: Tahoma; }");
            es.println("b {color:yellow; size: 17; justify; font-family:Consolas; }");
            es.println("p {color:white ; size: 15; justify; font-family:Consolas; }");
            es.println(" td {align=\"center\"}");
            es.println("</style>");

            //INICIO DE CODIGO-----------------------------------------
            es.println("<embed src=\"MEDIA/A.mp3\"  align=\"absmiddle\" autostart=\"true\" loop=\"true\"  hidden=\"true\" volume=\"50\"></embed>");
            //es.println("<marquee >");
            es.println("<center><img src=\"MEDIA/PELEA.gif\" width=1200 heigth=1200></img></center>");
            // es.println("</marquee>");
            

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy 'a las' hh:mm a ");
            ZonedDateTime datetime = ZonedDateTime.now();
            String fullForm = datetime.format(formatter);
            es.println("<b>El reporte se genero el: \t</b><p>" + fullForm + "</p>");

            es.println("</body>");
            es.println("</HTML>");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }//TERMINA REPORTE TOP COMIDAS
    
    static void ENTRENADORES() {

        FileWriter fichero = null;
        PrintWriter es = null;
        try {
            fichero = new FileWriter("REPORTES\\REPORTE ENTRENADORES.html");
            es = new PrintWriter(fichero);

            es.println("<HTML>");
            es.println("<title> REPORTE POKEMON SALVAJE </title>");
            es.println("<body bgcolor=black>");

            //CSS------------------------------------------------------         
            es.println("<style type=\"text/css\">");
            es.println("h1 { color: red; size: 13; background-color: white; font-family: Tahoma; }");
            es.println("h2 { color:#22E999; size: 13;  font-family: Tahoma; }");
            es.println("b {color:yellow; size: 17; justify; font-family:Consolas; }");
            es.println("p {color:white ; size: 15; justify; font-family:Consolas; }");
            es.println(" td {align=\"center\"}");
            es.println("</style>");

            //INICIO DE CODIGO-----------------------------------------
            es.println("<embed src=\"MEDIA/A.mp3\"  align=\"absmiddle\" autostart=\"true\" loop=\"true\"  hidden=\"true\" volume=\"50\"></embed>");
            //es.println("<marquee >");
            es.println("<center><img src=\"MEDIA/E.gif\" width=1200 heigth=1200></img></center>");
            // es.println("</marquee>");
            

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy 'a las' hh:mm a ");
            ZonedDateTime datetime = ZonedDateTime.now();
            String fullForm = datetime.format(formatter);
            es.println("<b>El reporte se genero el: \t</b><p>" + fullForm + "</p>");

            es.println("</body>");
            es.println("</HTML>");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }//TERMINA REPORTE TOP COMIDAS

}
