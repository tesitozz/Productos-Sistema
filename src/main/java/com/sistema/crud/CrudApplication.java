package com.sistema.crud;

import com.sistema.crud.entidad.Producto;
import com.sistema.crud.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Autowired
	private ProductoRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*
		Producto producto1 = new Producto("Gaseosa","Inca Colas","12","David Sanchez");
		repositorio.save(producto1);

		Producto producto2 = new Producto("Gaseosa","Coca Cola","12","Lolita");
		repositorio.save(producto2);

		 */
	}
}
