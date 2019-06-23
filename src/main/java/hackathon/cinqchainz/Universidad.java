package hackathon.cinqchainz;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    public List<Convenio> convenios;
    public List<Carrera> carreras;
    public String nombre;
    private int convenioID;

    public Universidad(String nombre, int tipoUniversidad) {
        this.nombre = nombre;
        this.carreras = this.LlenarCarreras();
        this.convenios = this.LlenarConvenios();
        this.convenioID = this.convenios.size() + 1;
    }

    public List<Carrera> LlenarCarreras() {
        this.carreras = new ArrayList<>();

        Carrera carr = new Carrera("Ciencias de la Computación");
        carr.cursos.add(new Curso("CC101", "Matemática Básica"));
        carr.cursos.add(new Curso("CC104", "Programación 1"));
        carr.cursos.add(new Curso("CC105", "Programación 2"));
        carr.cursos.add(new Curso("CC102", "Comprensión y Producción del Lenguaje"));
        carr.cursos.add(new Curso("CC109", "Ética y Ciudadanía"));
        carreras.add(carr);
        return carreras;
    }

    private List<Convenio> LlenarConvenios() {
        List<Institucion> instituciones = new ArrayList<>();
        instituciones.add(new Institucion("Sunedu"));
        instituciones.add(new Institucion("Sunedu2"));
        instituciones.add(new Institucion("Sunedu3"));

        List<Convenio> ListConvenios = new ArrayList<>();

        List<Carrera> ListCarreras = new ArrayList<>();
        Carrera carrera = new Carrera("Ingeniería Informática");
        carrera.agregarCurso("II101", "Matemática 1", this.carreras.get(0).cursos.get(0));
        carrera.agregarCurso("II102", "Introducción a la Programación", this.carreras.get(0).cursos.get(0));
        carrera.agregarCurso("II104", "Programación Orientada a Objetos", this.carreras.get(0).cursos.get(0));
        carrera.agregarCurso("II109", "Redacción y Lenguaje", this.carreras.get(0).cursos.get(0));
        carrera.agregarCurso("II107", "Historia Universal", null);
        ListCarreras.add(carrera);
        ListConvenios.add(new Convenio(1, this.nombre, "Universidad Privada del Norte", "Perú", "Vigente", instituciones, ListCarreras));


        ListCarreras = new ArrayList<>();
        carrera = new Carrera("Música");
        carrera.agregarCurso("MU101", "Matemática Básica", this.carreras.get(0).cursos.get(0));
        carrera.agregarCurso("MU102", "Desarrollo del Lenguaje", this.carreras.get(0).cursos.get(3));
        carrera.agregarCurso("MU104", "Ética ciudadana", this.carreras.get(0).cursos.get(4));
        carrera.agregarCurso("MU105", "Introducción a la Música", null);
        ListCarreras.add(carrera);
        ListConvenios.add(new Convenio(2, this.nombre, "Universidad Nacional de Colombia", "Perú", "Vigente", instituciones, ListCarreras));

        ListConvenios.add(new Convenio(3,this.nombre, "Universidad Peruana de Catalunya", "España", "Proceso", instituciones, null));

        ListConvenios.add(new Convenio(4, this.nombre, "University of California, Irvine", "Estados Unidos", "Rechazado", instituciones, null));

        return ListConvenios;
    }

    public Convenio CrearConvenios(String universidad, String pais, String estado, List<Institucion> instituciones, List<Carrera> carreras) {
        Convenio convenio = new Convenio(this.convenioID, this.nombre, universidad, pais, estado, instituciones, carreras);
        this.convenioID++;
        this.convenios.add(convenio);
        return convenio;
    }

    public List<Convenio> getConvenios() {
        return convenios;
    }

    public void setConvenios(List<Convenio> convenios) {
        this.convenios = convenios;
    }
}
