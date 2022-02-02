package alumnos;

import java.util.Scanner;

public class NotasAlumno {
	private Scanner leer = new Scanner(System.in);
	private int[] notasEV1 = new int[6];
	private int[] notasEV2 = new int[6];
	private int[] notasEV3 = new int[6];
	int contador1 = 0;
	int contador2 = 0;
	int contador3 = 0;
	private Alumno alumno;

	
	public NotasAlumno() {
		 this.alumno=Aplicacion.getAlumno();
	}
	
	
	public void asignarNota(int Evaluacion) {
		
		if (Evaluacion == 1) {
		do {
				for (int i = 0; i < alumno.getCiclo().asignaturasCiclo().length; i++) {
					System.out.println(alumno.getCiclo().asignaturasCiclo()[i]);
					System.out.println();
					this.notasEV1[contador1] = leer.nextInt();
					contador1++;
					
				}
				
				
			
		}while(contador1<notasEV1.length);}
		contador1 = 0;
		
		if (Evaluacion == 2) {
		do {
			for (int i = 0; i < alumno.getCiclo().asignaturasCiclo().length; i++) {
				System.out.println(alumno.getCiclo().asignaturasCiclo()[i]);
				System.out.println();
				this.notasEV2[contador2] = leer.nextInt();
				contador2++;
				
			}
			
			
			
			
		}while(contador2<notasEV2.length);}
		contador2 = 0;
		
		
		if (Evaluacion == 3) {
		do {
			
			for (int i = 0; i < alumno.getCiclo().asignaturasCiclo().length; i++) {
				System.out.println(alumno.getCiclo().asignaturasCiclo()[i]);
				System.out.println();
				this.notasEV3[contador3] = leer.nextInt();
				contador3++;
				
			}
			
		}while(contador3<notasEV3.length);}
		contador3 = 0;
		
		
		

	}
	
	
	public void notastoString() {
		System.out.println("De que evaluación quieres las notas?");
		int a = leer.nextInt();
		if (a == 1) {
			System.out.println();
			System.out.println("  |||Notas 1EV|||");
			System.out.println();
			for (int i = 0; i < alumno.getCiclo().asignaturasCiclo().length; i++,contador1++) {
				System.out.print(alumno.getCiclo().asignaturasCiclo()[i]+" "+this.notasEV1[contador1]+"\n");	 
				
			
		}
			
			
	}else if(a == 2) {
		System.out.println();
		System.out.println("  |||Notas 2EV|||");
		System.out.println();
		for (int i = 0; i < alumno.getCiclo().asignaturasCiclo().length; i++,contador2++) {
			System.out.print(alumno.getCiclo().asignaturasCiclo()[i]+" "+this.notasEV2[contador2]+"\n");
		
	
	}
		}else if(a == 3) {
			System.out.println();
			System.out.println("  |||Notas 3EV|||");
			System.out.println();
			for (int i = 0; i < alumno.getCiclo().asignaturasCiclo().length; i++,contador3++) {
				System.out.print(alumno.getCiclo().asignaturasCiclo()[i]+" "+this.notasEV3[contador3]+"\n");
			
		
		}
		}}
	
	
		
	
	
	
	
	
	
	

	
}
