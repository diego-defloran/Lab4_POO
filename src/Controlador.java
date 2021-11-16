

/*
 * @author Diego De Florán
 * @author Javier Rucal
 */
public class Controlador {
	/*
	 * @args String[] args
	 */
	public static void main(String[] args) {
		Vista vista = new Vista();
		int opcion;
		vista.MensajeBienvenida();
		vista.Menu();
		opcion = vista.Opcion();
	
		if (opcion == 1) {
			String a = vista.IngresoString();
			System.out.println(a);
		}
		
		else if (opcion == 2) {
			
		}
		
		else if (opcion == 3) {
			System.out.println("Gracias por utilizar el Simulador Virtual de Radios de MERCEDES-BENZ");
			System.exit(0);
		}

	}
}
