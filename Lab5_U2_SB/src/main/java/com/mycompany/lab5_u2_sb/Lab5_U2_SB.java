/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lab5_u2_sb;
import java.io.*;

/**
 *
 * @author ESPE
 */
public class Lab5_U2_SB {

    public static void main(String[] args) {
 
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ESPE\\Desktop\\POO3.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ESPE\\Desktop\\POO3.txt"))) {

           
            bw.write("algo");
            bw.newLine(); // 
            bw.write("hola");
            bw.newLine();
            bw.flush(); 

            
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea); 
                linea = br.readLine(); 
            }

        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}










