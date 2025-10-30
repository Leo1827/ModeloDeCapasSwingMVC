package persistencia;

import IGU.Persona;
import java.util.ArrayList;
import java.util.List;

public class Persistencia {

    private static List<Persona> listaPersonas = new ArrayList<>();
    public void guardar(Persona persona) {
            listaPersonas.add(persona);
            System.out.println("Guardar en persistencia: " + persona);
    }

    public List<Persona> obtenerPersonas(){
        return listaPersonas;
    }
}
