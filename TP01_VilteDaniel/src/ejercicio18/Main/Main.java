package ejercicio18.Main;

import ejercicio18.Model.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Pais> paises= new ArrayList<>();
		
		paises.add(new Pais("1001", "Argentina"));
		paises.add(new Pais("1002", "Francia"));
		paises.add(new Pais("1003", "España"));
		
		ArrayList<DestinoTuristico> array = new ArrayList<>();
		
		int op=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("----- MENU -----");
			System.out.println("1. Alta de destino turistico");
			System.out.println("2. Mostrar todos los destinos turisticos");
			System.out.println("3. Modificar el pais de un destino turistico");
			System.out.println("4- Limpiar el ArrayList de destino turisticos");
			System.out.println("5. Eliminar un destino turistico");
			System.out.println("6. Mostrar los destinos turisticos ordenados por nombre");
			System.out.println("7. Mostrar todos los paises");
			System.out.println("8. Mostrar los destinos turisticos que pertenecen a un pais");
			System.out.println("9. Salir");
			op = scan.nextInt();
			
			switch(op) {
			
				case 1: System.out.println("----- Ingreso de Datos -----");
				
					scan.nextLine();
				
					System.out.print("Ingrese el codigo del Destino: ");
					String codigo1= scan.nextLine();
					System.out.print("Ingrese el nombre del Destino: ");
					String nomDest1 = scan.nextLine();
					boolean encontrado=false;
					String nomPais="",codPais="";
					
		    		do {
			    		System.out.println("Ingrese el codigo del pais donde se encuentra el destino:");
			    		codPais = scan.nextLine();
			    		Iterator<Pais>it = paises.iterator();
			    		while(it.hasNext()) { 
			    			Pais p = it.next(); 
			    			if(p.getCodigoPais().equals(codPais)) {
			    				nomPais = p.getNombrePais();
			    				encontrado=true;
			    			}
			    		}
			    		if(encontrado==false)
			    			System.out.println("No hay ningun pais asociado con el codigo "+codPais);
		    		}while(!encontrado);
					
		    		int precio;
				 	do {
				 		 try {
				 			 System.out.println("Ingrese el precio del destino:"); 
						 	 precio = scan.nextInt(); 
						 	 if(precio<=0)
						 		 System.out.println("El precio debe ser mayor que 0");
				 		 }catch(InputMismatchException e) {
				 			System.out.println("Dato Invalido, ingreselo denuevo");
							precio=0;
							scan.nextLine();
				 		 }
				 	 }while(precio<=0); 
				 	
				 	int dias;
				 	
				 	do {
				 		 try {
				 			 System.out.println("Ingrese cantidad de dias:"); 
						 	 dias = scan.nextInt(); 
						 	 if(dias<=0)
						 		 System.out.println("Debe ser mayor que 1");
				 		 }catch(InputMismatchException e) {
				 			System.out.println("Dato Invalido, ingrese otro denuevo");
							dias=0;
							scan.nextLine();
				 		 }
				 	}while(dias<=0); 
				 	
		    		array.add(new DestinoTuristico(codigo1, nomDest1, precio,new Pais(codPais, nomPais), dias));
		    		
					break;
				case 2: System.out.println("----- Destinos Disponibles -----");
					for (int i=0;i<array.size();i++) {
						DestinoTuristico aux = array.get(i);
						aux.MostrarDatos();
						System.out.println("---------------------------");
					}
					break;
				case 3: System.out.println("----- Cambiar Pais -----");
					
					scan.nextLine();
				
					System.out.println("Ingrese el codigo del Destino, del que quiere cambiar el pais: ");
					String buscar = scan.nextLine();
					Iterator<DestinoTuristico> it =array.iterator();
					
					boolean encontrado3 = false;
					int index=0;
					
					while (it.hasNext()) {
						DestinoTuristico aux = it.next();
						if (aux.getCodigo().equals(buscar)) {
							encontrado3=true;
							System.out.println("Se encontro el destino turistico");
							System.out.print("Ingrese el codigo del pais al que quiere cambiar");
							String cod = scan.nextLine();
							
							Iterator<Pais> itp = paises.iterator();
							
							boolean encontradopais3 = false;
							
							while (itp.hasNext()) {
								Pais auxp = itp.next();
								
								if (auxp.getCodigoPais().equals(cod)) {
									System.out.println("Se encontro el Pais");
									System.out.println("Cambio realizado correctamente");
									DestinoTuristico cambio = array.get(index);
									cambio.setPais(auxp);
									array.set(index, cambio);
									encontradopais3=true;
									break;
								}
							}
							if (encontradopais3==false) System.out.println("No se encontro un pais con ese codigo");
						}
						index++;
					}
					
					if (encontrado3==false) System.out.println("No se encontro un destino con ese codigo");
					
					break;
				case 4: System.out.println("----- Limpieza -----");
					array.clear();
					System.out.println("Se eliminaron los destinos turisticos correctamente");
					break;
				case 5: System.out.println("----- Eliminar -----");
				
					scan.nextLine();
				
					System.out.print("Ingrese el codigo del destino a eliminar: ");
					String codigo5 = scan.nextLine();
					
					Iterator<DestinoTuristico> it5 = array.iterator();
					
					int index5=0;
					boolean encontrado5=false;
					
					while (it5.hasNext()) {
						DestinoTuristico aux = it5.next();
						
						if (aux.getCodigo().equals(codigo5)) {
							array.remove(index5);
							encontrado5=true;
							System.out.println("Destino eliminado correctamente");
						}
						index5++;
					}
					
					if (encontrado5==false) System.out.println("No se encontro el codigo del Destino");
					break;
				case 6: System.out.println("----- Destinos -----");
					//array.sort(Comparator.comparing(DestinoTuristico::getNombre));
					
					Collections.sort(array, (d1, d2) -> d1.getNombre().compareTo(d2.getNombre()));
				
					for (int i=0;i<array.size();i++) {
						DestinoTuristico aux= array.get(i);
						aux.MostrarDatos();
						System.out.println("--------------------");
					}
					break;
				case 7: System.out.println("------ Paises -------");
					for (int i=0;i<paises.size();i++) {
						Pais aux= paises.get(i);
						aux.MostrarDatos();
						System.out.println("--------------------");
					}
					break;
				case 8: System.out.println("----- Seleccion de Destino ------");
				
					scan.nextLine();
				
					System.out.print("Ingrese el codigo del pais para ver sus destinos: ");
					String pais8 = scan.nextLine();
					
					Iterator<DestinoTuristico> it8 = array.iterator();
					boolean encontrado8 = false;
					
					while (it8.hasNext()) {
						DestinoTuristico aux = it8.next();
						
						if (aux.getPais().getCodigoPais().equals(pais8)) {
							encontrado8 = true;
							aux.MostrarDatos();
							System.out.println("-------------------------");
						}
					}
					
					if (encontrado8 ==false) System.out.println("No se encontraron destinos para este pais");
					break;
				case 9: System.out.println("Programa Finalizado.");
				default : System.out.println("Esta no es una opcion");
					break;
			
			}
			
		} while (op!=9);
		
	}

}
