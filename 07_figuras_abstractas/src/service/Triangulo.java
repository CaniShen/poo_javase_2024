package service;
/*Crear una clase Triangulo que herede Figura. Tendrá dos atributos: base y altura
Crear una clase Circulo que herede Figura. Tendrá una tributo radio. */
public class Triangulo extends Figura{  // crear una clase Triangulo heredando la clase abstrado Figura(hereda su atributo color también)
	private int lado,altura;


	public Triangulo(int lado, int altura, String color) {// crear el construcdor con los tres parametros
		super(color);
		this.lado = lado;
		this.altura = altura;
	}
	
/*	public Triangulo(String color) {
		super(color);
	}*/
	@Override
	public double area() {
		return lado*altura/2;
	
	}

	public int getLado() {
		return lado;
	}


	public void setLado(int lado) {
		this.lado = lado;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}
	

}
