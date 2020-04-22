package Core.Dominio.Interfaces.Maestras.Logro;
import Core.Dominio.Entidades.Maestras.Logro;
import java.util.ArrayList;

public interface ILogroServicio {

    void Insertar(Logro entidad);

    void Eliminar(int Id);

    void Actualizar(Logro entidad);

    ArrayList<Logro> Obtener();

    Logro ObtenerPorId(int Id);
}
