package ar.edu.unju.fi.ejercicio04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero positivo menor que 10: ");
		int num = scanner.nextInt();
		if (num <= 10) {
			if (num==0) System.out.println("1");
			else {
				int r=num;
				num--;
				while (num!=0) {
					r*=num;
					num--;
				}
				System.out.println(r);
			}
			
		} else System.out.println("Numero fuera de rango");
		scanner.close();
		System.out.println("Fin del Programa");
	}
	
}
