package UI.Controladores.Maestras;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import Core.Dominio.Interfaces.Vistas.IVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrupoController implements ActionListener, IControlador {
    private IGrupoServicio grupoServicio;
    private IVista vista;
    
    public GrupoController(IGrupoServicio grupoServicio, IVista vista){
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
