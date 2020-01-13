package vehiculo;

public class Motocicleta extends Vehiculo{
	
	protected int cilindro;
	
	public Motocicleta(String marca, String modelo, double precio, int cilindro){
		super(marca, modelo, precio);
		setCilindro(cilindro);
	}
	
	//Setters
	public void setCilindro(int cilindro){
		this.cilindro = cilindro;
	}
	
	//Getters
	public int getCilindro(){
		return this.cilindro;
	}

	@Override
	public String toString(){
		return ("Marca: " + getMarca() + 
				" // Modelo: " + getModelo() + 
				" // Cilindrada: " + getCilindro() + 
				" cc // Precio: $" + getPrecio());
	}
	
}
