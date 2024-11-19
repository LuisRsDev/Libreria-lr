package com.distribuida.principal;

import com.distribuida.entities.Autor;

public class AutorPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Autor autor = new Autor(1,"Pablo","Neruda","Argentina","Buenos Aires","0999553311","pablo@gmail.com");
		Autor autor1 = new Autor(2,"Miguel","Servantes","Bolivia","Calle Ricardo","0984466331","miguel@gmail.com");
		
		System.out.println(autor.toString());
		System.out.println(autor1.toString());
		
	}

}
