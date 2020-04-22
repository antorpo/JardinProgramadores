package Core.Dominio.Entidades.Maestras;

import java.util.Date;

public class Logro {

    private int Id;
    private String Nombre;
    private String TipoLogro; // Cambiar por un enumerado de Logros
    private Date FechaLogro;
    private Date FechaCreacion;
    private Date FechaModificacion;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipoLogro() {
        return TipoLogro;
    }

    public void setTipoLogro(String TipoLogro) {
        this.TipoLogro = TipoLogro;
    }

    public Date getFechaLogro() {
        return FechaLogro;
    }

    public void setFechaLogro(Date FechaLogro) {
        this.FechaLogro = FechaLogro;
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
