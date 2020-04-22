package Infraestructura.BaseDeDatos.Repositorio.Maestras;

import Core.Dominio.Entidades.Maestras.Pariente;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteRepositorio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import java.util.ArrayList;

public class ParienteRepositorio implements IParienteRepositorio{
    private IDbFactoria dbFactoria;
    
    public ParienteRepositorio(IDbFactoria dbFactoria){
        this.dbFactoria = dbFactoria;
    }

    @Override
    public void Insertar(Pariente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Actualizar(Pariente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pariente> Obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pariente ObtenerPorId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
