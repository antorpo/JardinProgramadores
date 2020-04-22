package Core.Dominio.Interfaces.Maestras.Pariente;
import Core.Dominio.Entidades.Maestras.Pariente;
import java.util.ArrayList;

public interface IParienteServicio {
    
    boolean Insertar(Pariente entidad);

    boolean Eliminar(int Id);

    boolean Actualizar(Pariente entidad);

    ArrayList<Pariente> Obtener();

    Pariente ObtenerPorId(int Id);
}
