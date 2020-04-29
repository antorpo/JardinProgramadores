package Core.Servicios.Seguimiento;

import Core.Dominio.Entidades.Seguimiento.Seguimiento;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteRepositorio;
import Core.Dominio.Interfaces.Seguimiento.ISeguimientoRepositorio;
import Core.Dominio.Interfaces.Seguimiento.ISeguimientoServicio;
import java.util.ArrayList;

public class SeguimientoServicio implements ISeguimientoServicio {
    
    private ISeguimientoRepositorio seguimientoRepositorio;
    
    public SeguimientoServicio(ISeguimientoRepositorio seguimientoRepositorio){
        this.seguimientoRepositorio = seguimientoRepositorio;
    }
    
    @Override
    public boolean Insertar(Seguimiento entidad) {
        return seguimientoRepositorio.Insertar(entidad);
    }

    @Override
    public boolean Eliminar(int Id) {
        return seguimientoRepositorio.Eliminar(Id);
    }

    @Override
    public boolean Actualizar(Seguimiento entidad) {
        return seguimientoRepositorio.Actualizar(entidad);
    }

    @Override
    public ArrayList<Seguimiento> Obtener() {
        return seguimientoRepositorio.Obtener();
    }

    @Override
    public Seguimiento ObtenerPorId(int Id) {
        return seguimientoRepositorio.ObtenerPorId(Id);
    }

    @Override
    public ArrayList<Seguimiento> ObtenerPorIdEstudiante(int id, boolean bimestre) {
        return seguimientoRepositorio.ObtenerPorIdEstudiante(id, bimestre);
    }
    
}
