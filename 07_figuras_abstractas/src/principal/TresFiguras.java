package principal;

import service.Circulo;
import service.Operaciones;
import service.Figura;
import service.Mesa;
import service.Triangulo;

public class TresFiguras {

	public static void main(String[] args) {
	//Crear un Triangulo y un circulo con color 
		//y propiedades cualquera, y después mostrar el color y el area de cada uno
		
		Circulo cr=new Circulo("amarillo",5);
		Triangulo tr= new Triangulo("marrón",5,8);
		System.out.println("color:"+cr.getColor());
		System.out.println("area:"+cr.area());
		System.out.println("color:"+tr.getColor());
		System.out.println("area:+"+tr.area());
		imprimir(cr);
		imprimir(tr);
		
		//llamada a método que recibe la interfaz
		operar(tr);
		operar(new Mesa(2,11,5));
		
	}

	public static void imprimir(Figura f) {  //crear un metodo, static, porque está creado un metodo despues de main
		System.out.println("color:"+f.getColor());
		System.out.println("area:"+f.area());
	}
	public static void operar(Operaciones oper) {
		oper.girar(100);
		System.out.println(oper.invertir());
	}

}

