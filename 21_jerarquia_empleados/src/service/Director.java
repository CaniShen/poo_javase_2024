package service;

import java.time.LocalDate;

import model.Empleado;

public class Director extends Empleado {
	private String departamento;
	private int personal;
	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		super(nombre, edad, fechaIngreso, salario);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void incentivar() {
	/*if (mas 30 años && >20 ) {
		//se le incrementará su salario con el doble del bono.salario+=bono*2;
	}*/
	/*if (mas 30 años or >20) {
		//se le incrementará su salario con el bono
		
	}
	else break;
	}*/

}
}