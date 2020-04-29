package UI.Controladores.Registrar;

import Core.Dominio.Entidades.Maestras.Estudiante;
import Core.Dominio.Entidades.Seguimiento.Seguimiento;
import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import Core.Dominio.Interfaces.Seguimiento.ISeguimientoServicio;
import Infraestructura.Utilidades.DateComparator;
import UI.Vistas.Registrar.RegistrarVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 * Esta clase permite registrar el avance en los logros de un estudiante.
 * @author Antonio
 * @version 1.0
 */
public class RegistrarController implements ActionListener, IControlador {

    private IEstudianteServicio estudianteServicio;
    private ISeguimientoServicio seguimientoServicio;
    private RegistrarVista vista;
    private Estudiante estudiante;
    private ArrayList<Seguimiento> seguimiento;
    private Seguimiento seguimientoElegido;

    public RegistrarController(IEstudianteServicio estudianteServicio, ISeguimientoServicio seguimientoServicio, RegistrarVista vista) {
        this.estudianteServicio = estudianteServicio;
        this.seguimientoServicio = seguimientoServicio;
        this.vista = vista;

        llenarComboNotas();
    }

    /**
     * Este metodo recibe las acciones de la vista con su determinado comando.
     * @param ae Comando para identificar una accion de otra.
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        switch (comando) {
            case "REGISTRAR":
                registrarAvance();
                break;

            case "BUSCAR":
                estudiante = estudianteServicio.ObtenerPorDocumento(vista.txt_Documento.getText().trim());

                if (estudiante != null) {
                    cargarLogros();
                    JOptionPane.showMessageDialog(null, "Estudiante cargado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Estudiante no encontrado!", "Error:", JOptionPane.ERROR_MESSAGE);
                }

                break;

            case "GUARDAR":
                guardarRegistro();
                break;
        }
    }

    /**
     * Cargar los logros disponibles al elemento combo.
     */
    public void cargarLogros() {
        vista.cb_Logros.removeAllItems();
        seguimiento = seguimientoServicio.ObtenerPorIdEstudiante(estudiante.getId(), false);

        if (seguimiento.isEmpty()) {
            vista.cb_Logros.addItem("No hay logros");
        } else {
            seguimiento.forEach((logro) -> {
                vista.cb_Logros.addItem(logro.getNombreLogro());
            });
        }
    }

