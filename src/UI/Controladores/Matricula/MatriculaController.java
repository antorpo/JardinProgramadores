package UI.Controladores.Matricula;

import Core.Dominio.Entidades.Maestras.Estudiante;
import Core.Dominio.Entidades.Maestras.Grupo;
import Core.Dominio.Entidades.Maestras.Logro;
import Core.Dominio.Entidades.Maestras.Pariente;
import Core.Dominio.Entidades.Seguimiento.Seguimiento;
import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteServicio;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroServicio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteServicio;
import Core.Dominio.Interfaces.Seguimiento.ISeguimientoServicio;
import UI.Vistas.Matriculas.MatriculaVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

 
/**
 * Esta clase permite controlar todos los eventos de la matricula.
 * @author Antonio
 * @version 1.0
 */
public class MatriculaController implements ActionListener, IControlador {

    private IEstudianteServicio estudianteServicio;
    private IParienteServicio parienteServicio;
    private IGrupoServicio grupoServicio;
    private ILogroServicio logoServicio;
    private ISeguimientoServicio seguimientoServicio;
    private MatriculaVista vista;

    private ArrayList<Grupo> grupos;
    private ArrayList<Logro> logros;
    private ArrayList<Logro> logrosElegidos;

    public MatriculaController(IEstudianteServicio estudianteServicio, IParienteServicio parienteServicio, IGrupoServicio grupoServicio, ILogroServicio logoServicio, ISeguimientoServicio seguimientoServicio, MatriculaVista vista) {
        this.estudianteServicio = estudianteServicio;
        this.parienteServicio = parienteServicio;
        this.grupoServicio = grupoServicio;
        this.logoServicio = logoServicio;
        this.seguimientoServicio = seguimientoServicio;
        this.vista = vista;

        grupos = new ArrayList<Grupo>();
        logros = new ArrayList<Logro>();
        logrosElegidos = new ArrayList<Logro>();

        llenarComboTipo();
    }

    /**
     * Este metodo recibe las acciones de la vista con su determinado comando.
     * @param ae Comando para identificar una accion de otra.
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        switch (comando) {
            case "ADICIONAR":
                adicionarLogro();
                break;

            case "REMOVER":
                removerLogro();
                break;

            case "INFORMACION":
                String mensaje = "Los logros son la medida para medir el desarrollo en la formacion del estudiante. \n"
                        + "Cada logro se realiza en 2 meses de formacion!";

                JOptionPane.showMessageDialog(null, mensaje, "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                break;

            case "MATRICULAR":
                matricular();
                break;
        }
    }

    /**
     * Creamos un estudiante con los datos de la matricula.
     * @return Entidad estudiante
     */
    public Estudiante crearEstudiante() {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(vista.txt_Nombre.getText() + " " + vista.txt_Apellidos.getText());
        estudiante.setTipoDocumento((String) vista.cb_TipoDoc.getSelectedItem());
        estudiante.setNumeroDocumento(vista.txt_Documento.getText());
        estudiante.setFechaCreacion(new Date());
        estudiante.setEdad(Integer.parseInt(vista.txt_Edad.getText()));
        estudiante.setTalla(Double.parseDouble(vista.txt_Estatura.getText()));
        estudiante.setPeso(Double.parseDouble(vista.txt_Peso.getText()));
        estudiante.setGenero(vista.rb_Masculino.isSelected() ? "Masculino" : "Femenino");
        estudiante.setProblemas(vista.txt_Observaciones.getText());

        return estudiante;
    }

    /**
     * Creamos un pariente con los datos de la matricula.
     * @return Entidad pariente
     */
    public Pariente crearPariente() {
        Pariente pariente = new Pariente();
        pariente.setNombre(vista.txt_Nombre1.getText() + " " + vista.txt_Apellidos1.getText());
        pariente.setTipoDocumento((String) vista.cb_TipoDoc1.getSelectedItem());
        pariente.setNumeroDocumento(vista.txt_Documento1.getText());
        pariente.setFechaCreacion(new Date());
        pariente.setTelefono(vista.txt_Telefono1.getText());
        pariente.setCalidad((String) vista.cb_Calidad1.getSelectedItem());
        pariente.setCelular(vista.txt_Celular1.getText());
        pariente.setDireccion(vista.txt_Direccion1.getText());

        return pariente;
    }

