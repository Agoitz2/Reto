package Paquete;

import java.util.Scanner;

public class Alumno {
	Scanner leer = new Scanner(System.in);
	private String DNI;
	private String Nombre;
	private String Apellido;
	private int Edad;
	private String Grupo;
	private CicloFormativo ciclo;
	private NotasAlumno notas ;
	
	
	public Alumno(String DNI , String Nombre , String Apellido , int Edad,String Grupo,String Ciclo) {
		this.DNI = DNI;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Edad = Edad;
		this.Grupo = Grupo;
		this.ciclo = new CicloFormativo(Ciclo);
		this.notas = new NotasAlumno(leer.nextInt());
		System.out.println("hasta aquí");
		this.notas.asignarNota(leer.nextInt());
		
	}
	
	
	
	
	
	public String alumnoToString1() {
		return this.DNI+" "+this.Nombre+" "+this.Apellido+" "+this.Edad+" "+this.Grupo+" "+ciclo.getNombreCF()+" "+this.notas.notasToString();
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	
	
}
