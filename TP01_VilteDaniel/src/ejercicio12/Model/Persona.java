package ejercicio12.Model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaDeNac;
	
	
	public Persona(String nom, Calendar fecha) {
		this.nombre= nom;
		this.fechaDeNac = fecha;
	}
	
	public void MostrarDatos() {
		System.out.println("Nombre: "+ this.nombre);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        int dia=this.fechaDeNac.get(Calendar.DAY_OF_MONTH);
        int mes=this.fechaDeNac.get(Calendar.MONTH); mes++;
        int anio=this.fechaDeNac.get(Calendar.YEAR);
		System.out.println("Fecha de Nacimiento: "+dia+"/"+mes+"/"+anio);
		System.out.println("Edad: "+edad());
		System.out.println("Signo de zodiaco: "+zodiaco());
	}
	
	public int edad() {
		Calendar actual = Calendar.getInstance();
		int aux = actual.get(Calendar.YEAR) - fechaDeNac.get(Calendar.YEAR);
		if (actual.get(Calendar.DAY_OF_YEAR) < fechaDeNac.get(Calendar.DAY_OF_YEAR)) {
			aux--;
		}
		return aux;
	}
	
	public String zodiaco() {
		int dia = fechaDeNac.get(Calendar.DAY_OF_MONTH);
		int mes = fechaDeNac.get(Calendar.MONTH);
		 if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
	            return "Aries";
	        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
	            return "Tauro";
	        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
	            return "Géminis";
	        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
	            return "Cáncer";
	        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
	            return "Leo";
	        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
	            return "Virgo";
	        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
	            return "Libra";
	        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
	            return "Escorpio";
	        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
	            return "Sagitario";
	        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
	            return "Capricornio";
	        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
	            return "Acuario";
	        } else {
	            return "Piscis";
	        }
	}
	
	public String estacion() {
		int mes = fechaDeNac.get(Calendar.MONTH);
		String estac="";
		if (mes==11 || mes<2) {
			estac= "Verano";
		} else if(mes>=2 && mes<=4){
			estac= "Otoño";
		} else if (mes>=5 && mes <=7) {
			estac= "Invierno";
		} else if (mes>=8 && mes<=10){
			estac= "Primavera";
		}
		return estac;
	}
	

}
