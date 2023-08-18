
package com.mycompany.estudiantes2;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class RegistroEstudiantes extends JFrame {

    private JLabel codigoLabel, cedulaLabel, apellidoLabel, nombreLabel, emailLabel, telefonoLabel, direccionLabel, materiaLabel, estadoLabel;
    private JTextField codigoField, cedulaField, apellidoField, nombreField, emailField, telefonoField, direccionField;
    private JComboBox<String> materiaComboBox;
    private JRadioButton activoRadioButton, inactivoRadioButton;
    private JButton nuevoButton, guardarButton, editarButton, eliminarButton, salirButton;
        private JTable tablaEstudiantes;
    private DefaultTableModel modeloTabla;
    private JLabel backgroundLabel;

    public RegistroEstudiantes() {
       
        setTitle("Registro de Estudiantes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel formularioPanel = new JPanel(new GridLayout(11, 2));

        
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
                // Aquí puedes agregar la lógica para guardar los datos en la tabla
                // y realizar otras operaciones necesarias
            }
        });
    
  guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los datos de los campos
                String codigo = codigoField.getText();
                String cedula = cedulaField.getText();
                String apellido = apellidoField.getText();
                String nombre = nombreField.getText();
                String email = emailField.getText();
                String telefono = telefonoField.getText();
                String direccion = direccionField.getText();
                String materia = (String) materiaComboBox.getSelectedItem();
                String estado = activoRadioButton.isSelected() ? "Activo" : "Inactivo";

                // Agregar los datos a la tabla
                modeloTabla.addRow(new Object[]{codigo, cedula, apellido, nombre, email, telefono, direccion, materia, estado});

                // Limpiar los campos después de guardar
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
        int selectedRow = tablaEstudiantes.getSelectedRow();
        if (selectedRow != -1) {
                // Obtener los datos de la fila seleccionada
                String codigo = (String) modeloTabla.getValueAt(selectedRow, 0);
                String cedula = (String) modeloTabla.getValueAt(selectedRow, 1);
                String apellido = (String) modeloTabla.getValueAt(selectedRow, 2);
                String nombre = (String) modeloTabla.getValueAt(selectedRow, 3);
                String email = (String) modeloTabla.getValueAt(selectedRow, 4);
                String telefono = (String) modeloTabla.getValueAt(selectedRow, 5);
                String direccion = (String) modeloTabla.getValueAt(selectedRow, 6);
                String materia = (String) modeloTabla.getValueAt(selectedRow, 7);
                String estado = (String) modeloTabla.getValueAt(selectedRow, 8);

                // Llenar los campos con los datos de la fila seleccionada
                codigoField.setText(codigo);
                cedulaField.setText(cedula);
                apellidoField.setText(apellido);
                nombreField.setText(nombre);
                emailField.setText(email);
                telefonoField.setText(telefono);
                direccionField.setText(direccion);
                materiaComboBox.setSelectedItem(materia);
                if (estado.equals("Activo")) {
                    activoRadioButton.setSelected(true);
                } else {
                    inactivoRadioButton.setSelected(true);
                }
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
       
    }