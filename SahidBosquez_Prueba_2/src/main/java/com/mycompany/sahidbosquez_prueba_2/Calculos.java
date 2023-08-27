/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sahidbosquez_prueba_2;

/**
 *
 * @author VERONICA
 */
public class Calculos {
   public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static double average(int[] numbers) {
        int sum = sum(numbers);
        double average = (double) sum / numbers.length;
        return average;
    }

    public static String positivoonegativo(int number) {
        if (number > 0) {
            return "Positivo";
        } else if (number < 0) {
            return "Negativo";
        } else {
            return "Zero";
        }
    }
}


