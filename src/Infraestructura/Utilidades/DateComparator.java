package Infraestructura.Utilidades;
import java.util.Date;

/**
 * Esta clase contiene la utilidad para manejo de fechas dentro del proyecto.
 * @author Antonio
 * @version 1.0
 */
public class DateComparator {
    
    /**
     * Calcular los dias de diferencia entre dos fechas.
     * @param fecha1 Fecha 1
     * @param fecha2 Fecha 2
     * @return Dias de diferencia
     */
    public static int diasEntreFechas(Date fecha1, Date fecha2){
        return (int) ((fecha1.getTime()-fecha2.getTime())/86400000);
    }
    
}
