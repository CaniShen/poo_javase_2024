package service;

import java.util.ArrayList;
import java.util.List;

public interface NuevaLista extends List<Integer> {
	static List<Integer> ofPares(int n){
		Integer[] result=new Integer[n];
		int num=0,cont=0;
		while(cont<n){
			result[cont]=num;
			num+=2;
			cont++;
		}
		return List.of(result);
	}
	static List<Integer> ofPositivos(int ... data){
		var result=new ArrayList<Integer>();
		for(int n:data) {
			if(n>0) {
				result.add(n);
			}
		}
		return result;
	}
}
