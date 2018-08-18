package com.capgemini.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.bean.Product;


@RestController
public class ProductController {

	
	
	
	
	@RequestMapping("/index")
	public ModelAndView getProduct() {
		RestTemplate rt= new RestTemplate();
		List<Product>  p =rt.getForObject("http://localhost:9898/getProducts", ArrayList.class);
		return new ModelAndView("index","product",p);
		
		
		
		   
	 		
	}
	@RequestMapping("/")
	public ModelAndView getProducts() {
		RestTemplate rt= new RestTemplate();
		List<Product>  p =rt.getForObject("http://localhost:9898/getProducts", ArrayList.class);
		return new ModelAndView("index","product",p);
		
		
		
		   
	 		
	}
	
	@RequestMapping("/electronics")
	public ModelAndView getElectronics() {
		RestTemplate rt= new RestTemplate();
		List<Product>  pe =rt.getForObject("http://localhost:9898/getElectronics", ArrayList.class);
		return new ModelAndView("electronics","productelectronics",pe);
		
	
		
	 		
	}
	@RequestMapping("/furnitures")
	public ModelAndView getFurnitures() {
		RestTemplate rt= new RestTemplate();
		List<Product>  pf =rt.getForObject("http://localhost:9898/getFurnitures", ArrayList.class);
		return new ModelAndView("furnitures","productfurnitures",pf);
		
	
		
	 		
	}
	@RequestMapping("/mens")
	public ModelAndView getMens() {
		RestTemplate rt= new RestTemplate();
		List<Product>  pm =rt.getForObject("http://localhost:9898/getMens", ArrayList.class);
		return new ModelAndView("mens","productmens",pm);
		
	
		
	 		
	}
	@RequestMapping("/toys")
	public ModelAndView getToys() {
		RestTemplate rt= new RestTemplate();
		List<Product>  pt =rt.getForObject("http://localhost:9898/getToys", ArrayList.class);
		return new ModelAndView("toys","producttoys",pt);
		
	
		
	 		
	}
	

	/*@RequestMapping("/products")
public ModelAndView getAllEmployees() {
		
		List<Product> list=
		return new ModelAndView("show","emps",list);
		
	}*/
	
	
	
}
