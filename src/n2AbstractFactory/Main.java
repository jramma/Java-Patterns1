package n2AbstractFactory;

import java.util.HashMap;

public class Main {
	static HashMap<Phone, Adress> agendaFinal = new HashMap<Phone, Adress>();

	public static void main(String[] args) {
		int decision = 0;
		do {
			decision = Entrada.leerInt("1. Consultar Agenda \n 2.Añadir dirección \n 0.salir");
			switch (decision) {
			case 1:
				agendaFinal.entrySet().forEach(n ->{
					System.out.println(n.getKey().toString()+" "+ n.getValue().toString());
				});
				
				break;
			case 2:
				addAdress();
				break;
			default:
				System.out.println("te has equivocado de número");

			}
		} while (decision != 0);
	}

	private static void addAdress() {
		String pais = Entrada.leerString("Write the country of the adress:");
	
		switch (pais.toLowerCase()) {
		case "spain":
			usarAgenda(new SpainAdress());
			break;
		case "germany":
			usarAgenda(new GermanAdress());
			break;
		case "italy":
			usarAgenda(new ItalianAdress());
			break;
		default:
			System.out.println("We don't have that country on data!");
		}
	}

	private static void usarAgenda(InstanciaDeAgenda factory) {
		Phone phone = factory.createPhone();
		Adress adress = factory.createAdress();
		agendaFinal.put(phone, adress);
	}

}
