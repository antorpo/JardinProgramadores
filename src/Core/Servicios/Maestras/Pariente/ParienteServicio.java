package Core.Servicios.Maestras.Pariente;

import Core.Dominio.Entidades.Maestras.Pariente;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteRepositorio;
import Core.Dominio.Interfaces.Maestras.Pariente.IParienteServicio;
import java.util.ArrayList;


public class ParienteServicio implements IParienteServicio {
    private IParienteRepositorio parienteRepositorio;
    
    public ParienteServicio(IParienteRepositorio parienteRepositorio){
        this.parienteRepositorio = parienteRepositorio;
    }

    @Override
    public void Insertar(Pariente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Actualizar(Pariente entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Pariente> Obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pariente ObtenerPorId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
