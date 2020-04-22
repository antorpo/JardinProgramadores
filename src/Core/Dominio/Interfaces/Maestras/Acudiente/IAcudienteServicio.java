package Core.Dominio.Interfaces.Maestras.Acudiente;
import Core.Dominio.Entidades.Maestras.Acudiente;
import java.util.ArrayList;

public interface IAcudienteServicio {

    void Insertar(Acudiente entidad);

    void Eliminar(int Id);

    void Actualizar(Acudiente entidad);

    ArrayList<Acudiente> Obtener();

    Acudiente ObtenerPorId(int Id);
}
