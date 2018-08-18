package com.capgemini.dao;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.capgemini.bean.Product;

public interface IProductDao  {
	public List<Product> showProducts() ;
	List<Product> showSelectedProducts(String items);
}
