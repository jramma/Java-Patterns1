package n3Command;

public class Acelerar implements AccionarVehiculo{

	@Override
	public void accionar(Vehiculo vehiculo) {
		System.out.println("Acelerando... \n"+ vehiculo.acelerar());
		
	}

}
