package br.com.supera.game.store.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.supera.game.store.entities.Cart;

public class CartDTO {

	private Long id;
	private Integer quantity;
	private Double totalValue;
	private Double subValue;
	private Double shippingValue;

	private UserDTO user;
	private List<ProductDTO> products = new ArrayList<>();

	public CartDTO() {
	}

	public CartDTO(Long id, Integer quantity, Double totalValue, Double subValue, Double shippingValue, UserDTO user,
			List<ProductDTO> products) {
		this.id = id;
		this.quantity = quantity;
		this.totalValue = totalValue;
		this.subValue = subValue;
		this.shippingValue = shippingValue;
		this.user = user;
		this.products = products;
	}

	public CartDTO(Cart entity, UserDTO user, ProductDTO products) {
		quantity = entity.getQuantity();
		totalValue = entity.getTotalValue();
		subValue = entity.getSubValue();
		shippingValue = entity.getShippingValue();
		user = new UserDTO(entity.getUser());
		products = (ProductDTO) entity.getProducts();
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

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}
}
