package Core.Dominio.Interfaces.Maestras.Profesor;
import Core.Dominio.Entidades.Maestras.Profesor;
import java.util.ArrayList;

public interface IProfesorServicio {
    
    void Insertar(Profesor entidad);

    void Eliminar(int Id);

    void Actualizar(Profesor entidad);

    ArrayList<Profesor> Obtener();

    Profesor ObtenerPorId(int Id);
}
