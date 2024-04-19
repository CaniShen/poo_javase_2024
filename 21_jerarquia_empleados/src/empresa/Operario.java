package empresa;

import java.time.LocalDate;
import java.time.Period;

public class Operario extends Empleado {
	private int nivel;

	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		super(nombre, edad, fechaIngreso, salario);
		this.setNivel(nivel);
	}
	

	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		this.nivel = nivel;
	}


	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		if(nivel<=5&&nivel>=1) {
			this.nivel=nivel;
		}else {
			this.nivel=1;
		}
	}

	@Override
	public void incentivar() {
		Period p=Period.between(getFechaIngreso(), LocalDate.now());
		int year=p.getYears();
		if(this.getEdad()>30 && this.nivel>2) {
			this.setSalario(this.getSalario()+Empleado.BONO*2);
		}else if(this.getEdad()>30 ||this.nivel>2) {
			this.setSalario(this.getSalario()+Empleado.BONO);
		}

	}
	
	public void actualizarNivel() {
		Period p=Period.between(getFechaIngreso(), LocalDate.now());
		long year=p.getYears();
		if(year>2 && this.nivel<5) {
			nivel++;
		}
	}

}
