package principal;

import java.util.ArrayList;
import java.util.List;

public class Prueba2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(11);nums.add(7);nums.add(12);nums.add(31);
		nums.add(4);nums.add(3);nums.add(8);
		
		//muestra los números compredidos entre las posiciones 3 y 
		List<Integer> sublista=nums.subList(3, 7);
		for(Integer n:sublista) {
			System.out.println(n);
		}
	}

}
