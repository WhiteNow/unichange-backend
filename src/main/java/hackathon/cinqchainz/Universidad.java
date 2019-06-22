package hackathon.cinqchainz;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    public List<Convenio> convenios;
    public List<Institucion> instituciones;
    public List<Carrera> carreras;
    public String nombre;
    private int convenioID;

    public Universidad(String nombre, int tipoUniversidad) {
        this.nombre = nombre;
        this.convenios = LlenarConvenios();
        this.convenioID = this.convenios.size() + 1;
    }

    private List<Convenio> LlenarConvenios() {
        List<Convenio> ListConvenios = new ArrayList<Convenio>();
        ListConvenios.add(new Convenio(1, "Universidad Privada del Norte", "Perú", "Vigente"));
        ListConvenios.add(new Convenio(2, "Universidad Nacional de Colombia", "Colombia", "Proceso"));
        ListConvenios.add(new Convenio(3, "Universidad Peruana de Ciencias Aplicadas", "España", "Rechazado"));
        ListConvenios.add(new Convenio(4, "University California of Irvin", "Estados Unidos", "Vigente"));
        return ListConvenios;
    }

    public Convenio CrearConvenios(String universidad, String pais, String estado) {
        Convenio convenio = new Convenio(this.convenioID, universidad, pais, estado);
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
