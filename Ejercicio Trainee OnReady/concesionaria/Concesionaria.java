package concesionaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import vehiculo.Vehiculo;

public class Concesionaria implements ITareas{

	private List<Vehiculo> vehiculos;
	
	public Concesionaria(){
		this.vehiculos = new ArrayList<Vehiculo>();
		Administrador.agregarVehiculos(vehiculos);
	}

	@Override
	public void listarVehiculos() {
		for(Vehiculo vehiculo: vehiculos){
			System.out.println(vehiculo.toString());
		}
	}

	@Override
	public Vehiculo obtenerVehiculoMasCaro() {
		return vehiculos.get(0);
	}

	@Override
	public Vehiculo obtenerVehiculoMasBarato() {
		return vehiculos.get(vehiculos.size() - 1);
	}

	@Override
	public Vehiculo ObtenerVehiculoConLaLetra(char letra) {
		return null;
	}

	@Override
	public void ordenarVehiculosPorPrecioDeMayorAMenor() {
		Collections.sort(vehiculos);
		Collections.reverse(vehiculos);
	}
	
}
