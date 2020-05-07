package com.toni.springboot.servicio.productos.models.service;

import java.util.List;

import com.toni.springboot.servicio.productos.models.entity.Producto;

public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
