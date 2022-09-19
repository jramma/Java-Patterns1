package n2ejercicio1;

public class Adress {
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
}
