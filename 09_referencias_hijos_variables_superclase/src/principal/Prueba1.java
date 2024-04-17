package principal;
class C1{
	int a=5;
	public void print() {
		System.out.println("C1");
	}
}
class C2 extends C1{
	int a=6;
	public void print() {
		System.out.println("C2");
	}
	public void send() {
		System.out.println("Enviando...");
	}
}
public class Prueba1 {
	
	public static void main(String[] args) {
		C1 c=new C2();
		c.print();
		//c.send();no se puede llamar a este métodi porque no es de C1.
		//NO , poruqe es tipo de método no está definido en superclase.
		System.out.println(c.a);
	}

}