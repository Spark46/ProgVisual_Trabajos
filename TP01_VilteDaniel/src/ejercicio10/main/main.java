package ejercicio10.main;

import java.util.Scanner;
import ejercicio10.model.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese los datos de las pizzas");
		Scanner scan = new Scanner(System.in);
		for (int i=0;i<3;i++) {
			System.out.println("Pizza N°"+(i+1)+": ");
			System.out.println("Elija el diametro: ");
			System.out.println("Disponibles: 1. 20 (pizza pequeña), 2. 30 (pizza mediana), 3. 40 (pizza grande)");
			double diametro;
			int opcion;
			do {
				opcion = scan.nextInt();
			} while (opcion<=0 || opcion>3);
			if (opcion==1) diametro=20;
			else if (opcion==2) diametro=30;
			else diametro=40;
			System.out.println("¿Quiere ingredientes especiales?");
			System.out.println("1. Si");
			System.out.println("2. No");
			do {
				opcion = scan.nextInt();
			} while (opcion<=0 || opcion>2);
			boolean IngEsp;
			if (opcion==1) IngEsp=true;
			else IngEsp=false;
			
			Pizza piza = new Pizza();
			piza.setDiametro(diametro);
			piza.setIngredentes_especiales(IngEsp);
			
			System.out.println("** Pizza"+(i+1)+" **");
			System.out.println("Diametro ="+ piza.getDiametro());
			System.out.println("Ingredientes Especiales= "+piza.isIngredentes_especiales());
			System.out.println("Precio Pizza = "+piza.calcularPrecio()+"$");
			piza.CalcularArea();
			System.out.println("Area de la Pizza= "+piza.getArea());

			System.out.println("***************");
			
		}
	}

}
