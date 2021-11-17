import java.util.ArrayList;

public class A implements TipoA {
    public void UltimoContacto(){
       
                
        String NombreLlamar = "Kevin Lopez";
        String NumerLlamar = "748q5485";
          
        String llamando = "    __    __    ___    __  ______    _   ______  ____ \n" +
"   / /   / /   /   |  /  |/  /   |  / | / / __ \\/ __ \\\n" +
"  / /   / /   / /| | / /|_/ / /| | /  |/ / / / / / / /\n" +
" / /___/ /___/ ___ |/ /  / / ___ |/ /|  / /_/ / /_/ / \n" +
"/_____/_____/_/  |_/_/  /_/_/  |_/_/ |_/_____/\\____/  \n" +
"                                                      ";
        String llamada = llamando + "\n\nNombre: " + NombreLlamar + "\nNumero: " + NumerLlamar ;
        System.out.println(llamada);
        
            
       }
    

    public void TarjetaPresentacion(){
        System.out.println("\nMostrando tarjeta:\n\n");
        String tarjeta = " w*W*W*W*w\n" +
        "         \\\".\".\"/\n" +
        "          //`\\\\\n" +
        "         (/a a\\)\n" +
        "         (\\_-_/) \n" +
        "        .-~'='~-.\n" +
        "       /`~`\"Y\"`~`\\\n" +
        "      / /(_ * _)\\ \\\n" +
        "     / /  )   (  \\ \\\n" +
        "     \\ \\_/\\\\_//\\_/ / ";
        System.out.println(tarjeta);
    }
}
