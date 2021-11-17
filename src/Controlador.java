
/*
 * @author Diego De Florï¿½n
 * @author Javier Rucal
 */
public class Controlador {
	/*
	 * @args String[] args
	 */
	public static void main(String[] args) {
		Radio radio = new Radio();
		Vista vista = new Vista();
		int opcion = 0;
		vista.MensajeBienvenida();
		vista.Menu();
		String Modelo = "";
		opcion = vista.Opcion();
		if (opcion == 1){
			System.out.println("\nElija la clase de modelo (A, S, C):");
			String error = vista.IngresoString();
			Modelo = vista.IngresoString();
			
			

		while (opcion == 1 ){
			

		
		
		
			System.out.println("\nElija el modo a activar.\n 1.Modo Radio. \n 2.Modo Reproduccion. \n 3.Modo Telefono \n 4. Modo Productividad\n 5. Salir");
			int modo = vista.opcion();
			
			if (modo == 1){
				System.out.println("\nMODO RADIO ACTIVADO");
				System.out.println("Volumen actual: " + radio.getVolumen());
				System.out.println("Desea cambiar el volumen?\n 1. Sí\n 2. No");
				int vol = vista.opcion();
				if (vol == 1) {
					radio.setVolumen();
					System.out.println(radio.getVolumen());
					radio.modoRadio.MostrarMetodos();
				}
				else if (vol ==2) {
					radio.modoRadio.MostrarMetodos();
				}
				int eleccion = vista.opcion();
				if (eleccion == 1) {
					System.out.println("Emisora anterior: " + radio.modoRadio.getEmisora() + " Hz " + radio.modoRadio.getFrecuencia());
					radio.modoRadio.cambiarEmisora();
					System.out.println("Nueva emisora: " + radio.modoRadio.getEmisora() + " Hz " + radio.modoRadio.getFrecuencia());
				}
				else if (eleccion == 2) {
					radio.modoRadio.GuardarEmisora();
					
				}
				
				else if(eleccion ==3) {
					radio.modoRadio.CargarEmisora();
				}
				
			}

			else if (modo == 2){
				System.out.println("\nMODO REPRODUCCION ACTIVADO");
				radio.modoReproduccion.MostrarMetodos();
				int eleccion = vista.opcion();
				if (eleccion ==1) {
					System.out.println("PlayList: " + radio.modoReproduccion.getNombre());
					System.out.println("Cancion / Artista");
					radio.modoReproduccion.getPlayList();
				}
				else if(eleccion ==2) {
					System.out.println(radio.modoReproduccion.getNombre());
					radio.modoReproduccion.CambiarCancion();
				}
				else if(eleccion ==3) {
					radio.modoReproduccion.EscucharCancion();
					
				}
				
			}

			else if (modo ==3){
				System.out.println("\nMODO TELEFONO ACTIVADO");
				radio.mt.MostrarMetodos(Modelo);
				
				
				int eleccion = vista.opcion();
				if (eleccion == 1){
					radio.mt.Conectar_Desconectar();

				}
				else if (eleccion == 2){
					radio.mt.MostrarContactos();
				}
				else if (eleccion == 3){
					radio.mt.LlamarContacto();
				}
				else if (eleccion == 4){
					radio.mt.TerminarLlamada();
				}
				else if ((eleccion == 5) & (Modelo.equals("A"))){
					A a = new A();
					
					a.UltimoContacto();
				}

				else if ((eleccion == 5) & (Modelo.equals("S"))){
					S s = new S();
					
					s.CambiarBocinas();
				}

				else if ((eleccion == 5) & (Modelo.equals("C"))){
					C c = new C();
					c.LlamadaEspera();
				}
				
				else {
					System.out.print("\nElije una opciÃ³n vÃ¡lida, y concentrado que vas manejando");
				}
				
			}

			else if (modo == 4){

				System.out.println("\nMODO PRODUCTIVIDAD ACTIVADO");
				int eleccion;
				if (Modelo.equals("A")){
					System.out.print("\nModo A, presiona 1 para ver la tarjeta de presentacion\n");
					eleccion = vista.opcion();
					A a = new A();
					
					a.TarjetaPresentacion();;
				}

				else if (Modelo.equals("S")){
					System.out.print("\nModo s, presiona 1 para planificar vacaciones\n");
					 eleccion = vista.opcion();
					S s = new S();
					
					s.Planificcar();
				}

				else if (Modelo.equals("C")){
					System.out.print("\nModo C, presiona 1 para ver la prediccion del clima\n");
					eleccion = vista.opcion();
					C c = new C();
					c.PronosticoClima();
				}

			}
			
			else if (modo == 5) {
				System.out.println("Gracias por utilizar el Simulador Virtual de Radios de MERCEDES-BENZ");
				System.exit(0);
			}

			else {
				System.out.println("ELIJA UNA OPCION VALIDA (PerdÃ³n por gritar)");
			}
			
		}
	}
	
		else if (opcion == 2) {
			System.out.println("RADIO APAGADA! Ya no podrá escuchar buen requesón...");
		}
		
		else if (opcion == 3) {
			System.out.println("Gracias por utilizar el Simulador Virtual de Radios de MERCEDES-BENZ");
			System.exit(0);
		}
	}

}

