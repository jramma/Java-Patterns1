package fabrica;

public abstract class Adress {
	private int postalCode;
	private String calle;
	protected String country;
	@Override
	public String toString() {
		return "Adress [postalCode=" + postalCode + ", country=" + country + ", calle=" + calle + "]";
	}

	public void setCalle(  ) {
		calle = Entrada.leerString("Introduce la calle: ");
	}
	

	public void setPostalCode( ) {
		this.postalCode = Entrada.leerInt("Introduce postal code");
	}

	public abstract void setCountry( );
	
	
	
}
