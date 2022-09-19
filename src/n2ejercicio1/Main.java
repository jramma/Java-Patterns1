package n2ejercicio1;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		int decision = 0;
		HashMap<Phone, Adress> agenda = new HashMap<Phone, Adress>();

		do {
			decision = preguntarConsulta();
			System.out.println("\n");
			switch(decision) {
			case 1:
				usarAgenda(new NuevaInstancia());
				break;
			case 2:
				usarAgenda(new ConsultarAgenda());
				break;
			case 0:
				System.out.println("bye");
			}
		} while (decision != 0);

	}

	private static int preguntarConsulta() {
		System.out.println("----------------------------------------");
		return Entrada.leerInt("0.Salir \n " + "\n 1. Añadir teléfono y dirección." + " \n 2.Consultar agenda.");
	}

}
