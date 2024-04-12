package service;

public class Cuenta {// --clase cuenta--declaramos atributo类 现实甚或中具有共同--属性---和---行为--事物的抽象
	private double saldo;//Objeto---客观存在的东西---面对象


	public Cuenta(double saldo) { //构造函数
		super();
		this.saldo = saldo;
	}

	public Cuenta() {
		saldo = 100;
	}
	
	public void extraer(double cantidad) {
		this.saldo-=cantidad;
	}
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	public double obtenerSaldo() {
		return saldo;
	}

}
