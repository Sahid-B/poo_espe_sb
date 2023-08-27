/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuprincipal;

/**
 *
 * @author VERONICA
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class FormularioProfesor extends JFrame {
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JTextField txtNombre;
    private JTextField txtCedula;
    private JTextField txtApellido;
    private JTextField txtCelular;
    private JTextField txtMail;
    private JComboBox<String> comboTitulo;
    private JComboBox<String> comboEstado;

    public FormularioProfesor() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Cédula");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Mail");
        modeloTabla.addColumn("Título");
        modeloTabla.addColumn("Estado");
    }

    

    private void initComponents() {
        // Crear componentes
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblCedula = new JLabel("Cédula:");
        JLabel lblApellido = new JLabel("Apellido:");
        JLabel lblCelular = new JLabel("Celular:");
        JLabel lblMail = new JLabel("Mail:");
        JLabel lblTitulo = new JLabel("Título:");
        JLabel lblEstado = new JLabel("Estado:");

        txtNombre = new JTextField();
        txtCedula = new JTextField();
        txtApellido = new JTextField();
        txtCelular = new JTextField();
        txtMail = new JTextField();
        comboTitulo = new JComboBox<>(new String[]{"", "Licenciatura", "Ingeniería", "Maestría", "Doctorado"});
        comboEstado = new JComboBox<>(new String[]{"Activo", "Inactivo"});

        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnActualizar = new JButton("Actualizar");

        tabla = new JTable();

        // Diseño
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.YELLOW);

        JPanel panelFormulario = new JPanel(new GridLayout(7, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelFormulario.add(lblNombre);
        panelFormulario.add(txtNombre);
        panelFormulario.add(lblCedula);
        panelFormulario.add(txtCedula);
        panelFormulario.add(lblApellido);
        panelFormulario.add(txtApellido);
        panelFormulario.add(lblCelular);
        panelFormulario.add(txtCelular);
        panelFormulario.add(lblMail);
        panelFormulario.add(txtMail);
        panelFormulario.add(lblTitulo);
        panelFormulario.add(comboTitulo);
        panelFormulario.add(lblEstado);
        panelFormulario.add(comboEstado);

        JPanel panelBotones = new JPanel(new GridLayout(4, 1, 5, 5));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelBotones.add(btnNuevo);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnActualizar);

        JPanel panelTabla = new JPanel(new BorderLayout());
        panelTabla.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelTabla.add(new JScrollPane(tabla), BorderLayout.CENTER);

        JPanel panelCentral = new JPanel(new BorderLayout());
        panelCentral.add(panelFormulario, BorderLayout.CENTER);
        panelCentral.add(panelBotones, BorderLayout.EAST);

        add(panelCentral, BorderLayout.WEST);
        add(panelTabla, BorderLayout.CENTER);

        // Listeners
        btnNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });

        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarDatos();
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                eliminarDatos();
            }
        });

        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarDatos();
            }
        });

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void guardarDatos() {
        String nombre = txtNombre.getText();
        String cedula = txtCedula.getText();
        String apellido = txtApellido.getText();
        String celular = txtCelular.getText();
        String mail = txtMail.getText();
        String titulo = (String) comboTitulo.getSelectedItem();
        String estado = (String) comboEstado.getSelectedItem();

        Vector<String> fila = new Vector<>();
        fila.add(nombre);
        fila.add(cedula);
        fila.add(apellido);
        fila.add(celular);
        fila.add(mail);
        fila.add(titulo);
        fila.add(estado);

        modeloTabla.addRow(fila);
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtCedula.setText("");
        txtApellido.setText("");
        txtCelular.setText("");
        txtMail.setText("");
        comboTitulo.setSelectedIndex(0);
        comboEstado.setSelectedIndex(0);
    }

    private void eliminarDatos() {
        int selectedRow = tabla.getSelectedRow();
        if (selectedRow >= 0) {
            modeloTabla.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void actualizarDatos() {
        int selectedRow = tabla.getSelectedRow();
        if (selectedRow >= 0) {
            String nombre = txtNombre.getText();
            String cedula = txtCedula.getText();
            String apellido = txtApellido.getText();
            String celular = txtCelular.getText();
            String mail = txtMail.getText();
            String titulo = (String) comboTitulo.getSelectedItem();
            String estado = (String) comboEstado.getSelectedItem();

            modeloTabla.setValueAt(nombre, selectedRow, 0);
            modeloTabla.setValueAt(cedula, selectedRow, 1);
            modeloTabla.setValueAt(apellido, selectedRow, 2);
            modeloTabla.setValueAt(celular, selectedRow, 3);
            modeloTabla.setValueAt(mail, selectedRow, 4);
            modeloTabla.setValueAt(titulo, selectedRow, 5);
            modeloTabla.setValueAt(estado, selectedRow, 6);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormularioProfesor formularioProfesor = new FormularioProfesor();
            formularioProfesor.setVisible(true);
        });
    }
}