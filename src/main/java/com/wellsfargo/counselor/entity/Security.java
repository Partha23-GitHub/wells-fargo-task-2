package com.wellsfargo.counselor.entity;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private String purchase_date;
    private double purchase_price;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

	
	public Security(Long id, String name, String category, String purchase_date, double purchase_price, int quantity,
			Portfolio portfolio) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.purchase_date = purchase_date;
		this.purchase_price = purchase_price;
		this.quantity = quantity;
		this.portfolio = portfolio;
	}
	public Security() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(String purchase_date) {
		this.purchase_date = purchase_date;
	}
	public double getPurchase_price() {
		return purchase_price;
	}
	public void setPurchase_price(double purchase_price) {
		this.purchase_price = purchase_price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Portfolio getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}
    
	
}
