package UI.Controladores.Matricula;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteServicio;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteServicio;
import UI.Vistas.Matriculas.MatriculaVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatriculaController implements ActionListener, IControlador {

    private IEstudianteServicio estudianteServicio;
    private IParienteServicio parienteServicio;
    private IAcudienteServicio acudienteServicio;
    private IGrupoServicio grupoServicio;
    private MatriculaVista vista;

    public MatriculaController(IEstudianteServicio estudianteServicio, IParienteServicio parienteServicio, IAcudienteServicio acudienteServicio, IGrupoServicio grupoServicio, MatriculaVista vista) {
        this.estudianteServicio = estudianteServicio;
        this.parienteServicio = parienteServicio;
        this.acudienteServicio = acudienteServicio;
        this.grupoServicio = grupoServicio;
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarVista() {
        vista.setVisible(true);
    }

}
