package UI.Controladores.Maestras;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Profesor.IProfesorServicio;
import Core.Dominio.Interfaces.Vistas.IVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfesorController implements ActionListener, IControlador {
    private IProfesorServicio profesorServicio;
    private IVista vista;
    
    public ProfesorController(IProfesorServicio profesorServicio, IVista vista){
        this.profesorServicio = profesorServicio;
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
