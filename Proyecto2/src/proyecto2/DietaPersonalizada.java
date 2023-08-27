
package proyecto2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DietaPersonalizada extends JFrame {
    private JComboBox<String> proteinasComboBox;
    private JComboBox<String> vegetalesComboBox;
    private JComboBox<String> carbohidratosComboBox;
    private JComboBox<String> grasasComboBox;

    private JButton generarRecetaButton;
    private JButton guardarButton;

    private String[] opcionesProteinas = {"Seleccionar", "Pollo", "Pescado", "Carne", "Pavo"};
    private String[] opcionesVegetales = {"Seleccionar", "Espinacas", "Brócoli", "Zanahorias", "Pimientos", "Col rizada", "Calabacín"};
    private String[] opcionesCarbohidratos = {"Seleccionar", "Arroz integral", "Quinua", "Batatas", "Avena", "Pan integral"};
    private String[] opcionesGrasas = {"Seleccionar", "Aguacate", "Nueces", "Almendras", "Aceite de oliva"};
    

    private String[] recetasAleatorias = {
            "Receta de Ensalada Nutritiva",
            "Plato de Proteína Balanceada",
            "Bowl Energético",
            "Salmón al Horno con Verduras",
            "Pollo con Guarnición Variada",
            "Ensalada de Pollo con Espinacas y Aguacate",
"Filete de Pescado con Brócoli al Vapor",
"Tacos de Carne con Pimientos Asados",
"Bowl de Quinua con Zanahorias y Almendras",
"Batido de Avena y Frutas con Leche Descremada",
"Salmón al Horno con Espárragos",
"Wrap de Pavo con Pan Integral y Lechuga",
"Yogur Griego con Nueces y Frutas Mixtas",
"Ensalada de Quinua con Tofu y Verduras Variadas",
"Huevos Revueltos con Espinacas y Pan Integral",
            "Tacos de Carne con Pimientos Asados",
            "Ensalada de Espinacas y Fresas",
"Tortilla de Espinacas",
"Espinacas Salteadas con Ajo",
"Brócoli al Vapor con Limón",
"Quiche de Brócoli",
"Brócoli Salteado con Almendras",
"Batido de Col Rizada y Frutas",
"Chips de Col Rizada al Horno",
"Ensalada de Col Rizada con Garbanzos",
"Calabacines Rellenos de Carne",
"Espaguetis de Calabacín con Salsa Marinara",
"Calabacines Salteados con Hierbas",
"Bol de Arroz Integral con Vegetales",
"Arroz Frito Integral",
"Ensalada de Arroz Integral y Atún",
"Batatas Asadas con Yogur",
"Pure de Batatas",
"Batatas Rellenas de Quinua",
"Ensalada de Tomate y Mozzarella con Aceite de Oliva",
"Pescado al Horno con Aceite de Oliva y Limón",
"Verduras Asadas con Aceite de Oliva",
"Parfait de Yogur con Frutas y Granola",
"Salsa de Yogur para Ensaladas",
"Batido de Frutas con Yogur Griego",
"Batido de Proteínas con Leche Descremada",
"Avena Cocida con Leche Descremada",
"Pudín de Chía con Leche Descremada",
"Smoothie de Leche de Almendra con Frutas",
"Avena Remojada con Leche de Avena",
"Café con Leche de Soja Fortificada"
            
            
            
            // Agrega más recetas aleatorias aquí
    };

    private String recetaGuardada;

    public DietaPersonalizada() {
        setTitle("Dieta Personalizada");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        proteinasComboBox = new JComboBox<>(opcionesProteinas);
        vegetalesComboBox = new JComboBox<>(opcionesVegetales);
        carbohidratosComboBox = new JComboBox<>(opcionesCarbohidratos);
        grasasComboBox = new JComboBox<>(opcionesGrasas);
        

        panel.add(new JLabel("Proteínas:"));
        panel.add(proteinasComboBox);
        panel.add(new JLabel("Vegetales variados:"));
        panel.add(vegetalesComboBox);
        panel.add(new JLabel("Fuentes de carbohidratos:"));
        panel.add(carbohidratosComboBox);
        panel.add(new JLabel("Grasas saludables:"));
        panel.add(grasasComboBox);
        

        generarRecetaButton = new JButton("Generar Receta");
        guardarButton = new JButton("Guardar Receta");
        panel.add(generarRecetaButton);
        panel.add(guardarButton);

        add(panel, BorderLayout.CENTER);

       generarRecetaButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        List<String> ingredientesSeleccionados = new ArrayList<>();
        if (!proteinasComboBox.getSelectedItem().equals("Seleccionar")) ingredientesSeleccionados.add((String) proteinasComboBox.getSelectedItem());
        if (!vegetalesComboBox.getSelectedItem().equals("Seleccionar")) ingredientesSeleccionados.add((String) vegetalesComboBox.getSelectedItem());
        if (!carbohidratosComboBox.getSelectedItem().equals("Seleccionar")) ingredientesSeleccionados.add((String) carbohidratosComboBox.getSelectedItem());
        if (!grasasComboBox.getSelectedItem().equals("Seleccionar")) ingredientesSeleccionados.add((String) grasasComboBox.getSelectedItem());
      

        if (ingredientesSeleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona al menos un ingrediente.", "Selección Incompleta", JOptionPane.WARNING_MESSAGE);
        } else {
            String recetaCorrespondiente = buscarRecetaPorIngredientes(ingredientesSeleccionados);
            
            if (recetaCorrespondiente != null) {
                JOptionPane.showMessageDialog(null, recetaCorrespondiente, "Receta Correspondiente", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna receta correspondiente a los ingredientes seleccionados.", "Receta no encontrada", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
});




        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (recetaGuardada != null) {
                    JOptionPane.showMessageDialog(null, "Receta guardada:\n\n" + recetaGuardada, "Receta Guardada", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay receta para guardar. Genera una receta primero.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

   private String buscarRecetaPorIngredientes(List<String> ingredientes) {
    for (String receta : recetasAleatorias) {
        String recetaNormalizada = receta.toLowerCase();
        boolean coincide = true;
        for (String ingrediente : ingredientes) {
            if (!recetaNormalizada.contains(ingrediente.toLowerCase())) {
                coincide = false;
                break;
            }
        }
        if (coincide) {
            return receta;
        }
    }
    return null;
}
    
}
