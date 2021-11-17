
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javie
 */
public class ModoTelefono {
    
    ArrayList<String> Kevin = new ArrayList<>(Arrays.asList("Kevin Lopez", "3435437", "kevs@gmail.com"));
    ArrayList<String> FreddyMercury = new ArrayList<>(Arrays.asList("Freddy Mercury", "41506127", "eeeeo@gmail.com"));
    ArrayList<String> WalterWhite = new ArrayList<>(Arrays.asList("Walter White A.K.A Heissenberg", "534545", "JESSIE_NECESITAMOS_MAS_METILAMINA@gmail.com"));
    ArrayList<String> Cazafantasmas = new ArrayList<>(Arrays.asList("Cazafantasmas S.A", "666666", "whoYouGonnaCall@gmail.com"));
    ArrayList<String> Gordon = new ArrayList<>(Arrays.asList("Gordon Ramsey", "6341324", "AreYouAStupidSandwich@gmail.com"));
    ArrayList<ArrayList<String>> Contactos = new ArrayList<>(Arrays.asList(Kevin, FreddyMercury, WalterWhite, Cazafantasmas, Gordon));
    boolean conectado = false;
    boolean enLlamada = false;
    String UltimoContacto = "";
    Scanner scanner = new Scanner(System.in);
    
    public void Conectar_Desconectar(){
        if (conectado== true){
             while (conectado == true){
           System.out.println("\nEstatus actual: CONECTADO"); 
           System.out.println("\nIngrese 1 para desconectar o 2 para salir."); 
           int opcion = scanner.nextInt();
           if (opcion == 1){
               System.out.println("El telefono ha sido desconectado exitosamente.");
               conectado = false;
           }
           else if( opcion ==2){
               break;
           }
        }
        }
        else {
             while (conectado == false){
           System.out.println("\nEstatus actual: DESCONECTADO"); 
           System.out.println("\nIngrese 1 para conectar o 2 para salir."); 
           int opcion = scanner.nextInt();
           if (opcion == 1){
               System.out.println("El telefono ha sido conectado exitosamente.");
               conectado = true;
           }
           else if( opcion ==2){
               break;
           }
        }
        }
        
    }
    public void MostrarContactos(){
        String InfoContactos = "\nMOSTRANDO CONTACTOS:\n\n";
        for (int a = 0; a < Contactos.size(); a++){
            
            String nombre = Contactos.get(a).get(0);
            String numero = Contactos.get(a).get(1);
            String correo = Contactos.get(a).get(2);
            InfoContactos += (a+1) +". " +  nombre + "\n" + numero + "\n" + correo + "\n\n\n";
        }
        System.out.println(InfoContactos);
    }
    
    public void LlamarContacto(){
        if (enLlamada){
            System.out.println("\nEstas en una llamada, terminala para iniciar una nueva. Abusivo.");
        }
        else{
        System.out.println("\nELIGE EL CONTACTO PARA LLAMAR (NUMERO)\n");
        MostrarContactos();
        
        int a = scanner.nextInt();
        String NombreLlamar = Contactos.get(a-1).get(0);
        String NumerLlamar = Contactos.get(a-1).get(1);
          
        String llamando = "    __    __    ___    __  ______    _   ______  ____ \n" +
"   / /   / /   /   |  /  |/  /   |  / | / / __ \\/ __ \\\n" +
"  / /   / /   / /| | / /|_/ / /| | /  |/ / / / / / / /\n" +
" / /___/ /___/ ___ |/ /  / / ___ |/ /|  / /_/ / /_/ / \n" +
"/_____/_____/_/  |_/_/  /_/_/  |_/_/ |_/_____/\\____/  \n" +
"                                                      ";
        String llamada = llamando + "\n\nNombre: " + NombreLlamar + "\nNumero: " + NumerLlamar ;
        System.out.println(llamada);
        UltimoContacto = NombreLlamar;
        enLlamada = true;
        }
    }
    
    public void TerminarLlamada(){
        enLlamada = false;
        System.out.println("\nLlamada finalizada exitosamente.");
    }
    
    public void MostrarMetodos(){
        
        System.out.println("\nMODO TELEFONO:\n");
        System.out.println("1. Conectar/Desconectar telefono.\n ");
        System.out.println("2. Mostrar Contactos\n ");
        System.out.println("3. Llamar contacto.\n ");
        System.out.println("4. Finalizar llamada.\n ");
        
    }
    
}
