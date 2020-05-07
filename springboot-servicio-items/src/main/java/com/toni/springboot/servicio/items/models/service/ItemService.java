package com.toni.springboot.servicio.items.models.service;

import java.util.List;

import com.toni.springboot.servicio.items.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);

}
