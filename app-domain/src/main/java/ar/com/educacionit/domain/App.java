package ar.com.educacionit.domain;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Persona persona = new Persona("Juan","de los palotes", 123456789l);
        String nombreDeLaPersona = persona.obtenerNombre();
        System.out.println(nombreDeLaPersona);
        
        //usando el atrubuto de instancia llamado cantidad ojos
        //accediendo por medio del metodo
        System.out.println("juan tiene " + juan.getCantidadOjos() + " ojos");
        
        Persona gabriel = new Persona("gabriel", "lopez", 3l);
        
        System.out.println("gabriel tiene "+ gabriel.Cant_ojos + " ojos");
        Persona.Cant_ojos = 5;
        System.out.println("gabriel ahora tiene "+ gabriel.Cant_ojos + " ojos");
        System.out.println("juan ahora tiene " + juan.getCantidadOjos() + " ojos");

        
    }
}
