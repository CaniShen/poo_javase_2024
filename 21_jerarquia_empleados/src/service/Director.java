package service;

import java.time.LocalDate;
import java.time.Period;

public class Director extends Empleado {
	private String departamento;
	private int personal;
	public Director(String nombre, int edad, LocalDate fechaIngreso, double salario, String departamento,
			int personal) {
		super(nombre, edad, fechaIngreso, salario);
		this.departamento = departamento;
		this.personal = personal;
	}
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getPersonal() {
		return personal;
	}

	public void setPersonal(int personal) {
		this.personal = personal;
	}

	@Override
	public void incentivar() {
		Period p=Period.between(getFechaIngreso(), LocalDate.now());
		int month=p.getMonths();
		if(month>30&&personal>20) {
			this.setSalario(this.getSalario()+this.getBono()*2);
		}
		else if(month>30||personal>20){
			this.setSalario(this.getSalario()+this.getBono());
		}		
	}
	
}