package Paquete;

import java.util.Arrays;
import java.util.Scanner;

public class NotasAlumno {
	Scanner leer = new Scanner(System.in);
	private int Evaluacion;
	private int[] notasEV1 = new int[6];
	private int[] notasEV2 = new int[6];
	private int[] notasEV3 = new int[6];
	int contador1 = 0;
	int contador2 = 0;
	int contador3 = 0;
	
	public NotasAlumno(int e) {
		this.Evaluacion = e;
	
	}
	
	
	public void asignarNota(int Evaluacion) {
		
		if (Evaluacion == 1) {
		do {
				
				this.notasEV1[contador1] = leer.nextInt();
				contador1++;
				System.out.println(contador1);
			
		}while(contador1<notasEV1.length);}
		
		if (Evaluacion == 2) {
		do {
			
			this.notasEV2[contador2] = leer.nextInt();
			contador2++;
			
			
		}while(contador2<notasEV2.length);}
		
		
		if (Evaluacion == 3) {
		do {
			
			this.notasEV3[contador3] = leer.nextInt();
			contador3++;
			
		}while(contador3<notasEV3.length);}
		
		
		

	}
	
	public String notasToString() {
		for (int i = 0; i < notasEV1.length; i++) {
			int auxiliar = this.notasEV1[i];
			return 
		}
		
	}
	
	
	
	
	
	

	
}
