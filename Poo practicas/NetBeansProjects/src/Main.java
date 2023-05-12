/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ESPE
 */
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Introduce la hora (en formato militar): ");
    int hora = input.nextInt();

    if (hora >= 6 && hora < 12) {
      System.out.println("Buenos días");
    } else if (hora >= 12 && hora < 18) {
      System.out.println("Buenas tardes");
    } else if (hora >= 18 && hora <= 24) {
      System.out.println("Buenas noches");
    } else {
      System.out.println("Hora inválida");
    }
  }
}
