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
    public boolean Insertar(Logro entidad) {
        return logroRepositorio.Insertar(entidad);
    }

    @Override
    public boolean Eliminar(int Id) {
        return logroRepositorio.Eliminar(Id);
    }

    @Override
    public boolean Actualizar(Logro entidad) {
        return logroRepositorio.Actualizar(entidad);
    }

    @Override
    public ArrayList<Logro> Obtener() {
        return logroRepositorio.Obtener();
    }

    @Override
    public Logro ObtenerPorId(int Id) {
        return logroRepositorio.ObtenerPorId(Id);
    }
    
}
