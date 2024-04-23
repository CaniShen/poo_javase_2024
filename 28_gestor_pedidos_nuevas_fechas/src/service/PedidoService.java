package service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import model.Pedido;

public class PedidoService {

//  Programa para manejar pedidos. Un pedido se caracteriza por producto,unidades,fechaPedido.
//	Se presenta el siguiente menú:
//	1.- Nuevo pedido
//	2.- Pedido más reciente
//	3.- Pedidos entre dos fechas
//	4.- Salir
//
//	2: Muestra los datos del pedido más reciente
//	3: Se solicitan dos fechas, y se muestran los pedidos realizados
//	en ese rango de fechas 
	HashSet<Pedido> pedidos=new HashSet<>();
	
	public void nuevoPedido(Pedido pedido) {
		pedidos.add(pedido);		
	}
	//devuelve el pedido más reciente, pero si hubiera más de uno
	//que cumpla esa condición (misma fecha), que devuelva el que 
	//mñás unidades
	public Optional<Pedido> pedidoMasReciente() {
		/*Comparator <Pedido> c1=(a,b)->a.getFechaPedido().compareTo(b.getFechaPedido());
		Comparator<Pedido>  c2=(a,b)->a.getUnidades().compareTo(b.getUnidades());*/
		return pedidos.stream()//Stream<Pedido>
				.max(Comparator.comparing((Pedido p)->p.getFechaPedido())
						.thenComparingInt(p->p.getUnidades()));
		/*Pedido pAxu=null;   ///=new Pedido();
		LocalDate fMax=LocalDate.of(0, 1, 1); // 1/1/1970
		for(Pedido p:pedidos) {
			//si encontramos pedido con fecha más reciente que fMax
			//actualizamos fMax y pAux
			if (p.getFechaPedido().isAfter(fMax)) {
				fMax=p.getFechaPedido();
				 pAxu= p;
			}
		}
		return pAxu;*/
		/*return pedidos.stream()
				.collect(Collectors.filtering(p->p.fechaPedido.isAfter(p.fechaPedido), Collectors.toList()));*/
		/*return pedidos.stream()//Stream <Pedido>
				//.max(Comparator.comparing(p->p.getFechaPedido()))
				.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido()));*/
				
	
	}
		 						
										
	
	public List<Pedido> pedidoEntreFechas (LocalDate f1, LocalDate f2) {
		/*ArrayList<Pedido> aux=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2. se incluye 
			if (p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) {
				aux.add(p);
			}
		}
		return aux;*/
		return  pedidos.stream()//Stream <Pedido>
				.filter(p -> p.getFechaPedido().isAfter(f1) && p.getFechaPedido().isBefore(f2))
				.toList();
				
}
	public Optional<Pedido> muestraPedidoCercaFecha(LocalDate f3) {
		return pedidos.stream()
				.min((a,b)->Long.compare(Math.abs(ChronoUnit.DAYS.between(f3,a.getFechaPedido())),
				Math.abs(ChronoUnit.DAYS.between(f3,b.getFechaPedido()))));
				//.min(Comparator.comparingLong(p->Math.abs(ChronoUnit.DAYS.between(p.getFechaPedido(), fecha))))
				//.orElse(null); 
		
		
	}	
	//devuelve la lista de pedidos del producto recibido como parámetro
	public List<Pedido> muestraProducto(String producto) {
			return pedidos.stream()
					.filter(p->p.getProducto().equalsIgnoreCase(producto))
					.collect(Collectors.toList());			
	}
		
			
	//devuelve el pedido como menor número de unidades. Si hay más de uno 
	//el primero que encuentre
	public Optional<Pedido> pedidoMenorUnidades() {
		return pedidos.stream()
				.min(Comparator.comparingInt(p->p.getUnidades()));
	}
	
	
	//devuelve una cadena de nombres de todos los productos, sin duplicar, 
	//separados por un "-"
	
	public String nombresProductos() {
		
		return pedidos.stream()//Stream<Pedido>
				.map(p->p.getProducto())//Steram<String>
				.distinct()//Stream <String>
				.collect(Collectors.joining("-"));
	}
	
	
	
	
	
}



