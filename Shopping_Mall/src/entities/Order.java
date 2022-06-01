package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderDetails")
public class Order implements Serializable
{
	private static final long serialVersionUID=1L;
	@Id
	@Column(name="orderId")
	private int id;
	@Column(name="dateOfPurchase")
	private String dateOfPurchase;
	@Column(name="Total")
	private float total;
	@Column(name="customerId")
	private int customer_id;
	@Column(name="paymentMode")
	private String paymentMode;
	@Column(name="shopId")
	private int shop_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public int getShop_id() {
		return shop_id;
	}
	public void setShop_id(int shop_id) {
		this.shop_id = shop_id;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", total=" + total + ", customer_id="
				+ customer_id + ", paymentMode=" + paymentMode + ", shop_id=" + shop_id + "]";
	}
	
}
