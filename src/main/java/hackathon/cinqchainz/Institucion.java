package hackathon.cinqchainz;

import java.util.List;

public class Institucion {

    public List<Carrera> carreras;
    public String nombre;

    public Institucion(String nombre) {
        this.nombre = nombre;
    }

    public Carrera AgregarCarrera(String nombre) {
        Carrera carrera = new Carrera(nombre);
        this.carreras.add(carrera);
        return carrera;
    }

}
