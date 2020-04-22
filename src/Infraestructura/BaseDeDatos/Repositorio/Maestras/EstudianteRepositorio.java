package Infraestructura.BaseDeDatos.Repositorio.Maestras;

import Core.Dominio.Entidades.Maestras.Estudiante;
import Core.Dominio.Interfaces.Maestras.Estudiante.IEstudianteRepositorio;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import java.util.ArrayList;

public class EstudianteRepositorio implements IEstudianteRepositorio {
    private IDbFactoria dbFactoria;
    
    public EstudianteRepositorio(IDbFactoria dbFactoria){
        this.dbFactoria = dbFactoria;
    }

    @Override
    public void Insertar(Estudiante entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Actualizar(Estudiante entidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Estudiante> Obtener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Estudiante ObtenerPorId(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
