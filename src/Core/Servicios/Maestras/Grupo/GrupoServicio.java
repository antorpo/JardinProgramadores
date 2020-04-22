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
        return grupoRepositorio.Insertar(entidad);
    }

    @Override
    public boolean Eliminar(int Id) {
        return grupoRepositorio.Eliminar(Id);
    }

    @Override
    public boolean Actualizar(Grupo entidad) {
        return grupoRepositorio.Actualizar(entidad);
    }

    @Override
    public ArrayList<Grupo> Obtener() {
        return grupoRepositorio.Obtener();
    }

    @Override
    public Grupo ObtenerPorId(int Id) {
        return grupoRepositorio.ObtenerPorId(Id);
    }

   
    
}
