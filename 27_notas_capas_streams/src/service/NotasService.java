package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

////Realizar una nueva versión del programa de las notas. Al iniciar el programa
//aparecerá el siguiente menú:
//1.- Nueva nota
//2.- Calcular media
//3.- Notas extremas
//4.- Ver todas
//5.- Salir 
public class NotasService {
	ArrayList<Double> notas = new ArrayList<Double>();

	public void agregarNota(double nota) {
		notas.add(nota);

	}

	public double media() {
	/*return notas.stream()
			.mapToDouble(n->n)
			.average()
			.orElse(0);*/
		return notas.stream()
				.collect(Collectors.averagingDouble(n->n));
	}

	public double max() {
			/*return notas.stream()
				.mapToDouble(n->n)//DoubleStream
				.max()
				.orElse(0);*/
			return notas.stream()
					.collect(Collectors.maxBy(Comparator.comparingDouble(n->n)))
					.orElse(0.0);
	}

	public double min() {
		/*return notas.stream()
				.mapToDouble(n->n)
				.min()
				.orElse(0);*/
		return notas.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(n->n)))
				.orElse(0.0);
	}
	
	public int totalAprobado() {
		/*return (int)notas.stream()
				.filter(n->n>=5)
				.count();*/
		return notas.stream()
				.collect(Collectors.filtering(n->n>5,Collectors.counting())).intValue();
	}
	public Double[] obtenerNotas() {
/*	double []todas=new double[notas.size()];
//		for(int i=0;i<notas.size();i++) {
//			todas[i]=notas.get(i);
		}
//		return todas;*/
//		return notas.stream().mapToDouble(i -> i).toArray();
		return notas.toArray(new Double[0]);
	}

}




