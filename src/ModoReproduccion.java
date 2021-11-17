import java.util.ArrayList;

public class ModoReproduccion {
	private ArrayList<String> PlayLists = new ArrayList<>();
	PlayList playlist1 = new PlayList();
	Vista vista = new Vista();
	int e;
	public void getPlayList(){
		playlist1.MostrarCanciones();
	}
	
	public String getNombre() {
		String nombre = playlist1.getNombre();
		return nombre;
	}
	public void CambiarCancion() {
		getPlayList();
		System.out.println("Cambiando a: " + playlist1.getPlayList().get(e++));
	
	}
	public void EscucharCancion() {
		System.out.println("Reproduciendo: " + playlist1.getPlayList().get(e));	
		}
	
    public void MostrarMetodos(){
        System.out.println("\nMODO REPRODUCCION:\n");
        System.out.println("1. Seleccionar PlayList\n ");
        System.out.println("2. Cambiar Cancion.\n ");
        System.out.println("3. Escuchar Cancion.\n ");
    }
}
	
	
	
