import java.util.ArrayList;

public class ModoReproduccion {
	private ArrayList<String> PlayLists = new ArrayList<>();
	PlayList playlist1 = new PlayList();
	Vista vista = new Vista();
	int e = 0;
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
}
	
	
	
