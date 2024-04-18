package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import model.Producto;

public class ProductoService {
	List<Producto> productos=new ArrayList<>();
	public void agregarProducto(Producto p) {
		productos.add(p);
		
	}
	public void eliminarPorCategoria(String categoria) {
		productos.removeIf(p->p.getCategoria().equals(categoria));
	}
	public void bajarPrecio(int porcentaje) {
		productos.forEach(p->p.setPrecio(p.getPrecio()*((100-porcentaje)/100)));
		/*productos.replaceAll(p->p.getPrecio()*porcentaje);*/
	}
	public void subirPrecioCategoria(int porcentaje, String categoria) {
		productos.replaceAll(p->{
			if(categoria.equals(p.getCategoria())) {
				p.setPrecio(p.getPrecio()*((100+porcentaje)/100));
		}
			return p;
		});
	}
	public List<Producto>obtenerProductos() {
		
		return productos;
		
	}
}
