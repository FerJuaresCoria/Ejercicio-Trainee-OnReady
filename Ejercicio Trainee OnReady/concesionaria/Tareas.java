package concesionaria;

import vehiculo.Vehiculo;

public interface Tareas {

	public void listarVehiculos();
	public Vehiculo obtenerVehiculoMasCaro();
	public Vehiculo obtenerVehiculoMasBarato();
	public void obtenerVehiculoConLaLetra(String letra);
	public void ordenarVehiculosPorPrecioDeMayorAMenor();
	
}
