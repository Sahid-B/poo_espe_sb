

package formulario;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PDFGenerator {

    public static void generarReporte(ArrayList<String> datos) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("reporte_sistemahorario.pdf"));
            document.open();

            document.add(new Paragraph("Reporte de Sistema de Horario"));

            for (String dato : datos) {
                document.add(new Paragraph(dato));
            }

            document.close();

            System.out.println("Reporte del Sistema de Horario generado exitosamente.");
        } catch (DocumentException | IOException ex) {
            ex.printStackTrace();
            System.out.println("Error al generar el reporte del Sistema de Horario.");
        }
    }
}