package n2ejercicio1;

public class AddPhone implements ServicioFactory {

	@Override
	public Instancia crearInstancia() {
		Phone phone = new Phone
				(Entrada.leerInt("introduzca el prefijo de su pais"),
				Entrada.leerInt("Introduzca su n�mero de tel�fono"));
			System.out.println("El telefono "+ phone+ "ha sido a�adido");
		
		return phone;
	}

}
