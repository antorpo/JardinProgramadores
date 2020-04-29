package Core.Dominio.Interfaces.Maestras.Logro;
import Core.Dominio.Entidades.Maestras.Logro;
import Core.Dominio.Interfaces.RepositorioGenerico.IRepositorio;

public interface ILogroRepositorio extends IRepositorio<Logro>{
    int idUltimoRegistro();
}
