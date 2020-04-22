package Core.Dominio.Interfaces.Maestras.Acudiente;
import Core.Dominio.Entidades.Maestras.Acudiente;
import java.util.ArrayList;

public interface IAcudienteServicio {

    boolean Insertar(Acudiente entidad);

    boolean Eliminar(int Id);

    boolean Actualizar(Acudiente entidad);

    ArrayList<Acudiente> Obtener();

    Acudiente ObtenerPorId(int Id);
}
