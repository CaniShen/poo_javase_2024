package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
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
	
	public List<Pedido> pedidoMasReciente() {
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
//		return pedidos.stream()//Stream <Pedido>
//				//.max(Comparator.comparing(p->p.getFechaPedido()))
//				.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido())
//				.;
		return null;
	
	}
		 						
										
		
	
	public ArrayList<Pedido> pedidoEntreFechas (LocalDate f1, LocalDate f2) {
		/*ArrayList<Pedido> aux=new ArrayList<Pedido>();
		for(Pedido p:pedidos) {
			//si fecha del pedido es posterior o igual a f1 y anterior o igual a f2. se incluye 
			if (p.getFechaPedido().compareTo(f1)>=0&&p.getFechaPedido().compareTo(f2)<=0) {
				aux.add(p);
			}
		}
		return aux;*/
		return null;
				
}
}
