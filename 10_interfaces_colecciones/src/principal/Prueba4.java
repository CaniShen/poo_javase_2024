package principal;
interface I1{
	void print();
}
class CA implements I1{ 
	public void print(){// los metodos son publicos si están implementado un interface.
		System.out.println("CA");
	}
}
class CB extends CA{
	public void print(){
		System.out.println("CB");
	}
}
class CC extends CB{

}
public class Prueba4 {

	public static void main(String[] args) {
		CC c=new CC();
		c.print();
		CB b=c;
		b.print();
		CA a=c;
		a.print();
		I1 i=c;
		i.print();

	}

}