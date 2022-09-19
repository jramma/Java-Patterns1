package n2ejercicio1;

import java.util.HashMap;

public class Main {
	static HashMap<Phone, Adress> agenda = new HashMap<Phone, Adress>();

	public static void main(String[] args) {
		int decision = 0;

		do {
			decision = preguntarConsulta();
			System.out.println("\n");
			switch (decision) {
			case 1:
				usarAgenda(new AddPhone());
				break;
			case 2:
				usarAgenda(new AddAdress());
				break;
			case 3:
				System.out.println(agenda.toString().replace("]", "\n"));
				break;
			case 0:
				System.out.println("bye");
				default:
					System.out.println("Introduciste un numero incorrecto");
			}
		} while (decision != 0);

	}

	private static void usarAgenda(ServicioFactory factory) {
		Instancia instancia = factory.crearInstancia();
		agenda.put(instancia.writePhone(), instancia.writeAdress());

	}

	private static int preguntarConsulta() {
		System.out.println("----------------------------------------");
		return Entrada.leerInt("0.Salir" + "\n Puede introducir algo en la agenda según:"
				+ "\n 1. Introducir primero telefono." + " \n 2.Introducir primero direcion."
				+ "\n 3.consultar agenda.");
	}

}
