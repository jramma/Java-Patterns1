package n3Command;

public class Arrancar implements AccionarVehiculo {

	@Override
	public void accionar(Vehiculo vehiculo) {
		System.out.println("Arrancando... \n"+ vehiculo.arrancar());
// TODO Auto-generated method stub
		
	}

}
