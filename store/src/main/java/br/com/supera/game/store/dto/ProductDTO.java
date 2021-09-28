package br.com.supera.game.store.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import br.com.supera.game.store.entities.Product;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private BigDecimal price;
	private Short score;
	private String image;

	public ProductDTO() {
	}

	public ProductDTO(Long id, String name, BigDecimal price, Short score, String image) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.score = score;
		this.image = image;
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		score = entity.getScore();
		image = entity.getImage();
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Short getScore() {
		return score;
	}

	public void setScore(Short score) {
		this.score = score;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
