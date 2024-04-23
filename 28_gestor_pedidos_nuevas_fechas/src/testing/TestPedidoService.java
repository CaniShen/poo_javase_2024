package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.Pedido;
import service.PedidoService;

class TestPedidoService {
	static PedidoService service=new PedidoService();
	static Calendar calender=Calendar.getInstance();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		LocalDate f1=LocalDate.of(2023, 11,30);		
		LocalDate f2=LocalDate.of(2022,4, 11);
		LocalDate f3=LocalDate.of(2022,10,1);
	
		
		service.nuevoPedido(new Pedido("coca cola",20,f1));
		service.nuevoPedido(new Pedido("whisky",1,f2));
		service.nuevoPedido(new Pedido("patatas fritas",10,f3));
	}
	

	@Test
	void testPedidoMasReciente() {
		assertTrue(service.pedidoMasReciente().isPresent());
		assertEquals("coca cola", service.pedidoMasReciente().get().getProducto());
	}

	@Test
	void testPedidoEntreFechas() {
		LocalDate fmin=LocalDate.of(2022, 1, 1);
		LocalDate fmax=LocalDate.of(2022,12,31);
		assertEquals(2,service.pedidoEntreFechas(fmin, fmax).size());
	}
	@Test
	void testmuestraPedidoCercaFecha() {

		assertEquals("coca cola",service.muestraPedidoCercaFecha(LocalDate.of(2023,12,7)).get().getProducto());
		assertEquals("patatas fritas",service.muestraPedidoCercaFecha(LocalDate.of(2022,8,7)).get().getProducto());
		
	}
}
