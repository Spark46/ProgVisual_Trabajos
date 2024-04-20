package ejercicio17.Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.LocalDate;
import ejercicio17.Model.Model;
import ejercicio17.Model.Model.Jugador;

public class Main {

	public static void main(String[] args) {
		
		int op;
		Scanner scan = new Scanner(System.in);
		ArrayList<Jugador> equipo = new ArrayList<>();
		
		do {
			System.out.println("-------- MENU --------");
			System.out.println("1. Alta de jugador");
			System.out.println("2. Mostrar los datos del jugador (debe ingresar nombre y el apellido)");
			System.out.println("3. Mostrar todos los jugadores ordenados por apellido");
			System.out.println("4. Modificar los datos de un jugador (se debe ingresar el nombre y el apellido del jugador)");
			System.out.println("5. Eliminar un jugador (se debe ingresar el nombre y apellido)");
			System.out.println("6. Mostrar la cantidad total de jugadores que tiene el ArrayList.");
			System.out.println("7.  Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
			System.out.println("8. Salir");
			System.out.println("Elija una opcion:");
			op = scan.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("---------- Ingrese los Datos -----------");
				
				scan.nextLine(); // Limpieza del buffer
				
			    //Ingreso de Datos
			    System.out.print("Ingrese el nombre: ");
			    String nom = scan.nextLine();

			    System.out.print("Ingrese el apellido: ");
			    String apell = scan.nextLine();

			    //Ingreso de la fecha de nacimiento y manejo de excepcion
			    LocalDate fechanac = null;
			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			    do {
			        System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
			        String aux = scan.nextLine();

			        try {
			            fechanac = LocalDate.parse( aux, formatter);
			        } catch (DateTimeParseException e) {
			            System.out.println("Formato de fecha incorrecto. Por favor, ingrese la fecha en el formato correcto.");
			        }

			    } while (fechanac == null);

			    System.out.print("Ingrese la Nacionalidad: ");
			    String nac = scan.nextLine();

			    double alt = 0.0;

			    while (true) {
			        try {
			            System.out.print("Ingrese la estatura (x.xx): ");
			            String entrada = scan.nextLine();

			            alt = Double.parseDouble(entrada);

			            // Verificar si la estatura es válida (mayor que cero)
			            if (alt > 0) {
			                break; // Salir del bucle si la estatura es válida
			            } else {
			                System.out.println("La estatura debe ser mayor que cero. Por favor, ingrese un valor válido.");
			            }
			        } catch (NumberFormatException e) {
			            // Capturar la excepción si la entrada no se puede convertir a double
			            System.out.println("Formato incorrecto. Por favor, ingrese la estatura en el formato x.xx");
			        }
			    }

			    double p = 0;

			    while (true) {
			        try {
			            System.out.print("Ingrese el peso (XX.X): ");
			            String entrada = scan.nextLine();

			            p = Double.parseDouble(entrada);

			            // Verificar si el peso es valido
			            if (p > 0) {
			                break;
			            } else {
			                System.out.println("La estatura debe ser mayor que cero. Por favor, ingrese un valor válido.");
			            }
			        } catch (NumberFormatException e) {
			            // Capturar la excepción si la entrada no se puede convertir a double
			            System.out.println("Formato incorrecto. Por favor, ingrese la estatura en el formato x.xx");
			        }
			    }

			    String pos;
			    do {
			        System.out.print("Ingrese la posicion (delantero, defensa, medio, arquero): ");
			        pos = scan.nextLine();
			    } while (!pos.equals("delantero") && !pos.equals("defensa") && !pos.equals("medio") && !pos.equals("arquero"));
			    			    
			    // Crear el objeto Jugador utilizando el constructor parametrizado
			    Jugador jg = new Model().new Jugador(nom, apell, fechanac, nac, alt, p, pos);
			    equipo.add(jg); // Agregar el jugador al ArrayList
			    break;
			case 2:
				System.out.println("--------- Mostrar Datos ---------");
				
				scan.nextLine();
				
				System.out.println("Ingrese nombre:"); 
			 	 String nombreBuscar = scan.nextLine();
			 	 System.out.println("Ingrese apellido:");
			 	 String apellidoBuscar = scan.nextLine();
			 	 Iterator<Jugador>iterator = equipo.iterator();
			 	 Boolean encontrado = false;
				 while(iterator.hasNext()) {
					Jugador j = iterator.next();
					if(j.getNombre().equals(nombreBuscar) && j.getApellido().equals(apellidoBuscar)) {
						j.MostrarDatos();
						encontrado=true;
					}
				 }
				 if(!encontrado)
						System.out.println("No hay nigun jugador registrado como: "+nombreBuscar+" "+apellidoBuscar);
			 	 break;
			case 3:
				System.out.println("--------- Jugadores --------");
				//Ordeno el array por el apellido de los jugadores
				equipo.sort(Comparator.comparing(Jugador::getApellido));
				//
				//Imprimo los datos
				for (Jugador j : equipo) {
					j.MostrarDatos();
					System.out.println("-----------------------------");

				}
				break;
			case 4:
				
				scan.nextLine(); // Limpieza del buffer
				
				System.out.println("--------- Modificar --------");
				System.out.print("Ingrese el nombre: ");
				String nomb4 = scan.nextLine();
				System.out.print("Ingrese el apellido: ");
				String apell4 = scan.nextLine();

				int index=-1;
				do {
					for (int i = 0; i < equipo.size(); i++) {
					    Jugador jugador = equipo.get(i);
					    if (jugador.getApellido()==apell4 && jugador.getNombre()==nomb4) {
					    	index=i;
					    	break;
					    }
					}
					if (index==-1) System.out.println("Datos no encontrados, vuelva a intentarlo");
				} while (index==-1);
				
				
				System.out.print("Ingrese un nuevo nombre: ");
				nomb4 = scan.nextLine();
				System.out.print("Ingrese un nuevo apellido: ");
				apell4 = scan.nextLine();
				System.out.print("Ingrese la Nacionalidad: ");
				String nac4 = scan.nextLine();
				
				LocalDate fechanac4 = null;
			    DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			    do {
			        System.out.println("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
			        String aux = scan.nextLine();

			        try {
			            fechanac4 = LocalDate.parse( aux, formatter4);
			        } catch (DateTimeParseException e) {
			            System.out.println("Formato de fecha incorrecto. Por favor, ingrese la fecha en el formato correcto.");
			        }

			    } while (fechanac4 == null);

			    double alt4 = 0.0;

			    while (true) {
			        try {
			            System.out.print("Ingrese la estatura (x.xx): ");
			            String entrada = scan.nextLine();

			            alt = Double.parseDouble(entrada);

			            // Verificar si la estatura es válida (mayor que cero)
			            if (alt > 0) {
			                break; // Salir del bucle si la estatura es válida
			            } else {
			                System.out.println("La estatura debe ser mayor que cero. Por favor, ingrese un valor válido.");
			            }
			        } catch (NumberFormatException e) {
			            // Capturar la excepción si la entrada no se puede convertir a double
			            System.out.println("Formato incorrecto. Por favor, ingrese la estatura en el formato x.xx");
			        }
			    }

			    double p4 = 0;

			    while (true) {
			        try {
			            System.out.print("Ingrese el peso (XX.X): ");
			            String entrada = scan.nextLine();

			            p4 = Double.parseDouble(entrada);

			            // Verificar si el peso es valido
			            if (p4 > 0) {
			                break;
			            } else {
			                System.out.println("La estatura debe ser mayor que cero. Por favor, ingrese un valor válido.");
			            }
			        } catch (NumberFormatException e) {
			            // Capturar la excepción si la entrada no se puede convertir a double
			            System.out.println("Formato incorrecto. Por favor, ingrese la estatura en el formato x.xx");
			        }
			    }

			    String pos4;
			    do {
			        System.out.print("Ingrese la posicion (delantero, defensa, medio, arquero): ");
			        pos4 = scan.nextLine();
			    } while (!pos4.equals("delantero") && !pos4.equals("defensa") && !pos4.equals("medio") && !pos4.equals("arquero"));
			    
			    				
			    Jugador modificar = new Model().new Jugador(nomb4, apell4, fechanac4, nac4, alt4, p4, pos4);
			    
			    equipo.set(index, modificar);
			    System.out.println("-------- Se Modificaron los datos---------");
			    equipo.get(index).MostrarDatos();
			    break;
			case 5:
				
				scan.nextLine(); // Limpieza del buffer
				
				System.out.println("--------- Eliminar un jugador -----------");
				
				System.out.print("Ingrese el nombre del jugador a eliminar: ");
				String nom5 = scan.nextLine();
				System.out.print("Ingrese el apellido del jugador a eliminar: ");
				String apell5 = scan.nextLine();
								
				//Creacion del Iterador
				Iterator<Jugador> it = equipo.iterator();
				int sz5= equipo.size();
				
				//Recorrido 
				while (it.hasNext()) {
					Jugador aux = it.next();
					if (aux.getNombre() == nom5 && aux.getApellido()==apell5) {
						it.remove();
						break;
					}
				}
				
				if (sz5==equipo.size()) System.out.println("No se encontro al jugador");
				else System.out.println("Se elimino la jugador correctamente!");
				
				break;
			case 6:
				System.out.println("--------- Cantidad de Jugadores -----------");
				System.out.println("La cantidad de jugadores que estan en el ArrayList es de : "+ equipo.size());
				break;
			case 7:
				
				scan.nextLine(); // Limpieza del bufferl
				
				System.out.println("--------------- Nacionalidad ----------------");
				System.out.print("Ingrese la nacionalidad: ");
				String nac5 = scan.nextLine();
				
				Boolean aux7=false;
				
				Iterator<Jugador>it5 = equipo.iterator();
				 while(it5.hasNext()) {
					Jugador j = it5.next();
					if(j.getNacionalidad().equals(nac5)) {
						j.MostrarDatos();
						aux7=true;
						System.out.println("--------------------------------------------");
					}
				 }
				if (!aux7) System.out.println("No se encontraron jugadores de esa Nacionalidad");
				break;
			case 8:
				
				System.out.println("Fin del Programa.");
				break;
			}
			
		} while (op!= 8);
		
		

	}

}
