package Core.Dominio.Interfaces.Seguimiento;

import Core.Dominio.Entidades.Seguimiento.Seguimiento;
import Core.Dominio.Interfaces.RepositorioGenerico.IRepositorio;
import java.util.ArrayList;

public interface ISeguimientoRepositorio extends IRepositorio<Seguimiento> {
    ArrayList<Seguimiento> ObtenerPorIdEstudiante(int id,boolean bimestre);
}
