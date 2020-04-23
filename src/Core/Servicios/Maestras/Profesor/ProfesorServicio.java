package Core.Servicios.Maestras.Profesor;

import Core.Dominio.Entidades.Maestras.Profesor;
import Core.Dominio.Interfaces.Maestras.Profesor.IProfesorRepositorio;
import Core.Dominio.Interfaces.Maestras.Profesor.IProfesorServicio;
import java.util.ArrayList;

public class ProfesorServicio implements IProfesorServicio{
    private IProfesorRepositorio profesorRepositorio;
    
    public ProfesorServicio(IProfesorRepositorio profesorRepositorio){
        this.profesorRepositorio = profesorRepositorio;
    }

    @Override
    public boolean Insertar(Profesor entidad) {
        return profesorRepositorio.Insertar(entidad);
    }

    @Override
    public boolean Eliminar(int Id) {
        return profesorRepositorio.Eliminar(Id);
    }

    @Override
    public boolean Actualizar(Profesor entidad) {
        return profesorRepositorio.Actualizar(entidad);
    }

    @Override
    public ArrayList<Profesor> Obtener() {
        return profesorRepositorio.Obtener();
    }

    @Override
    public Profesor ObtenerPorId(int Id) {
        return profesorRepositorio.ObtenerPorId(Id);
    }

    @Override
    public Profesor ObtenerPorDocumento(String documento) {
        return profesorRepositorio.ObtenerPorDocumento(documento);
    }

}
