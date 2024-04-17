package service;

import interfaces.Transformaciones;

public class RaizCuadrado implements Transformaciones {

	@Override
	public Integer transformar(Integer n) {
	
	 return (int)Math.sqrt(n);
	}

}
