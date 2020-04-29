package UI.Controladores.Maestras;

import Core.Dominio.Entidades.Maestras.Logro;
import Core.Dominio.Entidades.Maestras.Profesor;
import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroServicio;
import UI.Vistas.Maestras.LogroVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Esta clase permite controlar todos los eventos de la maestra de logros.
 * @author Antonio
 * @version 1.0
 */
public class LogroController implements ActionListener, IControlador {
    private ILogroServicio logroServicio;
    private LogroVista vista;
    private Logro logro;
    
    public LogroController(ILogroServicio logroServicio, LogroVista vista){
        this.logroServicio = logroServicio;
        this.vista = vista;
        
        componentesEstado(false);
    }

    /**
     * Este metodo recibe las acciones de la vista con su determinado comando.
     * @param ae Comando para identificar una accion de otra.
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        
        switch(comando){
            case "CREAR":
                Logro entidad = new Logro();
                entidad.setNombre(vista.txt_Nombre.getText());
                entidad.setTipoLogro(vista.txt_Tipo.getText());
                entidad.setFechaCreacion(new Date());

                boolean estado = this.logroServicio.Insertar(entidad);

                if (estado) {
                    JOptionPane.showMessageDialog(null, "Logro agregado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error agregando logro!", "Error:", JOptionPane.ERROR_MESSAGE);
                }

                break;
            
            case "BUSCAR":
                logro = logroServicio.ObtenerPorId(Integer.parseInt(vista.txt_Id.getText().trim()));

                if (logro != null) {
                    componentesEstado(true);
                    vista.txt_Nombre2.setText(logro.getNombre());
                    vista.txt_Tipo2.setText(logro.getTipoLogro());

                } else {
                    JOptionPane.showMessageDialog(null, "Logro no encontrado!", "Error:", JOptionPane.ERROR_MESSAGE);
                    componentesEstado(false);
                    limpiarActualizacion();
                }

                break;
                
            case "ACTUALIZAR":
                Logro logroActualizar = new Logro();
                logroActualizar.setId(logro.getId());
                logroActualizar.setNombre(vista.txt_Nombre2.getText());
                logroActualizar.setTipoLogro(vista.txt_Tipo2.getText());
                logroActualizar.setFechaModificacion(new Date());

                boolean estado_actualizacion = logroServicio.Actualizar(logroActualizar);

                if (estado_actualizacion) {
                    JOptionPane.showMessageDialog(null, "Logro actualizado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error actualizando logro!", "Error:", JOptionPane.ERROR_MESSAGE);
                }
                
                componentesEstado(false);
                limpiarActualizacion();

                break;
             
            case "REFRESCAR":
                leerLogros();
                break;
        }
    }

    /**
     * Poder activar o inactivar los componentes de avance.
     * @param estado Activar o inactivar
     */
    public void componentesEstado(boolean estado) {
        vista.txt_Nombre2.setEnabled(estado);
        vista.txt_Tipo2.setEnabled(estado);
        vista.btn_Actualizar.setEnabled(estado);
        vista.panel_Editar.setEnabled(estado);
    }
    
    /**
     * Limpiar las variables y campos para un nuevo uso.
     */
    public void limpiarActualizacion() {
        vista.txt_Id.setText("");
        vista.txt_Nombre2.setText("");
        vista.txt_Tipo2.setText("");
    }
    
    /**
     * Leemos los logros desde la persistencia.
     */
    public void leerLogros() {
        if (listaVacia()) {
            ArrayList<Logro> logros = this.logroServicio.Obtener();

            for (Logro logro : logros) {
                Object e[] = {logro.getId(), logro.getNombre(), logro.getTipoLogro()};
                vista.tabla.addRow(e);
            }
        } else {
            while (vista.tabla.getRowCount() != 0) {
                vista.tbl_Logros.selectAll();
                vista.tabla.removeRow(vista.tbl_Logros.getSelectedRow());
            }
            leerLogros();
        }
    }
    
    /**
     * Comprobamos si la lista de la vista se encuentra vacia.
     * @return Vacia o no
     */
    public boolean listaVacia(){
        return vista.tabla.getRowCount() == 0;
    }
    
    /**
     * Dar visibilidad a la vista y iniciar sus primeras funcionalidades.
     */
    @Override
    public void iniciarVista() {
        vista.setVisible(true);
    }
}
