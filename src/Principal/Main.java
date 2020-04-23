package Principal;
import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteRepositorio;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteServicio;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteRepositorio;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoRepositorio;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroRepositorio;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroServicio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteRepositorio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteServicio;
import Core.Dominio.Interfaces.Maestras.Profesor.IProfesorRepositorio;
import Core.Dominio.Interfaces.Maestras.Profesor.IProfesorServicio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import Core.Dominio.Interfaces.Vistas.IVista;
import Core.Servicios.Maestras.Acudiente.AcudienteServicio;
import Infraestructura.BaseDeDatos.RepositorioGenerico.DbFactoria;
import UI.Controladores.Principal.MainController;
import UI.Vistas.Maestras.ProfesorVista;
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
       
        // Miramos si estamos conectados a la BD o no.
        if (estadoBD()) {
            mainCreacion();
        }else{
            JOptionPane.showMessageDialog(null, "Error cargando la BD!", "Error:", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
    public static void mainCreacion(){
        // Creamos vista-controlador:
        IVista mainVista = new PrincipalVista();;
        IControlador mainControlador = new MainController(mainVista);
       
        // Vincular vista-controlador:
        mainControlador.iniciarVista();
        mainVista.conectaControlador(mainControlador);  
    }
    
    
    public static void profesoresCreacion(){
        // Creamos vista-controlador:
        IVista mainVista = new PrincipalVista();;
        IControlador mainControlador = new MainController(mainVista);
       
        // Vincular vista-controlador:
        mainControlador.iniciarVista();
        mainVista.conectaControlador(mainControlador);  
    }
    
    
   
    public static boolean estadoBD(){
        return conexion.conectarBD()!=null;
    }
}
