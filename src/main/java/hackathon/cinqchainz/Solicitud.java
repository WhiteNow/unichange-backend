package hackathon.cinqchainz;

import java.util.Date;

public class Solicitud {
    public int id;
    public String codigoAlumno;
    public String universidadDestino;
    public Date fecha;

    public Solicitud(int id, String codigoAlumno, String universidadDestino, Date fecha) {
        this.id = id;
        this.codigoAlumno = codigoAlumno;
        this.universidadDestino = universidadDestino;
        this.fecha = fecha;
    }
}
