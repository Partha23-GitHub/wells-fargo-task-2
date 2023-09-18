package com.wellsfargo.counselor.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Portfolio {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

	
	public Portfolio(Long id, Client client, List<Security> securities) {
		super();
		this.id = id;
		this.client = client;
		this.securities = securities;
	}
	public Portfolio() {
		super();
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Security> getSecurities() {
		return securities;
	}
	public void setSecurities(List<Security> securities) {
		this.securities = securities;
	}
    
}
