package UI.Controladores.Maestras;

import Core.Dominio.Entidades.Maestras.Grupo;
import Core.Dominio.Entidades.Maestras.Profesor;
import Core.Dominio.Interfaces.Controlador.IControlador;
import Core.Dominio.Interfaces.Maestras.Grupo.IGrupoServicio;
import UI.Vistas.Maestras.GrupoVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class GrupoController implements ActionListener, IControlador {

    private IGrupoServicio grupoServicio;
    private GrupoVista vista;
    private Grupo grupo;

    public GrupoController(IGrupoServicio grupoServicio, GrupoVista vista) {
        this.grupoServicio = grupoServicio;
        this.vista = vista;
        
        componentesEstado(false);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();

        switch (comando) {
            case "CREAR":
                Grupo entidad = new Grupo();
                entidad.setNombre(vista.txt_Nombre.getText());
                entidad.setFechaCreacion(new Date());
               
                boolean estado = this.grupoServicio.Insertar(entidad);

                if (estado) {
                    JOptionPane.showMessageDialog(null, "Grupo agregado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error agregando grupo!", "Error:", JOptionPane.ERROR_MESSAGE);
                }

                break;
                
            case "BUSCAR":
                grupo = grupoServicio.ObtenerPorId(Integer.parseInt(vista.txt_Id.getText().trim()));
               
                if (grupo != null) {
                    componentesEstado(true);
                    vista.txt_Nombre2.setText(grupo.getNombre());
                } else {
                    JOptionPane.showMessageDialog(null, "Grupo no encontrado!", "Error:", JOptionPane.ERROR_MESSAGE);
                    componentesEstado(false);
                }

                break;
            
            case "ACTUALIZAR":
                Grupo grupoActualizar = new Grupo();
                grupoActualizar.setId(grupo.getId());
                grupoActualizar.setNombre(vista.txt_Nombre2.getText());
                grupoActualizar.setFechaModificacion(new Date());

                boolean estado_actualizacion = grupoServicio.Actualizar(grupoActualizar);

                if (estado_actualizacion) {
                    JOptionPane.showMessageDialog(null, "Grupo actualizado!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error actualizando grupo!", "Error:", JOptionPane.ERROR_MESSAGE);
                }
                
                componentesEstado(false);
                limpiarActualizacion();

                break;
            
            case "REFRESCAR":
                leerGrupos();
                break;
        }
    }

    public void componentesEstado(boolean estado) {
        vista.txt_Nombre2.setEnabled(estado);
        vista.btn_Actualizar.setEnabled(estado);
        vista.panel_Editar.setEnabled(estado);
    }
    
    public void leerGrupos() {
        if (listaVacia()) {
            ArrayList<Grupo> grupos = this.grupoServicio.Obtener();
            
            for (Grupo grupo : grupos) {
                Object e[] = {grupo.getId(), grupo.getNombre()};
                vista.tabla.addRow(e);
            }
        } else {
            while (vista.tabla.getRowCount() != 0) {
                vista.tbl_Grupos.selectAll();
                vista.tabla.removeRow(vista.tbl_Grupos.getSelectedRow());
            }
            leerGrupos();
        }
    }
    
    public void limpiarActualizacion() {
        vista.txt_Nombre2.setText("");
        vista.txt_Id.setText("");
    }
    
    public boolean listaVacia(){
        return vista.tabla.getRowCount() == 0;
    }
    
    @Override
    public void iniciarVista() {
        vista.setVisible(true);
    }
}
