package pruebas;

import java.util.function.Consumer;

public class PruebasLambda {
	static int s=2;
	public static void main(String[] args) {
		int a=2;
		int b=++a;
		//en una expresion lamba no se pueden usar variables locales
		//a no ser que las considere constante efectivas(siempre
		//Las variables atributo si se pueden usar
		Consumer<Integer> con=x->System.out.println(x+b+s);
		s++;
		
	}

		
}
