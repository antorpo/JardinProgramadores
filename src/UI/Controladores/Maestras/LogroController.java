package UI.Controladores.Maestras;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroServicio;
import Core.Dominio.Interfaces.Vistas.IVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogroController implements ActionListener, IControlador {
    private ILogroServicio logroServicio;
    private IVista vista;
    
    public LogroController(ILogroServicio logroServicio, IVista vista){
        this.logroServicio = logroServicio;
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
