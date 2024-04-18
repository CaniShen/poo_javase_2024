package service;

import java.time.LocalDate;
import java.time.Period;

public class Operario extends Empleado {
	private int nivel;

	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario) {
		super(nombre, edad, fechaIngreso, salario);
		// TODO Auto-generated constructor stub
	}
	
	public Operario(String nombre, int edad, LocalDate fechaIngreso, double salario, int nivel) {
		super(nombre, edad, fechaIngreso, salario);
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	@Override
	public void incentivar() {
		Period p=Period.between(getFechaIngreso(), LocalDate.now());
		int year=p.getYears();
		if(year>30 && this.nivel>2) {
			this.setSalario(this.getSalario()+this.getBono()*2);
		}else if(year>30 ||this.nivel>2) {
			this.setSalario(this.getSalario()+this.getBono());
		}

	}
	
	public void actualizarNivel() {
		Period p=Period.between(getFechaIngreso(), LocalDate.now());
		int year=p.getYears();
		if(year>2 && this.nivel<5) {
			nivel++;
		}
	}

}
