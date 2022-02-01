package Paquete;


import java.util.Scanner;

public class Aplicacion {
	Scanner leer = new Scanner(System.in);
	Alumno array[];
	private int contador = 0;
	
	
	public Aplicacion (int a) {
		array = new Alumno[a];
	}
	
	
	private void anadirAlumnos() {
		
		if (contador < array.length) {
			array[contador] = new Alumno(leer.next(),leer.next(),leer.next(),leer.nextInt(),leer.next());
			contador++;
		}
		
		
	}
	
	
	
	
	private String alumnoToString(String DNI) {
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].getDNI().equals(DNI)) {
				return array[i].alumnoToString1();
			}
		}
		
		return "Error";
	}
	
	
	public void iniciarMenu () {
		
		int opcion;
		boolean salir = false;
		do{
			System.out.println("Menu de la aplicación");
			System.out.println();
			System.out.println("1.AñadirAlumno");
			System.out.println();
			System.out.println("2.MostrarAlumno");
			System.out.println();
			System.out.println("3.Salir");
			System.out.println();
			System.out.println("Introduce numero para escoger opcion");
			opcion=leer.nextInt();
			switch(opcion) {
			case 1:
				anadirAlumnos();
				break;
			case 2:
				System.out.println(alumnoToString(leer.next()));
				break;
			case 3:
				salir = true;
				break;
			
			}

		}while(salir != true);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	
	
	
	
	
	
	

