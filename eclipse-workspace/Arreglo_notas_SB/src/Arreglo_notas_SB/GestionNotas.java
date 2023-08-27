package Arreglo_notas_SB;

import java.util.ArrayList;

public class GestionNotas {
ArrayList<Double> notas;
public GestionNotas() {
	notas=new ArrayList<>();
	
	
	
	
	
}
public void guardarNota (double n) {
	notas.add(n);
	
	
	
}

public double media() {
	double media=0;
	for (double d:notas) {
		media+=d;
		
		
		
		
	}
	
	return media/notas.size();
	
	
	
}
public int aprobados() {
	int op=0;
	for(double d:notas) {
		if(d>=14) {
			op++;
		}	
	}
	return ap;
	
}
}
