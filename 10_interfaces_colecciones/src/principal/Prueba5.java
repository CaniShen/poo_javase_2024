package principal;

import java.util.ArrayList;
import java.util.List;

public class Prueba5 {

	public static void main(String[] args) {
		List<Integer> lst1=new ArrayList<Integer>();
		
		//List<Number> lst2=new ArrayList<Integer>(); una lista de Number no es una lista de Integer
		// tiene que ser del mismo tipo, aunque existe la relación de herencia 
		// si es una lista de Number tiene que ser Lista de Number
		// El tipo de objeto tiene que coicidir.
		//Vairable de la colección.
		List<Number> lst3=new ArrayList<Number>();
		lst3.add(10);
		lst3.add(4.5);
		
		
		ArrayList<Integer> nums=new ArrayList<Integer>();
		nums.add(25);nums.add(3);nums.add(43);
		
		List<?> lst4=nums;
		//El tipo comodin, una conjunta definida admite de lista(u otro tipo de conjunto)
		//del cualquiertipo 
		List<? extends Number>lst5=nums;// admite lista de cualuqier tipo  que herede number(o Number)
		List<? super Integer> lst56=nums;//admite lista de cualuqier tipo que sea superclase de Integer(o Integer)
		//MAL!! new ArrayList<?>(); esta error. comodin no es un tipo 
	
	}	

}
