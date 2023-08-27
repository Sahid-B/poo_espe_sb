
package formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class RegistroEstudiantes extends JFrame {

    
    public String getCodigo() {
        return codigoField.getText();
    }

    public String getCedula() {
        return cedulaField.getText();
    }

    public String getApellido() {
        return apellidoField.getText();
    }

    public String getNombre() {
        return nombreField.getText();
    }

    public String getEmail() {
        return emailField.getText();
    }

    public String getTelefono() {
        return telefonoField.getText();
    }

    public String getDireccion() {
        return direccionField.getText();
    }

    public String getMateria() {
        return (String) materiaComboBox.getSelectedItem();
    }

    public String getProfesor() {
        return (String) profesorComboBox.getSelectedItem();
    }

    public String getEstado() {
        return activoRadioButton.isSelected() ? "Activo" : "Inactivo";
    }
    
    private JLabel codigoLabel, cedulaLabel, apellidoLabel, nombreLabel, emailLabel, telefonoLabel, direccionLabel, materiaLabel, estadoLabel;
    private JTextField codigoField, cedulaField, apellidoField, nombreField, emailField, telefonoField, direccionField;
    private JComboBox<String> materiaComboBox;
    private JRadioButton activoRadioButton, inactivoRadioButton;
    private JButton nuevoButton, guardarButton, editarButton, eliminarButton, salirButton;
        private JTable tablaEstudiantes;
    private DefaultTableModel modeloTabla;
    private JLabel backgroundLabel;
    
    private JComboBox<String> profesorComboBox;
    
Icon nuevoIcon = new ImageIcon("nuevo.png");
Icon guardarIcon = new ImageIcon("guardar.png");
Icon editarIcon = new ImageIcon("editar.png");
Icon eliminarIcon = new ImageIcon("eliminar.png");
Icon salirIcon = new ImageIcon("salir.png");





    public RegistroEstudiantes() {
        
        
       
        setTitle("Registro de Estudiantes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        

        JPanel formularioPanel = new JPanel(new GridLayout(11, 2));

        nuevoButton = new JButton(nuevoIcon);
guardarButton = new JButton(guardarIcon);
editarButton = new JButton(editarIcon);
eliminarButton = new JButton(eliminarIcon);
salirButton = new JButton(salirIcon);

        codigoLabel = new JLabel("Código:");
        cedulaLabel = new JLabel("Cédula:");
        apellidoLabel = new JLabel("Apellido:");
        nombreLabel = new JLabel("Nombre:");
        emailLabel = new JLabel("Email:");
        telefonoLabel = new JLabel("Teléfono:");
        direccionLabel = new JLabel("Dirección:");
        materiaLabel = new JLabel("Materia:");
        estadoLabel = new JLabel("Estado:");

        codigoField = new JTextField();
        cedulaField = new JTextField();
        apellidoField = new JTextField();
        nombreField = new JTextField();
        emailField = new JTextField();
        telefonoField = new JTextField();
        direccionField = new JTextField();

        //voy a generear un combobox
        String[] materias = {"POO", "Física", "Cálculo"};
        materiaComboBox = new JComboBox<>(materias);

        activoRadioButton = new JRadioButton("Activo");
        inactivoRadioButton = new JRadioButton("Inactivo");
        ButtonGroup estadoGroup = new ButtonGroup();
        estadoGroup.add(activoRadioButton);
        estadoGroup.add(inactivoRadioButton);
        activoRadioButton.setSelected(true);
        
        

      formularioPanel.add(codigoLabel);
formularioPanel.add(codigoField);
formularioPanel.add(cedulaLabel);
formularioPanel.add(cedulaField);
formularioPanel.add(apellidoLabel);
formularioPanel.add(apellidoField);
formularioPanel.add(nombreLabel);
formularioPanel.add(nombreField);
formularioPanel.add(emailLabel);
formularioPanel.add(emailField);
formularioPanel.add(telefonoLabel);
formularioPanel.add(telefonoField);
formularioPanel.add(direccionLabel);
formularioPanel.add(direccionField);
formularioPanel.add(materiaLabel);
formularioPanel.add(materiaComboBox);
formularioPanel.add(estadoLabel);
formularioPanel.add(activoRadioButton);
formularioPanel.add(new JLabel()); // Espacio vacío para el inactivoRadioButton
formularioPanel.add(inactivoRadioButton);

JPanel botonesPanel = new JPanel(new FlowLayout());

// Declaraciones de JButtons y otros componentes
nuevoButton = new JButton("Nuevo");
guardarButton = new JButton("Guardar");
editarButton = new JButton("Editar");
eliminarButton = new JButton("Eliminar");
salirButton = new JButton("Salir");

// Agregar los botones al botonesPanel
botonesPanel.add(nuevoButton);
botonesPanel.add(guardarButton);
botonesPanel.add(editarButton);
botonesPanel.add(eliminarButton);
botonesPanel.add(salirButton);

String[] profesores = {"Jose", "Mario", "Juaquin"};
        profesorComboBox = new JComboBox<>(profesores);

        formularioPanel.add(new JLabel("Profesor:"));
        formularioPanel.add(profesorComboBox);

// Crear el modelo de tabla
String[] columnNames = {"Código", "Cédula", "Apellido", "Nombre", "Email", "Teléfono", "Dirección", "Materia", "Estado"};
modeloTabla = new DefaultTableModel(columnNames, 0);
tablaEstudiantes = new JTable(modeloTabla);

// Agregar la tabla al scrollPane y al JFrame
JScrollPane scrollPane = new JScrollPane(tablaEstudiantes);
add(scrollPane, BorderLayout.EAST);

// Agregar los paneles al JFrame
add(formularioPanel, BorderLayout.CENTER);
add(botonesPanel, BorderLayout.SOUTH);
        
       

        add(scrollPane, BorderLayout.EAST);

        add(formularioPanel, BorderLayout.CENTER);
        add(botonesPanel, BorderLayout.SOUTH);

        
        
        
        
        //Accion d elos botones
        
       
        
    
// Acción para el botón "Guardar"
guardarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = getCodigo();
        String cedula = getCedula();
        String apellido = getApellido();
        String nombre = getNombre();
        String email = getEmail();
        String telefono = getTelefono();
        String direccion = getDireccion();
        String materia = getMateria();
        String profesor = getProfesor();
        String estado = getEstado();

        // Agregar los datos a la tabla
        modeloTabla.addRow(new Object[]{codigo, cedula, apellido, nombre, email, telefono, direccion, materia, profesor, estado});

        // Guardar en la base de datos MongoDB
        guardarEnMongoDB(codigo, cedula, apellido, nombre, email, telefono, direccion, materia, estado);

        // Limpiar campos
        limpiarCampos();
    }

    private void guardarEnMongoDB(String codigo, String cedula, String apellido, String nombre, String email, String telefono, String direccion, String materia, String estado) {
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase baseDeDatos = mongoClient.getDatabase("estudiantes2");
            MongoCollection<Document> coleccion = baseDeDatos.getCollection("estudiantes2");

            Document documentoEstudiante = new Document("codigo", codigo)
                .append("cedula", cedula)
                .append("apellido", apellido)
                .append("nombre", nombre)
                .append("email", email)
                .append("telefono", telefono)
                .append("direccion", direccion)
                .append("materia", materia)
                .append("estado", estado);

            coleccion.insertOne(documentoEstudiante);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void limpiarCampos() {
        codigoField.setText("");
        cedulaField.setText("");
        apellidoField.setText("");
        nombreField.setText("");
        emailField.setText("");
        telefonoField.setText("");
        direccionField.setText("");
        activoRadioButton.setSelected(true);
    }
});
            
        


         

    // Acción para el botón "Nuevo"
    nuevoButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            limpiarCampos();
        }

             private void limpiarCampos() {
        codigoField.setText("");
        cedulaField.setText("");
        apellidoField.setText("");
        nombreField.setText("");
        emailField.setText("");
        telefonoField.setText("");
        direccionField.setText("");
        activoRadioButton.setSelected(true);
    }

          
    });

    // Acción para el botón "Editar"
 editarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener el índice de la fila seleccionada en la tabla
        int selectedRow = tablaEstudiantes.getSelectedRow();
        
        if (selectedRow != -1) {
            // Obtener los valores de los campos de edición
            String codigo = codigoField.getText();
            String cedula = cedulaField.getText();
            String apellido = apellidoField.getText();
            String nombre = nombreField.getText();
            String email = emailField.getText();
            String telefono = telefonoField.getText();
            String direccion = direccionField.getText();
            String materia = (String) materiaComboBox.getSelectedItem();
            String estado = activoRadioButton.isSelected() ? "Activo" : "Inactivo";

            // Actualizar los valores en el modelo de tabla
            modeloTabla.setValueAt(codigo, selectedRow, 0);
            modeloTabla.setValueAt(cedula, selectedRow, 1);
            modeloTabla.setValueAt(apellido, selectedRow, 2);
            modeloTabla.setValueAt(nombre, selectedRow, 3);
            modeloTabla.setValueAt(email, selectedRow, 4);
            modeloTabla.setValueAt(telefono, selectedRow, 5);
            modeloTabla.setValueAt(direccion, selectedRow, 6);
            modeloTabla.setValueAt(materia, selectedRow, 7);
            modeloTabla.setValueAt(estado, selectedRow, 8);
        }
    }
});

// Acción para el botón "Eliminar"
eliminarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = tablaEstudiantes.getSelectedRow();
        if (selectedRow != -1) {
            modeloTabla.removeRow(selectedRow);
        }
    }
});

// Acción para el botón "Salir"
salirButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
});
    }

    ArrayList<RegistroEstudiantes> obtenerListaEstudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
            