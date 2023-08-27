package proyecto2;


import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class RutinaEjercicio extends JFrame {
      private JButton bajarPesoButton;
    private JButton tonificarMusculosButton;
    private JButton guardarPDFButton; // Nuevo botón para guardar en PDF
    private JTextArea rutinaTextArea;
    private JTable rutinaTable;

  

   private String[][] rutinasBajarPeso = {
    {
        "Caminata rápida durante 30 minutos",
        "Sentadillas: 3 series de 15 repeticiones",
        "Burpees: 3 series de 10 repeticiones",
        "Jumping jacks: 3 series de 20 repeticiones",
        "Plancha: Mantén durante 30 segundos, descansa 15 segundos, repite 3 veces"
    },
    {
        "Ciclismo estacionario: 20 minutos",
        "Zancadas: 3 series de 12 repeticiones por pierna",
        "Saltos de cuerda: 3 series de 1 minuto cada una",
        "Flexiones de brazos: 3 series de 10 repeticiones",
        "Descanso activo: Baila durante 15 minutos"
    },
    {
        "Caminata en subida: 25 minutos",
        "Sentadillas con salto: 3 series de 12 repeticiones",
        "Plancha lateral: Mantén durante 40 segundos en cada lado, repite 3 veces",
        "Burpees con saltos laterales: 3 series de 8 repeticiones",
        "Estiramientos: 15 minutos"
    },
    {
        "Natación: 30 minutos",
        "Zancadas con pesas: 3 series de 10 repeticiones por pierna",
        "Plancha con elevación de pierna: 3 series de 10 repeticiones por pierna",
        "Jumping jacks con salto amplio: 3 series de 20 repeticiones",
        "Yoga o estiramientos: 20 minutos"
    },
    {
        "Caminata rápida: 40 minutos",
        "Sentadillas sumo: 3 series de 15 repeticiones",
        "Flexiones de brazos en diamante: 3 series de 12 repeticiones",
        "Plancha con rodilla al pecho: 3 series de 15 repeticiones por pierna",
        "Estiramientos: 15 minutos"
    },
    {
        "Ciclismo al aire libre: 45 minutos",
        "Saltos de cuerda con doble giro: 3 series de 1 minuto cada una",
        "Flexiones de brazos con palmada: 3 series de 8 repeticiones",
        "Plancha con toque de hombro: 3 series de 15 repeticiones por lado",
        "Yoga o estiramientos: 20 minutos"
    },
    {
        "Entrenamiento en intervalos (HIIT): 20 minutos",
        "Sentadillas isométricas: Mantén durante 45 segundos, descansa 15 segundos, repite 3 veces",
        "Burpees con rodilla al codo: 3 series de 10 repeticiones",
        "Plancha con extensión de brazo: 3 series de 12 repeticiones",
        "Estiramientos y relajación: 20 minutos"
    }
};


   private String[][] rutinasTonificarMusculos = {
    {
        "Levantamiento de pesas: 3 series de 10 repeticiones",
        "Flexiones de brazos: 3 series de 12 repeticiones",
        "Sentadillas con pesas: 3 series de 15 repeticiones",
        "Plancha lateral: Mantén durante 30 segundos en cada lado, repite 3 veces",
        "Descanso activo: Yoga durante 20 minutos"
    },
    {
        "Press de piernas: 3 series de 12 repeticiones",
        "Dominadas: 3 series de 8 repeticiones",
        "Remo con barra: 3 series de 10 repeticiones",
        "Crunches: 3 series de 15 repeticiones",
        "Descanso activo: Estiramientos durante 15 minutos"
    },
    {
        "Sentadillas búlgaras: 3 series de 10 repeticiones por pierna",
        "Flexiones declinadas: 3 series de 10 repeticiones",
        "Press de hombros: 3 series de 12 repeticiones",
        "Plancha con elevación de brazo: 3 series de 12 repeticiones por brazo",
        "Estiramientos: 15 minutos"
    },
    {
        "Peso muerto: 3 series de 8 repeticiones",
        "Fondos en paralelas: 3 series de 12 repeticiones",
        "Pull-ups: 3 series de 6 repeticiones",
        "Mountain climbers: 3 series de 20 repeticiones por pierna",
        "Descanso activo: Yoga durante 20 minutos"
    },
    {
        "Press de banca: 3 series de 10 repeticiones",
        "Dominadas supinas: 3 series de 8 repeticiones",
        "Remo con mancuernas: 3 series de 12 repeticiones",
        "Plancha con extensión de cadera: 3 series de 15 repeticiones",
        "Estiramientos: 15 minutos"
    },
    {
        "Sentadillas hack: 3 series de 12 repeticiones",
        "Fondos en anillas: 3 series de 8 repeticiones",
        "Press militar: 3 series de 10 repeticiones",
        "Abdominales en V: 3 series de 15 repeticiones",
        "Descanso activo: Estiramientos durante 15 minutos"
    },
    {
        "Entrenamiento en circuito: 4 ejercicios, 3 rondas",
        "Dominadas pronas: 3 series de 6 repeticiones",
        "Press Arnold: 3 series de 10 repeticiones",
        "Plancha lateral con elevación de pierna: 3 series de 12 repeticiones por pierna",
        "Estiramientos y relajación: 20 minutos"
    }
};


        public RutinaEjercicio() {
        setTitle("Rutina de Ejercicio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel opcionesPanel = new JPanel(new GridLayout(1, 2, 20, 0));
        opcionesPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        bajarPesoButton = new JButton("Bajar de Peso");
        tonificarMusculosButton = new JButton("Tonificar los Músculos");
        
        guardarPDFButton = new JButton("Guardar en PDF");
        opcionesPanel.add(guardarPDFButton); // Agrega el botón al panel de opciones


        opcionesPanel.add(bajarPesoButton);
        opcionesPanel.add(tonificarMusculosButton);

        add(opcionesPanel, BorderLayout.NORTH);

        rutinaTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(rutinaTable);
        add(scrollPane, BorderLayout.CENTER);

        bajarPesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarRutina(rutinasBajarPeso);
            }
        });
 guardarPDFButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarRutinaComoPDF(); // Llama a la función para guardar en PDF
            }
        });
        tonificarMusculosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarRutina(rutinasTonificarMusculos);
            }
        });
    }

 private void mostrarRutina(String[][] rutinas) {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Día");
    model.addColumn("Ejercicios");

    for (int i = 0; i < rutinas.length; i++) {
        String[] ejercicios = rutinas[i];
        StringBuilder ejerciciosText = new StringBuilder();
        for (int j = 0; j < ejercicios.length; j++) {
            ejerciciosText.append(j + 1).append(". ").append(ejercicios[j]).append("\n");
        }
        model.addRow(new Object[]{ "Día " + (i + 1), ejerciciosText.toString() });
    }

    rutinaTable.setModel(model);

    // Ajustar la altura de las filas para que las rutinas sean más legibles
    rutinaTable.setRowHeight(80); // Cambia el valor según tus necesidades
}
 
  private void guardarRutinaComoPDF() {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("rutina_ejercicio.pdf"));
            document.open();

            DefaultTableModel model = (DefaultTableModel) rutinaTable.getModel();
            for (int row = 0; row < model.getRowCount(); row++) {
                String day = model.getValueAt(row, 0).toString();
                String exercises = model.getValueAt(row, 1).toString();

                Paragraph paragraph = new Paragraph(day + "\n" + exercises);
                document.add(paragraph);
            }

            document.close();
            JOptionPane.showMessageDialog(this, "Rutina guardada en PDF correctamente.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

 

}