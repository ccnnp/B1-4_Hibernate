package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="itemId")
	private int id;
	@Column(name="itemName")
	private String name;
	@Column(name="Price")
	private int price;
	@Column(name="Manufacturing_date")
	private String manufacturingDate;
	@Column(name="Expiry_date")
	private String expiryDate;
	@Column(name="Category")
	private String category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", manufacturingDate=" + manufacturingDate
				+ ", expiryDate=" + expiryDate + ", category=" + category + "]";
	}
	
}
