package ejercicio09.Model;

public class Producto {
	private String Nombre;
	private String Codigo;
	private double Precio;
	private double Descuento;
	
	public Producto() {
		//
	}
	
	public double CalcularDescuento() {
		return (Precio - (Precio * (Descuento/100)));
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public double getDescuento() {
		return Descuento;
	}
	public void setDescuento(double descuento) {
		if (descuento<=50 && descuento>=0) Descuento = descuento;
		else System.out.println("Descuento fuera de rango");
	}

	
}
