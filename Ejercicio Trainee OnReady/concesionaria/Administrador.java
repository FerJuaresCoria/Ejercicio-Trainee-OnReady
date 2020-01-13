package concesionaria;

import java.util.ArrayList;

import vehiculo.*;

public final class Administrador {
	
	public static ArrayList<Vehiculo> obtenerVehiculos(){
		
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		//	Marca	Modelo	Precio	Puertas/Cilindro
		
		vehiculos.add(new Automovil("Peugeot", "206", 200000.0, (byte) 4));
		vehiculos.add(new Motocicleta("Honda", "Titan", 60000.0, 125));
		vehiculos.add(new Automovil("Peugeot", "208", 205000.0, (byte) 5));
		vehiculos.add(new Motocicleta("Yamaha", "YBR", 80500.50, 160));
		
		vehiculos.add(new Automovil("Renault","4", 15000.0 , (byte) 4));
		vehiculos.add(new Automovil("BMW", "320", 500000.50, (byte) 5 ));
		vehiculos.add(new Motocicleta("Yamaha", "MT 03", 5000.0 , 150 ));
		vehiculos.add(new Automovil("Chevrolet", "Joy", 250000.0 , (byte) 5));
		
		return vehiculos;
	}
	
}