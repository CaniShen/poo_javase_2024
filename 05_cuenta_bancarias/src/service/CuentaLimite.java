package service;

public class CuentaLimite extends Cuenta {
	private double limite;// atributo de la clase Cuenta, hay que hacer el consductor
							// de la clase.

	public CuentaLimite(double saldo, double limite) {// se utiliza para crea una instancia con un saldo inicial
														// y un límite esecífico.

		super(saldo);
		this.limite = limite;
	}

	public CuentaLimite(double limite) {
		this.limite = limite;
	}

	public CuentaLimite() {
		limite = 50;// limite por defecto si no se asigna ninguno
	}

	// extraemos si la cantidad es inferior al límite
	@Override
	public void extraer(double cantidad) {
		if (cantidad < limite) {
			super.extraer(cantidad);
		}

	}
//	clase CuentaLimite
//	Clase que hereda Cuenta. Incorporará un atributo "limite",
//	para limitar la extracción a dicho valor.
//-----------------------------------------------
//	Además, añadiremos un método ajustarLimite(), que fijará el límite
//	en la mitad del saldo 
	public double adjustarLimite() {
		return this.limite = this.obtenerSaldo() / 2;

	}

}
