package ejercicio07.Main;
import java.util.Scanner;
import ejercicio07.Model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese los datos del empleado");
		System.out.println("Ingrese Nombre: ");
		Scanner scan = new Scanner(System.in);
		String nom = scan.nextLine();
		System.out.println("Ingrese Legajo");
		long legajo = scan.nextLong();
		System.out.println("Ingrese su Salario: ");
		double salario = scan.nextDouble();
		
		Empleado emplead = new Empleado(nom, legajo, salario);
		
		emplead.MostrarDatos();
		System.out.println("***Recibio un Aumento!***");
		emplead.AumentoSalario();
		emplead.MostrarDatos();
	}

}
