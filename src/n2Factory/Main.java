package fabrica;

import java.util.HashMap;

public class Main {
	static HashMap<Phone, Adress> agenda = new HashMap<Phone, Adress>();

	public static void main(String[] args) {

		int decision = 0;
		do {
			decision = Entrada.leerInt("1. Consultar Agenda \n 2.Añadir dirección \n 0.salir");
			switch (decision) {
			case 1:
				agenda.entrySet().forEach(n ->{
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
		String pais = Entrada.leerString("Introduzca su nacionalidad: German, Italian, Spanish");
		Phone p = FabricaDeAdressYPhones.createPhone(pais);
		Adress a = FabricaDeAdressYPhones.createAdress(pais);
		agenda.put(p, a);
		
		
	}

}
