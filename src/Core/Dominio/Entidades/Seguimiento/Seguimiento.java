package Core.Dominio.Entidades.Seguimiento;

import java.util.Date;

public class Seguimiento {

    private int Id;
    private int IdLogro;
    private int IdEstudiante;
    private Date PrimeraFecha;
    private Date SegundaFecha;
    private String PrimeraCalificacion;
    private String SegundaCalificacion;
    private String CalificacionFinal;
    private boolean Bimestre;
    private String NombreLogro;
    private String Comentario;
    
    public Seguimiento(){
        PrimeraCalificacion = "";
        SegundaCalificacion = "";
        CalificacionFinal = "";
        NombreLogro = "";
        Comentario = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdLogro() {
        return IdLogro;
    }

    public void setIdLogro(int IdLogro) {
        this.IdLogro = IdLogro;
    }

    public int getIdEstudiante() {
        return IdEstudiante;
    }

    public void setIdEstudiante(int IdEstudiante) {
        this.IdEstudiante = IdEstudiante;
    }

    public Date getPrimeraFecha() {
        return PrimeraFecha;
    }

    public void setPrimeraFecha(Date PrimeraFecha) {
        this.PrimeraFecha = PrimeraFecha;
    }

    public Date getSegundaFecha() {
        return SegundaFecha;
    }

    public void setSegundaFecha(Date SegundaFecha) {
        this.SegundaFecha = SegundaFecha;
    }

    public String getPrimeraCalificacion() {
        return PrimeraCalificacion;
    }

    public void setPrimeraCalificacion(String PrimeraCalificacion) {
        this.PrimeraCalificacion = PrimeraCalificacion;
    }

    public String getSegundaCalificacion() {
        return SegundaCalificacion;
    }

    public void setSegundaCalificacion(String SegundaCalificacion) {
        this.SegundaCalificacion = SegundaCalificacion;
    }

    public String getCalificacionFinal() {
        return CalificacionFinal;
    }

    public void setCalificacionFinal(String CalificacionFinal) {
        this.CalificacionFinal = CalificacionFinal;
    }

    public boolean isBimestre() {
        return Bimestre;
    }

    public void setBimestre(boolean Bimestre) {
        this.Bimestre = Bimestre;
    }

    public String getNombreLogro() {
        return NombreLogro;
    }

    public void setNombreLogro(String NombreLogro) {
        this.NombreLogro = NombreLogro;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }  
}
