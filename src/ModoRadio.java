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
		
		
	}

}
