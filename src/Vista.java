import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
	Scanner scan = new Scanner(System.in);
	String mensaje;
	int opcion;
	String a;
	
	public void MensajeBienvenida() {
		this.mensaje = "  |----------------------------------------------------------------|\r\n"
				+ "  |============================,--\"\"--.============================|\r\n"
				+ "  |==========================,'   ::   `.==========================|\r\n"
				+ "  |=========================/     ::     \\=========================|\r\n"
				+ "  |========================:      ::      :========================|\r\n"
				+ "  |=======================:       ::       :=======================|\r\n"
				+ "  |=======================|      .::.      |=======================|\r\n"
				+ "  |=======================:    .:'  `:.    :=======================|\r\n"
				+ "  |========================: .:'      `:. :========================|\r\n"
				+ "  |=========================\\            /=========================|\r\n"
				+ "  |==========================`.        ,'==========================|\r\n"
				+ "  |============================`--..--'============================|\r\n"
				+ "  |----------------------------------------------------------------|\n"
				+ "Bienvenido al Simulador Virtual de Radios de MERCEDEZ-BENZ" ; 
		System.out.println(this.mensaje);
	}
	
	public int Opcion() {
		boolean flag = false;
		int opcion=0;
		while (flag==false){
			try{
				opcion = scan.nextInt();
			} catch (InputMismatchException ex){
				System.out.println("Debe ingresar un numero entero");
				Menu();
				scan.next();
				continue;
			}
			if (opcion==1 || opcion==2 || opcion ==3){
				flag=true;
			} else {
				System.out.println("OPCION INCORRECTA");
			}
		}
		return opcion;
		}
	
	public void Menu() {
		System.out.println(" Que desea realizar?\n" + "1. Encender Radio\n"+"2. Apagar Radio\n" + "3. Salir");
	}
	
	public String IngresoString() {
		a = scan.nextLine();
		return this.a;
		
	}
	
	}
