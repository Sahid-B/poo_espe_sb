
package formulario;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class Formulario {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
        });
    }

    static void mostrarMenuPrincipal() {
        JFrame menuFrame = new JFrame("Menú Principal");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(300, 150);
        menuFrame.setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu opcionesMenu = new JMenu("Opciones");
        JMenuItem estudiantesItem = new JMenuItem("Estudiantes");
        JMenuItem profesorItem = new JMenuItem("Profesor");
        JMenuItem horariosItem = new JMenuItem("Sistema de Horarios");
        JMenuItem generarPDFItem = new JMenuItem("Generar PDF"); // Nueva opción

        opcionesMenu.add(estudiantesItem);
        opcionesMenu.add(profesorItem);
        opcionesMenu.add(horariosItem);
        opcionesMenu.add(generarPDFItem); // Agregar la nueva opción al menú
        menuBar.add(opcionesMenu);

        estudiantesItem.addActionListener(e -> openEstudiantesFrame());
        profesorItem.addActionListener(e -> openProfesorFrame());
        horariosItem.addActionListener(e -> openSchedulingSystemFrame());
        generarPDFItem.addActionListener(e -> generarPDF()); // Acción para generar PDF

        menuFrame.setJMenuBar(menuBar);
        menuFrame.setVisible(true);
    }
    private static void generarPDF() {
    // Obtener la lista de estudiantes desde la ventana adecuada
    RegistroEstudiantes estudiantesFrame = new RegistroEstudiantes();
    ArrayList<RegistroEstudiantes> listaEstudiantes = estudiantesFrame.obtenerListaEstudiantes();

    // Llamar al generador de PDF
    PDFGenerator.generarReporteEstudiantes(listaEstudiantes);
}
     private static void openEstudiantesFrame() {
        SwingUtilities.invokeLater(() -> {
            RegistroEstudiantes estudiantesFrame = new RegistroEstudiantes();
            estudiantesFrame.setVisible(true);
        });
    }

    private static void openProfesorFrame() {
        SwingUtilities.invokeLater(() -> {
            ProfessorFrame profesorFrame = new ProfessorFrame();
            profesorFrame.setVisible(true);
        });
    }

    private static void openSchedulingSystemFrame() {
        SwingUtilities.invokeLater(() -> {
            SchedulingSystemFrame horariosFrame = new SchedulingSystemFrame();
            horariosFrame.setVisible(true);
        });
    }
} 