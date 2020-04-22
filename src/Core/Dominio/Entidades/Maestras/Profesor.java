package Core.Dominio.Entidades.Maestras;

import Core.Dominio.Entidades.RepositorioGenerico.EntidadBase;

public class Profesor extends EntidadBase {

    private String Telefono;
    private String Especialidad;

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

}
