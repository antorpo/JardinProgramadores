package Infraestructura.BaseDeDatos.Repositorio.Maestras;

import Core.Dominio.Entidades.Maestras.Grupo;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoRepositorio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GrupoRepositorio implements IGrupoRepositorio {

    private IDbFactoria dbFactoria;
    private String tabla;

    public GrupoRepositorio(IDbFactoria dbFactoria, String tabla) {
        this.dbFactoria = dbFactoria;
        this.tabla = tabla;
    }

    @Override
    public boolean Insertar(Grupo entidad) {
        Connection con = null;
        boolean resultado = false;

        try {
            con = dbFactoria.conectarBD();
            String sql = "insert into " + tabla + " values (?, ?, ?, ?)";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, 0); // Id
            statement.setDate(2, new java.sql.Date(entidad.getFechaCreacion().getTime()));
            statement.setDate(3, null);
            statement.setString(4, entidad.getNombre());

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                resultado = true;
                System.out.println("[+] Insertado correctamente.");
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("[+] Error insertando en BD.");
            e.printStackTrace();
        }

        return resultado;
    }

    @Override
    public boolean Eliminar(int Id) {
        Connection con = null;
        boolean resultado = false;

        try {
            con = dbFactoria.conectarBD();
            String sql = "delete from " + tabla + " where id=? ";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, Id); // Id

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("[+] Eliminado correctamente.");
                resultado = true;
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("[+] Error eliminando en BD.");
            e.printStackTrace();
        }

        return resultado;
    }

    @Override
    public boolean Actualizar(Grupo entidad) {
        Connection con = null;
        boolean resultado = false;

        try {
            con = dbFactoria.conectarBD();
            String sql = "update " + tabla + " set fechamodificacion = ?, nombre = ? where id = ?";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setDate(1, new java.sql.Date(entidad.getFechaModificacion().getTime()));
            statement.setString(2, entidad.getNombre());
            statement.setInt(3, entidad.getId());

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("[+] Actualizado correctamente.");
                resultado = true;
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("[+] Error actualizando en BD.");
            e.printStackTrace();
        }

        return resultado;
    }

    @Override
    public ArrayList<Grupo> Obtener() {
        Connection con = null;
        ResultSet result = null;
        ArrayList<Grupo> lista = new ArrayList<Grupo>();

        try {
            con = dbFactoria.conectarBD();
            String sql = "select * from " + tabla + " order by id";

            Statement statement = con.createStatement();
            result = statement.executeQuery(sql);

            while (result.next()) {
                Grupo e = new Grupo();
                e.setId(result.getInt(1));
                e.setFechaCreacion(result.getDate(2));
                e.setFechaModificacion(result.getDate(3));
                e.setNombre(result.getString(4));
                lista.add(e);
            }

            result.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("[+] Error obteniendo registros.");
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    public Grupo ObtenerPorId(int Id) {
        Connection con = null;
        ResultSet result = null;
        Grupo entidad = new Grupo();

        try {
            con = dbFactoria.conectarBD();
            String sql = "select * from " + tabla + " where id = " + Id;

            Statement statement = con.createStatement();
            result = statement.executeQuery(sql);

            while (result.next()) {
                entidad.setId(result.getInt(1));
                entidad.setFechaCreacion(result.getDate(2));
                entidad.setFechaModificacion(result.getDate(3));
                entidad.setNombre(result.getString(4));
            }

            result.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("[+] Error obteniendo registros.");
            e.printStackTrace();
        }

        return entidad;
    }

}
