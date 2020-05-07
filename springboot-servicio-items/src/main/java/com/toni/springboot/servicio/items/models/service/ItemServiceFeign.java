package com.toni.springboot.servicio.items.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.toni.springboot.servicio.items.clientes.ProductoClienteRest;
import com.toni.springboot.servicio.items.models.Item;

@Service("serviceFeign")  //se establece el nombre para referenciarlo en @Qualifier en el autowired
@Primary
public class ItemServiceFeign implements ItemService{

	@Autowired
	private ProductoClienteRest clienteFeign;
	
	@Override
	public List<Item> findAll() {
		return clienteFeign.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(clienteFeign.ver(id), cantidad);
	}

}
