package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.capgemini.bean.Product;

@Repository
public class ProductDaoImpl  implements IProductDao{

	
	@Autowired
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Product> showProducts() {
		
			List<Product> list =new ArrayList<>();
			Query q=entityManager.createQuery("from Product");
			list =q.getResultList();
			return list;
		
}
	public List<Product> showSelectedProducts(@PathVariable String items) {
		
		List<Product> list =new ArrayList<>();
		Query q2=entityManager.createQuery("from Product where p_type='"+items+"'");
		list =q2.getResultList();
		return list;
	
}
	
	
	
	
	
	}
