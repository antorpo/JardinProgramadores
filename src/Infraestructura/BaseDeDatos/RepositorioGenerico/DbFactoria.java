package Infraestructura.BaseDeDatos.RepositorioGenerico;

import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbFactoria implements IDbFactoria {

    private String Host;
    private String Port;
    private String DbName;
    private String Username;
    private String Password;

    public DbFactoria(String host, String port, String dbname, String username, String password) {
        Host = host;
        Port = port;
        DbName = dbname;
        Username = username;
        Password = password;
    }

    @Override
    public Connection conectarBD() {
        Connection conexion = null;

        String url = "jdbc:mysql://" + Host + ":" + Port + "/" + DbName + "?user=" + Username
                + "&password=" + Password;
        try {
            conexion = DriverManager.getConnection(url);
            if (conexion != null) {
                System.out.println("[+] Conectado a la BD.");
            }
        } catch (SQLException e) {
            System.out.println("[+] No se pudo conectar a la BD.");
            e.printStackTrace();
        }
        return conexion;
    }

}
