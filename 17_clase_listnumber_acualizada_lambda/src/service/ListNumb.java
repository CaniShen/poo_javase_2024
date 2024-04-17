package service;

import java.util.ArrayList;
import java.util.Iterator;

import interfaces.Condicion;
import interfaces.Transformaciones;

//-Vamos a crear una clase, llamada ListNumber,ok 
//para manejar listas de números enteros. ------->collection ArrayList<Integer>
//La clase, heredará ArrayList<Integer>, e incorporará 
//las siguientes mejoras:
//
//-Método first() que devuelve el primer elemento de la lista
//-Método last() que devuelve el último elemento de la lista
//(ambos devuelven null si la lista está vacía)
//-Método sum() que devuelve la suma de todos 
//los elementos de la lista
//
//-No debe permitir añadir números ya existentes 
public class ListNumb extends ArrayList<Integer>{
	public Integer first() {//T get(int 0)
		if (size()==0) {//si está vacía devolvemos null
			return null;
		}
		return get(0);
	}
	public Integer last() {//T get(int (int size()-1))
		if (size()==0) {//si está vacía devolvemos null
			return null;
		}
		return get(size()-1);	
	}
	public int sum() {// recorrer  ArrayList con un buclefor los elementos de la coleccion
						 //¿Sumar elemento? hay que usar parse  asumar todo los elementos(convertiendo 
		int suma=0;
		/*for(int i=0;i<size();i++) {
			suma+=get(i);
		}*/
		for(Integer n:this) { // this se aplica-se refiere, al objeto donde está dentro
			suma+=n;
		}
		return suma;
		
	}
	@Override
	public boolean add(Integer e) {
		if (!contains(e)) {
		return super.add(e);
	}return false;
	

	}
	
	//nuevo método eliminarNumeros: eliminar los números de la 
	//lista que cumplan una condición 
	public void eliminarNums(Condicion condicion) {
		/*for(Integer n:this) {
			//si cumple la condición lo eliminamos
			if(condicion.test(n)) {
				remove(n);
			}
		}*/
		/*for(int i=0;i<size();i++) {
			if(condicion.test(get(i))) {
				remove(i);
			}
		}*/
		Iterator<Integer> it=iterator();
		while(it.hasNext()) {
			if(condicion.test(it.next())) {
				it.remove();
			}
		
		}
		
	}
	public void transformarNumeros(Transformaciones transforma) {
		for(int i=0;i<size();i++) {
			set(i,transforma.transformar(get(i)));
		}
	}
	//método para transformar cada número de la lista de otro.Debería ser 
	//capaz de transformar cada número en su cuadrado, en la mitad 
	//en su raíz cuadrado,etc...
	
}


			
		
	