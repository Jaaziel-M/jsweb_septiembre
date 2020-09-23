package ar.com.educacionit.domain.polimorfismo;

public class InformeBase {

	//atributos
	protected String nombre;
	
	//constructor
	public InformeBase(String nombre) {
		this.nombre = nombre;
	}
	//metodo abstracto, los hijos SI O SI Deben usar el metodo y de la manera que lo dicta el padre
	//metodo normal, los hijos pueden usar polimorfismo para modificar el metodo.
	
	public void convertir() {
		
		String resultado = "convertiendo archivo por defecto a .txt";
		System.out.println(resultado);
	}
	
}
