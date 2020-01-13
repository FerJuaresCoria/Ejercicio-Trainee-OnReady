package concesionaria;

import vehiculo.Vehiculo;

public interface ITareas {

	public void listarVehiculos();
	public Vehiculo obtenerVehiculoMasCaro();
	public Vehiculo obtenerVehiculoMasBarato();
	public Vehiculo ObtenerVehiculoConLaLetra(char letra);
	public void ordenarVehiculosPorPrecioDeMayorAMenor();
	
}
