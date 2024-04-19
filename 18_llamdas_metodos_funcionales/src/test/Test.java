package test;

import java.util.List;
import java.util.Map;
import java.util.Set;

import service.FuncionalesService;

public class Test {

	public static void main(String[] args) {
		FuncionalesService service=new FuncionalesService();
		//Realizar una llamada a cada método de service.
		//service.m1(Set.of(8,4,7),s->s.length());
		service.m1(Set.of(8,4,7),String::length);
		//service.m2(()->"Fafu y Kasiluo",(Integer n)->System.out.println(n));
		service.m2(()->"Fafu y Kasiluo",System.out::println);
		service.m3((a,b)->a+b,(a,b)->a);
		service.m4((a,b)->System.out.println(a+b), (a,b)->a.length()>b);
		service.m5(()->3, List.of("Fafu","Kasiluo","Neko"));
		service.m6(Map.of("Fafi",1,"Kasiluo",2),(a,b)->System.out.println(a+b));
		service.m7((String a)->List.of(a.length(),5,1));
	}

}
