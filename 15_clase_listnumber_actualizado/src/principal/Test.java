package principal;

import interfaces.Condicion;
import service.Cuadrado;
import service.ListNumb;
import service.RaizCuadrado;
class Impares implements Condicion {

	@Override
	public boolean test(Integer n) {

		return n % 2 != 0;
	}
}
public class Test {

	public static void main(String[] args) {
		ListNumb lst = new ListNumb();
		lst.add(20);
		lst.add(11);
		lst.add(30);
		lst.add(20);
		lst.add(17);
		lst.eliminarNums(new Impares());
		lst.transformarNumeros(new RaizCuadrado());
		System.out.println(lst.first());
		System.out.println(lst.last());
		System.out.println(lst.sum());
		
		
	}



}
