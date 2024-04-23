package pruebas;

import java.util.List;
import java.util.stream.Stream;

public class Test13Peek {

	public static void main(String[] args) {
		List<Integer> nums=List.of(11,4,5,8,2,7,5,8);
		//muestra cada número de la lista sin contar el repetidos, y despue´s el total 
		//de estos numeros
	System.out.println("Total de números: "+ nums.stream()
		.distinct()
		.peek(n->System.out.println("numeros: "+ n))//Stream <Integer>
		.count());
		

	
	}

}
