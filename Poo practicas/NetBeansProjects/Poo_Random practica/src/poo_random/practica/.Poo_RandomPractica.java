/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_random.practica;

/**
 *
 * @author ESPE
 */
public class Poo_RandomPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println (Math.random());
     System.out.println (Math.random()*100);
     System.out.println ((int)(Math.random()*100));
     
     int a;
     a =(int) (Math.random()*100);
     boolean resultado  = a >=10 && a <=60;
     System.out.println(a);
     System.out.println(resultado);
     
    }
    
}
