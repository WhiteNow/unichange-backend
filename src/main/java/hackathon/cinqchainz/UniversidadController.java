package hackathon.cinqchainz;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UniversidadController {
    Universidad universidad;

    @PostMapping("/convenios/initializer")
    public Universidad crearUniversidad() {
        universidad = new Universidad("UCV", 1);
        return universidad;
    }

    @GetMapping("/convenios")
    public List<Convenio> listarConvenios() {
        return universidad.convenios;
    }

    // todo
    /*@PostMapping("/convenios")
    public Convenio crearConvenio(@RequestBody Map<String, String> body) {
        String uni = body.get("universidad");
        String pais = body.get("pais");
        String estado = body.get("estado");
        List<Institucion> instituciones = new ArrayList<Institucion>;
        instituciones.add(new Institucion("Ministerio de Educación"));
        return universidad.CrearConvenios(uni, pais, estado, instituciones);
    }*/

    @GetMapping("/convenio/{strID}")
    public Convenio obtenerConvenio(@PathVariable String strID, @RequestBody Map<String, String> body) {
        int id = Integer.parseInt(strID);
        for(Convenio con : universidad.convenios) {
            if(con.id == id) {

            }
        }
        return null;
    }

    @PutMapping("/convenio/{strID}")
    public Convenio editarConvenio(@PathVariable String strID, @RequestBody Map<String, String> body) {
        int id = Integer.parseInt(strID);
        for(Convenio con : universidad.convenios) {
            if(con.id == id) {
                con.universidadB = body.get("universidad");
                con.pais = body.get("pais");
                con.estado = body.get("estado");
                return con;
            }
        }
        return null;
    }

    @DeleteMapping("/convenio/{strID}")
    public Convenio eliminarConvenio(@PathVariable String strID) {
        int id = Integer.parseInt(strID);
        universidad.convenios.removeIf(t -> t.id == id);
        return null;
    }

}
