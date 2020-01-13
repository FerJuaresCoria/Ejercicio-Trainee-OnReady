package concesionaria;

import java.util.List;

import vehiculo.*;

public final class Administrador {
	
	public static void agregarVehiculos(List<Vehiculo> vehiculos){
		
		//	Marca	Modelo	Precio	Puertas/Cilindro
		
		vehiculos.add(new Automovil("Peugeot", "206", 200000.0, (byte) 4));
		vehiculos.add(new Motocicleta("Honda", "Titan", 60000.0, 125));
		vehiculos.add(new Automovil("Peugeot", "208", 205000.0, (byte) 5));
		vehiculos.add(new Motocicleta("Yamaha", "YBR", 80500.50, 160));
		
	}
	
}