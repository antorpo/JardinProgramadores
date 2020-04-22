package Core.Dominio.Interfaces.Maestras.Grupo;
import Core.Dominio.Entidades.Maestras.Grupo;
import java.util.ArrayList;

public interface IGrupoServicio {

    boolean Insertar(Grupo entidad);

    boolean Eliminar(int Id);

    boolean Actualizar(Grupo entidad);

    ArrayList<Grupo> Obtener();

    Grupo ObtenerPorId(int Id);
}
