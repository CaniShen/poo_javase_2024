package service;

import java.time.LocalDate;

import model.Empleado;

public class Operario extends Empleado {
	private int nivel;

	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		super(nombre, edad, fechaIngreso, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void incentivar() {
		/*Si tiene más de 30 años y su nivel es superior a 2, se le incrementará su salario con el doble del
		bono. Si cumple solo una de las condiciones anteriores, se le incrementará su salario con el
		bono y si no cumple ninguna, no se hará nada.

		Dispondrá además de un método actualizarNivel(), que en caso de que el empleado lleve más
		de dos años en la empresa se le subirá un nivel de seguridad. Si ya está en nivel 5 no se hará
		nada*/

	}

}
