package UI.Controladores.Matricula;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteServicio;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteServicio;
import Core.Dominio.Interfaces.Vistas.IVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatriculaController implements ActionListener, IControlador{

    private final IEstudianteServicio estudianteServicio;
    private final IParienteServicio parienteServicio;
    private final IAcudienteServicio acudienteServicio;
    private final IGrupoServicio grupoServicio;
    private final IVista vista;

    public MatriculaController(IEstudianteServicio estudianteServicio, IParienteServicio parienteServicio, IAcudienteServicio acudienteServicio, IGrupoServicio grupoServicio, IVista vista) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
