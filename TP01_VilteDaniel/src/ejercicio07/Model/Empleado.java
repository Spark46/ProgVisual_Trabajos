package ejercicio07.Model;

public class Empleado {
	private String nombre;
	private long legajo;
	private double salario;
	
	private static double minsal=210000.00;
	private static double aumento=20000.00;
	
	public Empleado(String nombre, long legajo, double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if (salario>=minsal) this.salario=salario;
		else this.salario=minsal;
	}
	public void MostrarDatos() {
		System.out.println("Nombre del Empleado: "+ nombre);
		System.out.println("Legajo: "+legajo);
		System.out.println("Salario $: "+salario);
	}
	public void AumentoSalario() {
		salario+=aumento;
	}
	
}
