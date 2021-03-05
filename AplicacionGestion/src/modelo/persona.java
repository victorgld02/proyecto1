package modelo;

public class persona {

	private String nombre;
	private int edad;
	private String direccion;

	public persona() {

	}

	public persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	/**
	 * Constructor que recibe tres parametros
	 * 
	 * @param nombre
	 * @param edad
	 * @param direccion
	 */
	public persona(String nombre, int edad, String direccion) {
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	public void calculo() {

	}

	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param direccion
	 * @return
	 */
	public String comprobardireccion(String nombre, int edad, String direccion) {
		String devuelve = nombre + " " + edad + " " + direccion;
		return devuelve;
	}

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}

}
