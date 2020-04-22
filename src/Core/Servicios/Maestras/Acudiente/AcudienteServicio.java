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
        return acudienteRepositorio.Insertar(entidad);
    }

    @Override
    public boolean Eliminar(int Id) {
        return acudienteRepositorio.Eliminar(Id);
    }

    @Override
    public boolean Actualizar(Acudiente entidad) {
        return acudienteRepositorio.Actualizar(entidad);
    }

    @Override
    public ArrayList<Acudiente> Obtener() {
        return acudienteRepositorio.Obtener();
    }

    @Override
    public Acudiente ObtenerPorId(int Id) {
        return acudienteRepositorio.ObtenerPorId(Id);
    }
    
}
