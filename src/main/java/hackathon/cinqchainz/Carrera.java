package hackathon.cinqchainz;

import java.util.List;

public class Carrera {

    List<Curso> cursos;
    String nombre;

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public Curso agregarCurso(String codigo, String nombre) {
        Curso curso = new Curso(codigo, nombre );
        cursos.add(curso);
        return curso;
    }

}
