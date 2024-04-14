package ejercicio06.Main;
import ejercicio06.Model.Persona;
import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Con el Constructor Default
		System.out.println("Ingrese los datos de la 1ra persona: ");
		Scanner scanner = new Scanner(System.in);
		Persona person = new Persona();
		System.out.println("Ingrese su dni: ");
		
		String dni = scanner.nextLine();
		person.setDni(dni);
		
		System.out.println("Ingrese su nombre: ");
		
		String nombre = scanner.nextLine();
		person.setNombre(nombre);
		
		System.out.println("Ingrese su fecha de nacimiento (yyyy/mm/dd): ");
		
		String aux = scanner.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate fecha = LocalDate.parse(aux, formatter);
		person.setFechaNacimiento(fecha);
		
		System.out.println("Ingrese su provincia: ");
		
		String provincia = scanner.nextLine();
		person.setProvincia(provincia);
		
		person.MostrarDatos();
		//
		//con el 2do constructor
		System.out.println("Ingrese los datos de la 2da persona: ");
		System.out.println("Ingrese su dni: ");
		
		
		String dni2 = scanner.nextLine();
		System.out.println("Ingrese su nombre: ");
		
		String nombre2 = scanner.nextLine();
		
		System.out.println("Ingrese su fecha de nacimiento (yyyy/mm/dd): ");
		
		String aux2 = scanner.nextLine();
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate fecha2 = LocalDate.parse(aux2, formatter2);
		
		System.out.println("Ingrese su provincia: ");
		
		String provincia2 = scanner.nextLine();
		
		Persona person2 = new Persona(dni2, nombre2, fecha2, provincia2);
		person2.MostrarDatos();		//
		//Con el 3er constructor
		System.out.println("Ingrese los datos de la 3ra persona: ");
		
		System.out.println("Ingrese su dni: ");
		
		String dni3 = scanner.nextLine();
		
		System.out.println("Ingrese su nombre: ");
		
		String nombre3 = scanner.nextLine();
		
		System.out.println("Ingrese su fecha de nacimiento (yyyy/mm/dd)");
		
		String aux3 = scanner.nextLine();
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate fecha3 = LocalDate.parse(aux3, formatter3);
		
		
		Persona person3 = new Persona(dni3, nombre3, fecha3);
		person3.MostrarDatos();
		scanner.close();
	}

}
