package com.ControleDeVendasVendedor.cadastroDeVendedor.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String seller_Name;
	private Integer visited ;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	public Sale() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSeller_Name() {
		return seller_Name;
	}

	public void setSeller_Name(String seller_Name) {
		this.seller_Name = seller_Name;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
