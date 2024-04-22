package empresa;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TestOperador {

	@Test
	void testIncentivar() {
		Operario operario=new Operario("d",31, LocalDate.now().minusMonths(12),1000,3);
		operario.incentivar();
		assertEquals(2200, operario.getSalario());;
	}
	@Test
	void testIncentivar2() {
		Operario operario=new Operario("b",29,LocalDate.now().minusMonths(3),1000,3);
		operario.incentivar();
		assertEquals(1600, operario.getSalario());
	}
	@Test
	void testIncentivar3() {
		Operario operario=new Operario("b",31,LocalDate.now().minusMonths(3),1000,1);
		operario.incentivar();
		assertEquals(1600, operario.getSalario());
	}
	@Test	
	void testActualizarNivel1() {
		Operario operario=new Operario("c",31,LocalDate.now().minusMonths(25),1000,3);
		operario.actualizarNivel();
		assertEquals(4,operario.getNivel());
	}
	@Test
	void testActualizarNivel2() {
		Operario operario=new Operario("c",31,LocalDate.now().minusMonths(25),1000,5);
		operario.actualizarNivel();
		assertEquals(5,operario.getNivel());
	}
}
