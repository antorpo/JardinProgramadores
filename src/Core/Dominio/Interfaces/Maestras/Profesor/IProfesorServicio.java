package Core.Dominio.Interfaces.Maestras.Profesor;
import Core.Dominio.Entidades.Maestras.Profesor;
import java.util.ArrayList;

public interface IProfesorServicio {
    
    boolean Insertar(Profesor entidad);

    boolean Eliminar(int Id);

    boolean Actualizar(Profesor entidad);

    ArrayList<Profesor> Obtener();

    Profesor ObtenerPorId(int Id);
    
    Profesor ObtenerPorDocumento(String documento);
}
