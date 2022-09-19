package n2ejercicio1;

public class AddPhone implements ServicioFactory {

	@Override
	public Instancia crearInstancia() {
		Phone phone = new Phone
				(Entrada.leerInt("introduzca el prefijo de su pais"),
				Entrada.leerInt("Introduzca su número de teléfono"));
			System.out.println("El telefono "+ phone+ "ha sido añadido");
		
		return phone;
	}

}
