package com.toni.springboot.servicio.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.toni.springboot.servicio.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
