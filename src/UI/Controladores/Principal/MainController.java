package UI.Controladores.Principal;

import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Vistas.IVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController implements ActionListener, IControlador {

    private IVista vista;

    public MainController(IVista vista) {
        this.vista = vista;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        switch (comando) {
            case "MATRICULAS":
                System.out.println("Matriculas funcionando!");
                break;
        }
    }

    @Override
    public void iniciarVista() {
        vista.mostrarVista();
    }

}
