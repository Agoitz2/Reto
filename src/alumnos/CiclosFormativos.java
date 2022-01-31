package alumnos;

public class CiclosFormativos {

	private String nombreCF;
	private String[] modulos;
	
	public CiclosFormativos(String nCF, String[] m) {
		
		this.nombreCF = nCF;
		this.modulos = m;
		
	}

	public String getNombreCF() {
		return nombreCF;
	}

	public void setNombreCF(String nombreCF) {
		this.nombreCF = nombreCF;
	}
	

}
