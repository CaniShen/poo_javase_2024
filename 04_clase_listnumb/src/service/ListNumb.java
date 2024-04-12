package service;

import java.util.ArrayList;

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
		for(Integer n:this) { // this se apilica-se refiere, al objeto donde está dentro
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
}


			
		
	