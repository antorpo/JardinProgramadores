package UI.Controladores.Registrar;

import Core.Dominio.Entidades.Maestras.Estudiante;
import Core.Dominio.Entidades.Seguimiento.Seguimiento;
import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import Core.Dominio.Interfaces.Seguimiento.ISeguimientoServicio;
import Infraestructura.Utilidades.ReportPdf;
import UI.Vistas.Registrar.ReporteVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Esta clase permite controlar todos los eventos del reporte PDF.
 * @author Antonio
 * @version 1.0
 */
public class ReporteController implements ActionListener, IControlador {
  
    private IEstudianteServicio estudianteServicio;
    private ISeguimientoServicio seguimientoServicio;
    private ReporteVista vista;

    private ArrayList<Seguimiento> seguimiento;
    private Seguimiento seguimientoElegido;
    private Estudiante estudiante;

    public ReporteController(IEstudianteServicio estudianteServicio, ISeguimientoServicio seguimientoServicio, ReporteVista vista) {
        this.estudianteServicio = estudianteServicio;
        this.seguimientoServicio = seguimientoServicio;
        this.vista = vista;
    }

    /**
     * Este metodo recibe las acciones de la vista con su determinado comando.
     * @param ae Comando para identificar una accion de otra.
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        switch (comando) {
            case "BUSCAR":
                estudiante = estudianteServicio.ObtenerPorDocumento(vista.txt_Documento.getText());

                if (estudiante != null) {
                    cargarLogros();
                    JOptionPane.showMessageDialog(null, "Estudiante cargado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Estudiante no encontrado!", "Error:", JOptionPane.ERROR_MESSAGE);
                }

                break;

            case "REPORTE":
                reporte();
                break;
        }

    }

    /**
     * Cargar los logros disponibles al elemento combo.
     */
    public void cargarLogros() {
        vista.cb_Logros.removeAllItems();
        seguimiento = seguimientoServicio.ObtenerPorIdEstudiante(estudiante.getId(), true);

        if (seguimiento.isEmpty()) {
            vista.cb_Logros.addItem("No hay logros");
        } else {
            seguimiento.forEach((logro) -> {
                vista.cb_Logros.addItem(logro.getNombreLogro());
            });
        }
    }
    
    /**
     * Generar reporte PDF del logro seleccionado.
     */
    public void reporte() {
        if (!seguimiento.isEmpty()) {
            String seleccionado = vista.cb_Logros.getSelectedItem().toString();

            if (seleccionado != null) {
                seguimientoElegido = seguimiento.stream()
                        .filter(x -> x.getNombreLogro().equals(seleccionado))
                        .iterator().next();
                
                ReportPdf.generarPDF(seguimientoElegido, estudiante);
                limpiarBusqueda();
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un logro!", "Error:", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay logros cargados!", "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Limpiar las variables y campos para un nuevo uso.
     */
    public void limpiarBusqueda() {
        seguimiento = new ArrayList<Seguimiento>();
        seguimientoElegido = new Seguimiento();
        estudiante = null;
        vista.txt_Documento.setText("");
        vista.cb_Logros.removeAllItems();
    }

    /**
     * Dar visibilidad a la vista y iniciar sus primeras funcionalidades.
     */
    @Override
    public void iniciarVista() {
        limpiarBusqueda();
        vista.setVisible(true);
    }

}
