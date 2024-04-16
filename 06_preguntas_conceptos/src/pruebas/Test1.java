package pruebas;
class C1{
	C1(){
		System.out.print("c1");
	}
}
class C2 extends C1{
	C2(int a){
		System.out.print("c2 con a");
	}
}
class C3 extends C2{
	C3(){//error de compilación porque no existe constructor sin parametros en C2
		System.out.print("c3");
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
