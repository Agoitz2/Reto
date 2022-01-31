package Paquete;


import java.util.Scanner;

public class Aplicacion {
	Scanner leer = new Scanner(System.in);
	Alumno array[];
	private int contador = 0;
	
	
	public Aplicacion (int a) {
		array = new Alumno[a];
	}
	
	
	public void anadirAlumnos() {
		
		if (contador < array.length) {
			array[contador] = new Alumno(leer.next(),leer.next(),leer.next(),leer.nextInt(),leer.next());
			contador++;
		}
		
		
	}
	
	
	
	
	public String alumnoToString(String DNI) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].getDNI().equals(DNI)) {
				return array[i].alumnoToString1();
			}
		}
		
		return "Error";
	}
	
	

	
	
	
	
	
	
	
}
