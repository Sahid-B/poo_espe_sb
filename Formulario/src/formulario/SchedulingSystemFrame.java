
package formulario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;


public class SchedulingSystemFrame extends JFrame {

    private JComboBox<String> responsableComboBox, horasComboBox;
    private JButton guardarButton, nuevoButton, editarButton, eliminarButton, salirButton;
    private JTable tablaHorarios;
    private DefaultTableModel modeloTabla;
    private JRadioButton computadorasRadioButton, impresora3DRadioButton, proyectorRadioButton;

    public SchedulingSystemFrame() {
        setTitle("Sistema de Horarios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel formularioPanel = new JPanel(new GridLayout(5, 2));

        String[] responsables = {"Jose", "Mario", "Juaquin"};
        responsableComboBox = new JComboBox<>(responsables);

        String[] horas = {"7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM"};
        horasComboBox = new JComboBox<>(horas);

        formularioPanel.add(new JLabel("Responsable:"));
        formularioPanel.add(responsableComboBox);
        formularioPanel.add(new JLabel("Hora Disponible:"));
        formularioPanel.add(horasComboBox);

        computadorasRadioButton = new JRadioButton("Computadoras");
        impresora3DRadioButton = new JRadioButton("Impresora 3D");
        proyectorRadioButton = new JRadioButton("Proyector");

        formularioPanel.add(new JLabel("Material:"));
        formularioPanel.add(computadorasRadioButton);
        formularioPanel.add(new JLabel()); // Espacio en blanco para alinear con la columna de horas
        formularioPanel.add(impresora3DRadioButton);
        formularioPanel.add(new JLabel()); // Espacio en blanco para alinear con la columna de horas
        formularioPanel.add(proyectorRadioButton);

        guardarButton = new JButton("Guardar");
        nuevoButton = new JButton("Nuevo");
        editarButton = new JButton("Editar");
        eliminarButton = new JButton("Eliminar");
        salirButton = new JButton("Salir");

        JPanel botonesPanel = new JPanel(new GridLayout(1, 5)); // Cambio de BorderLayout a GridLayout
        botonesPanel.add(guardarButton);
        botonesPanel.add(nuevoButton);
        botonesPanel.add(editarButton);
        botonesPanel.add(eliminarButton);
        botonesPanel.add(salirButton);

        String[] columnNames = {"Responsable", "Hora Disponible", "Material"};
        modeloTabla = new DefaultTableModel(columnNames, 0);
        tablaHorarios = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tablaHorarios);

        add(formularioPanel, BorderLayout.NORTH);
        add(botonesPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        
        //boton guardar
  guardarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String responsable = (String) responsableComboBox.getSelectedItem();
        String hora = (String) horasComboBox.getSelectedItem();
        String material = "";

        if (computadorasRadioButton.isSelected()) {
            material += "Computadoras ";
        }
        if (impresora3DRadioButton.isSelected()) {
            material += "Impresora 3D ";
        }
        if (proyectorRadioButton.isSelected()) {
            material += "Proyector ";
        }

        modeloTabla.addRow(new Object[]{responsable, hora, material});

        // Conectar y guardar en MongoDB
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("sistemahorario2");
            MongoCollection<Document> collection = database.getCollection("sistemahorario2");

            Document registro = new Document("responsable", responsable)
                    .append("hora", hora)
                    .append("material", material);

            collection.insertOne(registro);

            // Generar PDF
            ArrayList<String> datos = new ArrayList<>();
            datos.add("Responsable: " + responsable);
            datos.add("Hora: " + hora);
            datos.add("Material: " + material);

            PDFGenerator.generarReporte(datos);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
});

    

  
        nuevoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }

            private void limpiarCampos() {
                responsableComboBox.setSelectedIndex(0);
                horasComboBox.setSelectedIndex(0);
            }
        });

        editarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = tablaHorarios.getSelectedRow();

        if (selectedRow != -1) {
            // Obtener los valores de los campos de edición
            String responsable = (String) responsableComboBox.getSelectedItem();
            String hora = (String) horasComboBox.getSelectedItem();

            // Actualizar los valores en el modelo de tabla
            modeloTabla.setValueAt(responsable, selectedRow, 0);
            modeloTabla.setValueAt(hora, selectedRow, 1);
        }
    }
});

  
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tablaHorarios.getSelectedRow();
                if (selectedRow != -1) {
                    modeloTabla.removeRow(selectedRow);
                }
            }
        });

   
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    }
