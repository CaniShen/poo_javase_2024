package pruebas;

import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(25,2,8,-3,2,4,11,-1,-20,8);
		//¿cuantos números positivos no repetidiso existes?
		System.out.println(nums.stream()
		.distinct()
		.filter(n->n>0)
		.count()
		);

	}

}
