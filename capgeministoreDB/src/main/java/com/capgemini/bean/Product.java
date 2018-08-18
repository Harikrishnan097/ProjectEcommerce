package com.capgemini.bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int p_id;
	private String p_name;
	private String company_name;
	private double price;
	private LocalDate p_dateofmanufacturing;
	private String p_type;
	private String p_specification;
	private String p_merchant_id;
	private String coupon_id;
	private String p_image_name;
	public Product(int p_id, String p_name, String company_name, double price, LocalDate p_dateofmanufacturing,
			String p_type, String p_specification, String p_merchant_id, String coupon_id, String p_image_name,
			String quantity) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.company_name = company_name;
		this.price = price;
		this.p_dateofmanufacturing = p_dateofmanufacturing;
		this.p_type = p_type;
		this.p_specification = p_specification;
		this.p_merchant_id = p_merchant_id;
		this.coupon_id = coupon_id;
		this.p_image_name = p_image_name;
		this.quantity = quantity;
	}
	private String quantity;
	public String getP_image_name() {
		return p_image_name;
	}
	public void setP_image_name(String p_image_name) {
		this.p_image_name = p_image_name;
	}
	public Product()
	{
		
	}
	public Product(int p_id, String p_name, String company_name, double price, LocalDate p_dateofmanufacturing,
			String p_type, String p_specification, String p_merchant_id, String coupon_id, String quantity) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.company_name = company_name;
		this.price = price;
		this.p_dateofmanufacturing = p_dateofmanufacturing;
		this.p_type = p_type;
		this.p_specification = p_specification;
		this.p_merchant_id = p_merchant_id;
		this.coupon_id = coupon_id;
		this.quantity = quantity;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getP_dateofmanufacturing() {
		return p_dateofmanufacturing;
	}
	public void setP_dateofmanufacturing(LocalDate p_dateofmanufacturing) {
		this.p_dateofmanufacturing = p_dateofmanufacturing;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public String getP_specification() {
		return p_specification;
	}
	public void setP_specification(String p_specification) {
		this.p_specification = p_specification;
	}
	public String getP_merchant_id() {
		return p_merchant_id;
	}
	public void setP_merchant_id(String p_merchant_id) {
		this.p_merchant_id = p_merchant_id;
	}
	public String getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(String coupon_id) {
		this.coupon_id = coupon_id;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
	
	
}
