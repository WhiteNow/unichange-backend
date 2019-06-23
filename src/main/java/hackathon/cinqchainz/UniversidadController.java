package hackathon.cinqchainz;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class UniversidadController {
    Universidad universidad;

    @PostMapping("/initializer")
    public Universidad crearUniversidad() {
        universidad = new Universidad("Universidad Peruana de Ciencias Aplicadas", 1);
        return null;
    }

    @GetMapping("/convenios")
    public List<Convenio> listarConvenios() {
        return universidad.convenios;
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
    public Convenio eliminarConvenio(@PathVariable String strID) {
        int id = Integer.parseInt(strID);
        //universidad.convenios.removeIf(t -> t.id == id);
        return null;
    }

}
