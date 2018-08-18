package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Product;

public interface IProductService {

	
	public List<Product> showProducts() ;
		
	public List<Product> showSelectedProducts(String items);
	
	
}
