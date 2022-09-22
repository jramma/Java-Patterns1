package parking;

import n3Command.Vehiculo;

public class Bicicleta implements Vehiculo {

	@Override
	public String arrancar() {
		// TODO Auto-generated method stub
		return "Pedaleando";
	}

	@Override
	public String frenar() {
		// TODO Auto-generated method stub
		return "Frenando bici";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "Pedalenado fuerte";
	}

	

}
