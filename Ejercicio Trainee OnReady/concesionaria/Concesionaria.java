package concesionaria;

import java.util.Collections;
import java.util.List;

import vehiculo.Vehiculo;

public class Concesionaria implements Tareas{

	private List<Vehiculo> vehiculos;
	
	public Concesionaria(){
		this.vehiculos = Administrador.obtenerVehiculos();
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
	public void ObtenerVehiculoConLaLetra(String letra) {
		for (Vehiculo vehiculo: vehiculos){
			if (buscarLetra(vehiculo, letra)){
				System.out.println("		" + vehiculo.getMarca() + " " + vehiculo.getModelo() + " $" + vehiculo.getPrecio());
			}
		}
	}
	
	private boolean buscarLetra(Vehiculo vehiculo, String letraABuscar){
		char[] modelo = vehiculo.getModelo().toCharArray();
		boolean seEncontro = false;
		for (int i = 0; i < modelo.length && !seEncontro; i++){
			if (String.valueOf(modelo[i]).equalsIgnoreCase(letraABuscar)){
				seEncontro = true;
			}
		}
		return seEncontro;
	}

	@Override
	public void ordenarVehiculosPorPrecioDeMayorAMenor() {
		Collections.sort(vehiculos);
		Collections.reverse(vehiculos);
	}
	
	public void listarVehiculosPorMarcaYModelo(){
		for(Vehiculo vehiculo: vehiculos){
			System.out.println(vehiculo.getMarca() + " " + vehiculo.getModelo());
		}
	}
}
