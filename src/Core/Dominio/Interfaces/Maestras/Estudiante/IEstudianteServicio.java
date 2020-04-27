package Core.Dominio.Interfaces.Maestras.Estudiante;
import Core.Dominio.Entidades.Maestras.Estudiante;
import java.util.ArrayList;

public interface IEstudianteServicio {

    boolean Insertar(Estudiante entidad);

    boolean Eliminar(int Id);

    boolean Actualizar(Estudiante entidad);

    ArrayList<Estudiante> Obtener();

    Estudiante ObtenerPorId(int Id);
    
    Estudiante ObtenerPorDocumento(String documento);
}
