package UI.Controladores.Principal;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteServicio;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroServicio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteServicio;
import Core.Dominio.Interfaces.Maestras.Profesor.IProfesorServicio;
import UI.Controladores.Maestras.GrupoController;
import UI.Controladores.Maestras.LogroController;
import UI.Controladores.Maestras.ProfesorController;
import UI.Controladores.Matricula.MatriculaController;
import UI.Vistas.Maestras.GrupoVista;
import UI.Vistas.Maestras.LogroVista;
import UI.Vistas.Maestras.ProfesorVista;
import UI.Vistas.Matriculas.MatriculaVista;
import UI.Vistas.Principal.PrincipalVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener, IControlador {

    private IAcudienteServicio acudienteServicio;
    private IEstudianteServicio estudianteServicio;
    private IGrupoServicio grupoServicio;
    private ILogroServicio logroServicio;
    private IParienteServicio parienteServicio;
    private IProfesorServicio profesorServicio;
    private PrincipalVista vista;

    private ProfesorVista profesorVista;
    private IControlador profesorController;
    
    private GrupoVista grupoVista;
    private IControlador grupoController;
    
    private LogroVista logroVista;
    private IControlador logroController;

    private MatriculaVista matriculaVista;
    private IControlador matriculaController;
    
    
    public MainController(PrincipalVista vista, IAcudienteServicio acudienteServicio, IEstudianteServicio estudianteServicio, IGrupoServicio grupoServicio, ILogroServicio logroServicio, IParienteServicio parienteServicio, IProfesorServicio profesorServicio) {
        this.vista = vista;
        this.acudienteServicio = acudienteServicio;
        this.estudianteServicio = estudianteServicio;
        this.grupoServicio = grupoServicio;
        this.logroServicio = logroServicio;
        this.parienteServicio = parienteServicio;
        this.profesorServicio = profesorServicio;
        
        profesoresMaestra();
        gruposMaestra();
        logrosMaestra();
        matriculas();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        switch (comando) {
            case "MAESTRA_PROFESORES":
                profesorController.iniciarVista();
                profesorVista.conectaControlador(profesorController);
                break;
                
            case "MAESTRA_GRUPOS":
                grupoController.iniciarVista();
                grupoVista.conectaControlador(grupoController);
                break; 
             
            case "MAESTRA_LOGROS":
                logroController.iniciarVista();
                logroVista.conectaControlador(logroController);
                break;
            
            case "MATRICULAS":
                matriculaController.iniciarVista();
                matriculaVista.conectaControlador(matriculaController);
                break;            
        }
    }

    public void profesoresMaestra() {
        profesorVista = new ProfesorVista();
        profesorController = new ProfesorController(profesorServicio, profesorVista);
    }
    
    public void gruposMaestra() {
        grupoVista = new GrupoVista();
        grupoController = new GrupoController(grupoServicio, grupoVista);
    }
    
    public void logrosMaestra() {
        logroVista = new LogroVista();
        logroController = new LogroController(logroServicio, logroVista);
    }
    
    public void matriculas() {
        matriculaVista = new MatriculaVista();
        matriculaController = new MatriculaController(estudianteServicio, parienteServicio,acudienteServicio, grupoServicio,logroServicio, matriculaVista);
    }

    @Override
    public void iniciarVista() {
        vista.setVisible(true);
    }

}
