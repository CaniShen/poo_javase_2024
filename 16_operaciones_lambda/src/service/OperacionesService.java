package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import interfaces.Condicion;

public class OperacionesService {
//método que recibe una lista de números enteros
	//y devuelve la suma de los pares
/*	public int sumaPares(List<Integer>numeros) {
		int suma=0;
		for(Integer n:numeros) {
			if(n%2==0) {
				suma+=n;
			}
		}
		return suma;
	}
	//método que recibe una lista de números enteros
	//y devuelve la suma de los positivos
	
/*	public int sumaPositivo(List<Integer>numeros) {
		int suma=0;
		for(Integer n:numeros ) {
			if(n>0) {
				suma+=n;
			}
		}
		return suma;
	}*/

	//método que recibe una lista de números enteros 
//y devuelve la suma de los multiplos de 5

	/*public int sumaMultiplos(List<Integer>numeros) {
		int suma=0;
		for(Integer n:numeros) {
			if (%5==0)
		}
		
		return 0;	
	}*/
	//método que recibe una lista d enumero y una condición 
	//devuelve la suma de los números que cumplen esa condición
	
	
	public int sumaPorCondicion(List<Integer> numeros,Predicate<Integer> predicate) {
		int suma=0;
		for(Integer n:numeros) {
			if(predicate.test(n)) {
				suma+=n;
			}
		}
		return suma;
		
		
	}
	public void gestionaNumeros(Collection<Integer>numeros,
								Consumer<Integer>operacion,
								Predicate<Integer>condicion) {// un método no se devuelve nada, son tres parametros, 
		for (Integer n:numeros) {
			if(condicion.test(n)){
				operacion.accept(n);
			}

		}
		
	}
	
		 //método que recibe una lista de números e imprime los pares
		//método que recibe un conjunto de números y guarda en un fichero los positivos
		//método que recibe una lista y guarda en un fichero los múltiplos de cinco
		//método que recibe un conjunto de números e imprime los negativos 
}