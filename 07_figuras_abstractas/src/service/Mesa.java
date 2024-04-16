package service;
/*Añadir una nueva clase llamada Mesa, con tres atributos (alto,ancho y largo)
que implemente la interfaz Operaciones */
public class Mesa implements Operaciones{
	private int alto;
	private int ancho;
	private int largo;
	
	public Mesa(int alto, int ancho, int largo) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
	}
	@Override
	public void girar(int grados) {
		alto+=grados;
		
	}
	@Override
	public int invertir() {
		ancho*=-1;
		return ancho*alto;
	}
}
