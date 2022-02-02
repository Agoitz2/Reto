package Paquete;

public class CicloFormativo {
	private String nombreCiclo;
	
	
	public CicloFormativo(String nCF) {
		this.nombreCiclo = nCF;
			
	}
	
	public  String[] asignaturasCiclo() {
		
		if (this.nombreCiclo.equals("DAW")) {
			String[] modulosDAW = {"|Programación|","|Sistemas Informáticos|","|FOL|","|Inglés|","|Lenguaje de marcas|","|Bases de Datos|"};
			return modulosDAW;
		}else if(this.nombreCiclo.equals("ASIR")) {
			String [] modulosASIR ={"|FOL|","|Sistemas informaticos|","|Redes|","|Lenguaje de marcas|","|Bases de datos|","|Fundamentos del hardware|"};
			return modulosASIR;
		}
		
		return null;
		
	}
	
	
	
	
	

	public String getNombreCF() {
		return this.nombreCiclo;
	}
	
	

	public void setNombreCF(String nombreCF) {
		this.nombreCiclo = nombreCF;
	}
	
	
	
	

}
