package Core.Dominio.Entidades.Maestras;

import Core.Dominio.Entidades.RepositorioGenerico.EntidadBase;

public class Profesor extends EntidadBase {

    private String Telefono;
    private String Especialidad;
    private String Genero;

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
}
