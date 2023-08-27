/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menuprincipal;

/**
 *
 * @author VERONICA
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {

    private JPanel cardPanel;
    private CardLayout cardLayout;

    public MenuPrincipal() {
        initComponents();
    }

    private void initComponents() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenu estudiantesMenu = new JMenu("Estudiantes");
        JMenuItem estudiantesItem = new JMenuItem("Formulario de Estudiantes");
        estudiantesMenu.add(estudiantesItem);

        JMenu profesorMenu = new JMenu("Profesor");
        JMenuItem profesorItem = new JMenuItem("Formulario de Profesor");
        profesorMenu.add(profesorItem);

        JMenu horariosMenu = new JMenu("Sistema Horarios");
        JMenuItem horariosItem = new JMenuItem("Formulario de Sistema Horarios");
        horariosMenu.add(horariosItem);

        menuBar.add(fileMenu);
        menuBar.add(estudiantesMenu);
        menuBar.add(profesorMenu);
        menuBar.add(horariosMenu);

        setJMenuBar(menuBar);

        // Inicializar el CardLayout y el panel donde se mostrarán los formularios
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Agregar los formularios al panel
        cardPanel.add(new Formulario(), "ESTUDIANTES");
        cardPanel.add(new FormularioProfesor(), "PROFESOR");
        cardPanel.add(new SistemaHorario(), "HORARIOS");

        // Mostrar el primer formulario (en este caso, el de Estudiantes)
        cardLayout.show(cardPanel, "ESTUDIANTES");

        // Listener para los elementos del menú
        estudiantesItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "ESTUDIANTES");
            }
        });

        profesorItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "PROFESOR");
            }
        });

        horariosItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "HORARIOS");
            }
        });

        // Ajustes de la ventana principal
        setTitle("Menú Principal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Agregar el panel con los formularios a la ventana
        add(cardPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
        });
    }
}