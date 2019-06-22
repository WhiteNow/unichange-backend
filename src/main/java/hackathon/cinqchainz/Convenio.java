package hackathon.cinqchainz;


import java.util.List;

public class Convenio {

    public int id;
    public String universidadA;
    public String universidadB;
    public String pais;
    public String estado;
    public List<Institucion> instituciones;
    public List<Tuple<Curso, Curso>> diccionario;

    public Convenio(int id, String universidadA, String universidadB, String pais, String estado, List<Institucion> instituciones, List<Tuple<Curso, Curso>> diccionario) {
        this.id = id;
        this.universidadA = universidadA;
        this.universidadB = universidadB;
        this.pais = pais;
        this.estado = estado;
        this.instituciones = instituciones;
        this.diccionario = diccionario;
    }

}
