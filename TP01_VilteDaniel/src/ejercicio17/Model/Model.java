package ejercicio17.Model;

import java.time.LocalDate;
import java.util.Comparator;

public class Model {
	
	public class Jugador {
		private String Nombre;
		private String Apellido;
		private LocalDate FechaNacimiento;
		private String Nacionalidad;
		private double Estatura;
		private double Peso;
		private String Posicion;

		public int calcularEdad() {
			int actual = LocalDate.now().getYear();
			int ans = actual - FechaNacimiento.getYear();
			
			return ans;
		}

		public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, String nacionalidad, double estatura,
				double peso, String posicion) {
			super();
			Nombre = nombre;
			Apellido = apellido;
			FechaNacimiento = fechaNacimiento;
			Nacionalidad = nacionalidad;
			Estatura = estatura;
			Peso = peso;
			Posicion = posicion;
		}
		
		public void MostrarDatos() {
			System.out.println("Nombre: "+Nombre);
			System.out.println("Apellido: "+Apellido);
			System.out.println("Fecha de Nacimiento: "+FechaNacimiento);
			System.out.println("Edad: "+calcularEdad());
			System.out.println("Nacionalidad: "+Nacionalidad);
			System.out.println("Estatura: "+Estatura);
			System.out.println("Peso: "+Peso);
			System.out.println("Posicion: "+Posicion);
		}

		public String getNombre() {
			return Nombre;
		}

		public String getApellido() {
			return Apellido;
		}
		
		public String getNacionalidad() {
			return Nacionalidad;
		}
		
	}
	
}
