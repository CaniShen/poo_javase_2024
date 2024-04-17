package service;

import java.util.List;

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
	
	
	public int sumaPorCondicion(List<Integer> numeros,Condicion condicion) {
		int suma=0;
		for(Integer n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}
		return suma;
		
		
	}
}