package alumnos;


import java.util.Scanner;

public class Aplicacion {
	Scanner leer = new Scanner(System.in);
	private static Alumno array[];
	
	private static int contador = 0;
	
	
	public Aplicacion (int a) {
		array = new Alumno[a];
	}
	
	
	private void anadirAlumnos() {
		
		if (contador < array.length) {
			array[contador] = new Alumno(leer.next(),leer.next(),leer.next(),leer.nextInt(),leer.next(),leer.next());
			contador++;
			
		}
		array[contador-1].crearNotas();
		
		
		
	}
	
	
	
	
	private void alumnoToString(String DNI) {
		
		for (int i = 0; i < contador; i++) {
			if (array[i].getDNI().equals(DNI)) {
				System.out.println(array[i].alumnoToString1());
				System.out.println();
				
			}	
		}
	
	}
	
	
	public void iniciarMenu () {
		String salida = " ";
		int opcion;
		boolean salir = false;
		do{
			System.out.println("Menu de la aplicación");
			System.out.println();
			System.out.println("1.AñadirAlumno");
			System.out.println();
			System.out.println("2.MostrarAlumno");
			System.out.println();
			System.out.println("3.Imprimir Notas de Alumno");
			System.out.println();
			System.out.println("4.Cambiar notas evaluacion alumno");
			System.out.println();
			System.out.println("5.Salir");
			System.out.println();
			System.out.println("Introduce numero para escoger opcion");
			opcion=leer.nextInt();
			switch(opcion) {
			case 1:
				 
				System.out.println("Introduce los datos en este orden : DNI,Nombre,Apellido,Edad,Grupo y Siglas de tu ciclo(EJ : DAW)");
				anadirAlumnos();
				break;
			case 2:
				System.out.println("Introduce el DNI del alumno");
				alumnoToString(leer.next());
				break;
			case 5:
				
				System.out.println("Saliendo...");
				System.exit(0);
				break;
				
			case 3:
				System.out.println("Introduce el DNI del alumno");
				alumnotasToString(leer.next());
				break;
			
			case 4 :
				System.out.println("Introduce el DNI del alumno");
				setNotasdeAlumno(leer.next());
				break;
			
			}
			System.out.println("Desea continuar? S/N");
			salida=leer.next();
			if (salida.equals("N")) {
				salir = true;
				System.out.println("Saliendo...");
			}

		}while(salir != true);
		}
		
		
		
		
		
		public static Alumno getAlumno() {
			return array[contador-1];
		}
		
		
		
		

		private void alumnotasToString(String DNI) {
			
			for (int i = 0; i < contador; i++) {
				if (array[i].getDNI().equals(DNI)) {
					array[i].getNotas().notastoString();
				}else if(!array[i].getDNI().equals(DNI)){System.out.println("No existe");}	
			}
		
		}
		
		
		private void setNotasdeAlumno(String DNI) {
			System.out.println("Introduce de que evaluacion quieres poner notas");
			for (int i = 0; i < contador; i++) {
				if (array[i].getDNI().equals(DNI)) {
					array[i].setNotas();
				}else {System.out.println();
					
					System.out.println("ERROR");}
			
		}
		
		
		
	}
		

}
	
	

	
	
	
	
	
	
	

