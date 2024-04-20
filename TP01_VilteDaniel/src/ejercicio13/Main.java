package ejercicio13;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] arr = new int[8];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i=0;i < arr.length;i++) {
			System.out.print("Ingrese un valor para la posicion N°"+(i+1)+": ");
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Elementos del array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Índice " + i + ": " + arr[i]);
        }

        scan.close();
        
        System.out.println("Fin del Programa.");

	}

}