    /**
     * Cargar la informacion del logro a registrar.
     */
    public void registrarAvance() {
        if (!seguimiento.isEmpty()) {
            String seleccionado = vista.cb_Logros.getSelectedItem().toString();

            if (seleccionado != null) {
                seguimientoElegido = seguimiento.stream()
                        .filter(x -> x.getNombreLogro().equals(seleccionado))
                        .iterator().next();

                activarRegistro();
                JOptionPane.showMessageDialog(null, "Ya puede registrar avances!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un logro!", "Error:", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay logros cargados!", "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Activamos los componentes de la vista para modificarlos en el apartado de avance.
     */
    public void activarRegistro() {
        componentesEstado(true);
        vista.lbl_LogroNombre.setText(seguimientoElegido.getNombreLogro());
        vista.txt_Comentario.setText(seguimientoElegido.getComentario());

        vista.date_Segundo.setEnabled(false);
        vista.cb_Nota2.setEnabled(false);

        if (seguimientoElegido.getPrimeraFecha() != null) {
            vista.date_Primer.setDate(seguimientoElegido.getPrimeraFecha());
            vista.cb_Nota1.setEnabled(false);
            vista.date_Primer.setEnabled(false);
            vista.date_Segundo.setEnabled(true);
            vista.cb_Nota2.setEnabled(true);
        }
    }

    /**
     * Guardamos la informacion proporcionada en cada corte del seguimiento.
     */
    public void guardarRegistro() {
        boolean ultimoCorte = false, actualizarPermiso = true;

        if (seguimientoElegido.getPrimeraFecha() == null) {
            seguimientoElegido.setPrimeraFecha(vista.date_Primer.getDate());
            seguimientoElegido.setPrimeraCalificacion((String) vista.cb_Nota1.getSelectedItem());
        }

        seguimientoElegido.setComentario(vista.txt_Comentario.getText());
        seguimientoElegido.setSegundaFecha(vista.date_Segundo.getDate());

        if (seguimientoElegido.getSegundaFecha() != null) {
            seguimientoElegido.setSegundaCalificacion((String) vista.cb_Nota2.getSelectedItem());
            seguimientoElegido.setCalificacionFinal(calcularCalificacionFinal());
            seguimientoElegido.setBimestre(true);
            ultimoCorte = true;
        }
        
        if(ultimoCorte){
            if(DateComparator.diasEntreFechas(seguimientoElegido.getSegundaFecha(), seguimientoElegido.getPrimeraFecha()) < 30){
                JOptionPane.showMessageDialog(null, "No hay diferencia de 1 mes entre las fechas!", "Error:", JOptionPane.ERROR_MESSAGE);
                actualizarPermiso = false;
            }
        }

        if (actualizarPermiso) {
            boolean estado_actualizacion = seguimientoServicio.Actualizar(seguimientoElegido);

            if (estado_actualizacion) {
                JOptionPane.showMessageDialog(null, "Reporte Actualizado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error actualizando reporte!", "Error:", JOptionPane.ERROR_MESSAGE);
            }

            componentesEstado(false);
            limpiarBusqueda();
        }
    }

    /**
     * Calcular la calificacion final dadas las dos anteriores.
     * @return Calificacion Final
     */
    public String calcularCalificacionFinal() {
        String calificacion = "No hay avance";
        String nota1 = seguimientoElegido.getPrimeraCalificacion();
        String nota2 = seguimientoElegido.getSegundaCalificacion();

        if (nota1.equals("Dificultad")) {
            if (nota2.equals("Capaz") || nota2.equals("Muy Capaz")) {
                calificacion = "Con posibilidades de Avanzar";
            }
        } else if (nota1.equals("Aceptable")) {
            if (nota2.equals("Capaz") || nota2.equals("Muy Capaz")) {
                calificacion = "Con posibilidades de Avanzar";
            }
        } else if (nota1.equals("Capaz")) {
            if (nota2.equals("Capaz") || nota2.equals("Muy Capaz")) {
                calificacion = "Con posibilidades de Avanzar";
            }
        } else if (nota1.equals("Muy Capaz")) {
            if (nota2.equals("Capaz")) {
                calificacion = "Con posibilidades de Avanzar";
            } else if (nota2.equals("Muy Capaz")) {
                calificacion = "Avanzo";
            }
        }

        return calificacion;
    }

    /**
     * Poder activar o inactivar los componentes de avance.
     * @param estado Activar o inactivar
     */
    public void componentesEstado(boolean estado) {
        vista.lbl_LogroNombre.setEnabled(estado);
        vista.date_Primer.setEnabled(estado);
        vista.date_Segundo.setEnabled(estado);
        vista.txt_Comentario.setEnabled(estado);
        vista.btn_Guardar.setEnabled(estado);
        vista.cb_Nota1.setEnabled(estado);
        vista.cb_Nota2.setEnabled(estado);
    }

    /**
     * Limpiar las variables y campos para un nuevo uso.
     */
    public void limpiarBusqueda() {
        seguimiento = new ArrayList<Seguimiento>();
        seguimientoElegido = new Seguimiento();
        vista.txt_Documento.setText("");
        vista.cb_Logros.removeAllItems();
        estudiante = null;
        vista.lbl_LogroNombre.setText("");
        vista.txt_Comentario.setText("");
        vista.date_Primer.setDate(null);
        vista.date_Segundo.setDate(null);
    }

    /**
     * Llenar los combos respecitivos a las calificaciones disponibles.
     */
    public void llenarComboNotas() {
        vista.cb_Nota1.removeAllItems();
        vista.cb_Nota1.addItem("Dificultad");
        vista.cb_Nota1.addItem("Aceptable");
        vista.cb_Nota1.addItem("Capaz");
        vista.cb_Nota1.addItem("Muy Capaz");
        vista.cb_Nota2.removeAllItems();
        vista.cb_Nota2.addItem("Dificultad");
        vista.cb_Nota2.addItem("Aceptable");
        vista.cb_Nota2.addItem("Capaz");
        vista.cb_Nota2.addItem("Muy Capaz");
    }

    /**
     * Dar visibilidad a la vista y iniciar sus primera funcionalidades.
     */
    @Override
    public void iniciarVista() {
        limpiarBusqueda();
        componentesEstado(false);
        vista.setVisible(true);
    }

}
