
/*
 * @author Diego De Flor�n
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
			

		
		
		
			System.out.println("\nElija el modo a activar.\n1.Modo Radio. \n2.Modo Reproduccion. \n3.Modo Telefono \n4. Modo Productividad");
			int modo = vista.opcion();
			
			if (modo == 1){

			}

			else if (modo == 2){

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
					System.out.print("\nElije una opción válida, y concentrado que vas manejando");
				}
				
			}

			else if (modo == 4){

				System.out.println("\nMODO PRODUCTIVIDAD ACTIVADO");
				int eleccion;
				if (Modelo.equals("A")){
					System.out.print("\nModo A, presiona 1 para ver la tarjeta de presentacion");
					eleccion = vista.opcion();
					A a = new A();
					
					a.TarjetaPresentacion();;
				}

				else if (Modelo.equals("S")){
					System.out.print("\nModo s, presiona 1 para planificar vacaciones");
					 eleccion = vista.opcion();
					S s = new S();
					
					s.Planificcar();
				}

				else if (Modelo.equals("C")){
					System.out.print("\nModo C, presiona 1 para ver la prediccion del clima");
					eleccion = vista.opcion();
					C c = new C();
					c.PronosticoClima();
				}

			}

			else {
				System.out.println("ELIJA UNA OPCION VALIDA (Perdón por gritar)");
			}
			
		}
	}
	
		else if (opcion == 2) {
			
		}
		
		else if (opcion == 3) {
			System.out.println("Gracias por utilizar el Simulador Virtual de Radios de MERCEDES-BENZ");
			System.exit(0);
		}
	}

}

