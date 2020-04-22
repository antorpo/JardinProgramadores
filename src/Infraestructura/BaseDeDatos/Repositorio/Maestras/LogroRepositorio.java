package Infraestructura.BaseDeDatos.Repositorio.Maestras;

import Core.Dominio.Entidades.Maestras.Logro;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroRepositorio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class LogroRepositorio implements ILogroRepositorio{
    private IDbFactoria dbFactoria;
    private String tabla;
    
    public LogroRepositorio(IDbFactoria dbFactoria, String tabla){
        this.dbFactoria = dbFactoria;
        this.tabla = tabla;
    }

    @Override
    public boolean Insertar(Logro entidad) {
       Connection con = null;
        boolean resultado = false;
        
        try {
            con = dbFactoria.conectarBD();
            String sql = "insert into " + tabla + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, 0); // Id
            statement.setDate(8, new java.sql.Date(entidad.getFechaCreacion().getTime()));
            statement.setDate(9, null);
            
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
    public boolean Actualizar(Logro entidad) {
        Connection con = null;
        boolean resultado = false;
        
        try {
            con = dbFactoria.conectarBD();
            String sql = "update " + tabla + " set nombre = ?, set apellido = ?, set documento = ?, set email =?,"
                    + "set carrera=?, set semestre=?, set fechaedicion=? where id=? ";

            PreparedStatement statement = con.prepareStatement(sql);
//            statement.setString(1, entidad.getNombre());
//            statement.setString(2, entidad.getApellidos());
//            statement.setString(3, entidad.getDocumento());
//            statement.setString(4, entidad.getEmail());
//            statement.setString(5, entidad.getCarrera());
//            statement.setInt(6, entidad.getSemestre());
//            statement.setDate(7, new java.sql.Date(entidad.getFechaEdicion().getTime()));
//            statement.setInt(8, entidad.getId());

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
    public ArrayList<Logro> Obtener() {
        Connection con = null;
        ResultSet result = null;
        ArrayList<Logro> lista = new ArrayList<Logro>();
        
        try {
            con = dbFactoria.conectarBD();
            String sql = "select * from " + tabla + " order by id";
            
            Statement statement = con.createStatement();
            result = statement.executeQuery(sql);
            
            while (result.next()) {
                  Logro e = new Logro();
                  e.setId(result.getInt(1));
//                  e.setNombre(result.getString(2));
//                  e.setApellidos(result.getString(3));
//                  e.setDocumento(result.getString(4));
//                  e.setEmail(result.getString(5));
//                  e.setCarrera(result.getString(6));
//                  e.setSemestre(result.getInt(7));
//                  e.setFechaCreacion(result.getDate(8));
//                  e.setFechaEdicion(result.getDate(9));

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
    public Logro ObtenerPorId(int Id) {
        Connection con = null;
        ResultSet result = null;
        Logro entidad = new Logro();
        
        try {
            con = dbFactoria.conectarBD();
            String sql = "select from " + tabla + " where id = " + Id;
            
            Statement statement = con.createStatement();
            result = statement.executeQuery(sql);
            
            while (result.next()) {
//                  estudiante.setId(result.getInt(1));
//                  estudiante.setNombre(result.getString(2));
//                  estudiante.setApellidos(result.getString(3));
//                  estudiante.setDocumento(result.getString(4));
//                  estudiante.setEmail(result.getString(5));
//                  estudiante.setCarrera(result.getString(6));
//                  estudiante.setSemestre(result.getInt(7));
//                  estudiante.setFechaCreacion(result.getDate(8));
//                  estudiante.setFechaEdicion(result.getDate(9));
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
