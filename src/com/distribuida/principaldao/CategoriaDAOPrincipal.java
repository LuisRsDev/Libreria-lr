package com.distribuida.principaldao;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;

public class CategoriaDAOPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);
		
		
				// add
		
				Categoria categoria = new Categoria(0,"Programacion", "Matematica simple e infrestructura de ciclos" );
				//categoriaDAO.add(categoria);
				
				//up 
				
				Categoria categoria1 = new Categoria(39,"Matematica", "Matematicas funcional y ciclos");
				//categoriaDAO.up(categoria1);
				
				//delete
				
				//categoriaDAO.del(39);
				
				//findOne
				
				try {
					Categoria categoria2 = categoriaDAO.findOne(39); 
					System.out.println(categoria2.toString());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
				//findAll
		
		List<Categoria> categorias = categoriaDAO.findAll();
		
		for (Categoria item : categorias) {
			
			System.out.println(item.toString());
		}
		
		context.close();
		
	}

}
