package parking;

import n3Command.Vehiculo;

public class Barco implements Vehiculo {

	@Override
	public String arrancar() {
		// TODO Auto-generated method stub
		return "Arriando velas";
	}

	@Override
	public String frenar() {
		// TODO Auto-generated method stub
		return "Recogiendo velas";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "Sacando remos";
	}


}
