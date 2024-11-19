package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

public class FacturaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente= new Cliente(1,"1756428775","Felipe","Gonzalez","Tumbaco","0989775352","feliz@gmail.com"); 
		Cliente cliente2= new Cliente(2,"1756448742","Alex","Perez","Quito","0989722314","alex@gmail.com");
		
		Factura factura = new Factura(); 
		
		factura.setIdFactura(1);
		factura.setNumFactura("FAC-0001");
		factura.setFecha(new Date());
		factura.setTotalNeto(120.50);
		factura.setIva(15.30);
		factura.setTotal(116.20);
		
		//Inyeccion de dependencias
		
		factura.setCliente(cliente);
		
		System.out.println(factura.toString());
	}

}
