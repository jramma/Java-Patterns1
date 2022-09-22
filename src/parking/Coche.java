package parking;

import n3Command.Vehiculo;

public class Coche implements Vehiculo {

	@Override
	public String arrancar() {
		// TODO Auto-generated method stub
		return "Luces de posición encendidas";
	}

	@Override
	public String frenar() {
		// TODO Auto-generated method stub
		return "Pisando freno";
	}

	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "No puedes sobrepasar el límite de velocidad";
	}

	

}
