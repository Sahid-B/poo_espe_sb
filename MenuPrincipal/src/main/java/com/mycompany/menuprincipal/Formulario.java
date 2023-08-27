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

public class Formulario extends JFrame {

    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JComboBox<String> comboMaterias;
    private JComboBox<String> comboAprobado;
    private JTextField txtPromedio;

    public Formulario() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Materias");
        modeloTabla.addColumn("Aprobado");
        modeloTabla.addColumn("Promedio");
    }

  

    private void initComponents() {
        // Crear componentes
        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblApellido = new JLabel("Apellido:");
        JLabel lblMaterias = new JLabel("Materias:");
        JLabel lblAprobado = new JLabel("Aprobado:");
        JLabel lblPromedio = new JLabel("Promedio:");

        txtNombre = new JTextField();
        txtApellido = new JTextField();
        comboMaterias = new JComboBox<>(new String[]{"", "POO", "Calculo", "Fisica", "Matematicas"});
        comboAprobado = new JComboBox<>(new String[]{"", "Aprobado", "No Aprobado"});
        txtPromedio = new JTextField();

        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnActualizar = new JButton("Actualizar");

        tabla = new JTable();

        // Diseño
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.YELLOW);

        JPanel panelFormulario = new JPanel(new GridLayout(5, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelFormulario.add(lblNombre);
        panelFormulario.add(txtNombre);
        panelFormulario.add(lblApellido);
        panelFormulario.add(txtApellido);
        panelFormulario.add(lblMaterias);
        panelFormulario.add(comboMaterias);
        panelFormulario.add(lblAprobado);
        panelFormulario.add(comboAprobado);
        panelFormulario.add(lblPromedio);
        panelFormulario.add(txtPromedio);

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
        String apellido = txtApellido.getText();
        String materias = (String) comboMaterias.getSelectedItem();
        String aprobado = (String) comboAprobado.getSelectedItem();
        String promedio = txtPromedio.getText();

        Vector<String> fila = new Vector<>();
        fila.add(nombre);
        fila.add(apellido);
        fila.add(materias);
        fila.add(aprobado);
        fila.add(promedio);

        modeloTabla.addRow(fila);
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtApellido.setText("");
        comboMaterias.setSelectedIndex(0);
        comboAprobado.setSelectedIndex(0);
        txtPromedio.setText("");
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
            String apellido = txtApellido.getText();
            String materias = (String) comboMaterias.getSelectedItem();
            String aprobado = (String) comboAprobado.getSelectedItem();
            String promedio = txtPromedio.getText();

            modeloTabla.setValueAt(nombre, selectedRow, 0);
            modeloTabla.setValueAt(apellido, selectedRow, 1);
            modeloTabla.setValueAt(materias, selectedRow, 2);
            modeloTabla.setValueAt(aprobado, selectedRow, 3);
            modeloTabla.setValueAt(promedio, selectedRow, 4);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Formulario formulario = new Formulario();
            formulario.setVisible(true);
        });
    }
}