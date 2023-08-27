/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formulario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    private JTextField usuarioField;
    private JPasswordField contrasenaField;
    private JButton ingresarButton;

    public LoginForm() {
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioField = new JTextField();
        JLabel contrasenaLabel = new JLabel("Contraseña:");
        contrasenaField = new JPasswordField();
        
        Icon ingresarIcon = new ImageIcon("ingresar.png"); // Ruta de la imagen
        ingresarButton = new JButton("", ingresarIcon); // Establecer el texto en blanco

        panel.add(usuarioLabel);
        panel.add(usuarioField);
        panel.add(contrasenaLabel);
        panel.add(contrasenaField);
        panel.add(new JLabel());
        panel.add(ingresarButton);

        add(panel);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioField.getText();
                char[] contrasenaChars = contrasenaField.getPassword();
                String contrasena = new String(contrasenaChars);

                if (usuario.equals("Sahid") && contrasena.equals("1234")) {
                    dispose(); // Cerrar la ventana de inicio de sesión
                    mostrarFormularioPrincipal();
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Inténtalo de nuevo.");
                    contrasenaField.setText("");
                }
            }
        });
    }

    private void mostrarFormularioPrincipal() {
        Formulario.mostrarMenuPrincipal();
    }
} 
