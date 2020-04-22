package Infraestructura.BaseDeDatos.Repositorio.Maestras;

import Core.Dominio.Entidades.Maestras.Logro;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroRepositorio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import java.util.ArrayList;

public class LogroRepositorio implements ILogroRepositorio{
    private IDbFactoria dbFactoria;
    
    public LogroRepositorio(IDbFactoria dbFactoria){
        this.dbFactoria = dbFactoria;
    }

    @Override
    public void Insertar(Logro entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Actualizar(Logro entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Logro> Obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Logro ObtenerPorId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
