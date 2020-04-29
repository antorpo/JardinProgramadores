package Infraestructura.Utilidades;

import Core.Dominio.Entidades.Maestras.Estudiante;
import Core.Dominio.Entidades.Seguimiento.Seguimiento;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Esta clase contiene la utilidad para crear el reporte PDF utilizando la libreria IText
 * @author Antonio
 * @version 1.0
 */
public class ReportPdf {

    static Document documento = new Document();

    /**
     * Generamos el archivo PDF dependiendo de su configuracion.
     * @param seguimiento Contiene la informacion del seguimiento
     * @param estudiante Contiene la informacion del estudiante
     */
    public static void generarPDF(Seguimiento seguimiento, Estudiante estudiante) {

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/reporte_" + estudiante.getNumeroDocumento() + ".pdf"));

            Image header = Image.getInstance("src/Assets/Img/titulo.png");
            header.scaleToFit(500, 500);
            header.setAlignment(Chunk.ALIGN_CENTER);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Logro: " + seguimiento.getSegundaFecha() + "\n\n");

            Paragraph info = new Paragraph();
            Chunk Nombre = new Chunk("Nombre: ", FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.RED));
            Chunk Documento = new Chunk("Documento: ", FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.RED));
            Chunk Comentarios = new Chunk("Comentarios: \n", FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.RED));
            
            info.add(Nombre);
            info.add(estudiante.getNombre() + "\n");
            info.add(Documento);
            info.add(estudiante.getNumeroDocumento() + "\n");
            info.add(Comentarios);
            info.add(seguimiento.getComentario() + "\n\n\n");
           
            PdfPTable tabla = new PdfPTable(4);
         
            tabla.addCell("Logro");
            tabla.addCell("Primer Corte");
            tabla.addCell("Segundo Corte");
            tabla.addCell("Definitivo");

            tabla.addCell(seguimiento.getNombreLogro());
            tabla.addCell(seguimiento.getPrimeraCalificacion());
            tabla.addCell(seguimiento.getSegundaCalificacion());
            tabla.addCell(seguimiento.getCalificacionFinal());
            
            
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            documento.add(info);
            documento.add(tabla);

            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado en el escritorio!", "Informacion:", JOptionPane.INFORMATION_MESSAGE);

        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Error en PDF " + e);
        } catch (IOException e) {
            System.out.println("Error en la imagen " + e);
        }
    }

}
