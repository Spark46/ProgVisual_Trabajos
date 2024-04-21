package ejercicio18.Model;
import ejercicio18.Model.Pais;

public class DestinoTuristico {
	private String Codigo;
	private String Nombre;
	private int Precio;
	private Pais pais;
	private int CantDias;
	
	public DestinoTuristico(String codigo, String nombre, int precio, Pais pais, int cantDias) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		Precio = precio;
		this.pais = pais;
		CantDias = cantDias;
	}
	
	public void MostrarDatos() {
		System.out.println("Codigo del Destino: "+Codigo);
		System.out.println("Nombre del Destino: "+Nombre);
		System.out.println("Precio del Destino: "+Precio);
		this.pais.MostrarDatos();
		System.out.println("Cantidad de dias a quedarse: "+CantDias);
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getCantDias() {
		return CantDias;
	}

	public void setCantDias(int cantDias) {
		CantDias = cantDias;
	}
	
	
    public int compareTo(DestinoTuristico otroDestino) {
        return this.Nombre.compareTo(otroDestino.getNombre());
    }
	
}
