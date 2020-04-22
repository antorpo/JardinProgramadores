package Core.Dominio.Interfaces.Vistas;
import Core.Dominio.Interfaces.Controlador.IControlador;

public interface IVista {
    void IniciarlizarComponentes();
    void conectaControlador(IControlador c);
}
