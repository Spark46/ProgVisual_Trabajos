package ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creacion del array con 5 elementos String
		
		String [] array = new String [5];
		
		// Entrada de datos del array con estructura For
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese 5 nombres de personas");
		for (int i=0;i<5;i++) {
			array[i]= scan.nextLine();
		}
		
		//Muestra de Datos con estructura While
		int i=0;
		while (i<5) {
			System.out.println("array["+i+"]: "+array[i]);
			i++;
		}
		
		System.out.println("Tamaño del array: "+array.length);
		
		byte remov;
		do {
			System.out.print("Ingrese un indice [0,4] para eliminar del array: ");
			remov = scan.nextByte();
		}while (remov < 0 || remov > 4);
		byte j=5;
		do {
			j--;
		} while (j!=remov);
		
		if (j==4) array[j]="";
		else {
			for (int x=j;x<4;x++) {
				array[x]=array[x+1];
			}
			array[4]="";
		}
		//Muestra de Datos luego de la eliminacion
		i=0;
		while (i<5) {
			System.out.println("array["+i+"]: "+array[i]);
			i++;
		}
		
		System.out.println("Fin del Programa.");
	}

}
