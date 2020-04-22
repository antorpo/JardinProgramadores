package Core.Servicios.Maestras.Acudiente;

import Core.Dominio.Entidades.Maestras.Acudiente;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteRepositorio;
import Core.Dominio.Interfaces.Maestras.Acudiente.IAcudienteServicio;
import java.util.ArrayList;

public class AcudienteServicio implements IAcudienteServicio {
    private IAcudienteRepositorio acudienteRepositorio;
    
    public AcudienteServicio(IAcudienteRepositorio acudienteRepositorio){
        this.acudienteRepositorio =  acudienteRepositorio;
    }

    @Override
    public boolean Insertar(Acudiente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Actualizar(Acudiente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Acudiente> Obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Acudiente ObtenerPorId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
