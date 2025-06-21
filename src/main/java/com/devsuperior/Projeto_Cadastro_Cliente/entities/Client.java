package com.devsuperior.Projeto_Cadastro_Cliente.entities;

import java.time.LocalDate;

public class Client {

	private Long id;
	private String name;
	private Double income;
	private LocalDate bithDate;
	private Integer children;
	
	
	public Client() {
		
	}
	
	public Client(Long id, String name, Double income, LocalDate bithDate, Integer children) {
		this.id = id;
		this.name = name;
		this.income = income;
		this.bithDate = bithDate;
		this.children = children;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public LocalDate getBithDate() {
		return bithDate;
	}

	public void setBithDate(LocalDate bithDate) {
		this.bithDate = bithDate;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
	
	
	
}