    /**
     * Creamos la matricula, con el estudiante, pariente y logros.
     */
    public void matricular() {
        if (logrosElegidos.size() < 6) {
            JOptionPane.showMessageDialog(null, "Tiempo minimo de formacion 12 meses!", "Advertencia:", JOptionPane.WARNING_MESSAGE);
        } else {

            boolean estadoEstudiante = this.estudianteServicio.Insertar(crearEstudiante());
            boolean estadoPariente = this.parienteServicio.Insertar(crearPariente());

            if (estadoEstudiante && estadoPariente) {
                Seguimiento seguimiento;
                boolean estadoFinal = true;
                int idEstudiante = this.estudianteServicio.idUltimoRegistro();

                for (Logro logro : logrosElegidos) {
                    seguimiento = new Seguimiento();
                    seguimiento.setIdLogro(logro.getId());
                    seguimiento.setIdEstudiante(idEstudiante);
                    seguimiento.setNombreLogro(logro.getNombre());

                    boolean estado = this.seguimientoServicio.Insertar(seguimiento);

                    if (!estado) {
                        estadoFinal = false;
                        break;
                    }
                }

                if (estadoFinal) {
                    JOptionPane.showMessageDialog(null, "Matricula exitosa!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                    limpiarMatricula();
                } else {
                    JOptionPane.showMessageDialog(null, "Matricula fallida!", "Error:", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error en la matricula!", "Error:", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Adicionamos logros a la lista de matriculados por el estudiante.
     */
    public void adicionarLogro() {
        String seleccionado = vista.list_LogrosDisponibles.getSelectedValue();

        if (seleccionado != null) {

            if (!logroRepetido(seleccionado)) {

                Logro logro = logros.stream()
                        .filter(x -> x.getNombre().equals(seleccionado))
                        .iterator().next();

                matricularLogro(logro);

            } else {
                JOptionPane.showMessageDialog(null, "Logro ya matriculado!", "Advertencia:", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un logro!", "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Guardamos en la persistencia los diferentes logros matriculados.
     * @param entidad Logro a matricular
     */
    public void matricularLogro(Logro entidad) {
        vista.lista2.clear();
        vista.lbl_Tiempo.setText("0");

        if (entidad != null) {
            logrosElegidos.add(entidad);
        }

        logrosElegidos.forEach((logro) -> {
            vista.lista2.addElement(logro.getNombre());
            String tiempo = String.valueOf(Integer.parseInt(vista.lbl_Tiempo.getText()) + 2);
            vista.lbl_Tiempo.setText(tiempo);
        });
    }

    /**
     * Removemos logros a la lista de matriculados por el estudiante.
     */
    public void removerLogro() {
        String seleccionado = vista.list_LogrosMatriculados.getSelectedValue();

        if (seleccionado != null) {
            Logro logro = logros.stream()
                    .filter(x -> x.getNombre().equals(seleccionado))
                    .iterator().next();

            logrosElegidos.remove(logro);
            matricularLogro(null);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un logro!", "Error:", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Calculamos si un logro ya existe en los que estan matriculados.
     * @param nombre Nombre del logro
     * @return Encontrado o no en los logros matriculados.
     */
    public boolean logroRepetido(String nombre) {
        boolean encontrado = false;

        for (Logro logro : logrosElegidos) {
            if (logro.getNombre().equals(nombre)) {
                encontrado = true;
                break;
            }
        }

        return encontrado;
    }
    
    /**
     * Cargar los grupos disponibles al elemento combo.
     */
    public void cargarGrupos() {
        vista.cb_Grupo.removeAllItems();
        grupos = this.grupoServicio.Obtener();

        if (grupos.isEmpty()) {
            vista.cb_Grupo.addItem("No hay grupos");
        } else {
            grupos.forEach((grupo) -> {
                vista.cb_Grupo.addItem(grupo.getNombre());
            });
        }
    }

    /**
     * Cargar los logros disponibles al elemento combo.
     */
    public void cargarLogros() {
        vista.lista.clear();
        logros = this.logoServicio.Obtener();

        logros.forEach((logro) -> {
            vista.lista.addElement(logro.getNombre());
        });
    }

    /**
     * Limpiar las variables y campos para un nuevo uso.
     */
    public void limpiarMatricula() {
        logros = new ArrayList<Logro>();
        logrosElegidos = new ArrayList<Logro>();
        grupos = new ArrayList<Grupo>();
        vista.lista.clear();
        vista.lista2.clear();
        vista.txt_Nombre.setText("");
        vista.txt_Apellidos.setText("");
        vista.txt_Documento.setText("");
        vista.txt_Edad.setText("");
        vista.txt_Estatura.setText("");
        vista.txt_Peso.setText("");
        vista.txt_Observaciones.setText("");
        vista.txt_Nombre1.setText("");
        vista.txt_Apellidos1.setText("");
        vista.txt_Documento1.setText("");
        vista.txt_Telefono1.setText("");
        vista.txt_Direccion1.setText("");
        vista.txt_Celular1.setText("");
    }

    /**
     * Cargar los tipos de documentos disponibles al elemento combo.
     */
    public void llenarComboTipo() {
        vista.cb_TipoDoc.removeAllItems();
        vista.cb_TipoDoc.addItem("Registro Civil");
        vista.cb_TipoDoc.addItem("Tarjeta de Identidad");
        vista.cb_TipoDoc1.removeAllItems();
        vista.cb_TipoDoc1.addItem("Cedula de Ciudadania");
        vista.cb_TipoDoc1.addItem("Cedula de Extranjeria");
        vista.cb_TipoDoc1.addItem("Pasaporte");
        vista.cb_Calidad1.removeAllItems();
        vista.cb_Calidad1.addItem("Padre/Madre");
        vista.cb_Calidad1.addItem("Familiar");
        vista.cb_Calidad1.addItem("Acudiente");
    }
    
    /**
     * Dar visibilidad a la vista y iniciar sus primera funcionalidades.
     */
    @Override
    public void iniciarVista() {
        limpiarMatricula();
        cargarLogros();
        cargarGrupos();
        vista.setVisible(true);
    }

}
