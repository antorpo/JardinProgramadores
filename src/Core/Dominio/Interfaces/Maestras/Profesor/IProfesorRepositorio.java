package Core.Dominio.Interfaces.Maestras.Profesor;
import Core.Dominio.Entidades.Maestras.Profesor;
import Core.Dominio.Interfaces.RepositorioGenerico.IRepositorio;

public interface IProfesorRepositorio extends IRepositorio<Profesor> {
    Profesor ObtenerPorDocumento(String documento);
}
