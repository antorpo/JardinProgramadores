package Core.Dominio.Interfaces.Maestras.Estudiante;
import Core.Dominio.Entidades.Maestras.Estudiante;
import java.util.ArrayList;

public interface IEstudianteServicio {

    void Insertar(Estudiante entidad);

    void Eliminar(int Id);

    void Actualizar(Estudiante entidad);

    ArrayList<Estudiante> Obtener();

    Estudiante ObtenerPorId(int Id);
}
