package Core.Servicios.Maestras.Estudiante;
import Core.Dominio.Entidades.Maestras.Estudiante;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteRepositorio;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import java.util.ArrayList;

public class EstudianteServicio implements IEstudianteServicio{
    // Inyectamos las dependencias.
    private IEstudianteRepositorio estudianteRepositorio;
    
    public EstudianteServicio(IEstudianteRepositorio estudianteRepositorio){
        this.estudianteRepositorio = estudianteRepositorio;
    }

    @Override
    public boolean Insertar(Estudiante entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Estudiante entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Estudiante> Obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estudiante ObtenerPorId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
