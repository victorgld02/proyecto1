package modelo;

public class persona {

	private String nombre;
	private int edad;
	private String direccion;

	public persona() {

	}
	
	

	public persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}



	public persona(String nombre, int edad, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public void calculo() {
		
	}



	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
	
	
}
