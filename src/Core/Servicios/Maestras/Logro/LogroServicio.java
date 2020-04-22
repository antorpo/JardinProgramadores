package Core.Servicios.Maestras.Logro;
import Core.Dominio.Entidades.Maestras.Logro;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroRepositorio;
import Core.Dominio.Interfaces.Maestras.Logro.ILogroServicio;
import java.util.ArrayList;

public class LogroServicio implements ILogroServicio {
    private ILogroRepositorio logroRepositorio;
    
    public LogroServicio(ILogroRepositorio logroRepositorio){
        this.logroRepositorio = logroRepositorio;
    }
    
    @Override
    public void Insertar(Logro entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Actualizar(Logro entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Logro> Obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Logro ObtenerPorId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
