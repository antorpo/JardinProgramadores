package Core.Dominio.Interfaces.RepositorioGenerico;

import java.util.ArrayList;

public interface IRepositorio<T> {

    void Insertar(T entidad);

    void Eliminar(int Id);

    void Actualizar(T entidad);

    ArrayList<T> Obtener();

    T ObtenerPorId(int Id);
}
