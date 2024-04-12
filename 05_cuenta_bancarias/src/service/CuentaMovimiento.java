package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Movimiento;
/*Clase CuentaMovimientos
Clase que hereda CuentaLimite.  okkkkkkkkkkkkk
Incopora un nuevo método obtenerMovimientos --okaaaaaaaaaaaaaaa
que devolverá un ArraList con los movimientos realizados
en la cuenta
Cada movimiento se define por: cantidad, fechaHora, tipo (ingreso o extracción)*/ 
public class CuentaMovimiento extends CuentaLimite {
	private ArrayList<Movimiento> movimientos=new ArrayList<>();
	
	public CuentaMovimiento(double saldo, double limite) {
		super(saldo,limite);
	}
	public ArrayList<Movimiento> obtenerMovimiento(){
		return movimientos;
	}
	@Override
	public void extraer(double cantidad) {
		Movimiento m=new Movimiento(cantidad,LocalDateTime.now(),"extracción");
		movimientos.add(m);
		super.extraer(cantidad);
	}
	@Override
	public void ingresar(double cantidad) {
		Movimiento m=new Movimiento(cantidad,LocalDateTime.now(),"ingreso");
		movimientos.add(m);
		super.ingresar(cantidad);
	}
	

}
