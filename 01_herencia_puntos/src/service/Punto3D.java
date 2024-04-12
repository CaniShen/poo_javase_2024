package service;

public class Punto3D extends Punto {
	private int z;
	public Punto3D(int z) {
		//y=100;// da error porque tiene acceso private,pero sí hereda el atributo y
			//en este caso tiene 3 atributos en la memoria.
		//super();//llamada a construcdor sin parámentro de la superclase.
		this.z=z;	
	}

	public Punto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
//	public void imprimir(String r) { //método--sobrecarga
//		
//	}
//	@Override
//	public void imprimir() {
//		System.out.println("Las coordinadas son: "+getX()+","+getY()+","+z);
//	}

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();//llamar al metodo original, y añadiando algo mas.
		System.out.println(","+z);
	}
	
}
