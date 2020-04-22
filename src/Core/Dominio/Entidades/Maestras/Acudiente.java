package Core.Dominio.Entidades.Maestras;

public class Acudiente extends Pariente {

    private String celAdicional;
    private String Horario;
    private String Permiso;

    public String getCelAdicional() {
        return celAdicional;
    }

    public void setCelAdicional(String celAdicional) {
        this.celAdicional = celAdicional;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getPermiso() {
        return Permiso;
    }

    public void setPermiso(String Permiso) {
        this.Permiso = Permiso;
    }

}
