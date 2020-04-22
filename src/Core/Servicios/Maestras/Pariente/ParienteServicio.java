package Core.Servicios.Maestras.Pariente;

import Core.Dominio.Entidades.Maestras.Pariente;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteRepositorio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteServicio;
import java.util.ArrayList;


public class ParienteServicio implements IParienteServicio {
    private IParienteRepositorio parienteRepositorio;
    
    public ParienteServicio(IParienteRepositorio parienteRepositorio){
        this.parienteRepositorio = parienteRepositorio;
    }

    @Override
    public boolean Insertar(Pariente entidad) {
        return parienteRepositorio.Insertar(entidad);
    }

    @Override
    public boolean Eliminar(int Id) {
        return parienteRepositorio.Eliminar(Id);
    }

    @Override
    public boolean Actualizar(Pariente entidad) {
        return parienteRepositorio.Actualizar(entidad);
    }

    @Override
    public ArrayList<Pariente> Obtener() {
        return parienteRepositorio.Obtener();
    }

    @Override
    public Pariente ObtenerPorId(int Id) {
        return parienteRepositorio.ObtenerPorId(Id);
    }

    
}
