package ejercicio12.Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import ejercicio12.Model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese su nombre: ");
		
		Scanner scan = new Scanner(System.in);
		String nom = scan.nextLine();
		
		System.out.println("Ingrese su fecha de nacimiento(dd/mm/yyyy): ");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fechaStr = scan.nextLine();
        Calendar fecha = Calendar.getInstance();
        
		try {
            Date aux = dateFormat.parse(fechaStr);

            fecha.setTime(aux);

        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Asegúrese de ingresar la fecha en formato dd/mm/yyyy.");
        }
		
		Persona person1 = new Persona(nom, fecha);
		person1.MostrarDatos();
		System.out.println("Fin del Programa.");
	}

}
