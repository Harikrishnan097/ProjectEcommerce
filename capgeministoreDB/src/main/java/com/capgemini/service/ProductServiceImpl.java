package com.capgemini.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.capgemini.bean.Product;
import com.capgemini.dao.IProductDao;
import com.capgemini.dao.ProductDaoImpl;


@Service
@Transactional
public class ProductServiceImpl implements IProductService {

	
	@Autowired
	ProductDaoImpl repo;
	@Override
	public List<Product> showProducts() {
		// TODO Auto-generated method stub
		return repo.showProducts();
	}
	
	@Override
	public List<Product> showSelectedProducts(String items) {
		// TODO Auto-generated method stub
		return repo.showSelectedProducts(items);
	}

	}


