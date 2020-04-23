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
import Infraestructura.BaseDeDatos.RepositorioGenerico.DbFactoria;
import Infraestructura.BaseDeDatos.Repositorio.Maestras.*;
import UI.Controladores.Principal.MainController;
import UI.Vistas.Principal.PrincipalVista;
import javax.swing.JOptionPane;

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

    // Repositorios:
    private static IAcudienteRepositorio acudienteRepositorio;
    private static IEstudianteRepositorio estudianteRepositorio;
    private static IGrupoRepositorio grupoRepositorio;
    private static ILogroRepositorio logroRepositorio;
    private static IParienteRepositorio parienteRepositorio;
    private static IProfesorRepositorio profesorRepositorio;

    public static void main(String[] args) {
        conexion = new DbFactoria("localhost", "3306", "bd_jardin", "root", "");
        acudienteRepositorio = new AcudienteRepositorio(conexion, "acudiente");
        estudianteRepositorio = new EstudianteRepositorio(conexion, "estudiante");
        grupoRepositorio = new GrupoRepositorio(conexion, "grupo");
        logroRepositorio = new LogroRepositorio(conexion, "logro");
        parienteRepositorio = new ParienteRepositorio(conexion, "pariente");
        profesorRepositorio = new ProfesorRepositorio(conexion, "profesor");

        acudienteServicio = new AcudienteServicio(acudienteRepositorio);
        estudianteServicio = new EstudianteServicio(estudianteRepositorio);
        grupoServicio = new GrupoServicio(grupoRepositorio);
        logroServicio = new LogroServicio(logroRepositorio);
        parienteServicio = new ParienteServicio(parienteRepositorio);
        profesorServicio = new ProfesorServicio(profesorRepositorio);

        // Miramos si estamos conectados a la BD o no.
        if (estadoBD()) {
            // Creamos vista-controlador:
            PrincipalVista mainVista = new PrincipalVista();
            IControlador mainControlador = new MainController(mainVista, acudienteServicio, estudianteServicio, grupoServicio, logroServicio, parienteServicio, profesorServicio);

            // Vincular vista-controlador:
            mainControlador.iniciarVista();
            mainVista.conectaControlador(mainControlador);
        } else {
            JOptionPane.showMessageDialog(null, "Error cargando la BD!", "Error:", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    public static boolean estadoBD() {
        return conexion.conectarBD() != null;
    }
}
