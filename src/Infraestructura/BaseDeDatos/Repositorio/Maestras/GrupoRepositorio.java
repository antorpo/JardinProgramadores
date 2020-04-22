package Infraestructura.BaseDeDatos.Repositorio.Maestras;

import Core.Dominio.Entidades.Maestras.Grupo;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoRepositorio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import java.util.ArrayList;

public class GrupoRepositorio implements IGrupoRepositorio{
    private IDbFactoria dbFactoria;
    
    public GrupoRepositorio(IDbFactoria dbFactoria){
        this.dbFactoria = dbFactoria;
    }

    @Override
    public void Insertar(Grupo entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Actualizar(Grupo entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Grupo> Obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Grupo ObtenerPorId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
