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
