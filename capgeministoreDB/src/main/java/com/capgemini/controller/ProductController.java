package com.capgemini.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Product;
import com.capgemini.service.IProductService;


@RestController
public class ProductController {

	
	@Autowired
	IProductService service;

	@RequestMapping("/getProducts")
	public List<Product> getProducts()
	{
		return service.showProducts();
		
	
	
}
	@RequestMapping("/getElectronics")
	public List<Product> getElectronicsProducts()
	{
		return service.showSelectedProducts("ELECTRONICS");
	
}
	
	
	@RequestMapping("/getMens")
	public List<Product> getMensProducts()
	{
		return service.showSelectedProducts("MEN");
	
}
	
	@RequestMapping("/getToys")
	public List<Product> getToysProducts()
	{
		return service.showSelectedProducts("TOYS");
	
}
	@RequestMapping("/getFurnitures")
	public List<Product> getFurnituresProducts()
	{
		return service.showSelectedProducts("FURNITURES");
	
}
	
	
	
	
}
