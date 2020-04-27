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
        return estudianteRepositorio.Insertar(entidad);
    }

    @Override
    public boolean Eliminar(int Id) {
        return estudianteRepositorio.Eliminar(Id);
    }

    @Override
    public boolean Actualizar(Estudiante entidad) {
        return estudianteRepositorio.Actualizar(entidad);
    }

    @Override
    public ArrayList<Estudiante> Obtener() {
        return estudianteRepositorio.Obtener();
    }

    @Override
    public Estudiante ObtenerPorId(int Id) {
        return estudianteRepositorio.ObtenerPorId(Id);
    }

    @Override
    public Estudiante ObtenerPorDocumento(String documento) {
        return estudianteRepositorio.ObtenerPorDocumento(documento);
    }

   
}
