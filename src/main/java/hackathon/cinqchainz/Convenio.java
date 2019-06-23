package hackathon.cinqchainz;


import java.util.ArrayList;
import java.util.List;

public class Convenio {

    public int id;
    public String universidadA;
    public String universidadB;
    public String pais;
    public String estado;
    public List<Institucion> instituciones;
    public List<Carrera> carreras;

    public Convenio(int id, String universidadA, String universidadB, String pais, String estado, List<Institucion> instituciones, List<Carrera> carreras) {
        this.id = id;
        this.universidadA = universidadA;
        this.universidadB = universidadB;
        this.pais = pais;
        this.estado = estado;
        this.carreras = carreras;
        this.instituciones = instituciones;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

}
