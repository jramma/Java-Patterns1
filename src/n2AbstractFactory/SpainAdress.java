package n2AbstractFactory;

public class SpainAdress implements InstanciaDeAgenda {

	@Override
	public Phone createPhone() {
		Phone phone = new Phone( 34, Entrada.leerInt("Introduce el telefono"));
		return phone;
	}

	@Override
	public Adress createAdress() {
		Adress adress = new Adress("Spain",Entrada.leerString("Introduce la ciudad:"),Entrada.leerString("Introduzca la calle:"),Entrada.leerInt("Introcude el codigo postal:"));
		return adress;
	}

}
