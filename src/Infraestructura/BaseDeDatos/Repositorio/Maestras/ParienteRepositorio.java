package Infraestructura.BaseDeDatos.Repositorio.Maestras;

import Core.Dominio.Entidades.Maestras.Pariente;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteRepositorio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ParienteRepositorio implements IParienteRepositorio {

    private IDbFactoria dbFactoria;
    private String tabla;

    public ParienteRepositorio(IDbFactoria dbFactoria, String tabla) {
        this.dbFactoria = dbFactoria;
        this.tabla = tabla;
    }

    @Override
    public boolean Insertar(Pariente entidad) {
        Connection con = null;
        boolean resultado = false;

        try {
            con = dbFactoria.conectarBD();
            String sql = "insert into " + tabla + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, 0); // Id
            statement.setString(2, entidad.getNombre());
            statement.setString(3, entidad.getTipoDocumento());
            statement.setString(4, entidad.getNumeroDocumento());
            statement.setDate(5, new java.sql.Date(entidad.getFechaCreacion().getTime()));
            statement.setDate(6, null);
            statement.setString(7, entidad.getTelefono());
            statement.setString(8, entidad.getCalidad());
            statement.setString(9, entidad.getCelular());
            statement.setString(10, entidad.getDireccion());

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
    public boolean Actualizar(Pariente entidad) {
        Connection con = null;
        boolean resultado = false;

        try {
            con = dbFactoria.conectarBD();
            String sql = "update " + tabla + " set nombre = ?, tipodocumento = ?, numerodocumento = ?, "
                    + " fechamodificacion = ?, telefono = ?, calidad = ?, celular = ?, direccion = ? where id = ? ";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, entidad.getNombre());
            statement.setString(2, entidad.getTipoDocumento());
            statement.setString(3, entidad.getNumeroDocumento());
            statement.setDate(4, new java.sql.Date(entidad.getFechaModificacion().getTime()));
            statement.setString(5, entidad.getTelefono());
            statement.setString(6, entidad.getCalidad());
            statement.setString(7, entidad.getCelular());
            statement.setString(8, entidad.getDireccion());
            statement.setInt(9, entidad.getId());

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
    public ArrayList<Pariente> Obtener() {
        Connection con = null;
        ResultSet result = null;
        ArrayList<Pariente> lista = new ArrayList<Pariente>();

        try {
            con = dbFactoria.conectarBD();
            String sql = "select * from " + tabla + " order by id";

            Statement statement = con.createStatement();
            result = statement.executeQuery(sql);

            while (result.next()) {
                Pariente e = new Pariente();
                e.setId(result.getInt(1));
                e.setNombre(result.getString(2));
                e.setTipoDocumento(result.getString(3));
                e.setNumeroDocumento(result.getString(4));
                e.setFechaCreacion(result.getDate(5));
                e.setFechaModificacion(result.getDate(6));
                e.setTelefono(result.getString(7));
                e.setCalidad(result.getString(8));
                e.setCelular(result.getString(9));
                e.setDireccion(result.getString(10));

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
    public Pariente ObtenerPorId(int Id) {
        Connection con = null;
        ResultSet result = null;
        Pariente entidad = new Pariente();

        try {
            con = dbFactoria.conectarBD();
            String sql = "select * from " + tabla + " where id = " + Id;

            Statement statement = con.createStatement();
            result = statement.executeQuery(sql);

            while (result.next()) {
                entidad.setId(result.getInt(1));
                entidad.setNombre(result.getString(2));
                entidad.setTipoDocumento(result.getString(3));
                entidad.setNumeroDocumento(result.getString(4));
                entidad.setFechaCreacion(result.getDate(5));
                entidad.setFechaModificacion(result.getDate(6));
                entidad.setTelefono(result.getString(7));
                entidad.setCalidad(result.getString(8));
                entidad.setCelular(result.getString(9));
                entidad.setDireccion(result.getString(10));
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
