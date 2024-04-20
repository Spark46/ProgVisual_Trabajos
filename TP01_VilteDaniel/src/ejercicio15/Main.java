package ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ingreso del tamaño del array y su creacion
		
		Scanner scan = new Scanner(System.in);
		int size;
		do {
			System.out.print("Ingrese un valor en el rango [5,10]: ");
			size = scan.nextInt();
		} while (size < 5 || size > 10);
		
		String [] array = new String [size];
		
		//Limpieza del buffer
		scan.nextLine();
		
		// Entrada de datos del array
		System.out.println("--------------------------------");
		
		
		System.out.println("Ingrese "+size+" nombres de personas");
		for (int i=0;i<size;i++) {
			array[i]= scan.nextLine();
		}
		
		//Muestra de Datos
		System.out.println("---------- De 0 a "+size+"------------");
		for (int i=0;i<size;i++) {
			System.out.println("arr["+i+"]: "+array[i]);
		}
		System.out.println("---------- De "+size+" a 0 ------------");
		for (int i=size-1;i>=0;i--) {
			System.out.println("arr["+i+"]: "+array[i]);
		}
		System.out.println("Fin del Programa.");

	}

}
