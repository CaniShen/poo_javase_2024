package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.CuentasService;

class TestCuentasService {
	static CuentasService service;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service=new CuentasService();
		
	}

	@Test
	void testExisteCuenta() {
		assertTrue(service.existeCuenta("ES4720800136253000145866"));
		assertFalse(service.existeCuenta("ES111111111"));
	}

	@Test
	void testCuentasPorDivisa() {
		assertEquals(2, service.cuentasPorDivisa("EUR"));
	}

}