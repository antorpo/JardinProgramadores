package Core.Dominio.Interfaces.RepositorioGenerico;

import java.sql.Connection;

public interface IDbFactoria {

    Connection conectarBD();
}
