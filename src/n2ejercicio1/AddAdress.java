package n2ejercicio1;

public class AddAdress implements ServicioFactory {

	@Override
	public Instancia crearInstancia() {
		Adress adress=new Adress(Entrada.leerString("Introduzca su direccion (ej. c:calleejemplo 22)"),
				Entrada.leerString("Introduzca su Ciudad"),Entrada.leerString("País"));	
		return adress;
	}

}
