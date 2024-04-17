package view;

import java.util.List;

import interfaces.Condicion;
import service.OperacionesService;
class Positivos implements Condicion{

	@Override
	public boolean test(Integer n) {
		
		return n>0;
	}
	
}
class Pares implements Condicion {

	@Override
	public boolean test(Integer n) {
		
		return n%2==0;
	}
	
}
public class AppNumeros {
	

	public static void main(String[] args) {
		List<Integer> numeros=List.of(3,-2,8,5,1,17,22,-9,6,12);
		//imprimir, por una lado, la suma de los pares
		//y por otro suma de los negativos
		OperacionesService service=new OperacionesService();
		System.out.println("Suma positivos: "+service.sumaPorCondicion(numeros, new Positivos()));
		System.out.println("Suma pares: "+service.sumaPorCondicion(numeros, new Pares()));
		
		
	
	}
	
	

	
}
