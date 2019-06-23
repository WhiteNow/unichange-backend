package hackathon.cinqchainz;

import java.util.Date;

public class Solicitud {
    public int id;
    public String codigoAlumno;
    public String universidadDestino;
    public Date fecha;
    public String estado;

    public Solicitud(int id, String codigoAlumno, String universidadDestino, Date fecha, String estado) {
        this.id = id;
        this.codigoAlumno = codigoAlumno;
        this.universidadDestino = universidadDestino;
        this.fecha = fecha;
        this.estado = estado;
    }
}
