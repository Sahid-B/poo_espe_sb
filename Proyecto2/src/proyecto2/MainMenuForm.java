
package proyecto2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class MainMenuForm extends JFrame {
    private String nombreUsuario;

    public MainMenuForm(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;

        setTitle("Menú Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel bienvenidaLabel = new JLabel("Bienvenido, " + nombreUsuario + "!");
        bienvenidaLabel.setFont(bienvenidaLabel.getFont().deriveFont(20.0f));
        bienvenidaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(bienvenidaLabel, BorderLayout.NORTH);

        JPanel botonesPanel = new JPanel(new GridLayout(3, 1, 0, 20));
        botonesPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton opcion1Button = new JButton("Datos del Paciente");
        JButton opcion2Button = new JButton("Generador de Rectas Saludables");
        JButton opcion3Button = new JButton("Calendario saludable ");
          JButton opcion4Button = new JButton("Rutina de ejercicio"); 
      
       

        botonesPanel.add(opcion1Button);
        botonesPanel.add(opcion2Button);
        botonesPanel.add(opcion3Button);
        botonesPanel.add(opcion4Button); 
         

        add(botonesPanel, BorderLayout.CENTER);

        add(botonesPanel, BorderLayout.CENTER);

       opcion1Button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        RegistroPacientes registroPacientes = new RegistroPacientes();
        registroPacientes.setVisible(true);
    }
});

opcion2Button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        DietaPersonalizada dietaFrame = new DietaPersonalizada();
        dietaFrame.setVisible(true);
    }
});

opcion3Button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        CalendarioAlimenticio calendario = new CalendarioAlimenticio();
        calendario.setVisible(true);
    }
});

opcion4Button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        RutinaEjercicio rutinaEjercicio = new RutinaEjercicio();
        rutinaEjercicio.setVisible(true);
    }
});

 
    }
}