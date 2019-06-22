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
        this.convenios = LlenarConvenios();
        this.convenioID = this.convenios.size() + 1;
    }

    public List<Carrera> LlenarCarreras() {
        carreras = new ArrayList<>();
        Carrera carr1 = new Carrera("Ciencias de la Computación");

        carr1.agregarCurso("CC101", "Matemática Básica");
        carr1.agregarCurso("CC104", "Programación 1");
        carr1.agregarCurso("CC105", "Programación 2");
        carr1.agregarCurso("CC102", "Comprensión y Producción del Lenguaje");
        carr1.agregarCurso("CC109", "Ética y Ciudadanía");
        return carreras;
    }

    private List<Convenio> LlenarConvenios() {
        List<Institucion> instituciones = new ArrayList<>();
        instituciones.add(new Institucion("Sunedu"));
        instituciones.add(new Institucion("Sunedu2"));
        instituciones.add(new Institucion("Sunedu3"));

        List<Tuple<Curso, Curso>> diccionario = new ArrayList<>();

        List<Convenio> ListConvenios = new ArrayList<>();
        ListConvenios.add(new Convenio(1, "Universidad Privada del Norte", "Universidad Privada del Norte", "Perú", "Vigente", instituciones, diccionario));
        ListConvenios.add(new Convenio(2, "Universidad Nacional de Colombia", "Universidad Nacional de Colombia", "Colombia", "Proceso", instituciones, diccionario));
        ListConvenios.add(new Convenio(3,"Universidad Peruana de Ciencias Aplicadas", "Universidad Peruana de Ciencias Aplicadas", "España", "Rechazado", instituciones, diccionario));
        ListConvenios.add(new Convenio(4, "University California of Irvin", "University California of Irvin", "Estados Unidos", "Vigente", instituciones, diccionario));

        return ListConvenios;
    }

    public Convenio CrearConvenios(String universidad, String pais, String estado, List<Institucion> instituciones, List<Tuple<Curso, Curso>> diccionario) {
        Convenio convenio = new Convenio(this.convenioID, this.nombre, universidad, pais, estado, instituciones, diccionario);
        this.convenios.add(convenio);
        this.convenioID++;
        return convenio;
    }

}

/*

Matemática Básica
CC101
Programación 1
CC104
Programación 2
CC105
Comprensión y Producción del Lenguaje
CC102
Ética y Ciudadanía
CC109

---------

Matemática 1
II101
Introducción a la Programación
II102
Programación Orientada a Objetos
II104
Redacción y Lenguaje
II109
Historia Universal
II107

---------

Matemática Básica
MU101
Desarrollo del Lenguaje
MU102
Ética ciudadana
MU104
Introducción a la Música
MU105

 */
