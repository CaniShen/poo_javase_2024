package pruebas;

import java.util.Arrays;
import java.util.Comparator;

public class Test11Ordenacion {

	public static void main(String[] args) {
		String[] textos= {"hello","by","car","send","enter","clear","in","step"};
		//muestra las palabras ordenadas a menos a más caracteres
		//y si tienen el mismo número ed caracteres, entonces las ordenan
		//alfabeticamente
		
		
		/*Comparator<String> c1=(a,b)->a.length()-b.length();
		Comparator<String> c2=c1.thenComparing((a,b)->a.compareTo(b));
		Arrays.stream(textos)
		.sorted(c2)
		//.sorted(Comparator.comparingInt(a->a.length()))
		.forEach(System.out::println);*/

		Arrays.stream(textos)
		.sorted(Comparator.comparingInt((String a)->a.length()).thenComparing((a,b)->a.compareTo(b)))
		.forEach(System.out::println);

		
}
}