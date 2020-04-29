package Principal;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Acudiente.*;
import Core.Dominio.Interfaces.Maestras.Estudiante.*;
import Core.Dominio.Interfaces.Maestras.Grupo.*;
import Core.Dominio.Interfaces.Maestras.Logro.*;
import Core.Dominio.Interfaces.Maestras.Pariente.*;
import Core.Dominio.Interfaces.Maestras.Profesor.*;
import Core.Servicios.Maestras.Acudiente.AcudienteServicio;
import Core.Servicios.Maestras.Estudiante.EstudianteServicio;
import Core.Servicios.Maestras.Grupo.GrupoServicio;
import Core.Servicios.Maestras.Logro.LogroServicio;
import Core.Servicios.Maestras.Pariente.ParienteServicio;
import Core.Servicios.Maestras.Profesor.ProfesorServicio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import Core.Dominio.Interfaces.Seguimiento.ISeguimientoRepositorio;
import Core.Dominio.Interfaces.Seguimiento.ISeguimientoServicio;
import Core.Servicios.Seguimiento.SeguimientoServicio;
import Infraestructura.BaseDeDatos.RepositorioGenerico.DbFactoria;
import Infraestructura.BaseDeDatos.Repositorio.Maestras.*;
import Infraestructura.BaseDeDatos.Repositorio.Seguimiento.SeguimientoRepositorio;
import UI.Controladores.Principal.MainController;
import UI.Vistas.Principal.PrincipalVista;
import javax.swing.JOptionPane;

/**
 * Esta clase es el corazon del aplicativo o en otras palabras el orquestador, asigna
 * la conexion a la base da datos y instancia los diferentes servicio y repositorios.
 * @author Antonio
 * @version 1.0
 */
public class Main {
    // Este sera el orquestador para no poner la capa de aplicaciones.

    // Conexion BD:
    private static IDbFactoria conexion;

    // Servicios:
    private static IAcudienteServicio acudienteServicio;
    private static IEstudianteServicio estudianteServicio;
    private static IGrupoServicio grupoServicio;
    private static ILogroServicio logroServicio;
    private static IParienteServicio parienteServicio;
    private static IProfesorServicio profesorServicio;
    private static ISeguimientoServicio seguimientoServicio;

    // Repositorios:
    private static IAcudienteRepositorio acudienteRepositorio;
    private static IEstudianteRepositorio estudianteRepositorio;
    private static IGrupoRepositorio grupoRepositorio;
    private static ILogroRepositorio logroRepositorio;
    private static IParienteRepositorio parienteRepositorio;
    private static IProfesorRepositorio profesorRepositorio;
    private static ISeguimientoRepositorio seguimientoRepositorio;

    public static void main(String[] args) {
        // Creamos la conexion con la base de datos local.
        conexion = new DbFactoria("localhost", "3306", "bd_jardin", "root", "");
        
        // Conectamos los repositorios.
        acudienteRepositorio = new AcudienteRepositorio(conexion, "acudiente");
        estudianteRepositorio = new EstudianteRepositorio(conexion, "estudiante");
        grupoRepositorio = new GrupoRepositorio(conexion, "grupo");
        logroRepositorio = new LogroRepositorio(conexion, "logro");
        parienteRepositorio = new ParienteRepositorio(conexion, "pariente");
        profesorRepositorio = new ProfesorRepositorio(conexion, "profesor");
        seguimientoRepositorio = new SeguimientoRepositorio(conexion, "seguimiento");

        // Inyectamos las dependencias comunicandonos por medio de interfaces.
        acudienteServicio = new AcudienteServicio(acudienteRepositorio);
        estudianteServicio = new EstudianteServicio(estudianteRepositorio);
        grupoServicio = new GrupoServicio(grupoRepositorio);
        logroServicio = new LogroServicio(logroRepositorio);
        parienteServicio = new ParienteServicio(parienteRepositorio);
        profesorServicio = new ProfesorServicio(profesorRepositorio);
        seguimientoServicio = new SeguimientoServicio(seguimientoRepositorio);

        // Miramos si estamos conectados a la BD o no.
        if (estadoBD()) {
            // Creamos vista-controlador:
            PrincipalVista mainVista = new PrincipalVista();
            IControlador mainControlador = new MainController(mainVista, acudienteServicio, estudianteServicio, grupoServicio, logroServicio, parienteServicio, profesorServicio, seguimientoServicio);

            // Vincular vista-controlador:
            mainControlador.iniciarVista();
            mainVista.conectaControlador(mainControlador);
        } else {
            JOptionPane.showMessageDialog(null, "Error cargando la BD!", "Error:", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    /**
     * Comprobamos la conexion a la base de datos.
     * @return estado de la conexion
     */
    public static boolean estadoBD() {
        return conexion.conectarBD() != null;
    }
}
