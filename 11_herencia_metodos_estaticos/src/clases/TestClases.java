package clases;
class C1 {
	static void print () {
		System.out.println("C1");
	}
}

class C2 extends C1{
	//sí hereda metodo estático.
	
}
public class TestClases {

	public static void main(String[] args) {
		C2.print();//hereda el método estático.

	}

}
