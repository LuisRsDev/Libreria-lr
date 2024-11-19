package com.distribuida.principal;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente= new Cliente(1,"1756428775","Felipe","Gonzalez","Tumbaco","0989775352","feliz@gmail.com"); 
		Cliente cliente2= new Cliente(2,"1756448742","Alex","Perez","Quito","0989722314","alex@gmail.com");
		
		System.out.println(cliente.toString());
		System.out.println(cliente2.toString());
		
		
	
	}

}
