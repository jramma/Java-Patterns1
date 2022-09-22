package fabrica;

public class FabricaDeAdressYPhones {
	

	public static Adress createAdress(String tipo) {
		Adress adress = null;
			switch (tipo) {
			case "German":
				adress = new GermanAdress();
				break;
			case "Spanish":
				adress = new SpanishAdress();
				break;
			case "Italian":
				adress = new ItalianAdress();
			default:
				System.out.println("Tipos adress: Italy, Spain, Germany");
			}
		
		return adress;

	}
	

	public static Phone createPhone(String tipo) {
		Phone phone = null;
			switch (tipo) {
			case "German":
				phone = new GermanPhone();
				break;
			case "Spanish":
				phone = new SpanishPhone();
				break;
			case "Italian":
				phone = new ItalianPhone();
			default:
				System.out.println("Tipos adress: Italy, Spain, Germany");
			}
		return phone;

	}
}

