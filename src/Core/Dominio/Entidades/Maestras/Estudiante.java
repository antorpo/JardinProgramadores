package Core.Dominio.Entidades.Maestras;

import Core.Dominio.Entidades.RepositorioGenerico.EntidadBase;

public class Estudiante extends EntidadBase {

    private int Edad;
    private double Talla;
    private double Peso;
    private String Genero;
    private String Problemas;

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getTalla() {
        return Talla;
    }

    public void setTalla(double Talla) {
        this.Talla = Talla;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getProblemas() {
        return Problemas;
    }

    public void setProblemas(String Problemas) {
        this.Problemas = Problemas;
    }
}
