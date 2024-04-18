package principal;

import java.util.ArrayList;
import java.util.List;

public class TestremoveIf {

	public static void main(String[] args) {
		//List<Integer> nums=List.of(3,18,9,-3,2,-8); //no se puede cambiar por Inmutabilidad POR LIST OF
		List<Integer> nums=new ArrayList<>(List.of (3,18,9,-3,2,-8));
		nums.removeIf(n->n<0);
		nums.forEach(n->System.out.println(n));

	}

}
