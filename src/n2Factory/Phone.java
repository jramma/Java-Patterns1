package fabrica;

public abstract class Phone {
	private int numero;
	protected String prefix;
	
	public abstract void setPrefix( );

	public void setNumero() {
		
		this.numero = Entrada.leerInt("Introduce el numero de telefono");
	}

	@Override
	public String toString() {
		return "Phone [numero=" + numero + ", prefix=" + prefix + "]";
	}

	
	
	
}
