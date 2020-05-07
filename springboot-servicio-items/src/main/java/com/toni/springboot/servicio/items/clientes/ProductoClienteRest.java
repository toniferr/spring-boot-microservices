package com.toni.springboot.servicio.items.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.toni.springboot.servicio.items.models.Producto;

@FeignClient(name = "servicio-productos" , url = "localhost:8001")
public interface ProductoClienteRest {

    @GetMapping("/listar")
	public List<Producto> listar();
    
    @GetMapping("/ver/{id}")
	public Producto ver(@PathVariable Long id);
}
