package n2ejercicio1;

public class Adress implements Instancia{
	private String adress;
	private String city;
	private String country;

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Adress(String adress, String city, String country) {
		this.adress = adress;
		this.city = city;
		this.country = country;
	}

	@Override
	public Phone writePhone() {
		Phone phone = new Phone
		(Entrada.leerInt("introduzca el prefijo de su pais"),
		Entrada.leerInt("Introduzca su número de teléfono"));
	System.out.println("El telefono "+ phone+ "ha sido añadido");	
		return phone;
	}

	@Override
	public Adress writeAdress() {
		Adress adress=new Adress(Entrada.leerString("Introduzca su direccion (ej. c:calleejemplo 22)"),
				Entrada.leerString("Introduzca su Ciudad"),this.country);	
		return adress;
	}
}
