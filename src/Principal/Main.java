package Principal;
import Core.Dominio.Interfaces.RepositorioGenerico.IDbFactoria;
import Infraestructura.BaseDeDatos.RepositorioGenerico.DbFactoria;
import javax.swing.JOptionPane;

public class Main {
    // Este sera el orquestador para no poner la capa de aplicaciones.
    
    // Conexion BD:
    private static IDbFactoria conexion;
    
    public static void main(String[] args) {
        conexion = new DbFactoria("localhost", "3306", "bd_jardin", "root", "");
       
        // Miramos si estamos conectados a la BD o no.
        if (estadoBD()) {
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Error cargando la BD!", "Error:", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
    
    public static boolean estadoBD(){
        return conexion.conectarBD()!=null;
    }
}
