package principal;

import java.util.stream.Stream;

public class Primitiva {

	public static void main(String[] args) {
		//realizar un programa que muestra la combinación ganadora
		//de la primitiva (6 números aleatorios no repetidos entre
		//1 y 49
		Stream.generate(()->(int)(Math.random()*49+1))
		.distinct()
		.limit(6)
		.forEach(n->System.out.println(n));
			
		

	}

}