package Core.Servicios.Maestras.Grupo;

import Core.Dominio.Entidades.Maestras.Grupo;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoRepositorio;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import java.util.ArrayList;

public class GrupoServicio implements IGrupoServicio{
    private IGrupoRepositorio grupoRepositorio;
    
    public GrupoServicio(IGrupoRepositorio grupoRepositorio){
        this.grupoRepositorio = grupoRepositorio;
    }

    @Override
    public boolean Insertar(Grupo entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Grupo entidad) {
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
