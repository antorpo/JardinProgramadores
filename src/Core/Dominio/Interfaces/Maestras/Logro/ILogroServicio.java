package Core.Dominio.Interfaces.Maestras.Logro;
import Core.Dominio.Entidades.Maestras.Logro;
import java.util.ArrayList;

public interface ILogroServicio {

    boolean Insertar(Logro entidad);

    boolean Eliminar(int Id);

    boolean Actualizar(Logro entidad);

    ArrayList<Logro> Obtener();

    Logro ObtenerPorId(int Id);
}
