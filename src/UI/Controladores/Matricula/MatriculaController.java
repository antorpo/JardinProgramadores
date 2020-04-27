package UI.Controladores.Matricula;

import Core.Dominio.Entidades.Maestras.Estudiante;
import Core.Dominio.Entidades.Maestras.Grupo;
import Core.Dominio.Entidades.Maestras.Logro;
import Core.Dominio.Entidades.Maestras.Pariente;
import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteServicio;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteServicio;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroServicio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteServicio;
import UI.Vistas.Matriculas.MatriculaVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class MatriculaController implements ActionListener, IControlador {

    private IEstudianteServicio estudianteServicio;
    private IParienteServicio parienteServicio;
    private IAcudienteServicio acudienteServicio;
    private IGrupoServicio grupoServicio;
    private ILogroServicio logoServicio;
    private MatriculaVista vista;

    private ArrayList<Grupo> grupos;
    private ArrayList<Logro> logros;
    private ArrayList<Logro> logrosElegidos;

    public MatriculaController(IEstudianteServicio estudianteServicio, IParienteServicio parienteServicio, IAcudienteServicio acudienteServicio, IGrupoServicio grupoServicio, ILogroServicio logoServicio, MatriculaVista vista) {
        this.estudianteServicio = estudianteServicio;
        this.parienteServicio = parienteServicio;
        this.acudienteServicio = acudienteServicio;
        this.grupoServicio = grupoServicio;
        this.logoServicio = logoServicio;
        this.vista = vista;

        grupos = new ArrayList<Grupo>();
        logros = new ArrayList<Logro>();
        logrosElegidos = new ArrayList<Logro>();

        llenarComboTipo();
    }

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

    public void matricular() {
        // Creamos el estudiante:
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

        // Creamos el pariente:
        Pariente pariente = new Pariente();
        pariente.setNombre(vista.txt_Nombre1.getText() + " " + vista.txt_Apellidos1.getText());
        pariente.setTipoDocumento((String) vista.cb_TipoDoc1.getSelectedItem());
        pariente.setNumeroDocumento(vista.txt_Documento1.getText());
        pariente.setFechaCreacion(new Date());
        pariente.setTelefono(vista.txt_Telefono1.getText());
        pariente.setCalidad((String) vista.cb_Calidad1.getSelectedItem());
        pariente.setCelular(vista.txt_Celular1.getText());
        pariente.setDireccion(vista.txt_Direccion1.getText());

        boolean estadoEstudiante = this.estudianteServicio.Insertar(estudiante);
        boolean estadoPariente = this.parienteServicio.Insertar(pariente);
        
        JOptionPane.showMessageDialog(null, "EXITOSO!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
    }

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

    public void cargarGrupos() {
        vista.cb_Grupo.removeAllItems();
        grupos = this.grupoServicio.Obtener();

        if (grupos.isEmpty()) {
            vista.cb_Grupo.addItem("No hay grupos");
        } else {
            for (Grupo grupo : grupos) {
                vista.cb_Grupo.addItem(grupo.getNombre());
            }
        }
    }

    public void cargarLogros() {
        vista.lista.clear();
        logros = this.logoServicio.Obtener();

        logros.forEach((logro) -> {
            vista.lista.addElement(logro.getNombre());
        });
    }

    public void cancelarMatricula() {
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

    @Override
    public void iniciarVista() {
        cancelarMatricula();
        cargarLogros();
        cargarGrupos();
        vista.setVisible(true);
    }

}
