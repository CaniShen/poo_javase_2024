package service;

import interfaces.Transformaciones;

public class LaMitad implements Transformaciones {

	@Override
	public Integer transformar(Integer n) {
		
		return n/2;
	}

}
