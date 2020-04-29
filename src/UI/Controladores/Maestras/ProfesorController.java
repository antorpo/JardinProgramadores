package UI.Controladores.Maestras;

import Core.Dominio.Entidades.Maestras.Profesor;
import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Profesor.IProfesorServicio;
import UI.Vistas.Maestras.ProfesorVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Esta clase permite controlar todos los eventos de la maestra de profesores.
 * @author Antonio
 * @version 1.0
 */
public class ProfesorController implements ActionListener, IControlador {

    private IProfesorServicio profesorServicio;
    private ProfesorVista vista;
    private Profesor profesor;

    public ProfesorController(IProfesorServicio profesorServicio, ProfesorVista vista) {
        this.profesorServicio = profesorServicio;
        this.vista = vista;
        
        llenarComboTipos();
        componentesEstado(false);
    }

    /**
     * Este metodo recibe las acciones de la vista con su determinado comando.
     * @param ae Comando para identificar una accion de otra.
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        switch (comando) {
            case "LIMPIAR_CREACION":
                limpiarCreacion();
                break;
            case "LIMPIAR_ACTUALIZACION":
                limpiarActualizacion();
                break;

            case "CREAR":
                Profesor entidad = new Profesor();
                entidad.setNombre(vista.txt_Nombre.getText() + " " + vista.txt_Apellidos.getText());
                entidad.setTipoDocumento((String) vista.cb_TipoDoc.getSelectedItem());
                entidad.setNumeroDocumento(vista.txt_Documento.getText());
                entidad.setFechaCreacion(new Date());
                entidad.setTelefono(vista.txt_Telefono.getText());
                entidad.setEspecialidad(vista.txt_Espe.getText());
                entidad.setGenero(vista.rb_Masculino.isSelected() ? "Masculino" : "Femenino");

                boolean estado = this.profesorServicio.Insertar(entidad);

                if (estado) {
                    JOptionPane.showMessageDialog(null, "Profesor agregado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error agregando profesor!", "Error:", JOptionPane.ERROR_MESSAGE);
                }

                break;

            case "BUSCAR":
                profesor = profesorServicio.ObtenerPorDocumento(vista.txt_Documento2.getText().trim());

                if (profesor != null) {
                    componentesEstado(true);
                    vista.txt_Nombre2.setText(profesor.getNombre());
                    vista.txt_Telefono2.setText(profesor.getTelefono());
                    vista.txt_Espe2.setText(profesor.getEspecialidad());
                    vista.txt_Doc2.setText(profesor.getNumeroDocumento());
                    vista.txt_Doc2.setEnabled(false);
                    vista.cb_TipoDoc2.setSelectedItem(profesor.getTipoDocumento());
                    vista.cb_TipoDoc2.setEnabled(false);

                    if (profesor.getGenero().equals("Masculino")) {
                        vista.rb_Masculino2.setSelected(true);
                    } else {
                        vista.rb_Femenino2.setSelected(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Profesor no encontrado!", "Error:", JOptionPane.ERROR_MESSAGE);
                    componentesEstado(false);
                    limpiarActualizacion();
                }

                break;

            case "ACTUALIZAR":
                Profesor profesorActualizar = new Profesor();
                profesorActualizar.setId(profesor.getId());
                profesorActualizar.setNombre(vista.txt_Nombre2.getText());
                profesorActualizar.setTipoDocumento((String) vista.cb_TipoDoc2.getSelectedItem());
                profesorActualizar.setNumeroDocumento(vista.txt_Doc2.getText());
                profesorActualizar.setTelefono(vista.txt_Telefono2.getText());
                profesorActualizar.setEspecialidad(vista.txt_Espe2.getText());
                profesorActualizar.setGenero(vista.rb_Masculino2.isSelected() ? "Masculino" : "Femenino");
                profesorActualizar.setFechaModificacion(new Date());

                boolean estado_actualizacion = profesorServicio.Actualizar(profesorActualizar);

                if (estado_actualizacion) {
                    JOptionPane.showMessageDialog(null, "Profesor actualizado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error actualizando profesor!", "Error:", JOptionPane.ERROR_MESSAGE);
                }
                
                componentesEstado(false);
                limpiarActualizacion();

                break;
            
            case "REFRESCAR":
                leerProfesores();
                break;
        }
    }

     /**
     * Cargar los logros disponibles al elemento combo.
     */
    public void llenarComboTipos() {
        vista.cb_TipoDoc.removeAllItems();
        vista.cb_TipoDoc.addItem("Cedula de Ciudadania");
        vista.cb_TipoDoc.addItem("Cedula de Extranjeria");
        vista.cb_TipoDoc.addItem("Pasaporte");
        vista.cb_TipoDoc2.removeAllItems();
        vista.cb_TipoDoc2.addItem("Cedula de Ciudadania");
        vista.cb_TipoDoc2.addItem("Cedula de Extranjeria");
        vista.cb_TipoDoc2.addItem("Pasaporte");
    }

    /**
     * Limpiar las variables y campos para un nuevo uso, apartado creacion.
     */
    public void limpiarCreacion() {
        vista.txt_Nombre.setText("");
        vista.txt_Apellidos.setText("");
        vista.txt_Documento.setText("");
        vista.txt_Telefono.setText("");
        vista.txt_Espe.setText("");
    }

    /**
     * Limpiar las variables y campos para un nuevo uso, apartado actualizacion.
     */
    public void limpiarActualizacion() {
        vista.txt_Documento2.setText("");
        vista.txt_Nombre2.setText("");
        vista.txt_Doc2.setText("");
        vista.txt_Telefono2.setText("");
        vista.txt_Espe2.setText("");
    }
    
    /**
     * Poder activar o inactivar los componentes de avance.
     * @param estado Activar o inactivar
     */
    public void componentesEstado(boolean estado) {
        vista.txt_Nombre2.setEnabled(estado);
        vista.txt_Telefono2.setEnabled(estado);
        vista.txt_Espe2.setEnabled(estado);
        vista.txt_Doc2.setEnabled(estado);
        vista.cb_TipoDoc2.setEnabled(estado);
        vista.rb_Masculino2.setEnabled(estado);
        vista.rb_Femenino2.setEnabled(estado);
        vista.btn_Actualizar.setEnabled(estado);
        vista.btn_Limpiar2.setEnabled(estado);
        vista.panel_Editar.setEnabled(estado);
    }
    
    /**
     * Leemos los profesores guardados en la persistencia.
     */
    public void leerProfesores() {
        if (listaVacia()) {
            ArrayList<Profesor> profesores = this.profesorServicio.Obtener();
            
            for (Profesor profesor : profesores) {
                Object e[] = {profesor.getId(), profesor.getNombre(), profesor.getTipoDocumento(), 
                profesor.getNumeroDocumento(), profesor.getTelefono(), profesor.getEspecialidad(), profesor.getGenero()};
                vista.tabla.addRow(e);
            }
        } else {
            while (vista.tabla.getRowCount() != 0) {
                vista.tbl_Profesores.selectAll();
                vista.tabla.removeRow(vista.tbl_Profesores.getSelectedRow());
            }
            leerProfesores();
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
