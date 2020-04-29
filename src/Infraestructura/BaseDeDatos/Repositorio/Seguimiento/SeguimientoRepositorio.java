package Infraestructura.BaseDeDatos.Repositorio.Seguimiento;

import Core.Dominio.Entidades.Seguimiento.Seguimiento;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import Core.Dominio.Interfaces.Seguimiento.ISeguimientoRepositorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class SeguimientoRepositorio implements ISeguimientoRepositorio {

    private IDbFactoria dbFactoria;
    private String tabla;

    public SeguimientoRepositorio(IDbFactoria dbFactoria, String tabla) {
        this.dbFactoria = dbFactoria;
        this.tabla = tabla;
    }

    @Override
    public boolean Insertar(Seguimiento entidad) {
        Connection con = null;
        boolean resultado = false;

        try {
            con = dbFactoria.conectarBD();
            String sql = "insert into " + tabla + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, 0); // Id
            statement.setInt(2, entidad.getIdLogro());
            statement.setInt(3, entidad.getIdEstudiante());
            statement.setDate(4, null);
            statement.setDate(5, null);
            statement.setString(6, entidad.getPrimeraCalificacion());
            statement.setString(7, entidad.getSegundaCalificacion());
            statement.setString(8, entidad.getCalificacionFinal());
            statement.setBoolean(9, entidad.isBimestre());
            statement.setString(10, entidad.getNombreLogro());
            statement.setString(11, entidad.getComentario());

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
    public boolean Actualizar(Seguimiento entidad) {
        Connection con = null;
        boolean resultado = false;

        try {
            con = dbFactoria.conectarBD();
            String sql = "update " + tabla + " set idlogro = ?, idestudiante = ?, primerafecha = ?, "
                    + " segundafecha = ?, primeracalificacion = ?, segundacalificacion = ?, calificacionfinal = ?, bimestre = ?, nombrelogro = ?, comentario = ? where id = ? ";

            Date fecha1 = entidad.getPrimeraFecha();
            Date fecha2 = entidad.getSegundaFecha();
            
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, entidad.getIdLogro());
            statement.setInt(2, entidad.getIdEstudiante());
            statement.setDate(3, fecha1 != null ? new java.sql.Date(fecha1.getTime()) : null);
            statement.setDate(4, fecha2 != null ? new java.sql.Date(fecha2.getTime()) : null);
            statement.setString(5, entidad.getPrimeraCalificacion());
            statement.setString(6, entidad.getSegundaCalificacion());
            statement.setString(7, entidad.getCalificacionFinal());
            statement.setBoolean(8, entidad.isBimestre());
            statement.setString(9, entidad.getNombreLogro());
            statement.setString(10, entidad.getComentario());
            statement.setInt(11, entidad.getId());
            
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
    public ArrayList<Seguimiento> Obtener() {
        Connection con = null;
        ResultSet result = null;
        ArrayList<Seguimiento> lista = new ArrayList<Seguimiento>();

        try {
            con = dbFactoria.conectarBD();
            String sql = "select * from " + tabla + " order by id";

            Statement statement = con.createStatement();
            result = statement.executeQuery(sql);

            while (result.next()) {
                Seguimiento e = new Seguimiento();
                e.setId(result.getInt(1));
                e.setIdLogro(result.getInt(2));
                e.setIdEstudiante(result.getInt(3));
                e.setPrimeraFecha(result.getDate(4));
                e.setSegundaFecha(result.getDate(5));
                e.setPrimeraCalificacion(result.getString(6));
                e.setSegundaCalificacion(result.getString(7));
                e.setCalificacionFinal(result.getString(8));
                e.setBimestre(result.getBoolean(9));
                e.setNombreLogro(result.getString(10));
                e.setComentario(result.getString(11));
                
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
    public Seguimiento ObtenerPorId(int Id) {
        Connection con = null;
        ResultSet result = null;
        Seguimiento entidad = new Seguimiento();

        try {
            con = dbFactoria.conectarBD();
            String sql = "select * from " + tabla + " where id = " + Id;

            Statement statement = con.createStatement();
            result = statement.executeQuery(sql);

            while (result.next()) {
                entidad.setId(result.getInt(1));
                entidad.setIdLogro(result.getInt(2));
                entidad.setIdEstudiante(result.getInt(3));
                entidad.setPrimeraFecha(result.getDate(4));
                entidad.setSegundaFecha(result.getDate(5));
                entidad.setPrimeraCalificacion(result.getString(6));
                entidad.setSegundaCalificacion(result.getString(7));
                entidad.setCalificacionFinal(result.getString(8));
                entidad.setBimestre(result.getBoolean(9));
                entidad.setNombreLogro(result.getString(10));
                entidad.setComentario(result.getString(11));
            }

            result.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("[+] Error obteniendo registros.");
            e.printStackTrace();
        }

        return entidad;
    }
    
        
    @Override
    public ArrayList<Seguimiento> ObtenerPorIdEstudiante(int id, boolean bimestre) {
        Connection con = null;
        ResultSet result = null;
        ArrayList<Seguimiento> lista = new ArrayList<Seguimiento>();
        
        int digit = bimestre ? 1 : 0;

        try {
            con = dbFactoria.conectarBD();
            String sql = "select * from " + tabla + " where (idestudiante = " + id + ") and (bimestre = " + digit + ") order by id";

            Statement statement = con.createStatement();
            result = statement.executeQuery(sql);

            while (result.next()) {
                Seguimiento e = new Seguimiento();
                e.setId(result.getInt(1));
                e.setIdLogro(result.getInt(2));
                e.setIdEstudiante(result.getInt(3));
                e.setPrimeraFecha(result.getDate(4));
                e.setSegundaFecha(result.getDate(5));
                e.setPrimeraCalificacion(result.getString(6));
                e.setSegundaCalificacion(result.getString(7));
                e.setCalificacionFinal(result.getString(8));
                e.setBimestre(result.getBoolean(9));
                e.setNombreLogro(result.getString(10));
                e.setComentario(result.getString(11));
                
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
    

}
