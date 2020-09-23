package ar.com.educacionit.domain.polimorfismo;

public class InformeCSV extends InformeBase {

	//alt+shift+s
	public InformeCSV(String nombre) {
		super(nombre);
	}
	
	@Override
	public void convertir() {
		
		System.out.println("Generando informe en CSV");
		
		System.out.println("........");
		
		System.out.println("Se ha generado el informe" + super.nombre);
	}
}
