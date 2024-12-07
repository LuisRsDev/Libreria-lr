package com.distribuida.principaldao;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;



public class FacturaDAOPrincipal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
				
				FacturaDAO facturaDAO = context.getBean("facturaDAOImpl",FacturaDAO.class);
				ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class); 
				
				//add
				
				Cliente cliente = clienteDAO.findOne(1);
				Factura factura = new Factura(); 
				factura.setIdFactura(0);
				factura.setNumFactura("FAC-001");
				factura.setFecha(new Date());
				factura.setTotalNeto(100.30);
				factura.setIva(15.32);
				factura.setTotal(116.32);
				factura.setCliente(cliente);
				
				//facturaDAO.add(factura);
				
				//up
				
				Cliente cliente1 = clienteDAO.findOne(2);
				Factura factura1= new Factura(); 
				factura1.setIdFactura(86);
				factura1.setNumFactura("FAC-255");
				factura1.setFecha(new Date());
				factura1.setTotalNeto(130.30);
				factura1.setIva(17.32);
				factura1.setTotal(128.32);
				factura1.setCliente(cliente1);
				
				//facturaDAO.up(factura1);
				
				//del 
				
				//facturaDAO.del(86);
				
				//findOne 
				
				try {
					System.out.println(facturaDAO.findOne(86).toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				//findAll
			
				facturaDAO.findAll().forEach(item ->{
					System.out.println(item.toString());
				});
				
				context.close();

	}

}
