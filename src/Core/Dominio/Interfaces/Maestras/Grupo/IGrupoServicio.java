package Core.Dominio.Interfaces.Maestras.Grupo;
import Core.Dominio.Entidades.Maestras.Grupo;
import java.util.ArrayList;

public interface IGrupoServicio {

    void Insertar(Grupo entidad);

    void Eliminar(int Id);

    void Actualizar(Grupo entidad);

    ArrayList<Grupo> Obtener();

    Grupo ObtenerPorId(int Id);
}
