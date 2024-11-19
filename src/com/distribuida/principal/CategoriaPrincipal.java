package com.distribuida.principal;

import com.distribuida.entities.Categoria;

public class CategoriaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria categoria = new Categoria(1,"Ciencias","Documentales e informacion");
		Categoria categoria1 = new Categoria(2,"Deportes","Entrevistas y eventos");
		
		System.out.println(categoria.toString());
		System.out.println(categoria1.toString());
	}

}
