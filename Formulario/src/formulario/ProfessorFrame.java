/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;



import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


   public class ProfessorFrame extends JFrame {

    private JTextField nombreField, apellidoField, cedulaField, telefonoField;
    private JComboBox<String> gradoComboBox;
    private JButton guardarButton, editarButton, eliminarButton, nuevoButton, salirButton;
    private JTable tablaProfesores;
    private DefaultTableModel modeloTabla;

    public ProfessorFrame() {
        setTitle("Registro de Profesores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel formularioPanel = new JPanel(new GridLayout(5, 2));

        nombreField = new JTextField();
        apellidoField = new JTextField();
        cedulaField = new JTextField();
        telefonoField = new JTextField();

        String[] grados = {"Licenciatura", "Maestría", "Doctorado"};
        gradoComboBox = new JComboBox<>(grados);

        formularioPanel.add(new JLabel("Nombre:"));
        formularioPanel.add(nombreField);
        formularioPanel.add(new JLabel("Apellido:"));
        formularioPanel.add(apellidoField);
        formularioPanel.add(new JLabel("Cédula:"));
        formularioPanel.add(cedulaField);
        formularioPanel.add(new JLabel("Teléfono:"));
        formularioPanel.add(telefonoField);
        formularioPanel.add(new JLabel("Grado de Universidad:"));
        formularioPanel.add(gradoComboBox);

        guardarButton = new JButton("Guardar");
        editarButton = new JButton("Editar");
        eliminarButton = new JButton("Eliminar");
        nuevoButton = new JButton("Nuevo");
        salirButton = new JButton("Salir");

        JPanel botonesPanel = new JPanel(new FlowLayout());
        botonesPanel.add(guardarButton);
        botonesPanel.add(editarButton);
        botonesPanel.add(eliminarButton);
        botonesPanel.add(nuevoButton);
        botonesPanel.add(salirButton);

        String[] columnNames = {"Nombre", "Apellido", "Cédula", "Teléfono", "Grado"};
        modeloTabla = new DefaultTableModel(columnNames, 0);
        tablaProfesores = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tablaProfesores);

        add(formularioPanel, BorderLayout.WEST);  // Coloca el formulario a la izquierda
        add(scrollPane, BorderLayout.CENTER);     // Coloca la tabla en el centro
        add(botonesPanel, BorderLayout.SOUTH);    // Coloca los botones abajo

          pack();  // Ajusta el tamaño del frame automáticamente
    
        
        
        
        
        
  
    // ActionListener para el botón "Guardar"
guardarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String cedula = cedulaField.getText();
        String telefono = telefonoField.getText();
        String grado = (String) gradoComboBox.getSelectedItem();

        // Preparar un documento para MongoDB
        Document profesorDocument = new Document("nombre", nombre)
                .append("apellido", apellido)
                .append("cedula", cedula)
                .append("telefono", telefono)
                .append("grado", grado);

        // Guardar el documento en MongoDB
        guardarDocumentoEnMongo(profesorDocument);

        // Agregar los datos al modelo de la tabla
        modeloTabla.addRow(new Object[]{nombre, apellido, cedula, telefono, grado});

        // Limpiar los campos
        limpiarCampos();
    }

    private void guardarDocumentoEnMongo(Document document) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("profesor2");
            MongoCollection<Document> collection = database.getCollection("profesor2");

            collection.insertOne(document);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void limpiarCampos() {
        nombreField.setText("");
        apellidoField.setText("");
        cedulaField.setText("");
        telefonoField.setText("");
        gradoComboBox.setSelectedIndex(0);
    }
});

        // ActionListener for the "Nuevo" button
        nuevoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }

            private void limpiarCampos() {
                nombreField.setText("");
                apellidoField.setText("");
                cedulaField.setText("");
                telefonoField.setText("");
                gradoComboBox.setSelectedIndex(0);
            }
        });

        editarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = tablaProfesores.getSelectedRow();

        if (selectedRow != -1) {
            // Obtener los valores de los campos de edición
            String nombre = nombreField.getText();
            String apellido = apellidoField.getText();
            String cedula = cedulaField.getText();
            String telefono = telefonoField.getText();
            String grado = (String) gradoComboBox.getSelectedItem();

            // Actualizar los valores en el modelo de tabla
            modeloTabla.setValueAt(nombre, selectedRow, 0);
            modeloTabla.setValueAt(apellido, selectedRow, 1);
            modeloTabla.setValueAt(cedula, selectedRow, 2);
            modeloTabla.setValueAt(telefono, selectedRow, 3);
            modeloTabla.setValueAt(grado, selectedRow, 4);
        }
    }
});


        // ActionListener for the "Eliminar" button
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = tablaProfesores.getSelectedRow();
                if (selectedRow != -1) {
                    modeloTabla.removeRow(selectedRow);
                }
            }
        });

        // ActionListener for the "Salir" button
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

   }