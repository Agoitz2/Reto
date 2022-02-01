package Paquete;

public class Nota {
	
	private int Evaluacion;
	private int[] notasEV1 = new int[6];
	private int[] notasEV2 = new int[6];
	private int[] notasEV3 = new int[6];
	int contador1 = 0;
	int contador2 = 0;
	int contador3 = 0;
	
	public Nota(int e) {
		this.Evaluacion = e;
	
	}
	
	
	public void asignarNota(int Evaluacion , int nota) {
		
		if (Evaluacion == 1) {
			notasEV1[contador1] = nota;
			contador1++;
		}
		else if (Evaluacion == 2) {
			notasEV2[contador2] = nota;
			contador2++;
			
		}else if (Evaluacion == 3) {
			notasEV3[contador3] = nota;
			contador3++;
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	

	
}
