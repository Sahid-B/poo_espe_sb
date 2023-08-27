
package proyecto2;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CalendarioAlimenticio extends JFrame {
    private List<String> recetasDesayuno;
    private List<String> recetasAlmuerzo;
    private List<String> recetasMerienda;
    private JButton cambiarRecetasButton;
    private JButton guardarPDFButton;
    private JTable calendarioTable;

    private JTextArea calendarioTextArea;

    public CalendarioAlimenticio() {
        setTitle("Calendario Alimenticio");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
      
     recetasDesayuno = new ArrayList<>();
recetasDesayuno.add("Bol de Avena y Yogur con Frutas");
recetasDesayuno.add("Smoothie de Frutas y Frutos Secos");
recetasDesayuno.add("Avena con Frutas y Nueces");
recetasDesayuno.add("Tostadas de Aguacate y Huevo");
recetasDesayuno.add("Panqueques de Plátano");
recetasDesayuno.add("Yogur con Granola y Miel");
recetasDesayuno.add("Batido de Proteína con Frutas");
recetasDesayuno.add("Huevos Revueltos con Verduras");
recetasDesayuno.add("Tortilla de Espinacas y Queso");
recetasDesayuno.add("Muffins de Avena y Arándanos");
recetasDesayuno.add("Sandwich de Clara de Huevo y Espinacas");
recetasDesayuno.add("Tostadas de Almendra y Banano");
recetasDesayuno.add("Yogur Griego con Frutos Rojos");
recetasDesayuno.add("Mango con Crema de Coco");
recetasDesayuno.add("Pan Integral con Hummus y Tomate");
recetasDesayuno.add("Batido de Espinacas y Piña");
recetasDesayuno.add("Tostadas de Huevo y Aguacate");
recetasDesayuno.add("Yogur con Frutas Mixtas");
recetasDesayuno.add("Galletas de Avena y Manzana");
recetasDesayuno.add("Bol de Chía con Frutas");

recetasAlmuerzo = new ArrayList<>();
recetasAlmuerzo.add("Ensalada de Pavo con Frutas y Nueces");
recetasAlmuerzo.add("Bowl de Batata y Frijoles Negros");
recetasAlmuerzo.add("Wrap de Salmón con Aguacate");
recetasAlmuerzo.add("Tostadas de Tofu con Tomate y Almendras");
recetasAlmuerzo.add("Pollo a la Parrilla con Verduras Asadas");
recetasAlmuerzo.add("Ensalada de Atún con Vegetales Variados");
recetasAlmuerzo.add("Bol de Quinua y Verduras");
recetasAlmuerzo.add("Tofu Salteado con Arroz Integral");
recetasAlmuerzo.add("Ensalada de Garbanzos y Pepino");
recetasAlmuerzo.add("Batatas Rellenas con Pavo y Verduras");
recetasAlmuerzo.add("Salmón al Horno con Espárragos y Limón");
recetasAlmuerzo.add("Wrap de Pollo con Verduras");
recetasAlmuerzo.add("Omelette de Claras con Espinacas y Tomates");
recetasAlmuerzo.add("Bowl de Lentejas y Espinacas");
recetasAlmuerzo.add("Tacos de Pavo con Guacamole");
recetasAlmuerzo.add("Pasta Integral con Brócoli y Pesto");
recetasAlmuerzo.add("Ensalada de Pollo con Hummus");
recetasAlmuerzo.add("Bol de Couscous y Verduras Asadas");
recetasAlmuerzo.add("Hamburguesa de Pavo con Ensalada");
recetasAlmuerzo.add("Tofu a la Parrilla con Verduras");

recetasMerienda = new ArrayList<>();
recetasMerienda.add("Bol de Avena y Yogur con Frutas");
recetasMerienda.add("Smoothie de Frutas y Frutos Secos");
recetasMerienda.add("Tostadas de Tofu con Tomate y Almendras");
recetasMerienda.add("Batido de Proteína");
recetasMerienda.add("Palitos de Apio con Hummus");
recetasMerienda.add("Yogur con Nueces y Miel");
recetasMerienda.add("Galletas de Avena y Pasas");
recetasMerienda.add("Manzana con Mantequilla de Almendras");
recetasMerienda.add("Tostadas de Pan Integral con Queso Cottage");
recetasMerienda.add("Huevo Cocido y Zanahorias Baby");
recetasMerienda.add("Barritas de Granola Caseras");
recetasMerienda.add("Bol de Frutas Mixtas");
recetasMerienda.add("Té Verde con Almendras");
recetasMerienda.add("Yogur de Coco con Nueces");
recetasMerienda.add("Batido de Papaya y Jengibre");
recetasMerienda.add("Rollitos de Jamón y Queso");
recetasMerienda.add("Tostadas de Aguacate y Tomate");
recetasMerienda.add("Galletas de Almendra y Chía");
recetasMerienda.add("Mix de Frutos Secos y Arándanos");
recetasMerienda.add("Pan Integral con Hummus y Pepino");



      cambiarRecetasButton = new JButton("Cambiar Recetas");
        guardarPDFButton = new JButton("Guardar en PDF");

        JPanel panel = new JPanel();
        panel.add(cambiarRecetasButton);
        panel.add(guardarPDFButton);

        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.BLUE);
        headerPanel.setPreferredSize(new Dimension(0, 40));
        JLabel headerLabel = new JLabel("HORARIO SALUDABLE");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        headerPanel.add(headerLabel);

        JPanel calendarPanel = new JPanel(new BorderLayout());
        calendarPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        calendarPanel.add(headerPanel, BorderLayout.NORTH);

        String[] columnNames = {"Día", "Desayuno", "Almuerzo", "Merienda"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 7);

        calendarioTable = new JTable(model);
        calendarioTable.setRowHeight(80);
        calendarioTable.getColumnModel().getColumn(0).setMaxWidth(100);
        calendarPanel.add(new JScrollPane(calendarioTable), BorderLayout.CENTER);

        add(panel, BorderLayout.NORTH);
        add(calendarPanel, BorderLayout.CENTER);

        generarCalendario();

        cambiarRecetasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generarCalendario();
            }
        });

        guardarPDFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarTablaComoPDF();
            }
        });
    }

    private void generarCalendario() {
        Random random = new Random();
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        for (int i = 0; i < 7; i++) {
            calendarioTable.setValueAt(diasSemana[i], i, 0);
            calendarioTable.setValueAt(recetasDesayuno.get(random.nextInt(recetasDesayuno.size())), i, 1);
            calendarioTable.setValueAt(recetasAlmuerzo.get(random.nextInt(recetasAlmuerzo.size())), i, 2);
            calendarioTable.setValueAt(recetasMerienda.get(random.nextInt(recetasMerienda.size())), i, 3);
        }
    }

  private void guardarTablaComoPDF() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);

        if (option == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getPath() + ".pdf";

            Document document = new Document(PageSize.A4);
            try {
                PdfWriter.getInstance(document, new FileOutputStream(filePath));
                document.open();

                PdfPTable pdfTable = new PdfPTable(calendarioTable.getColumnCount());
                pdfTable.setWidthPercentage(100);

                Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
                Font regularFont = FontFactory.getFont(FontFactory.HELVETICA);

                for (int i = 0; i < calendarioTable.getColumnCount(); i++) {
                    PdfPCell cell = new PdfPCell(new Phrase(calendarioTable.getColumnName(i), headerFont));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    pdfTable.addCell(cell);
                }

                for (int row = 0; row < calendarioTable.getRowCount(); row++) {
                    for (int col = 0; col < calendarioTable.getColumnCount(); col++) {
                        Object value = calendarioTable.getValueAt(row, col);
                        PdfPCell cell = new PdfPCell(new Phrase(value.toString(), regularFont));
                        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                        pdfTable.addCell(cell);
                    }
                }

                document.add(pdfTable);
                document.close();

                JOptionPane.showMessageDialog(this, "Tabla guardada como PDF exitosamente.");
            } catch (FileNotFoundException | DocumentException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al guardar la tabla como PDF.");
            }
        }
    }

    }