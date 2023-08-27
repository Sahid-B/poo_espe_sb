
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.ArithmeticException;

public class excepcion {

 public static void main(String[] args) {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 try {
 String nombre = br.readLine(); 
 int div = 8/2; 
 System.out.println(div);
 
 }catch (IOException e) {
 e.printStackTrace();
 }catch (ArithmeticException e) { 

 System.out.println("No se puede dividir por cero");

 }

 }

 }
