package pruebas;

import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//imprime los cincos primeros números
		//sin incluir repetidos.
				nums.stream()//Stream<Integer>
				.distinct()	//Stream<Integer>
				.limit(5)	//Steram<Integer>
				.forEach(n->System.out.println(n));

	}

}
