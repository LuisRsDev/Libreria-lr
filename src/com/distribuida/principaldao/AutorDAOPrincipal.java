package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Cliente;

public class AutorDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		
				// add
		
				Autor autor = new Autor(0, "Juanes", "Raul", "Quito","Av americas","0998878765","juanes@gmail.com" );
				//autorDAO.add(autor);
				
				//up 
					
				Autor autor1 = new Autor(39,"Juan", "Silva", "Ecuador","10 de agosto","0998874532","juan10@gmail.com" );
				//autorDAO.up(autor1);
				
				//delete
				
				//autorDAO.del(39);
				
				//findOne
				
				try {
					Autor autor2 = autorDAO.findOne(39); 
					System.out.println(autor2.toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
		
		List<Autor> autores = autorDAO.findAll();
		
		for (Autor item : autores) {
			
			System.out.println(item.toString());
		}
		
		context.close();
	}

}
