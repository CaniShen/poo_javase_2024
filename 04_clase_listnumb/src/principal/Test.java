package principal;

import service.ListNumb;

public class Test {

	public static void main(String[] args) {
		ListNumb lst = new ListNumb();
		lst.add(20);
		lst.add(30);
		lst.add(10);
		System.out.println(lst.first());
		System.out.println(lst.last());
		System.out.println(lst.sum());

	}

}
