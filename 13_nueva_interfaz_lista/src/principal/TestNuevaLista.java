package principal;

import service.NuevaLista;

public class TestNuevaLista {

	public static void main(String[] args) {
		System.out.println(NuevaLista.ofPares(10));
		System.out.println(NuevaLista.ofPositivos(5,-2,-6,9,-4,2));
	}

}