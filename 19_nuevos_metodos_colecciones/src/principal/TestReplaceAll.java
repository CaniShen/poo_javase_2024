package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplaceAll {

	public static void main(String[] args) {
		List<Double> nums= new ArrayList<>(List.of(3.0,18.0,9.0,-3.0,2.0,-8.0));
		//sustituimos cada elemento por su mitad.
		nums.replaceAll(n->n/2);
		nums.forEach(n->System.out.println(n));

	}

}
