package UI.Controladores.Principal;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteServicio;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroServicio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteServicio;
import Core.Dominio.Interfaces.Maestras.Profesor.IProfesorServicio;
import Core.Dominio.Interfaces.Seguimiento.ISeguimientoServicio;
import UI.Controladores.Maestras.GrupoController;
import UI.Controladores.Maestras.LogroController;
import UI.Controladores.Maestras.ProfesorController;
import UI.Controladores.Matricula.MatriculaController;
import UI.Controladores.Registrar.RegistrarController;
import UI.Controladores.Registrar.ReporteController;
import UI.Vistas.Maestras.GrupoVista;
import UI.Vistas.Maestras.LogroVista;
import UI.Vistas.Maestras.ProfesorVista;
import UI.Vistas.Matriculas.MatriculaVista;
import UI.Vistas.Principal.PrincipalVista;
import UI.Vistas.Registrar.RegistrarVista;
import UI.Vistas.Registrar.ReporteVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase asigna sus respectivas dependencias a cada apartado.
 * @author Antonio
 * @version 1.0
 */
public class MainController implements ActionListener, IControlador {
    
    // Inyectamos las dependencias comunicandonos por medio de interfaces.
    private IAcudienteServicio acudienteServicio;
    private IEstudianteServicio estudianteServicio;
    private IGrupoServicio grupoServicio;
    private ILogroServicio logroServicio;
    private IParienteServicio parienteServicio;
    private IProfesorServicio profesorServicio;
    private ISeguimientoServicio seguimientoServicio;
    private PrincipalVista vista;

    private ProfesorVista profesorVista;
    private IControlador profesorController;
    
    private GrupoVista grupoVista;
    private IControlador grupoController;
    
    private LogroVista logroVista;
    private IControlador logroController;

    private MatriculaVista matriculaVista;
    private IControlador matriculaController;
    
    private RegistrarVista registrarVista;
    private IControlador registrarController;
    
    private ReporteVista reporteVista;
    private IControlador reporteController;
    
    public MainController(PrincipalVista vista, IAcudienteServicio acudienteServicio, IEstudianteServicio estudianteServicio, IGrupoServicio grupoServicio, ILogroServicio logroServicio, IParienteServicio parienteServicio, IProfesorServicio profesorServicio, ISeguimientoServicio seguimientoServicio) {
        this.vista = vista;
        this.acudienteServicio = acudienteServicio;
        this.estudianteServicio = estudianteServicio;
        this.grupoServicio = grupoServicio;
        this.logroServicio = logroServicio;
        this.parienteServicio = parienteServicio;
        this.profesorServicio = profesorServicio;
        this.seguimientoServicio = seguimientoServicio;
        
        profesoresMaestra();
        gruposMaestra();
        logrosMaestra();
        matriculas();
        registrar();
        reporte();
    }

    /**
     * Este metodo recibe las acciones de la vista con su determinado comando.
     * @param ae Comando para identificar una accion de otra.
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        switch (comando) {
            case "MAESTRA_PROFESORES":
                profesorController.iniciarVista();
                break;
                
            case "MAESTRA_GRUPOS":
                grupoController.iniciarVista();
                break; 
             
            case "MAESTRA_LOGROS":
                logroController.iniciarVista();
                break;
            
            case "MATRICULAS":
                matriculaController.iniciarVista();
                break;    
                
            case "REGISTRAR":
                registrarController.iniciarVista();
                break;    
                
            case "REPORTE":
                reporteController.iniciarVista();
                break;  
        }
    }

    /**
     * Inicializamos Controlador-Vista de Profesores.
     */
    public void profesoresMaestra() {
        profesorVista = new ProfesorVista();
        profesorController = new ProfesorController(profesorServicio, profesorVista);
        profesorVista.conectaControlador(profesorController);
    }
    
    /**
     * Inicializamos Controlador-Vista de Grupos.
     */
    public void gruposMaestra() {
        grupoVista = new GrupoVista();
        grupoController = new GrupoController(grupoServicio, grupoVista);
        grupoVista.conectaControlador(grupoController);
    }
    
    /**
     * Inicializamos Controlador-Vista de Logros.
     */
    public void logrosMaestra() {
        logroVista = new LogroVista();
        logroController = new LogroController(logroServicio, logroVista);
        logroVista.conectaControlador(logroController);
    }
    
    /**
     * Inicializamos Controlador-Vista de Matriculas.
     */
    public void matriculas() {
        matriculaVista = new MatriculaVista();
        matriculaController = new MatriculaController(estudianteServicio, parienteServicio, grupoServicio,logroServicio,seguimientoServicio, matriculaVista);
        matriculaVista.conectaControlador(matriculaController);
    }
    
    /**
     * Inicializamos Controlador-Vista de Registro.
     */
    public void registrar() {
        registrarVista = new RegistrarVista();
        registrarController = new RegistrarController(estudianteServicio, seguimientoServicio,registrarVista);
        registrarVista.conectaControlador(registrarController);
    }
    
    /**
     * Inicializamos Controlador-Vista de Reporte.
     */
    public void reporte() {
        reporteVista = new ReporteVista();
        reporteController = new ReporteController(estudianteServicio, seguimientoServicio,reporteVista);
        reporteVista.conectaControlador(reporteController);
    }

    /**
     * Dar visibilidad a la vista y iniciar sus primera funcionalidades.
     */
    @Override
    public void iniciarVista() {
        vista.setVisible(true);
    }

}
