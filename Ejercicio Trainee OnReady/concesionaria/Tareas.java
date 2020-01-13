package concesionaria;

import vehiculo.Vehiculo;

public interface Tareas {

	public void listarVehiculos();
	public Vehiculo obtenerVehiculoMasCaro();
	public Vehiculo obtenerVehiculoMasBarato();
	public void ObtenerVehiculoConLaLetra(String letra);
	public void ordenarVehiculosPorPrecioDeMayorAMenor();
	
}
