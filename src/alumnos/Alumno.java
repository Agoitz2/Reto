package alumnos;

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
		
	}
	
	
	public void crearNotas() {
		this.notas = new NotasAlumno();
	}
	
	
	public String alumnoToString1() {
		return "|DNI| :"+this.DNI+"\n"+"|Nombre| :"+this.Nombre+"\n"+"|Apellido| :"+this.Apellido+"\n"+"|Edad| :"+this.Edad+"\n"+"|Grupo| : "+this.Grupo+"\n"+"|Nombre Ciclo| :"+this.ciclo.getNombreCF()+" ";
	}
	
	public String notasAlumnoToString() {
		return this.notas.toString();
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	
	
	public CicloFormativo getCiclo() {
		return this.ciclo;
	}
	
	public void setNotas() {
		this.notas.asignarNota(leer.nextInt());
	}
	
	public NotasAlumno getNotas() {
		return this.notas;
	}
}
