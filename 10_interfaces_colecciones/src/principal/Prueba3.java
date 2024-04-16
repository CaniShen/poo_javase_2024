package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prueba3 {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(11);nums.add(7);nums.add(12);nums.add(31);
		HashSet<Integer> nums2=new HashSet<Integer>();
		nums2.add(11);nums2.add(4);nums2.add(1);nums2.add(31);
		//System.out.println(iguales(nums,nums2));
		//recorremos resultado con un Iterator
		Set<Integer> res=iguales(nums,nums2);
		Iterator<Integer> it=res.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	//Realizar un método que recibe dos colecciones de enteros
	//y devuelve un conjunto con los números contenidos en ambas
	//colecciones
	public static Set<Integer> iguales(Collection<Integer> col1,Collection<Integer> col2){
		Set<Integer> resultado=new HashSet<>();
		for(Integer n:col1) {
			if(col2.contains(n)) {
				resultado.add(n);
			}
		}
		return resultado;
	}

}
