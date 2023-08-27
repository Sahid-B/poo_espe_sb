
package proyecto2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import java.util.Map;

public class LoginForm extends JFrame {

    private JTextField usuarioField;
    private JPasswordField contrasenaField;
    private JButton registrarButton;
    private JButton ingresarButton;

    // Mapa para almacenar los usuarios registrados (simulación)
    private Map<String, String> usuariosRegistrados;

    public LoginForm() {
        
        
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

     ImageIcon fondoImagen = new ImageIcon("fondo.jpg"); // Ruta de la imagen de fondo
JLabel fondoLabel = new JLabel(fondoImagen);
fondoLabel.setLayout(new BorderLayout()); // Establecer el diseño del fondoLabel
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
fondoLabel.setSize(screenSize); // Asegurar que el fondo ocupe todo el espacio de la ventana
fondoLabel.setPreferredSize(screenSize); // Ajustar el tamaño preferido del fondo
add(fondoLabel, BorderLayout.CENTER);


        usuariosRegistrados = new HashMap<>();

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.setOpaque(false); // Hacer que el panel sea transparente

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setForeground(Color.WHITE); // Configurar el color del texto
        usuarioLabel.setFont(usuarioLabel.getFont().deriveFont(18.0f)); // Hacer el texto más grande
        usuarioField = new JTextField();
        usuarioField.addKeyListener(new EnterKeyListener()); // Agregar el KeyListener
        JLabel contrasenaLabel = new JLabel("Contraseña:");
        contrasenaLabel.setForeground(Color.WHITE); // Configurar el color del texto
        contrasenaLabel.setFont(contrasenaLabel.getFont().deriveFont(18.0f)); // Hacer el texto más grande
        contrasenaField = new JPasswordField();
        contrasenaField.addKeyListener(new EnterKeyListener()); // Agregar el KeyListener

        ingresarButton = new JButton("Iniciar Sesión"); // Agregar texto al botón
        registrarButton = new JButton("Registrar");
        registrarButton.addKeyListener(new EnterKeyListener()); // Agregar el KeyListener

        panel.add(usuarioLabel);
        panel.add(usuarioField);
        panel.add(contrasenaLabel);
        panel.add(contrasenaField);
        panel.add(new JLabel());
        panel.add(registrarButton);
        panel.add(new JLabel());
        panel.add(ingresarButton);

        fondoLabel.add(panel, BorderLayout.SOUTH); // Agregar el panel al fondoLabel

       

         registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (camposDeRegistroCompletos()) {
                    registrarUsuario();
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, completa ambos campos.");
                }
            }
        });

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSesion();
            }
        });
    }

    private void mostrarFormularioPrincipal(String nombreUsuario) {
        MainMenuForm mainMenuForm = new MainMenuForm(nombreUsuario);
        mainMenuForm.setVisible(true);
        dispose(); // Cerrar la ventana de inicio de sesión
    }

    

    private void registrarUsuario() {
        String usuario = usuarioField.getText();
        char[] contrasenaChars = contrasenaField.getPassword();
        String contrasena = new String(contrasenaChars);

        usuariosRegistrados.put(usuario, contrasena);
        JOptionPane.showMessageDialog(null, "Usuario registrado con éxito.");
        usuarioField.setText("");
        contrasenaField.setText("");
    }

    private void iniciarSesion() {
    String usuario = usuarioField.getText();
    char[] contrasenaChars = contrasenaField.getPassword();
    String contrasena = new String(contrasenaChars);

    if (usuariosRegistrados.containsKey(usuario) && usuariosRegistrados.get(usuario).equals(contrasena)) {
        dispose(); // Cerrar la ventana de inicio de sesión
        mostrarFormularioPrincipal(usuario); // Pasa el nombre de usuario al menú principal
    } else {
        JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Inténtalo de nuevo.");
        contrasenaField.setText("");
    }
}
    
    

    // KeyListener para detectar la tecla "Enter" y activar los botones
    private class EnterKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (e.getSource() == usuarioField || e.getSource() == contrasenaField) {
                    iniciarSesion();
                } else if (e.getSource() == registrarButton) {
                    registrarUsuario();
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {}
    }
    
    private boolean camposDeRegistroCompletos() {
        String usuario = usuarioField.getText();
        char[] contrasenaChars = contrasenaField.getPassword();
        String contrasena = new String(contrasenaChars);

        return !usuario.isEmpty() && contrasenaChars.length > 0;
    }}