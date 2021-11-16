import java.util.ArrayList;
public class PlayList {
	private String nombre = "MixTape - 80's & Perreo";
	private ArrayList<String> Canciones1;
	
	public PlayList() {
		Canciones1 = new ArrayList<>();
		Canciones1.add("I Want to Know What Love Is - 1999 Remastered / Foreigner");
		Canciones1.add("Last Train to London / Electric Light Orchestra");
		Canciones1.add("Hold the Line / TOTO");
		Canciones1.add("Caribbean Queen (No More Love On the Run) / Billy Ocean");
		Canciones1.add("Le Freak / CHIC");
		Canciones1.add("(I Just) Died In Your Arms / Cutting Crew");
		Canciones1.add("Como Antes / Yandel");
		Canciones1.add("Safari / J Balvin");
		Canciones1.add("Ella Me Levanto / Daddy Yankee");
		Canciones1.add("Rakata / Wisin & Yandel");
		Canciones1.add("Llamado de Emergencia / Daddy Yankee");	
	}
	
	public ArrayList<String> getPlayList(){
		return this.Canciones1;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void MostrarCanciones() {
		for (int e = 0; Canciones1.size() >0; e++) {
			System.out.println(Canciones1.get(e));
		}
	}
}
