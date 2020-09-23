package ar.com.educacionit.domain;

//clase
public class Persona {

	//atributos
	//encapsulamiento
	private String pensamiento;
	private float altura;
	private String nombre;
	private String apellido;
	private Long dni;
	public int cantidadOjos;
	public static Integer Cant_ojos = 2;
	
	//contructores por defecto
	public Persona() {
		System.out.println("Creando persona....");
	}
	
	public Persona(String nombre, String apellido, Long dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	//metodos
	public String obtenerNombre() {
		return this.nombre;
	}
	public String obtenerApellido() {
		return this.apellido;
	}
	public Long obtenerDni() {
		return this.dni;
	}
	
	//Metodo getter  Los metodos setter mandan info a la clase.
	public Integer getCantidadOjos() {
		return this.cantidadOjos;
	}
	
	//metodo Setter
	public void setNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	//metodo de CLASE
	public static Integer getOjos() {
		return Persona.Cant_ojos;
	}
	
	
}









































































