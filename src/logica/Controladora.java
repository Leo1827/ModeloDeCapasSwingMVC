package logica;
import persistencia.Persistencia;
import IGU.Persona;
public class Controladora {
    Persistencia persis = new Persistencia();

    public void agregarPersona(String nombre, int edad) {
        Persona persona = new Persona(nombre, edad);
        persis.guardar(persona);
    }
}
