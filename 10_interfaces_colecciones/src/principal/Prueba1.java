package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class Prueba1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(25);nums.add(200);nums.add(20);
		System.out.println(sumarPares(nums));
		Vector<Integer> nums2=new Vector<Integer>();
		nums2.add(4);nums2.add(11);nums2.add(67);
		System.out.println(sumarPares(nums2));
		//lista inmutable (fija)
		List<Integer> nums3=List.of(40,2,11,-3,6);
		
		System.out.println(sumarPares(nums3));
	}
	
	//crear un método que reciba una lista de Integer
	//y devuelva la suma de los pares de dicha lista
	public static int sumarPares(List<Integer> lista) {
		int pares=0;
		for(Integer n:lista) {
			if(n%2==0) {
				pares+=n;
			}
		}
		return pares;
	}
	
	//crear un método que reciba una colección de Integer
	//y devuelva la media de los valores de dicha colección
	public static int media(Collection<Integer> col) {
		int media=0;
		for(Integer n:col) {
			media+=n;
		}
		return media/col.size();
	}
}
