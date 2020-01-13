package vehiculo;

public class Automovil extends Vehiculo{
	
	protected byte puertas;
	
	public Automovil(String marca, String modelo, double precio, byte puertas){
		super(marca, modelo, precio);
		setPuertas(puertas);
	}
	
	//Setters
	public void setPuertas(byte puertas){
		this.puertas = puertas;
	}
	
	//Getters
	public byte getPuertas(){
		return this.puertas;
	}

	@Override
	public String toString(){
		return ("Marca: " + getMarca() + 
				" // Modelo: " + getModelo() + 
				" // Puertas: " + getPuertas() + 
				" // Precio: $" + getPrecio());
	}
}
