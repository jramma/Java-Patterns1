package n2ejercicio1;

public class Phone implements Instancia {
	private int prefix;
	private int number;

	public Phone(int prefix, int number) {
		this.prefix = prefix;
		this.number = number;
	}

	public int getPrefix() {
		return prefix;
	}

	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public Phone writePhone() {
		Phone phone = new Phone(getPrefix(),getNumber());
			System.out.println("El telefono "+ getPrefix()+getNumber()+ "ha sido añadido");	
		return phone;
	}

	@Override
	public Adress writeAdress() {
		Adress adress1=new Adress(Entrada.leerString("Introduzca su direccion (ej. c:calleejemplo 22)"),
				Entrada.leerString("Introduzca su Ciudad"), Entrada.leerString("Introduzca su país"));	
		return adress1;
	}
}
