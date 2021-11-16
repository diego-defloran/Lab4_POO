
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
		opcion = vista.Opcion();
		if (opcion == 1){
		while (opcion == 1 ){
			

		
		
		
			System.out.println("\nElija el modo a activar.\n1.Modo Radio. \n2.Modo Reproduccion. \n3.Modo Telefono");
			int modo = vista.opcion();
			
			if (modo == 1){

			}

			else if (modo == 2){

			}

			else if (modo ==3){
				System.out.println("\nMODO TELEFONO ACTIVADO");
				radio.mt.MostrarMetodos();
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
				else {
					System.out.print("Elije una opción válida, y concentrado que vas manejando");
				}
				
			}

			else if (modo == 4){

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

