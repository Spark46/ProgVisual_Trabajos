package ejercicio08.Model;

public class CalculadoraEspecial {
	
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public CalculadoraEspecial() {
		//
	}
	
	public int calcularProductorial() {
		int r=0;
		for (int k=1;k<=n;k++) {
			r+=(k+k*4);
		}
		return r;
	}
	
	
}
