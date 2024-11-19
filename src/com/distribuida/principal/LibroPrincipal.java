package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Libro;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Autor;

public class LibroPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categoria categoria = new Categoria(1,"Ciencias","Documentales e informacion");
		Categoria categoria1 = new Categoria(2,"Deportes","Entrevistas y eventos");
		Autor autor = new Autor(1,"Pablo","Neruda","Argentina","Buenos Aires","0999553311","pablo@gmail.com");
		Autor autor1 = new Autor(2,"Miguel","Servantes","Bolivia","Calle Ricardo","0984466331","miguel@gmail.com");
		
		Libro libro = new Libro(); 
		
		libro.setIdLibro(1);
		libro.setTitulo("Don quijote");
		libro.setEditorial("Montevideo");
		libro.setNumPaginas("13400");
		libro.setEdicion("ilimitada");
		libro.setIdioma("español");
		libro.setFechaPublicacion(new Date());
		libro.setDescripcion("Fantasia"); 
		libro.setTipodePasta("Doble");
		libro.setIsbn("123");
		libro.setNumEjemplares("123555");
		libro.setPortada("Elegante");
		libro.setPresentacion("Fuerte");
		libro.setPrecio(130.20);
		
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		
		System.out.println(libro.toString());
		

		}
	}
