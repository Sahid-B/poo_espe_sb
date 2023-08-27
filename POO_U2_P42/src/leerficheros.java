import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;

public class leerficheros {
	
	public static void main(String[] args)  throws FileNotFoundException {
		
		 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ESPE\\Desktop\\POO.txt"));
		String linea;

			try {
				while ((linea=br.readLine())!=null) {
				System.out.println(linea);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

		
			
			
		
		
		
	
		
		
	
	
	
	
	


