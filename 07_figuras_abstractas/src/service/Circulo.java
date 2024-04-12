package service;

public class Circulo extends Figura{// crear una clase Triangulo heredando la clase abstrado Figura(hereda su atributo color también)
		private double radio;
	
		public Circulo(String color, double radio) {// crear el construcdor con los dos parametros
			super(color);
			this.radio = radio;

		}

		@Override
		public double area() {
			return Math.PI*radio*radio; //Math.PI(radio^2) no EXISTE!!!
			
		}

		public double getRadio() {
			return radio;
		}

		public void setRadio(double radio) {
			this.radio = radio;
		}
		

	}

