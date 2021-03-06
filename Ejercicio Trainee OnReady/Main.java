import concesionaria.Concesionaria;


public class Main {
	
	static Concesionaria concesionaria = new Concesionaria();
	static final String LETRA_A_BUSCAR = "y";
	
	public static void main (String[] args){
		
		concesionaria.listarVehiculos();
		separador();
		
		concesionaria.ordenarVehiculosPorPrecioDeMayorAMenor();
		
		System.out.println("Vehiculo mas caro: " + concesionaria.obtenerVehiculoMasCaro().getMarca() + 
				" " + concesionaria.obtenerVehiculoMasCaro().getModelo());	
		System.out.println("Vehiculo mas barato: " + concesionaria.obtenerVehiculoMasBarato().getMarca() +
				" " + concesionaria.obtenerVehiculoMasBarato().getModelo());
		
		System.out.println("\nVeh�culo/s que contiene/n en el modelo la letra �Y�:");
		concesionaria.ObtenerVehiculoConLaLetra(LETRA_A_BUSCAR);
		separador();
		
		System.out.println("Veh�culos ordenados por precio de mayor a menor: \n");
		concesionaria.listarVehiculosPorMarcaYModelo();
	}
	
	public static void separador(){
		System.out.println("===============================");
	}

}
