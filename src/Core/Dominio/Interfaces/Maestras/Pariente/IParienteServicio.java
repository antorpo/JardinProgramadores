package Core.Dominio.Interfaces.Maestras.Pariente;
import Core.Dominio.Entidades.Maestras.Pariente;
import java.util.ArrayList;

public interface IParienteServicio {
    
    void Insertar(Pariente entidad);

    void Eliminar(int Id);

    void Actualizar(Pariente entidad);

    ArrayList<Pariente> Obtener();

    Pariente ObtenerPorId(int Id);
}
