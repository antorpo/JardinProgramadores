package Core.Dominio.Entidades.Maestras;

import java.util.Date;

public class Grupo {

    private int Id;
    private Date FechaCreacion;
    private Date FechaModificacion;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public Date getFechaModificacion() {
        return FechaModificacion;
    }

    public void setFechaModificacion(Date FechaModificacion) {
        this.FechaModificacion = FechaModificacion;
    }

}
