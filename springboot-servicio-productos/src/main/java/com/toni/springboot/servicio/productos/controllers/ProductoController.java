package com.toni.springboot.servicio.productos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.toni.springboot.servicio.productos.models.entity.Producto;
import com.toni.springboot.servicio.productos.models.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Producto ver(@PathVariable Long id) {
		return productoService.findById(id);
	}
}

	