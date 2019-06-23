package hackathon.cinqchainz;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UniversidadController {
    Universidad universidad;
    List<Solicitud> solicitudes;

    @PostMapping("/initializer")
    public Universidad crearUniversidad() {
        this.universidad = new Universidad("Universidad Peruana de Ciencias Aplicadas", 1);

        this.solicitudes = new ArrayList<>();
        Date date = new GregorianCalendar(2020, Calendar.FEBRUARY, 11).getTime();
        this.solicitudes.add(new Solicitud(1, "u201411972", this.universidad.convenios.get(0).universidadB, date) );
        return null;
    }

    @GetMapping("/convenios")
    public List<Convenio> listarConvenios() {
        return this.universidad.convenios;
    }

    // todo
    @PostMapping("/convenios")
    public Convenio crearConvenio(@RequestBody Convenio body) {
        //String universidad = body.get("universidad");
        //String pais = body.get("pais");
        //String estado = body.get("estado");
        return null;
    }

    @GetMapping("/convenio/{strID}")
    public Convenio obtenerConvenio(@PathVariable String strID) {
        int id = Integer.parseInt(strID);
        for(Convenio con : universidad.convenios) {
            if(con.id == id) {
                return con;
            }
        }
        return null;
    }

    @PutMapping("/convenio/{strID}")
    public Convenio editarConvenio(@PathVariable String strID, @RequestBody Map<String, String> body) {
        int id = Integer.parseInt(strID);
        for(Convenio con : universidad.convenios) {
            if(con.id == id) {
                con.estado = body.get("estado");
                return con;
            }
        }
        return null;
    }

    @DeleteMapping("/convenio/{strID}")
    public String eliminarConvenio(@PathVariable String strID) {
        int id = Integer.parseInt(strID);
        for(int i=0; i<universidad.convenios.size(); i++) {
            if(universidad.convenios.get(i).id == id) {
                universidad.convenios.remove(i);
                return "Convenio eliminado satisfactoriamente";
            }
        }
        return null;
    }

    @GetMapping("/universidades")
    public List<String> obtenerUniversidades() {
        List<String> universidades = new ArrayList<>();
        universidades.add("Universidad Peruana de Ciencias Aplicadas");
        universidades.add("Universidad Privada del Norte");
        universidades.add("Universidad Nacional de Colombia");
        universidades.add("University of California, Irvine");
        return universidades;
    }

    @GetMapping("/reguladores")
    public List<String> obtenerReguladores() {
        List<String> reguladores = new ArrayList<>();
        reguladores.add("SUNEDU");
        reguladores.add("Ministerio de Educación");
        return reguladores;
    }

    @GetMapping("/solicitudes")
    public List<Solicitud> listarSolicitudes() {
        return this.solicitudes;
    }

}
