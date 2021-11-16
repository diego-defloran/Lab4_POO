
public abstract class Radio {
	protected boolean encendido = false;
	protected int volumen;
	protected ModoRadio modoRadio = new ModoRadio();
	protected ModoReproduccion modoReproduccion = new ModoReproduccion();
	
	
	public boolean getEncendido() {
		return encendido;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setVolumen() {
		Vista vista = new Vista();
		System.out.println("Si desea subir el volumen, introduzca: Subir\nSi desea bajar el volumen, introduzca: Bajar\n");
		String s = vista.IngresoString();
		if (s.equals("Subir")){	
			this.volumen = volumen + 1;
		}
		else if(s.equals("Bajar")) {
			this.volumen = volumen - 1;
		}
		
		else if(s.equals("") || !s.equals("Subir") || !s.equals("Bajar")) {
			setVolumen();
		}
	}
	
	public void setEncendido() {
		this.encendido = true;
	}
}
