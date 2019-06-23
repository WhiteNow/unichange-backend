package hackathon.cinqchainz;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    public List<Curso> cursos;
    public String nombre;
    public List<Tuple<Curso, Curso>> diccionario;

    public Carrera(String nombre) {
        this.cursos = new ArrayList<>();
        this.diccionario = new ArrayList<>();
        this.nombre = nombre;
    }

    public Curso agregarCurso(String codigo, String nombre, Curso match) {
        Curso curso = new Curso(codigo, nombre);
        cursos.add(curso);
        diccionario.add(new Tuple<>(match, curso));
        return curso;
    }

}
