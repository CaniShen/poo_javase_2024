package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
		System.out.println("Suma positivos: "+service.sumaPorCondicion(numeros, n->n>0));
		System.out.println("Suma pares: "+service.sumaPorCondicion(numeros, n->n%2==0));
		//suma los negativos mayores que -5
		System.out.println("Otras "+ service.sumaPorCondicion(numeros, n->n<0&&n>5));
		Predicate<Integer> negativo=n->n<0;
		System.out.println("Otras "+ service.sumaPorCondicion(numeros, negativo.and(n->n<-5)));
		Predicate<Integer> pares=n->n%2==0;
		Predicate<Integer> multi5=n->n%5==0;
		
		//imprimir los positivos
		service.gestionaNumeros(numeros, n->System.out.println(n), n->n>0);
		
		//guarde los pares en un fichero
		
		service.gestionaNumeros(numeros,n->{
			try(FileOutputStream fos=new FileOutputStream("pares.txt", true);
					PrintStream out=new PrintStream(fos)){
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}, pares);
		
		service.gestionaNumeros(numeros, n->{
			try(FileOutputStream fos=new FileOutputStream("pares.txt", true);
					PrintStream out=new PrintStream(fos)){
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}, multi5);
		
		service.gestionaNumeros(numeros, n->{
			try(FileOutputStream fos=new FileOutputStream("multiplos5",true);
					PrintStream out=new PrintStream(fos)){
			}catch(IOException ex) {
					ex.printStackTrace();
				}
		}, n->n<0);
	}
	
	//método que recibe una lista y devuelve la suma de todos los elementos de la lista, añadiendo el valor que se extraiga de un fichero
	//método que recibe una lista y devuelve la suma de todos los elementos de la lista, a le añadimos un número léido desde un puerto externo 
	public int sumaConExtra(List<Integer> numeros, Supplier<Integer> sup) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=n;
		}
		suma+=sup.get();
		return suma;
	}
	
}
