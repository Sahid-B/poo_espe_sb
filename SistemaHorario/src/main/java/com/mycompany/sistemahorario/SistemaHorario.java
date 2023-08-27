/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemahorario;

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

public class SistemaHorario extends JFrame {
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JComboBox<String> comboHorario;
    private JTextField txtEncargado;
    private JComboBox<String> comboDisponibilidad;

    public SistemaHorario() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);
        modeloTabla.addColumn("Horario");
        modeloTabla.addColumn("Encargado");
        modeloTabla.addColumn("Disponibilidad");
    }

    private void initComponents() {
        // Crear componentes
        JLabel lblHorario = new JLabel("Horario:");
        JLabel lblEncargado = new JLabel("Encargado:");
        JLabel lblDisponibilidad = new JLabel("Disponibilidad:");

        comboHorario = new JComboBox<>(new String[]{"7:00am", "8:00am", "9:00am", "10:00am", "11:00am", "12:00pm", "1:00pm", "2:00pm", "3:00pm"});
        txtEncargado = new JTextField();
        comboDisponibilidad = new JComboBox<>(new String[]{"Sí", "No"});

        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnActualizar = new JButton("Actualizar");

        tabla = new JTable();

        // Diseño
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.YELLOW);

        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelFormulario.add(lblHorario);
        panelFormulario.add(comboHorario);
        panelFormulario.add(lblEncargado);
        panelFormulario.add(txtEncargado);
        panelFormulario.add(lblDisponibilidad);
        panelFormulario.add(comboDisponibilidad);

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
        String horario = (String) comboHorario.getSelectedItem();
        String encargado = txtEncargado.getText();
        String disponibilidad = (String) comboDisponibilidad.getSelectedItem();

        Vector<String> fila = new Vector<>();
        fila.add(horario);
        fila.add(encargado);
        fila.add(disponibilidad);

        modeloTabla.addRow(fila);
    }

    private void limpiarCampos() {
        comboHorario.setSelectedIndex(0);
        txtEncargado.setText("");
        comboDisponibilidad.setSelectedIndex(0);
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
            String horario = (String) comboHorario.getSelectedItem();
            String encargado = txtEncargado.getText();
            String disponibilidad = (String) comboDisponibilidad.getSelectedItem();

            modeloTabla.setValueAt(horario, selectedRow, 0);
            modeloTabla.setValueAt(encargado, selectedRow, 1);
            modeloTabla.setValueAt(disponibilidad, selectedRow, 2);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para actualizar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SistemaHorario().setVisible(true);
            }
        });
    }
}