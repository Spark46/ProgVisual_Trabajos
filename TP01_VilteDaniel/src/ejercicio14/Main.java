package ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Ingreso del tamaño del array y su creacion
		Scanner scan = new Scanner(System.in);
		int size;
		do {
			System.out.print("Ingrese un valor en el rango [3,10]: ");
			size = scan.nextInt();
		} while (size < 3 || size > 10);
		
		int [] array = new int [size];
		
		// Entrada de datos del array
		System.out.println("--------------------------------");
		System.out.println("Ingrese los datos para el array");
		for (int i=0;i<size;i++) {
			System.out.print("Ingrese un valor para la posicion N°: "+(i+1)+" ");
			array[i]= scan.nextInt();
		}
		
		System.out.println("--------------------------------");
		int sum=0;
		for (int i=0;i<size;i++) {
			System.out.println("arr["+i+"]: "+array[i]);
			sum+=array[i];
		}
		System.out.println("La suma total es: "+sum);
		System.out.println("Fin del Programa.");
	}

}
