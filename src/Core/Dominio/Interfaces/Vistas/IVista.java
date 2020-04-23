package Core.Dominio.Interfaces.Vistas;
import Core.Dominio.Interfaces.Controlador.IControlador;

public interface IVista {
    void conectaControlador(IControlador c);
    void mostrarVista();
}
