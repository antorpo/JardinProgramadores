package Core.Dominio.Interfaces.Seguimiento;

import Core.Dominio.Entidades.Seguimiento.Seguimiento;
import java.util.ArrayList;

public interface ISeguimientoServicio {

    boolean Insertar(Seguimiento entidad);

    boolean Eliminar(int Id);

    boolean Actualizar(Seguimiento entidad);

    ArrayList<Seguimiento> Obtener();

    Seguimiento ObtenerPorId(int Id);
    
    ArrayList<Seguimiento> ObtenerPorIdEstudiante(int id, boolean bimestre);
}
