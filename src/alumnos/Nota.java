package alumnos;

public class Nota {
	
	private int Evaluacion;
	private int[] modulos;
	
	public Nota(int e, int[] m) {
		this.Evaluacion = e;
		this.modulos = m;
	}
	
	public void toStringNotas(int n) {
		if (Evaluacion == n) {
			System.out.println("En la evaluacion " + n + " y estas notas: " + modulos[0] + modulos[1] + modulos[2] + modulos[3] + modulos[4] + modulos[5]);
		}
	}
	
}
