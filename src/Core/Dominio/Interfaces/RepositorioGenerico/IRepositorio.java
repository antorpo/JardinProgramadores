package Core.Dominio.Interfaces.RepositorioGenerico;

import java.util.ArrayList;

public interface IRepositorio<T> {

    boolean Insertar(T entidad);

    boolean Eliminar(int Id);

    boolean Actualizar(T entidad);

    ArrayList<T> Obtener();

    T ObtenerPorId(int Id);
}
