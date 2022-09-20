package n2AbstractFactory;

public class GermanAdress implements InstanciaDeAgenda {

	@Override
	public Phone createPhone() {
		Phone phone = new Phone( 49, Entrada.leerInt("Introduce el telefono"));
		return phone;
	}

	@Override
	public Adress createAdress() {
		Adress adress = new Adress("Germany",Entrada.leerString("Introduce la ciudad:"),Entrada.leerString("Introduzca la calle:"),Entrada.leerInt("Introcude el codigo postal:"));
		return adress;
	}



}
