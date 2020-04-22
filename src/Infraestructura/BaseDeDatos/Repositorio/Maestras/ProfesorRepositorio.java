package Infraestructura.BaseDeDatos.Repositorio.Maestras;

import Core.Dominio.Entidades.Maestras.Profesor;
import Core.Dominio.Interfaces.Maestras.Profesor.IProfesorRepositorio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import java.util.ArrayList;

public class ProfesorRepositorio implements IProfesorRepositorio{
    private IDbFactoria dbFactoria;
    
    public ProfesorRepositorio(IDbFactoria dbFactoria){
        this.dbFactoria = dbFactoria;
    }

    @Override
    public void Insertar(Profesor entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Actualizar(Profesor entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Profesor> Obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Profesor ObtenerPorId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
