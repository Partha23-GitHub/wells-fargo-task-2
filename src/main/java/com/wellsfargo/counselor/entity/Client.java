package com.wellsfargo.counselor.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String phoneNumber;
	
	@ManyToOne
    @JoinColumn(name = "financial_advisor_id")
    private FinancialAdvisor financialAdvisor;
	
	@OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

	public Client() {
		super();
	}

	public Client(long id, String name, String email, String phoneNumber, FinancialAdvisor financialAdvisor,
			List<Portfolio> portfolios) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.financialAdvisor = financialAdvisor;
		this.portfolios = portfolios;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public FinancialAdvisor getFinancialAdvisor() {
		return financialAdvisor;
	}

	public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
		this.financialAdvisor = financialAdvisor;
	}

	public List<Portfolio> getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}
	
	
}
