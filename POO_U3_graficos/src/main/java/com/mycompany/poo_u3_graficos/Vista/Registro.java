/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo_u3_graficos.Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class Registro extends JFrame {
    //creamos una ventana grafica con Jframe
public JPanel panel;
    public Registro(){
        this.setSize(500,500);
        setTitle("Registro");
        //Para cerrar sistema
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //centrar la ventana 
        //setBounds(500,200,500,500);
        setLocationRelativeTo(null);
        colocarPanel();
        colocarEtiquetas();
        ColocarBotones();
         ColocarCajatexto();
         colocarAreaTexto();
    } 
    
    private void iniciarComponentes(){
        colocarPanel();
    }
    private void colocarPanel(){
     panel=new JPanel();
     //damos color al panel
     panel.setBackground(Color.YELLOW);
     //poner el panel sobre la ventana registro
     this.getContentPane().add(panel);
     
 
    }
   //crear etiquetas
    public void colocarEtiquetas(){
        JLabel label = new JLabel("REGISTRAR",SwingConstants.CENTER);
        panel.add(label);
        
        panel.setLayout(null);
        label.setBounds(100, 10, 350, 50);
        label.setForeground(Color.GRAY);
        label.setBackground(Color.RED);
        
        label.setOpaque(true);
        //creamos objeto
        
        JLabel label1 = new JLabel();        
        label1.setText("Nombre:");
        //Agregamos  
        panel.add(label1);
        //ubicacion
        label1.setHorizontalAlignment(HEIGHT);
        //fuente
        label1.setForeground(Color.GRAY);
        label1.setFont(new Font("arial",Font.PLAIN,15));
        label1.setBounds(50, 70, 350, 50);
        
        //Poner Imagen
        JLabel labelimagen=new JLabel();
        ImageIcon imagen =new ImageIcon("registro 2.png");
        labelimagen.setBounds(50, 105 ,50, 50);
        panel.add(labelimagen);
        
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(),Image.SCALE_SMOOTH)));
        
    }
    
    public void ColocarBotones(){
        JButton boton1 =new JButton("CLICK");
        boton1.setBounds(30, 310, 100, 50);
        panel.add(boton1);
        boton1.setEnabled(true);
        boton1.setMnemonic('a');
        
        boton1.setBorder(BorderFactory.createLineBorder(Color.ORANGE,10,true));
        
        
        
       JButton boton2 = new JButton();
ImageIcon imagen = new ImageIcon("boton.png");

panel.add(boton2);
boton2.setBounds(210, 310, 100, 50);
boton2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));

        
        
        
        
    }
    
    public void ColocarCajatexto(){
        JTextField cajaTexto1=new JTextField();
        cajaTexto1.setBounds(130, 80, 250, 30);
          panel.add(cajaTexto1);
          cajaTexto1.setText("POO");
          System.out.println("el texto de la caja es"+cajaTexto1.getText());
        
        
        
    }
    
    public void colocarAreaTexto(){
        JTextArea textarea = new JTextArea();
        
        textarea.setBounds(130, 130, 250, 150);
          panel.add(textarea);
          textarea.setText("POO");
          textarea.append("\n Escribir aqui.....");
          
          JScrollPane barra=new JScrollPane(textarea);
          //vertical
          barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
          //horizontal 
          barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
          barra.setBounds(130, 130, 250, 150);
         panel.add(barra);
        
    }
    
}
