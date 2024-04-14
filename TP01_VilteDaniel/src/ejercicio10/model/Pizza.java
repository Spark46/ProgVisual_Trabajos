package ejercicio10.model;

public class Pizza {
		private double diametro;
		private double precio;
		private double area;
		private boolean ingredentes_especiales;
		private static final double IE20 = 500;
		private static final double IE30 = 750;
		private static final double IE40 = 1000;
		
		public Pizza() {
			
		}
		
		public void CalcularArea() {
			this.area = (3.14 * ((diametro/2)*(diametro/2)));
		}
		
		public int calcularPrecio() {
			int precio;
			if (diametro==20) {
				precio=4500;
				if (ingredentes_especiales==true) {
					precio+=IE20;
				}
			} else if (diametro==30) {
				precio=4800;
				if (ingredentes_especiales==true) {
					precio+=IE30;
				}
			} else {
				precio=5500;
				if (ingredentes_especiales==true) {
					precio+=IE40;
				}
			}
			return precio;
		}
		
		//Getter and Setters
		public double getDiametro() {
			return diametro;
		}
		public void setDiametro(double diametro) {
			this.diametro = diametro;
		}
		public double getPrecio() {
			return precio;
		}
		public void setPrecio(double precio) {
			this.precio = precio;
		}
		public double getArea() {
			return area;
		}
		public boolean isIngredentes_especiales() {
			return ingredentes_especiales;
		}
		public void setIngredentes_especiales(boolean ingredentes_especiales) {
			this.ingredentes_especiales = ingredentes_especiales;
		}
		
		
}
