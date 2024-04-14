package ejercicio09.Main;

import ejercicio09.Model.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Cargando datos del Producto N°" + (i + 1));
            
            System.out.println("Ingrese el nombre: ");
            String nombre = scan.nextLine();
            
            System.out.println("Ingrese el codigo: ");
            String codigo = scan.nextLine();
            
            System.out.println("Ingrese el precio: ");
            double precio = scan.nextInt();
            
            double descuento;
            do {
                System.out.println("Ingrese el descuento[Entre 0 y 50]: ");
                descuento = scan.nextInt();
            } while (descuento < 0 || descuento > 50);

            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setDescuento(descuento);
            producto.setNombre(nombre);
            producto.setPrecio(precio);

            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Codigo: " + producto.getCodigo());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Precio con Descuento: " + producto.CalcularDescuento());

            scan.nextLine();
        }
        System.out.println("Fin del programa.");
        scan.close();
    }
}

