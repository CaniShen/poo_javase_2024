package model;

import java.time.LocalDate;

public abstract class Empleado {
		private String nombre;
		private int edad;
		private LocalDate fechaIngreso;
		private double salario;
		final private double bono=600.00;
		public Empleado(String nombre, int edad, LocalDate fechaIngreso, double salario) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.fechaIngreso = fechaIngreso;
			this.salario = salario;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public LocalDate getFechaIngreso() {
			return fechaIngreso;
		}
		public void setFechaIngreso(LocalDate fechaIngreso) {
			this.fechaIngreso = fechaIngreso;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
	public abstract void incentivar();
	public double getBono() {
		return bono;
	}
		
		
}
