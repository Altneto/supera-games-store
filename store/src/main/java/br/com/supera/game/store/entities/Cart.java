package br.com.supera.game.store.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer quantity;
	private Double totalValue;
	private Double subValue;
	private Double shippingValue;

	@ManyToOne
	private User user;

	@ManyToMany
	private List<Product> products = new ArrayList<>();

	public Cart() {
	}

	public Cart(Long id, Integer quantity, Double totalValue, Double subValue, Double shippingValue, User user,
			List<Product> products) {
		this.id = id;
		this.quantity = quantity;
		this.totalValue = totalValue;
		this.subValue = subValue;
		this.shippingValue = shippingValue;
		this.user = user;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Double getSubValue() {
		return subValue;
	}

	public void setSubValue(Double subValue) {
		this.subValue = subValue;
	}

	public Double getShippingValue() {
		return shippingValue;
	}

	public void setShippingValue(Double shippingValue) {
		this.shippingValue = shippingValue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
