package n2AbstractFactory;

public class Adress {
	private String country;
	private String cityOrVillage;
	private String street;
	private int postalcode;
	
	public Adress(String country, String cityOrVillage, String street, int postalcode) {
		this.country = country;
		this.cityOrVillage = cityOrVillage;
		this.street = street;
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCityOrVillage() {
		return cityOrVillage;
	}

	public void setCityOrVillage(String cityOrVillage) {
		this.cityOrVillage = cityOrVillage;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(int postalcode) {
		this.postalcode = postalcode;
	}

	@Override
	public String toString() {
		return "Adress [country=" + country + ", cityOrVillage=" + cityOrVillage + ", street=" + street
				+ ", postalcode=" + postalcode + "]";
	}
	
	
	
	
}
