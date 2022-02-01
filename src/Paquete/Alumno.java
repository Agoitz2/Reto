package Paquete;

public class Alumno {
	
	private String DNI;
	private String Nombre;
	private String Apellido;
	private int Edad;
	private String Grupo;
	private CicloFormativo ciclo;
	
	
	public Alumno(String DNI , String Nombre , String Apellido , int Edad,String Grupo,String Ciclo) {
		this.DNI = DNI;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.Edad = Edad;
		this.Grupo = Grupo;
		this.ciclo = new CicloFormativo(Ciclo);
	}
	
	
	
	
	
	public String alumnoToString1() {
		return this.DNI+" "+this.Nombre+" "+this.Apellido+" "+this.Edad+" "+this.Grupo+" "+ciclo.getNombreCF();
	}
	
	public String getDNI() {
		return this.DNI;
	}
	
	
	
}
