package Core.Dominio.Interfaces.Maestras.Estudiante;
import Core.Dominio.Entidades.Maestras.Estudiante;
import Core.Dominio.Interfaces.RepositorioGenerico.IRepositorio;

public interface IEstudianteRepositorio extends IRepositorio<Estudiante> {
    Estudiante ObtenerPorDocumento(String documento);
}
