package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;
import com.distribuida.entities.Libro;

public class FacturaDetallePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factura factura = new Factura(); 
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-0001");
		factura.setFecha(new Date());
		factura.setTotalNeto(120.50);
		factura.setIva(15.30);
		factura.setTotal(116.20);	
		Libro libro = new Libro(); 
		
		libro.setIdLibro(1);
		libro.setTitulo("Don quijote");
		libro.setEditorial("Montevideo");
		libro.setNumPaginas(12);
		libro.setEdicion("ilimitada");
		libro.setIdioma("español");
		libro.setFechaPublicacion(new Date());
		libro.setDescripcion("Fantasia"); 
		libro.setTipodePasta("Doble");
		libro.setIsbn("123");
		libro.setNumEjemplares(18);
		libro.setPortada("Elegante");
		libro.setPresentacion("Fuerte");
		libro.setPrecio(130.20);

		FacturaDetalle facturaDetalle = new FacturaDetalle(1, 124.00, 156.18, factura, libro);
		System.out.println(facturaDetalle.toString());
	
	}
 
}
