import java.util.ArrayList;

public class ModoRadio {
	private String Frecuencia = "FM";
	private ArrayList<Double> EmisorasGuardadas = new ArrayList<>();
	private double Emisora; 
	
	public String getFrecuencia() {
		return this.Frecuencia;
		
	}
	
	public void setFrecencia() {
		this.Frecuencia = "AM";
	}
	
	public void cambiarEmisora() {
		Emisora = Emisora + 0.5;
	}
	
	public double getEmisora() {
		return this.Emisora;
	}
	
	public void GuardarEmisora() {
		if (EmisorasGuardadas.size() > 0 || EmisorasGuardadas.size() < 50) {
			EmisorasGuardadas.add(this.Emisora);
			System.out.println("LISTADO");
			for (int e = 0; EmisorasGuardadas.size() > e; e++) {
				System.out.println(EmisorasGuardadas.get(e));
			}
		}
		else if (EmisorasGuardadas.isEmpty() == true) {
			System.out.println("AGREGUE EMISORAS!");
		}
		else if (EmisorasGuardadas.size() == 50 ) {
			System.out.println("HA ALCANZADO LA CAPACIDAD MÁXIMA. TIENE 50 EMISORAS GUARDADAS!");
		}
	}
	
	public void CargarEmisora() {
		for (int e = 0; EmisorasGuardadas.size() > e; e++) {
			System.out.println(EmisorasGuardadas.get(e));
		}
		Vista vista = new Vista();
		System.out.println("Ingrese la posicion de la lista con la emisora que desea reproducir, iniciando desde 0.\n");
		int eleccion = vista.opcion();
		System.out.println("Ha seleccionado: " + EmisorasGuardadas.get(eleccion) + "en posicion: " + EmisorasGuardadas.indexOf(eleccion));
		if (eleccion > EmisorasGuardadas.size()) {
			System.out.println("Ingrese una opcion valida!");
			CargarEmisora();
		}
	}
		
	    public void MostrarMetodos(){
	        
	        System.out.println("\nMODO RADIO:\n");
	        System.out.println("1. Cambiar frecuencia\n ");
	        System.out.println("2. Guardar Emisora.\n ");
	        System.out.println("3. Cargar Emisora.\n ");
	        
	    }
		
}

