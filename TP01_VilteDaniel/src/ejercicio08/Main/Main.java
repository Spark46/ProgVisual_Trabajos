package ejercicio08.Main;

import ejercicio08.Model.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero entero: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		CalculadoraEspecial calc = new CalculadoraEspecial();
		
		calc.setN(n);
		
		System.out.println("El resultado de la productoria es: "+ calc.calcularProductorial());
		
		System.out.println("Fin del programa");
		scan.close();
	}

}
