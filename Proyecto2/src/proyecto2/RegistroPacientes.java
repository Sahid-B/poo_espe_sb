
package proyecto2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroPacientes extends JFrame {
    private JTextField nombreField;
    private JTextField apellidoField;
    private JComboBox<Integer> edadComboBox;
    private JTextField pesoField;
    private JTextField alturaField;
    private JTextArea habitosField;
    private JButton guardarButton;
    private JButton nuevoButton;
    private JButton eliminarButton;
    private JButton salirButton;
    private JButton editarButton;
   private Connection connection;




    public RegistroPacientes() {
        setTitle("Registro de Pacientes");
        setSize(400, 500); // Ajusté la altura para dar espacio a la caja de texto más grande
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();

        JLabel apellidoLabel = new JLabel("Apellido:");
        apellidoField = new JTextField();

        JLabel edadLabel = new JLabel("Edad:");
        Integer[] edades = new Integer[99];
        for (int i = 1; i <= 99; i++) {
            edades[i - 1] = i;
        }
        edadComboBox = new JComboBox<>(edades);

        JLabel pesoLabel = new JLabel("Peso (kg):");
        pesoField = new JTextField();

        JLabel alturaLabel = new JLabel("Altura (cm):");
        alturaField = new JTextField();

        JLabel habitosLabel = new JLabel("Hábitos Alimenticios:");
        habitosField = new JTextArea();
        habitosField.setRows(15); // Ajustar el número de filas para hacerlo más grande
        habitosField.setLineWrap(true); // Activar el ajuste automático de línea
        habitosField.setWrapStyleWord(true); // Ajustar palabras completas en líneas

        JScrollPane habitosScrollPane = new JScrollPane(habitosField);

        guardarButton = new JButton("Guardar");
        nuevoButton = new JButton("Nuevo");
        eliminarButton = new JButton("Eliminar");
        editarButton = new JButton("Editar");
        salirButton = new JButton("Salir");

        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(apellidoLabel);
        panel.add(apellidoField);
        panel.add(edadLabel);
        panel.add(edadComboBox);
        panel.add(pesoLabel);
        panel.add(pesoField);
        panel.add(alturaLabel);
        panel.add(alturaField);
        panel.add(habitosLabel);
        panel.add(habitosScrollPane);

        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        buttonsPanel.add(guardarButton);
        buttonsPanel.add(nuevoButton);
        buttonsPanel.add(eliminarButton);
        buttonsPanel.add(editarButton);
        buttonsPanel.add(salirButton);

        add(panel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.SOUTH);

        

try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database.");
            System.exit(1);
        }

 // Acción para el botón "Guardar"
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String apellido = apellidoField.getText();
                int edad = (int) edadComboBox.getSelectedItem();
                double peso = Double.parseDouble(pesoField.getText());
                double altura = Double.parseDouble(alturaField.getText());
                String habitos = habitosField.getText();

                double alturaMetros = altura / 100.0;
                double imc = peso / (alturaMetros * alturaMetros);
                String mensajeIMC;

                if (imc < 18.5) {
                    mensajeIMC = "Bajo peso";
                } else if (imc >= 18.5 && imc < 25.0) {
                    mensajeIMC = "Peso ideal";
                } else {
                    mensajeIMC = "Sobrepeso";
                }

                JOptionPane.showMessageDialog(null, "IMC: " + imc + "\nEstado: " + mensajeIMC);

                // Save to the SQL database
                guardarEnSQL(nombre, apellido, edad, peso, altura, habitos);

                limpiarCampos();
            }
        });

// Acción para el botón "Editar"
editarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        int edad = (int) edadComboBox.getSelectedItem();
        double peso = Double.parseDouble(pesoField.getText());
        double altura = Double.parseDouble(alturaField.getText());
        String habitos = habitosField.getText();

        // Aquí podrías realizar la lógica para editar los datos del paciente seleccionado

        JOptionPane.showMessageDialog(null, "Paciente editado con éxito.");
        limpiarCampos();
    }
});

// Acción para el botón "Eliminar"
eliminarButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Aquí podrías realizar la lógica para eliminar el paciente seleccionado

        JOptionPane.showMessageDialog(null, "Paciente eliminado con éxito.");
        limpiarCampos();
    }
});

// Acción para el botón "Salir"
salirButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
});

// Acción para el botón "Nuevo"
nuevoButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        limpiarCampos();
    }
});


    }
private void limpiarCampos() {
    nombreField.setText("");
    apellidoField.setText("");
    pesoField.setText("");
    alturaField.setText("");
    habitosField.setText("");
    // Limpiar otros campos si los tienes
}
 private void guardarEnSQL(String nombre, String apellido, int edad, double peso, double altura, String habitos) {
        String sql = "INSERT INTO pacientes (nombre, apellido, edad, peso, altura, habitos) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setInt(3, edad);
            preparedStatement.setDouble(4, peso);
            preparedStatement.setDouble(5, altura);
            preparedStatement.setString(6, habitos);

            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado en la base de datos SQL.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al guardar en la base de datos SQL.");
        }
    }



}