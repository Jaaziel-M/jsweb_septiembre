package ar.com.educacionit.domain.polimorfismo;

public class InformePDF extends InformeBase {

	public InformePDF(String nombre) {
		super(nombre);
	}

	//polimorfismo con redefinicion
	@Override
	public void convertir() {
		
		System.out.println("Generando informe en PDF");
		
		System.out.println("........");
		
		System.out.println("Se ha generado el informe" + super.nombre);
	}
	
}
