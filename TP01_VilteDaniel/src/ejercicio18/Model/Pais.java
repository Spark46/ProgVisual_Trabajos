package ejercicio18.Model;

public class Pais {
	private String CodigoPais;
	private String NombrePais;
	
	public Pais (String cod, String nomb) {
		CodigoPais = cod;
		NombrePais = nomb;
	}
	
	public void MostrarDatos() {
		System.out.println("Codigo del Pais: "+CodigoPais);
		System.out.println("Nombre del Pais: "+NombrePais);
	}
	
	public String getCodigoPais() {
		return CodigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		CodigoPais = codigoPais;
	}

	public String getNombrePais() {
		return NombrePais;
	}

	public void setNombrePais(String nombrePais) {
		NombrePais = nombrePais;
	}
	
}
