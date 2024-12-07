package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class ClienteDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
	
		// add
		
		//Cliente cliente = new Cliente(0,"1753776234", "Felipe", "Lopez", "Quito","0996654832","felipe@gmail.com" );
		//clienteDAO.add(cliente);
		
		//up 
		
		//Cliente cliente1 = new Cliente(39,"1753776234", "Felipes", "Lopez1", "Quito12","0996654832","felipe12@gmail.com" );
		//clienteDAO.up(cliente1);
		
		//delete
		
		//clienteDAO.del(39);
		
		//findOne
		
		try {
			Cliente cliente2 = clienteDAO.findOne(39); 
			System.out.println(cliente2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		//findAll
		
		List<Cliente> clientes = clienteDAO.findAll();
		
		for (Cliente item : clientes) {
			
			System.out.println(item.toString());
		}
		
		context.close();
		

	}

}
