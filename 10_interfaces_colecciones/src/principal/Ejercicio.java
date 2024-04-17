package principal;


/*Escribe un método que nos muestre la parte entera
de cualquier objeto numérico de envoltorio:

Double d=2.3;
Integer integ=7;
Float ft=3.4f;

metodo(d) -> 2
metodo(integ) ->7
metodo(ft) -> 3 */
public class Ejercicio {
	Number nums;
	public static int dameEntero(Number nums){
	return nums.intValue();
}
	public static void main(String[] args) {
		Double d=2.3;
		Integer integ=7;
		Float ft=3.4f;
		System.out.println(dameEntero(d));
		dameEntero(integ);
	}

}
